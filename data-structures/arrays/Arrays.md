# ARRAYS
In Java, an array is a data structure that allows you to store multiple values of the same type under a single variable name. Arrays are used to group elements of the same data type together, and each element in the array can be accessed by its index. Here are some key points about arrays in Java:
## Declaration and Initialization:
1. ### Declaration:
    * Arrays in Java are declared with a specified data type, followed by square brackets ([]).  
    Example: *int[] numbers;*
2. Initialization:
    * Arrays can be initialized when declared or later using the new keyword.  
    Example: *int[] numbers = new int[5]; // Initializes an array of integers with a length of 5*
    * Alternatively, you can initialize an array with values:  
     *int[] numbers = {1, 2, 3, 4, 5};*
## Accessing Elements
1. Indexing  
    Array indices starts form **Zero**.  
    Example *int thirdelement = array[2];*
## Length of Array:
* Length Property:  
Arrays have a length property that returns the number of elements in the array.
Example:* int arrayLength = numbers.length;*  
## Arrays and Loops:
* Iterating Through Elements:
Arrays are often used in loops to iterate through each element.  
Example:   *for (int i = 0; i < numbers.length; i++) {  
 System.out.println(numbers[i]);  
}* 

## Arrays and Methods:
1. Passing to Methods:  
You can pass arrays to methods just like any other variable.  
Example:  
*void printArray(int[] arr) {  
    for (int num : arr) {  
        System.out.println(num);  
    }  
}*
2. Returning from Methods:  
Methods can return arrays.Here methods does not returns array of values.Returning array is nothing but returning array's object(reference of array of values ).  
Example:  
*int[] createArray() {  
    return new int[]{1, 2, 3, 4, 5};  
}*  
## Arrays Class:  
The **java.util.Arrays** class provides various utility methods for working with arrays, including sorting, searching, and filling.
Example:  
*import java.util.Arrays;  
// Sorting an array  
int[] numbers = {5, 2, 8, 1, 3};  
Arrays.sort(numbers);*  
## Multidimensional Arrays:  
* Declaration:  
Java supports multidimensional arrays, such as 2D arrays.  
Example: *int[][] matrix = new int[3][4]; * 
Initialization:  
Example:  
*int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};*  
Accessing Elements:  
Example: *int element = matrix[1][2];*  
## Limitations:  
* Fixed Size:  
Arrays in Java have a fixed size, meaning their length cannot be changed after initialization.
If dynamic sizing is required, consider using other data structures like **ArrayList**.  
* Homogeneous Elements:  
Arrays can only store elements of the same data type.
