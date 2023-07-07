import java.util.Scanner;

public class twodarray {
    // private static int j;

    public static void main(String[] args, int j) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[] [] arr = new int[row][col];
        System.out.println("enter array element: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter"+i+"row data");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
    }
}
