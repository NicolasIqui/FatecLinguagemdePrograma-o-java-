import javax.swing.JOptionPane;

    public class matriz {
        static int vt[][]=new int [4][3]; 
        public static void main (String args[]){
            carregamat();
             
            for (int i=0;i<3;i++){
               JOptionPane.showMessageDialog(null, " a quantidade do produto " +(i+1)+ " vendido no mes foram " +calcprodutomes(vt)[i]);
            }   
            for(int i=0;i<4;i++){
                JOptionPane.showMessageDialog(null,"a quantidade de produtos vendidos por semana é "+calcpvsem(vt)[i]);
            }
            JOptionPane.showMessageDialog(null,calcmes(vt));
        }
        

        static void carregamat(){
            for (int i=0;i<4;i++){
                for (int j=0;j<3;j++){
                    vt[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do da matriz"));
                }
            }
        }
        static int[] calcprodutomes(int vt[][]){
            int soma[]=new int [3];
            for (int j=0;j<3;j++){
                for(int i=0;i<4;i++){
                soma[j]=vt[i][j]+soma[j];   
                }   
            }
            return soma;
        }
        
        static int[] calcpvsem(int vt[][]){
            int somasemana[]=new int [4];
            for (int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                  somasemana[i]=vt[i][j]+somasemana[i];   
                }   
            }
            return somasemana;
        }

        static int calcmes(int vt[][]){
           int mes=0;
            for (int j=0;j<3;j++){
                for(int i=0;i<4;i++){
               mes=vt[i][j]+mes;  
                }   
            }
            return mes;
        }
    }   

