# ArrayList
In Java, the ArrayList is a part of the Java Collections Framework and is part of the java.util package. It provides dynamic arrays in Java, allowing you to dynamically resize the array as needed.  
ArrayList< E > is a **generic class**
```java
import java.util.ArrayList; //import the ArrayList 

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of specific type, here the type is Interger
        ArrayList<Integer> numbers = new ArrayList<>(); //Interger type ArrayList.
        ArrayList<String> names = new ArrayList<>(); // String type ArrayList.

        // Add elements to the ArrayList by using add() method.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        name.add("Lakinana");
        name.add("Chakradhar");
        //Print the array list
        System.out.println("Numbers ArrayList: "+numbers);
        System.out.println("Names ArrayList: "+names);

        // Print the elements using a for-each loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```
## AraayList methods
1. **ArrayList<>():** It is a constructer,which is used to  create instance of the class by **new** keyword before it.  
**Syntax:**
```java
new ArrayList<type>();
```
- type clause should not be primitive data type.
- new keyword and ArrayList<>() will returns a reference.To use further we should store reference in a variable(i.e., here we call object).
```java
ArrayList<type> object_name ; //declearation 
object_name = new ArrayList<type>(); // memory allocation and assigning to a variable of type ArrayList<>
```
- we can does both lines in a single line.
```java
ArrayList<type> object_name = new ArrayList<type>();
```
2. **Adding elements in ArrayList**   
In order to add elements in the arraylist the following methods are going to use(method signatures):  
    1. **boolean add(E e)**  
        This method adds the element at the end of the list
    ```java
    arraylist.add(10); // arraylist is of integer type
    arraylist.add("Github"); // arraylist is of string type
    ```  
    2. **void add(int index, E e)**  
    Element of type E  will be add at position index.
    ```java
    arraylist.add(2,10); // arraylist is of integer type
    ```  
    3. **boolean addAll(Collection<? extends E> c)**  
    Add All Elements from Another Collection  
    ```java
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");

    ArrayList<String> moreFruits = new ArrayList<>();
    moreFruits.add("Orange");
    moreFruits.add("Grapes");

    fruits.addAll(moreFruits);
    ```
    4. **boolean addAll(int index, Collection<? extends E> c)**  
    Add All Elements from Another Collection at a Specific Index
    ```java
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");

    ArrayList<String> moreFruits = new ArrayList<>();
    moreFruits.add("Orange");
    moreFruits.add("Grapes");

    // Insert all elements from moreFruits at index 1
    fruits.addAll(1, moreFruits);
    ```