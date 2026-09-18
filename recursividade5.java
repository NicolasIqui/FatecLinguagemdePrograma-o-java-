import javax.swing.JOptionPane;
public class recursividade5 {
    static int num=0;
    public static void main(String[] args) {
        num=Integer.parseInt(JOptionPane.showInputDialog(num));
        JOptionPane.showMessageDialog(null,calcSerie(num));
    }

     static int  calcSerie(int num){
        int serie=0;
        if(num>=1){
            System.out.println(num);
            serie=calcFatorial(num)+calcSerie(num-1);
        }
        return serie;
     }

    static int calcFatorial(int num){
        int fat=1;
        if(num>=1){
            fat=num*calcFatorial(num-1);
          
        }
        return fat;
    }

}
