import javax.swing.JOptionPane;
public class vetor2 {
   static int  vt[]=new int[5]; 
    public static void main (String args[]){
        calc();

    }
    static void calc(){
        int maior=0;
        int menor=0;
        
        for (int i=0;i<5;i++){
            vt[i]=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do vetor na posicao "+(i+1) ));
            if(i==0){
                maior=vt[i];
                menor=vt[i];
            }else{
                if(vt[i]>=maior){
                    maior=vt[i];
                }else{

                } 
                if(vt[i]<menor){
                    menor=vt[i];
                }       
            }
           
        }
        for (int i=0;i<5;i++){
            JOptionPane.showMessageDialog(null,"o valor da posicao  "+(i+1)+ "do vetor é "+vt[i] );
        }
        JOptionPane.showMessageDialog(null,"o maior e menor valor respectivamente "+maior+ "  "+menor);
        JOptionPane.showMessageDialog(null, calcmedia(vt));
    }
    static double calcmedia(int vt[]){
        double media=0;
        for (int i=0; i<5;i++){
            media=media+vt[i];
        }
        media=media/5;
        return media;
    }

}
