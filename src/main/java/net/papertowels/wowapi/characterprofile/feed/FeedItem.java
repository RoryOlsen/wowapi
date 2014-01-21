package net.papertowels.wowapi.characterprofile.feed;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
		@Type(name = "BOSSKILL", value = BossKillFeedItem.class),
		@Type(name = "LOOT", value = LootFeedItem.class),
		@Type(name = "ACHIEVEMENT", value = AchievementFeedItem.class),
		@Type(name = "CRITERIA", value = CriteriaFeedItem.class)
})
public abstract class FeedItem {

	private Date timestamp;
	private String type;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
