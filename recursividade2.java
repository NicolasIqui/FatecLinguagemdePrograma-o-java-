import javax.swing.JOptionPane;

public class recursividade2 {
    static int num;
    static int num2;
       public static void main(String[] args) {
         num=Integer.parseInt(JOptionPane.showInputDialog(num));
         
        System.out.println(calcularRecursiva2(num));
        }

       public static int calcularRecursiva2(int num){
        int serie=0;
        
        if(num>=1){
            serie=num+calcularRecursiva2(num-1);
        
        }
        return serie;
        
       }    

}
