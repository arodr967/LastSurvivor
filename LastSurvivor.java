/*
File name: LastSurvivor.java
 */
package lastsurvivor;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class LastSurvivor {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * There are n items, numbered from 1 to n in a given array and given a
     * positive integer number k (k < n). We start from item number 1 and delete
     * from the array the item number k and so on until one item remains. The
     * task is to output the initial position of this remaining item. For
     * example, if we have an array = [1, 2, 3, 4, 5, 6, 7], n = 7 and k = 3,
     * then the numbers 3, 6, 2, 7, 5, 1 are deleted in order, and the number 4
     * survives.
     *  
(a) Implement a recursive function in Java int lastsurvivor(int arr[],
     * int n, int k) that simulates this process and returns the location of the
     * last survivor in a given array.
     *//*********PROPERTY OF ALICIA RODRIGUEZ**********
(b) What is the running time complexity of your function? Justify
     * The running time complexity is O(n) because we 
     * are triversing each element in the array.
     *//*********PROPERTY OF ALICIA RODRIGUEZ**********
     * @param array an array integers
     * @param n the length of the array
     * @param k the number which will be vanquished recursively
     * @return the last survivor
     *
     */
    public static int lastSurvivor(int array[], int n, int k) {
        if (n == 1) {
            return array[0];
        } else {
            return ((lastSurvivor(array, n - 1, k) + k - 1) % n)+1;            
        }
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    
    public static int lastSurvivorPosition(int array[], int n, int k)
    {//*********PROPERTY OF ALICIA RODRIGUEZ**********
        return (lastSurvivor(array, n, k)-1);
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********

    public static void main(String[] args) {
   //*********PROPERTY OF ALICIA RODRIGUEZ**********     
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Answer: " + lastSurvivorPosition(array, 7, 3));
  //*********PROPERTY OF ALICIA RODRIGUEZ**********      
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of LastSurvivor class definition
