import java.util.*;

public class print123 {

    public static void main(String[] args) {
        int num = 1;
        for(int i= 1; i<=4; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        int[][] numGroups = {
            {11, 12, 13, 14, 15},
            {7, 8, 9, 10},
            {4, 5, 6},
            {2, 3},
            {1}
        };

        for (int[] group : numGroups) {
            for (int number : group) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    
    }
}
