import java.util.*;
import static java.lang.System.*;

public class Task5{
    public static void main( String[] args) {
        //input arrayLits takes the user input
        ArrayList<Integer> inputArray = new ArrayList<>();
        //outputarry will be the array to be printed
        ArrayList<Integer> outputArray = new ArrayList<>();

        Scanner sysIn = new Scanner(in);
        out.println("Enter numbers:");
        
        //collect user input and stops if user input equals -1
        int num = 0;
        while(num != -1){
            out.print("Press -1 to finish:");
            num = sysIn.nextInt();
            if(num == -1){
                break;
            }
            inputArray.add(num);
        }
        
        //remove duplicates
        for(int i = 0; i < inputArray.size(); i++){
            int put = inputArray.get(i);
            if(!outputArray.contains(put)){
                outputArray.add(put);
            }
        }
        
        //create output
        String output = "";
        for(int i = 0; i < outputArray.size(); i++){
                output = output + outputArray.get(i) + "\t";
        }
        
        out.println("Result:");
        out.println(output);
    }
}
