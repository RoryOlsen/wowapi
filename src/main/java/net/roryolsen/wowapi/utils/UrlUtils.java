package net.roryolsen.wowapi.utils;


public class UrlUtils {

	public static String encodeUrl(String original) {
		return original.replaceAll("%", "%25")
				.replaceAll(" ", "%20")
				.replaceAll("&", "%26")
				.replaceAll("\\?", "%3F");
	}
}
