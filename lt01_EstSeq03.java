
package prj_estseq20082026;
import javax.swing.JOptionPane;
public class lt01_EstSeq03 {
    public static void main(String[] args) {
  double area,base,altura;
     base=Double.parseDouble(JOptionPane.showInputDialog(" digite a base do triangulo"));
     altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
     area=base*altura/2;
     

     JOptionPane.showMessageDialog(null,"a area do triangulo e "+area);
    }
}
