
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_EstSeq07 {
    public static void main (String args [ ] ) {
        double comprimento,largura,altura,volume;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura "));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento "));
        volume=altura*largura*comprimento;
        JOptionPane.showMessageDialog(null,"o valor do volume e = "+volume );
  
}
        }
        

