public class Perfect {
    public static void main(String[] args) {
        System.out.println("Numerele perfecte de la 1 la 1000 sunt: ");
        for(int n=1; n<=1000; n++){
            int d=0;
            for(int i=1; i<=n/2; i++){
                if(n%i==0){
                    d+=i;
                }
            }
            if(d==n){
                System.out.println(n);
            }
        }

    }

}