package Strings;

public class addSpacesString {

    // Method to add spaces at specified positions
    public String addSpaces(String s, int[] arr) {
        StringBuilder ans = new StringBuilder();
        long n = s.length();
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (index < arr.length && i == arr[index]) {
                ans.append(' ');
                index++;
            }
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        addSpacesString s1 = new addSpacesString();

        // Sample input
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {2, 13, 15};

        // Call the method and print result
        String result = s1.addSpaces(s, spaces);
        System.out.println("Resulting string: \"" + result + "\"");
    }
}

