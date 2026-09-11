import javax.swing.JOptionPane;

public class recursividade3 {
    static int num=0;
    public static void main(String[] args) {
        num=Integer.parseInt(JOptionPane.showInputDialog(num));
        JOptionPane.showMessageDialog(null,calcularRecursiva3(num));
    }

    static double calcularRecursiva3(double num){
        double serie;
        if(num>1){
            serie=1/num+calcularRecursiva3(num-1);    
            System.out.println(serie);
            return serie;
        }
        return num;
        
        // 1/3  
        // 1/2 0,5
        // 1/1 1
       
    }
}
