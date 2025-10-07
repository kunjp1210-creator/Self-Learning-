public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        for(int j=1;j<=n;j++){
            for(int k=1;k<=n-j;k++){
                System.out.print("  ");
            }
            for(int i=j;i>=1;i--){
                System.out.print(i+" ");
            }
            for(int k=2;k<=j;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
