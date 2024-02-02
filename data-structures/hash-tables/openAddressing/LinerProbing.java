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
        int key = hashFunction(value);
        if(state[key] == 0 || state[key] == -1){
            hashtable[key] = value;
            state[key] = 1;
            count[key]++;
        }
        else {
            for(int i=1;(i<this.hashsize) && (state[key] == 1);i++){
                if(hashtable[key] != value)
                    key = hashFunction(value+i);
            }
                hashtable[key] = value;
                state[key] = 1;
                count[key]++;
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
            }
        }
        return false;
    }

    void delete(int value){
        int key = hashFunction(value);
        boolean flg = false;
        if(state[key] == 0){ }
        else if(state[key]==1 && hashtable[key] == value)
        {
            state[key] = -1;
            count[key]--;
            flg = true;
        }
        else{
            for(int i=1;(i<hashsize) && (state[key] != 0);i++)
            {
                if(hashtable[key] == value)
                {
                    state[key] = -1;
                    count[key]--; 
                    flg = true;
                }
            }
        }
        System.out.println((flg)? key:"Not found");
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
        hashmap.insert(3);
        hashmap.insert(1);
        hashmap.insert(6);
        hashmap.insert(5);
        hashmap.insert(5);
        hashmap.insert(5);
        hashmap.insert(9);
        hashmap.insert(9); 
        hashmap.insert(6);
        hashmap.insert(1);
        hashmap.insert(3);
        hashmap.insert(4);
        hashmap.print();
    }
}
