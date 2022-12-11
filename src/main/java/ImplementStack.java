

/**
 * Implement a linear sata structure with the following features:
 * FIFO
 */
class Stacks {
    static final int MAX = 100;
    // a position of -1 means that there is no element in the stack...duh
    int topEle = -1;
    int arr[] = new int[100];

    boolean isEmpyt() {
        return (topEle < 0);
    }

    // add an element to the stack
     boolean push(int x){
        // basically...if topEle is pointing beyond the maximum capacity of your stack
        if(topEle >=(MAX-1)){
            System.out.println("Stack is beyond full");
            return false;
        } else {
            // increment index of topEle by 1 to become 0
            arr[++topEle] = x;
            System.out.println("Successfuly add"+x+"into your stack");
            return true;
        }
     }
}
public class ImplementStack {
}
