//import java.util.Arrays;
//
//public class new1 {
//    public static int call1(String[] nums,int ki,int trimi) {
//        int[] array = new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            int n = Integer.parseInt("nums[i]");
//            array[i] = n%((int)Math.pow(10,trimi));
//        }
//        Arrays.sort(array);
//        return array[ki];
//    }
//    public static void main(String[] args) {
//        String[] nums = new String[]{"102","473","251","814"};
//        int[][] queries = new int[][]{{1,1},{2,3},{4,2},{1,2}};
//        int[] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            result[i] = call1(nums,queries[i][0],queries[i][1]);
//        }
//        for(int i=0;i<nums.length;i++)
//        System.out.print(result[i]);
//    }
//}
