
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_Estseq02 {
    public static void main(String[] args) {
        Double salario, aumento,salarionovo;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario "));
        aumento = salario * 15 /100;
        salarionovo=salario+aumento;
        JOptionPane.showMessageDialog(null,"o salario com reajuste e  "+salarionovo);
  
    }
}
