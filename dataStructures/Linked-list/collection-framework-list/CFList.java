import java.util.LinkedList;
public class CFList {
    public static void main(String arg[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        System.out.println(list);
        for(int a:list)
        {
           System.out.print(a+" "); 
        }
    }
}
