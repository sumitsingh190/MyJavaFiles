package Strings;
public class RemoveOutermostParenthesis {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0; // track the current nesting level

        // Convert the string to a character array first
        char[] arr = s.toCharArray();

// Loop through each character using index
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];  // Get current character

            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch);  // Append if it's not the outermost '('
                }
                    depth++;  // Going deeper into parentheses
            } else if (ch == ')') {
                depth--;  // Closing a parenthesis level
                if (depth > 0) {
                    result.append(ch);  // Append if it's not the outermost ')'
        }
    }
}


        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String output = removeOuterParentheses(input);
        System.out.println("Output: " + output); // Expected: "()()()()(())"
    }
}
