/**
 * A binary search algorithm works on the idea of neglecting half of the list on every iteration.
 * It keeps on splitting the list until it finds the value it is looking for in a given list.
 * A binary search algorithm is a quick upgrade to a simple linear search algorithm.
 *
 * Binary search algorithms only work with sorted sets
 * -We can use the divide and conquer rule to sort the array
 *
 * Time/Space Comlexity
 * The time complexity of the binary search algorithm is O(log n).
 * The best-case time complexity would be O(1) when the central index would directly match the desired value.
 * Binary search worst case differs from that.
 * The worst-case scenario could be the values at either extremity of the list or values not in the list.
 *
 * In the worse case complexity of the binary search,
 *  the values are present in such a way that either they are at the extremity of the list or are not present in the list at all.
 */

public class ImplementBinarySearch {
    public static void binarySearch(int arr[], int start, int key, int length){
        // find mid value
        int mid = (start + length)/2;
        while(start <= length){
            if(arr[mid] == key){
                System.out.println("Element found in position "+mid);
                break;
            } else if(arr[mid] < key){
                //move to right side
                start = mid+1;
            } else{
                //move to left side
                length = mid-1;
            }
            // keep finding the middle value for each iteration
            mid = (start+length)/2;
        }
        if(start > length){
            System.out.println("Element is not found");
        }

    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int key = 40;
        binarySearch(arr, 0, key, arr.length-1);
    }
}
