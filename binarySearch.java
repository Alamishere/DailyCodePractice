package DailyCodePractice;

public class binarySearch {
    public int search(int []nums, int target){
        int left=0;
        int right= nums.length-1;

        while(left<=right){
            int mid= left+(right-left)/2;

            if(nums[mid]== target){
                return mid;
            } else if(nums[mid]<target){
                left= mid+1;
            } else{
                right = mid-1;
            }
        }

        return -1;
    }

       public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        
        int[] nums = {1, 3, 5, 7, 9, 11};
        System.out.println(bs.search(nums, 7));
        System.out.println(bs.search(nums, 1));
        System.out.println(bs.search(nums, 15));
    }
    
}
