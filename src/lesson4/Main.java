package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] nums = new int[7][8];
        // вывод ромба
        System.out.println("5. вывод ромба");
        int k = (nums.length) / 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j + i >= (k-1) && i < k && j < k) {
                    System.out.print(nums[i][j] + " ");
                } else if ((j-k) <= (i) && i < k && j >= k) {
                    System.out.print(nums[i][j] + " ");
                } else if ((i-k) <= (j) && i >= k && j < k) {
                    System.out.print(nums[i][j] + " ");
                } else if (((j-k) + (i-k))<= (k-1) && i >= k && j >= k) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
