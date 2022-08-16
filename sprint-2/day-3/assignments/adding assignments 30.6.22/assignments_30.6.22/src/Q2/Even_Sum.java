package Q2;

public class Even_Sum {

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int m=arr[0].length;
        int n= arr.length;

        for(int c=0;c<m;c++){
            int  sum=0;
            for(int r=0;r<n;r++){
                if(arr[r][c]%2==0){
                    sum=sum+arr[r][c];
                }
            }
            System.out.println(sum);
        }
    }
}
