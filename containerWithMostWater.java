package DailyCodePractice;
public class containerWithMostWater {
    public int maxArea(int[] height){
        int left=0;
        int right = height.length-1;
        int maxArea=0;

        while(right>left){
            int heightofContainer = Math.min(height[left], height[right]); 
            int width= right-left; 
            int area= heightofContainer*width;

            maxArea=Math.max(maxArea, area);

            if(height[left]<height[right]){
                left++;
            }else 
            right--;
        }
        return maxArea;
}
public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    containerWithMostWater obj = new containerWithMostWater();
    int result = obj.maxArea(height);
    System.out.println("Maximum water area: " + result);
}

}
