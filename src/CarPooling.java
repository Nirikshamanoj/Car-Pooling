import java.util.Scanner;

public class CarPooling {
    static boolean possibleOrNot(int[][] A, int capacity){
        int trip_1_start = A[0][1], trip_1_end = A[0][2];
        int trip_2_start = A[1][1], trip_2_end = A[1][2];
        int array[] = new int[trip_2_end];
        for(int i = 1 ; i < trip_1_end ; i++){
            array[i] += A[0][0];
        }
        for(int i = trip_2_start ; i < trip_2_end ; i++){
            array[i] += A[1][0];
        }
        for (int values : array){
            if(values > capacity){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] A=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        int capacity=scanner.nextInt();
        boolean check=possibleOrNot(A,capacity);
        System.out.println(check);
    }
}
