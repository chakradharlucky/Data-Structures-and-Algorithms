package algorithms.recursion;
import java.util.*;
public class Palindrom {
    public boolean palindrom(String str){
        if(str.length() == 0 || str.length()==1){
            return true;
        }
        else if(str.charAt(0) == str.charAt(str.length()-1)){
            return palindrom(str.substring(1, str.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        Palindrom po = new Palindrom();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(po.palindrom(str));
        scan.close();
    }
}
