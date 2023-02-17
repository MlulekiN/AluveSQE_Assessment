package Challenge_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NameSelect {
    public static void main(String args[]) throws IOException {

        Scanner userName = new Scanner(System.in);
        String[] myName = new String[5];
        myName[0] = "jbdhadjn akfndjfnf";
        myName[1] = "jbdhadjna  kfndjfnf";
        myName[2] = "jbdhadjnakf  ndjfnf";
        myName[3] = "jbdhadjn  akfndjfnf";
        myName[4] = "jbdhad j  nakfndjfnf";


        int i = 0;
        while (i < 5) {
            String removeSpce = Arrays.toString(myName);
            removeSpce.replaceAll("/s", "");
            System.out.println(removeSpce.toUpperCase() + userName.nextLine());
            i++;
        }
    }
}
