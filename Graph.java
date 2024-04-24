package Graph;
import java.util.*;
public class Graph1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] ar=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                int edge = sc.nextInt();
                if (edge != 0 && edge !=1) {
                    edge =sc.nextInt();}
                ar[i][j] = edge;
                ar[j][i] = edge;
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();

        }
    }
}
