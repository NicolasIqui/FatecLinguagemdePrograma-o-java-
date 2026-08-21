
package prj_estseq20082026;
import javax.swing.JOptionPane;
public class lt01_EstSeq09 {
        public static void main (String args [ ] ) {
        int n1,n2,quadrados;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero "));
        quadrados = (n1*n1) +(n2*n2) ;
        JOptionPane.showMessageDialog(null,"a soma dos quadrados e  "+quadrados  );
  
}

}