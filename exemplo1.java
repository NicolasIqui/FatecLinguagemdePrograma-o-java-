
import javax.swing.JOptionPane;
public class exemplo1{
    static int num;
public static void main(String[] args) {    
    num=Integer.parseInt(JOptionPane.showInputDialog(num));
    JOptionPane.showInternalMessageDialog(null,calculRecursiva(num));

}

  public static  int  calculRecursiva(int num){
    int x=1;
    if(num!=1){
        x=num*calculRecursiva(num-1);
       
    }
    return x;
    
    }

}