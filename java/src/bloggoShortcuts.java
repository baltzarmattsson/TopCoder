public class bloggoShortcuts {
	
	public static String expand(String text) {
		String retStr = "";
		boolean closing = false;
		char[] ca = text.toCharArray();
		for (char c : ca) {
			if (c != '-' && c != '*') {
				retStr += c;
			} else {
				if (c == '-')
					retStr += closing ? "</i>" : "<i>";
				else if (c == '*')
					retStr += closing ? "</b>" : "<b>";
				closing = !closing;
			}

		}
		return retStr;
	}
}
