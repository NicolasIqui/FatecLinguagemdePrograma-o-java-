
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_EstSeq08 {
    public static void main(String[] args) {
        Double deposito,porcentagem,saldoatual;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario "));
        porcentagem = (deposito * 1.3)/100;
        saldoatual=porcentagem+deposito;
        JOptionPane.showMessageDialog(null," o saldo atual e   "+saldoatual);
  
    }
}
