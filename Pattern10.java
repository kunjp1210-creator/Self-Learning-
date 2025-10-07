public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int j=n;j>=1;j--){
            for(int k=1;k<=j;k++){
                System.out.print(" *");
            }
            int s=2*(n-j);
            for(int k=1;k<=s;k++){
                System.out.print("  ");
            }
            for(int k=1;k<=j;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
