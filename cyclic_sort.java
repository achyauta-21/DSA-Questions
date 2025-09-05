import java.util.Arrays;

public class cyclic_sort {
    
    // function for cycli sort
    public static void cyclic(int arr[]){
int i =0;
while(i<arr.length){
    int correctPosition = arr[i]-1;
if(arr[i] != arr[correctPosition]){
    swap(arr, i, correctPosition);
}
else{
    i++;
}
}
    }
    
    static void swap(int arr[] ,int index1, int index2){
        int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,1,6,8,7};
      cyclic(arr);
      System.out.println(Arrays.toString(arr));
    }
}
