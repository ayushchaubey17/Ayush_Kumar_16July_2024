public class Question4 {

    public static final String[] ones = {
            "", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertNumberToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        return convert(num).trim();
    }

    private static String convert(int num) {
        String current;

        if (num % 100 < 10) {
            current = ones[num % 10];
            num /= 10;
        } else if (num % 100 < 20) {
            current = teens[num % 10];
            num /= 100;
        } else {
            current = ones[num % 10];
            num /= 10;

            current = tens[num % 10] + " " + current;
            num /= 10;
        }

        if (num == 0) {
            return current;
        }

        if (current.isEmpty()) {
            return ones[num] + " hundred";
        } else {
            return ones[num] + " hundred and " + current;
        }
    }

    public static void main(String[] args) {
        int number = 40;
        System.out.println(convertNumberToWords(number));     }
}
