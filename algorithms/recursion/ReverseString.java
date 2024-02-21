package algorithms.recursion;

/**
 * ReverseString
 */
public class ReverseString {

    public String revString(String str){
        if(str.length()<1)
            return str;
        return revString(str.substring(1, str.length()))+str.charAt(0);
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.revString("Chakradhar"));
    }
}