import java.util.Scanner;

class TwoSum {
    public static void main(String[] args) {




        // int n;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter number of elements you want to store.");
        // n = input.nextInt();

        // int[] array = new int[n];

        // System.out.println("Enter elements of array : ");

        // for(int i =0;i<n;i++){
        //     array[i] = input.nextInt();
        // }

        // System.out.println("Array elements are : ");
        
        // for(int i = 0; i<n;i++){
        //     System.out.println(array[i]);
        // }


        int[] nums = {3,9,6,2};
        int target = 8;


        int[] ans = twoSum(nums, target);

        for(int i = 0; i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
        // for (int i : ans) {
        //     System.out.println(i);
        // }






    }

    // public static int[] twoSum(int[] nums, int target) {

    //     int[] newArray = new int[2];
    //     for(int i = 0; i<nums.length;i++){
    //         for(int j=1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                newArray[0] = i;
    //                newArray[1] = j;
    //                return newArray; 
    //             }
    //         }
    //     }
    //     return newArray;


        
    // }
        public static int[] twoSum(int[] nums, int target) {

            int[] arrayNew = new int[2];
            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        arrayNew[0] = i;
                        arrayNew[1] = j;
                        return arrayNew;
                    }
                }
            }
            return arrayNew;
        }
}