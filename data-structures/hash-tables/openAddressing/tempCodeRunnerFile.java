

    LinerProbing(int hashsize){
        this.hashsize = hashsize;
        this.hashtable = new int[hashsize];
        this.state = new int[hashsize];
        this.count = new int[hashsize];
    }

    public static void main(String[] args) {
        LinerProbing hashmap = new LinerProbing(10);
        hashmap.insert(9);
        hashmap.insert(3);
        hashmap.insert(4);
        hashmap.insert(1);
        hashmap.insert(5);
        hashmap.insert(2)