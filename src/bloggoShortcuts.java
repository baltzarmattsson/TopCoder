public class bloggoShortcuts {
	
	public static void main(String[] args) {
		System.out.println(expand("Test -BBBB- *AAAAA*"));
	}

	public static String expand(String text) {
		String retStr = "";
		boolean closing = false;
		char[] ca = text.toCharArray();
		for (char c : ca) {
			if (c != '-' && c != '*') {
				retStr += c;
			} else {
				if (c == '-') {
					retStr += closing ? "</i>" : "<i>";
					closing = !closing;
				} else if (c == '*') {
					retStr += closing ? "</b>" : "<b>";
					closing = !closing;
				}
			}

		}
		return retStr;
	}
}
