public class Palindrome {
    public static void main(String[] args) {
        String[] s = {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
        for (int i = 0; i < s.length; i++) {
            System.out.println("Введённое слово "+s [i] +" является палиндромом - " + isPalindrome(s[i]));
        }
    }
    public static String reverseString(String s)
    {
        String reverse ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindrome(String s)
    {
        String reverse = reverseString(s);
        return s.equals(reverse);
    }
}
