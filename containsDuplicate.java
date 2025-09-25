import java.util.HashSet;

public class containsDuplicate {
    public static boolean isDuplicate(int [] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int []nums ={1,2,3,1};

        System.out.println(containsDuplicate.isDuplicate(nums));
    }
    
}
