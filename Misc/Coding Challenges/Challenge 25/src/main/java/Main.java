import java.util.Arrays;

public class Main {


    public static int LongestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        Arrays.sort(nums);

        int index = 1;
        int longestSequence = 0;
        int tempSequence = 1;



        while( index  < nums.length ) {


            if (index == nums.length - 1){
                longestSequence = Math.max(longestSequence, tempSequence);
                break;
            }

            var elementAtIndex = nums[index];
            var elementAtTheNextIndex = nums[index + 1];

            if (elementAtIndex == elementAtTheNextIndex ||
            elementAtTheNextIndex == elementAtIndex + 1
            ) {
                tempSequence++;
                index++;
            }  else {
                longestSequence = Math.max(longestSequence, tempSequence +1);
                tempSequence = 1;
                index++;

            }




            }



        return longestSequence;

    }
    public static void main(String[] args) {
        // System.out.println(LongestConsecutive(new int[] {100,4,200,1,3,2}));

        System.out.println(LongestConsecutive(new int[] {0, 0}));

        //System.out.println(LongestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
    }
}
