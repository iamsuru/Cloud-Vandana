class ArrayShuffleValues {
    private void arrayShuffle(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * (i + 1));
            int temp = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayShuffleValues obj = new ArrayShuffleValues();
        obj.arrayShuffle(nums);
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }
}