
package prj_estseq20082026;
import javax.swing.JOptionPane;

public class lt01_EstSeq04 {
    public static void main(String args[]){
        double c,f;
       c=Double.parseDouble(JOptionPane.showInputDialog("digite a temperatura em celsius"));
       f=(9*c+160)/5;
       JOptionPane.showInternalMessageDialog(null,"a temperatura em farenheit e "+f);
    }
}
