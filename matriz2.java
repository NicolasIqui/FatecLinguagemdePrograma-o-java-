import javax.swing.JOptionPane;
public class matriz2 {
    static int mat2[][]=new int [4][4];
    public static void main(String[] args) {
        carregamatriz();
        apresentamatriz();
    }

    static void  carregamatriz(){
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j){
                     mat2[i][j]=calcpot(i);
                }else{
                mat2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite o valor da matriz"));
                }    
            }
        }
    }
    static int calcpot(int i){
        int resultado=0;
        if(i==0){
            resultado=1;
        }else{
            //          calpot= i=0 =1  calpot(0)=1 calcpot(1)=4 calcpot(2)=4*4 
            resultado=4*calcpot(i-1);
        }
        return resultado;
    }
    static void apresentamatriz(){
         String texto = "";
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                texto += mat2[i][j] + "\t ";
            }
             texto += "\n";
           

        }
            System.out.println(texto);
            JOptionPane.showMessageDialog(null, texto);
    }
}
