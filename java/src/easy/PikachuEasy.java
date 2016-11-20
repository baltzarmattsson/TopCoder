public class PikachuEasy {
    public String check(String word) {
        String[] able = {"pi", "ka", "chu"};
        for (int i = 0; i < able.length; i++) {
    		word = word.replaceAll(able[i], "");
        }
        if (word.length() > 0) return "NO";
        return "YES";
    }
}