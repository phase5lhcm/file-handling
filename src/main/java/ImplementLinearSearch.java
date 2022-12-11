/**
 *  What is the time complexity of a linear search?
 *  Time complexity is O(n) meaning that the search is consistent.
 *  We have a single input, N, and we iterate over N i++ times over each iteration
 *  Whatever we do inside the loop does not increase time...unless we add another loop,
 *   but we do not do that here
 *   The space complexity of a linear search algorithm is O(1) because we only have one input array, N
 *   We do not take up or allocate more space otherwise
 */

public class ImplementLinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,8};
        int key = 8;
        boolean flag = false;
        int position = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == key){
                flag = true;
            }
        }
        if(flag==true){
            System.out.println("Element found in position "+(position+1));
        } else {
            System.out.println("Element not found");
        }
    }
}
