public class String_Operations {
    public static void main(String[] args) {

        String s1 = "Anurag";
        System.out.println(s1);

        // Length of string
        System.out.println(s1.length());

        // Adding strings (append)
        s1 = s1 + " Mondal";
        System.out.println(s1);

        s1 += " Coder";
        System.out.println(s1);

        // Removing last character (NO pop_back in Java)
        s1 = s1.substring(0, s1.length() - 1);
        System.out.println(s1);

        // Adding a character at the end (NO push_back)
        s1 = s1 + "a";
        System.out.println(s1);

        // Reverse full string
        String reversed = new StringBuilder(s1).reverse().toString();
        System.out.println(reversed);

        // Reverse first 3 characters
        String firstPart =
                new StringBuilder(reversed.substring(0, 3)).reverse().toString();
        String remainingPart = reversed.substring(3);
        reversed = firstPart + remainingPart;
        System.out.println(reversed);

        // int to String
        int x = 546;
        s1 = String.valueOf(x);
        System.out.println(s1);

        // String to int
        int y = Integer.parseInt(s1);
        System.out.println(y + 1);

        // Clearing string
        s1 = "";
        System.out.println(s1);
    }
}

