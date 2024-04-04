package Leetcodes;

public class BinarySearch {

    public static void main(String[] args) {

//        int[] nums = {2, 3, 4, 5, 6, 7, 8};
//        System.out.println(search(nums, 8));

        System.out.println(1/2);

    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int currentIndex = left + ((right - left) / 2);
            if (nums[currentIndex] == target) {
                index = currentIndex;
                return index;
            }

            if (nums[currentIndex] > target) right = currentIndex - 1;
            if (nums[currentIndex] < target) left = currentIndex + 1;
            System.out.println("Left: " + left + " Right: " + right);

        }

        return index;

    }

}