
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_EstSeq05 {
       public static void main (String args [ ] ) {
        double  a, b,c,x1,x2,delta;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c "));
        delta=b*b-4*a*c;
        x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        JOptionPane.showMessageDialog(null,"o valor de x1 e = "+x1+  " e o valor de x2= "+x2 );
  
}
        }