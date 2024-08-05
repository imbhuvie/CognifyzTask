package random.password.generator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of password :");
        int passwordLength=sc.nextInt();
        System.out.print("Are you want Numbers (y/n) : ");
        boolean isNumners=sc.next().equals("y");
        System.out.print("Are you want Uppercase Alphabates (y/n) : ");
        boolean isUppAlpha=sc.next().equals("y");;
        System.out.print("Are you want Lowecase Alphabates (y/n) : ");
        boolean isLowAlpha=sc.next().equals("y");
        System.out.print("Are you want Special Symbols (y/n) : ");
        boolean isSymbols=sc.next().equals("y");
        String numSet="1234567890123456789012345678905";
        String upperCharSet="QWERTYUIOPLKJHGFDSAZXCVBNM";
        String lowerCaseSet="qwertyuioplkjhgfdsazxcvbnm";
        String symbolSet="`~!@#$%^&*()_+-={}|[]\\|:\";'";

        StringBuilder validChars = new StringBuilder();
        if (isNumners) validChars.append(numSet);
        if (isLowAlpha) validChars.append(lowerCaseSet);
        if (isUppAlpha) validChars.append(upperCharSet);
        if (isSymbols) validChars.append(symbolSet);

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(validChars.length());
            password.append(validChars.charAt(index));
        }
        System.out.println("-------------------------------");
            System.out.println("Generated password :=> " + password);






    }


}
