import javax.swing.JOptionPane;
public class vetor3 {
   static int  vt1[]=new int [3];
   static int vt2[]=new int [3];
   static int vt3[]=new int [6];
   public static void main (String args[]){
    carregarvet1();
    carregarvet2();
    carregarvet3(vt1, vt2);
    for (int i=0;i<6;i++){
        JOptionPane.showMessageDialog(null, vt3[i]);
    }
   }
   static void carregarvet1(){
    for (int i=0;i<3;i++){
        vt1[i]=Integer.parseInt(JOptionPane.showInputDialog(" digite o valor do vetor 1 posicao " +(i+1) ));
    }
    

   }
    static void carregarvet2(){
    for (int i=0;i<3;i++){
    vt2[i]=Integer.parseInt(JOptionPane.showInputDialog(" digite o valor do vetor 2 na posicao " +(i+1) ));
    }
    }

    static int[] carregarvet3(int vt1[],int v2[]){
    for (int i=0;i<6;i++){
        if(i<3){
            vt3[i]=vt1[i];    
        }else{
            vt3[i]=vt2[i-3];    
        }
    }
        return vt3;
        
    }
}