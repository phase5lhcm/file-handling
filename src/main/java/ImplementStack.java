

/**
 * Implement a linear sata structure with the following features:
 * FIFO retrieval of nodes
 * push an element onto the stack and remove an element from the stack
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
            System.out.println("Successfuly add "+x+" into your stack");
            return true;
        }
     }
     // remove an element from the stack
    int pop(){
        // stack is empty, there isn't anything to remove
        if(topEle<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = arr[topEle--];
            return x;
        }
    }

}
public class ImplementStack {
    public static void main(String[] args){
        Stacks s = new Stacks();
        for( int i = 0; i < 5; i++){
            s.push(10+i);
        }
        System.out.println(s.pop() + " was popped from stack"); // removes last element added to the stack :)
    }
}
