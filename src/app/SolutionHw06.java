package app;

public class SolutionHw06 {
    public static void main(String[] args) {
        int[] source = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int index =0;index < source.length; index++) {
            sum +=source[index];
            System.out.printf("%d Num is %d, sum is %d %n",
                   source[index], source[index], sum);
        }
        System.out.printf("Sum of numbers is %d", sum);











    }








}
