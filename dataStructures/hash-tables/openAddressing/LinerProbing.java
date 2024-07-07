import java.util.*;
public class LinerProbing {
    int hashsize;
    int hashtable[];
    int state[];
    int count[];

    int hashFunction(int value){
        return value%this.hashsize;
    }

    void insert(int value){        
        int key = hashFunction(value),i;
        if(state[key] == 0){
            hashtable[key] = value;
            state[key] = 1;
            count[key]++;
        }
        else{
            if(search(value))
            {
                for(i=0;;i++){
                    if(hashtable[key]==value)
                    {
                        count[key]++;
                        break;
                    }
                    key = hashFunction(value+i);
                }
            }
            else{
                for(i=0;(i<hashsize)&&(state[key]==1);i++){
                    key = hashFunction(value+i);
                }
                if(i<hashsize)
                {
                    hashtable[key] = value;
                    state[key] = 1;
                    count[key]++;
                }
                else{
                    System.out.println(value+" Hash table full");
                }
            }
        }
    }

    boolean search(int value){

        int key = hashFunction(value);
        if(state[key] == 0){
            return false;
        }
        else if(state[key]==1 && hashtable[key] == value)
        {
            return true;
        }
        else{
            for(int i=1;(i<hashsize) && (state[key] != 0);i++)
            {
                if(hashtable[key] == value)
                return true;
                key = hashFunction(value+i);
            }
        }
        return false;
    }

    void delete(int value){
        if(noOfElements(count) == 0){
            System.out.println("Hash Table empty!!");
        }
        else {
        int key = hashFunction(value);
            for(int i=0;i<hashsize;i++)
            {
                if(hashtable[key] == value)
                {
                    count[key]--; 
                    if(count[key] == 0)
                        state[key] = -1;
                    break;
                }
                key = hashFunction(value + i);
            }
        }
    }

    int noOfElements(int array[]){
        return Arrays.stream(array).sum();
    }

    void print(){
        System.out.println("Hash table: "+Arrays.toString(hashtable)+"\nCount:      "+Arrays.toString(count)+"\nState:      "+Arrays.toString(state));
    }

    LinerProbing(int hashsize){
        this.hashsize = hashsize;
        this.hashtable = new int[hashsize];
        this.state = new int[hashsize];
        this.count = new int[hashsize];
    }

    public static void main(String[] args) {
        LinerProbing hashmap = new LinerProbing(5);
        hashmap.insert(9);
        hashmap.insert(3);
        hashmap.insert(4);
        hashmap.insert(1);
        hashmap.insert(5);
        hashmap.insert(5);
        hashmap.insert(2);
        
        hashmap.print();
        hashmap.delete(5);
        System.out.println("after delete");
        // hashmap.insert(2);
        hashmap.print();


    
    }
}
