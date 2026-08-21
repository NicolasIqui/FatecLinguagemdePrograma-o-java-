
package prj_estseq20082026;
import javax.swing.JOptionPane;
public class lt01_Estseq01 {
        public static void main (String args [ ] ) {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadradado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null,"a area do quadrado e "+lado  );
  
}

}