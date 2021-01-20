package subject01__;

public class characterstring__array {
    public static int[] characterstring_to_array(String str) {
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i) - '0';
        }
        return array;
    }
}
