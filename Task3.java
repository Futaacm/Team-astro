import java.util.Scanner;
import static java.lang.System.*;

public class Task3 {
    public static void main( String[] args){
        Scanner sysIn = new Scanner(in);

        String input = sysIn.next();
        char[] letters = new char[input.length()];
        final int[] lNum = new int[input.length()];
        StringBuffer inputS = new StringBuffer(input);  

        inputS.getChars(0,input.length(),letters,0);

        for(int i = 0; i < input.length(); i++) {
            lNum[i] = (int)letters[i]; 
        }
        
        String result = mode(lNum);
        out.print("The letter with the highes occurence is :" + result);
    }

    public static int mode(int[] n) {
        int maxKey = 0;
        int maxCounts = 0;

        int[] counts = new int[n.length];

        for (int i=0; i < n.length; i++) {
            counts[n[i]]++;
            if (maxCounts < counts[n[i]]) {
                maxCounts = counts[n[i]];
                maxKey = n[i];
            }
        }
        return maxKey;
    }

}