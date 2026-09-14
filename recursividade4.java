import javax.swing.JOptionPane;

public class recursividade4{
    static int num=0;
     static int x=1;
    public static void main(String[] args) {
        num=Integer.parseInt(JOptionPane.showInputDialog(num));
        JOptionPane.showMessageDialog(null, calculoRecursiva(num,x));
    }

    static  double calculoRecursiva(double num,int x){
        double serie =0;  
        if(num>=1){
            serie=num/x+calculoRecursiva(num-1, x+1);
           
        }
        return serie;

    }


}