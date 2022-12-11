public class ImplementSelectionSort {
    public static  void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int length = arr.length;
        implementSelectionSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void implementSelectionSort(int[] arr){
        int index;
       for(int i = 0; i < arr.length; i++){
           index = i;
           for(int j = i+1; j < arr.length;j++){
               if(arr[j] < arr[index]){
                   index = j;
               }
           }
           int smallNum = arr[index];
           arr[index] = arr[i];
           arr[i] = smallNum;
       }
    }
}
