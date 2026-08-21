
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_EstSeq06 {
    public static void main(String args[]){
        int a, b,c;
       a=Integer.parseInt(JOptionPane.showInputDialog("digite o  valor de  a "));
       b=Integer.parseInt(JOptionPane.showInputDialog("digite o  valor de  b "));
       c=a;
       a=b;
       b=c;       
       JOptionPane.showInternalMessageDialog(null,"os valores trocados sao A=" +a+ "B= "+b);
    }
}
