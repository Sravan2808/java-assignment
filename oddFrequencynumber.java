//Tc:O(n)
//Sc:O(1)
public class oddFrequencynumber {
    public static int getOddFrequencyNum(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[]={4,3,6,2,6,4,2,3,4,3,3};
        int result= getOddFrequencyNum(nums);
        System.out.println("The odd frequency occuring number is : " + result);
    }
}
