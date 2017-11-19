import java.util.Scanner;
import static java.lang.System.*;

public class Task4{
    public static void main( String[] args){
        Scanner sysIn = new Scanner(in);
        
        out.print("Enter word: ");
        String input = sysIn.next();

        int inputLength = input.length();

        int perm = 1;
        for(int i = 1; i <= inputLength; i++) {
            perm = perm * i;
        }

        out.println("Number of permutation of "+ input+ " is = " + perm);
    }
}
