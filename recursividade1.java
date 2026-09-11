public class recursividade1 {
    static int n;
    public static void main(String[] args) {
        System.out.println(recursiva2(n));
    }
    public static  int  recursiva2(int n){
       int valor=0;
        if(n<101){
            valor=n+recursiva2(n+1);
            System.out.println(valor-n);
        }
        return valor;
    }
}
