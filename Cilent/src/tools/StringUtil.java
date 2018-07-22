package tools;

public class StringUtil {

	/**
	 *
	 * @param s
	 * @return String
	 */
	public static String getStateCode(String s) {
		int i = s.indexOf('|');
		s = s.substring(0, i);
		return s;
	}

	/**
	 * 
	 * @param s
	 * @return String
	 */
	public static String getADDInfo(String s) {
		int i = s.indexOf('|');
		s = s.substring(i + 1, s.length());
		return s;
	}

	/**
	 * 
	 * @param s
	 * @return String
	 */
	public static String getList(String s) {
		int i = s.indexOf('|');
		s = s.substring(i + 1, s.length());
		return s;
	}

	/**
	 * 
	 * @param s
	 * @return String
	 */
	public static String getDeleteInfo(String s) {
		int i = s.indexOf('|');
		s = s.substring(i + 1, s.length());
		return s;
	}

	/**
	 *
	 * @param s
	 * @return String
	 */
	public static String getERRORInfo(String s) {
		int i = s.indexOf('|');
		s = s.substring(i + 1, s.length());
		return s;
	}

}
