public class Primes {
    public static void main(String[] args) {
        
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Palindrome {
    public static String reverseString(String s) {
        String reversed = ""; 
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);  
        }
        return reversed; 
    }
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом.");
            } else {
                System.out.println(s + " не является палиндромом.");
            }
        }
    }
}
