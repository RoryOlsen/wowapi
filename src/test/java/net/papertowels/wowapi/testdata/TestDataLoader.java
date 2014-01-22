package net.papertowels.wowapi.testdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestDataLoader {

	private static final String CHARACTERS_FILE_LOCATION = "net/papertowels/wowapi/characters.txt";
	private static final String GUILDS_FILE_LOCATION = "net/papertowels/wowapi/guilds.txt";

	public List<TestCharacter> generateTestCharacterList() {
		List<TestCharacter> list = new ArrayList<TestCharacter>();
		try (InputStream is = TestDataLoader.class.getClassLoader().getResourceAsStream(CHARACTERS_FILE_LOCATION);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				String[] data = currentLine.split("\t");
				String region = data[0];
				String realmName = data[1];
				String characterName = data[2];
				TestCharacter character = new TestCharacter(region, realmName, characterName);
				list.add(character);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public List<TestGuild> generateTestGuildList() {
		List<TestGuild> list = new ArrayList<TestGuild>();
		try (InputStream is = TestDataLoader.class.getClassLoader().getResourceAsStream(GUILDS_FILE_LOCATION);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				String[] data = currentLine.split("\t");
				String region = data[0];
				String realmName = data[1];
				String guildName = data[2];
				TestGuild guild = new TestGuild(region, realmName, guildName);
				list.add(guild);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return list;
	}
}
