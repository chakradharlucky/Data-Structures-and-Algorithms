package algorithms.recursion;
import java.util.*;
public class NumberToBinary {
    public String numToBin(int num){
        if(num/2 == 0 || num == 0)
            return Integer.toString(num%2);
        int rem = num % 2;
        return numToBin(num/2) + Integer.toString(rem);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberToBinary ntob = new NumberToBinary();
        int num = scan.nextInt();
        System.out.println(ntob.numToBin(num));
        scan.close();
    }
}
