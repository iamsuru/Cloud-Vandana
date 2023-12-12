import java.util.Scanner;

class CheckPangram {

    private boolean checkPangram(String inputString) {
        int[] alpha = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alpha[index] = 1;
            }
        }
        for (int val : alpha) {
            if (val == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPangram obj = new CheckPangram();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to check : ");
        String inputString = sc.nextLine();
        boolean isPangramSentence = obj.checkPangram(inputString.toLowerCase());
        if (isPangramSentence) {
            System.out.printf("\n%s is a pangram.", inputString);
        } else {
            System.out.printf("\n%s is not a pangram.", inputString);
        }
        sc.close();
    }
}