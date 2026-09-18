import javax.swing.JOptionPane;
public class Vetor1 {
    static int vt[]=new int [5];
    public static void main(String[] args) {
    carregavetor();        
    }

    static void carregavetor(){
    

        for (int i =0;i<5;i++){
            vt[i]=Integer.parseInt(JOptionPane.showInputDialog("digite a posicao do vetor "+(i+1)));
            
        }
        
        for (int i=0; i<5;i++){
            JOptionPane.showMessageDialog(null,"o valor da posicao "+(i+1)+ " é " +vt[i]); 
            
        }   
        JOptionPane.showMessageDialog(null,"a media dos valores entre 10 e 200 "+calcmedia(vt) );
        JOptionPane.showMessageDialog(null,"a quantidade de numeros impares e "+calcimpares(vt) );
    }
    static double calcmedia(int vt[]){
        double media=0;
        int c=0;
        for (int i=0;i<5;i++){
            if(vt[i]>10 && vt[i]<200){
                media=media+vt[i];
                c=c+1;
            }else{
            }
        }
        return media;

    }
    static int calcimpares(int vt[]){
        int imp=0;
        for (int i=0;i<5;i++){
            if(vt[i]%2!=0){
                imp=imp+1;
            }else{

            }            
        }
        return imp;
    }    
}
