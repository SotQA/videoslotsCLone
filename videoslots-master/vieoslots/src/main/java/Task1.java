import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static int[] fillTheArrayWithRandomNumbers() {
        int[] array = new int[new Random().nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(30);
        }
        System.out.println("This is an array with random numbers in it : " + Arrays.toString(array) + " .");
        return array;
    }

    public static int numbersMultipliersByFourOrSix(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0 && array[i] % 6 == 0) {
                count++;
            } else if (array[i] % 4 == 0 || array[i] % 6 == 0) {
                count++;
            }
        }
        System.out.println("This is a number of integers that are a multiplier of either 4 or 6 or both : " + count + " .");
        return count;
    }

    public static void isTheStringPalindrome(String word) {
        String correctStringToValidate = word.toLowerCase().replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(correctStringToValidate);
        boolean result = stringBuilder.reverse().toString().equals(correctStringToValidate);
        if (result && correctStringToValidate.length() > 2) {
            System.out.println("This string " + word + " is a palindrome!");
        } else {
            System.out.println("This string " + word + " is not a palindrome!");
        }
    }

    public static void main(String[] args) {

        //Test data for the first method(array with numbers)
        int[] filledArrayPositiveCheckUp = fillTheArrayWithRandomNumbers();
        String[] arrayOfStringsNegativeCheckUp = {"One", "Two", "Three"};
        int number = 3;
        int[] arrayWithNegativeNumbers = {-4, -6, -10};
        int[] zeroArrayNegativeCHeckUp = {0, 0, 0};


        //Array checkups
        numbersMultipliersByFourOrSix(filledArrayPositiveCheckUp);
        //These two checkups are negative and are commented out because Java is strict about data types,
        //but I would leave them here, so we understand that the method accepts only array of integers.
//        numbersMultipliersByFourOrSix(arrayOfStringsNegativeCheckUp);
//        numbersMultipliersByFourOrSix(number);
        numbersMultipliersByFourOrSix(arrayWithNegativeNumbers);
        numbersMultipliersByFourOrSix(zeroArrayNegativeCHeckUp);


        //Test data for the second method (palindrome)
        String smokeTestDataPalindrome = "kayak";
        String negativeCheckUpNotPalindrome = "word";
        String integerPalindrome = "1221";
        String oneLetterString = "a";
        String emptyString = "";
        String spaceString = " ";
        String doubleSPaceString = "  ";
        String palindromeUpperAndLowerCase = "KaYaK";
        String specialSymbolsPalindrome = "{}{}{";
        String specialSymbolsNotPalindrome = "!@#$%^&*()_+=-";
        String sentencePalindrome = "Do geese see God";
        String specialLettersPalindrome = "田水水田";
        String specialLettersNotPalindrome = "田水水田口廿廿火";


        //Palindrome checkups
        isTheStringPalindrome(smokeTestDataPalindrome);
        isTheStringPalindrome(integerPalindrome);
        isTheStringPalindrome(negativeCheckUpNotPalindrome);
        isTheStringPalindrome(oneLetterString);
        isTheStringPalindrome(emptyString);
        isTheStringPalindrome(spaceString);
        isTheStringPalindrome(doubleSPaceString);
        isTheStringPalindrome(palindromeUpperAndLowerCase);
        isTheStringPalindrome(specialSymbolsPalindrome);
        isTheStringPalindrome(specialSymbolsNotPalindrome);
        isTheStringPalindrome(sentencePalindrome);
        isTheStringPalindrome(specialLettersPalindrome);
        isTheStringPalindrome(specialLettersNotPalindrome);
    }
}
