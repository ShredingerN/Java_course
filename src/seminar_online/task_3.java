package seminar_online;

/**
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
public class task_3 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 1, 0, 2, 4, 3, 2, 2, 3};
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
