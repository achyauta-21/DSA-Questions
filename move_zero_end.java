// wap to print all the zero to the end of the array
public class move_zero_end {

// function to print the end zero
public static int[] endZero(int nums[]){
    int j=-1;
    for(int i=0;i<nums.length;i++){
if(nums[i]==0){
    j=i;
    break;
}
    }

  for(int i=j+1;i<nums.length;i++){
    if(nums[i]!=0){
        // swap
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=  temp;
        j++;
    }
  }
  return nums;
}
    public static void main(String[] args) {
        int nums[] ={2,4,5,67,0,23,0,4,54,0};
             int[] ans = endZero(nums);
        for (int i = 0; i <nums.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
    
}
