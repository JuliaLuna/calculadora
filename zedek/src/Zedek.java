import javax.swing.JOptionPane;

public class Zedek {
    
     public static void main( String[] args )
             
     
   {
      
      
      String Valor =
      JOptionPane.showInputDialog("Insira 1 para soma, 2 multi, 3 subtração ou 4 para Div:");
      
      int calcular = Integer.parseInt (Valor);
       
      if (calcular == 1){
 
      
          
       String valor1 = 
        JOptionPane.showInputDialog ("Digite um valor para soma:");
       
       String valor2 = 
         JOptionPane.showInputDialog("Digite outro valor para soma:");
       
       int val = Integer.parseInt (valor1);
       int val2 = Integer.parseInt (valor2);
       
       int somaval = val + val2;
       
        JOptionPane.showMessageDialog( null, "A soma é " + somaval, 
         "Soma", JOptionPane.PLAIN_MESSAGE );
       
    }else{
        if (calcular == 2){
      
           String Numero1 = 
            JOptionPane.showInputDialog( "Digite o primeiro número para a operção:" );
          String Numero2 =
          JOptionPane.showInputDialog( "Digite o segundo número para a operação:" );

    
           int num1 = Integer.parseInt( Numero1 ); 
           int num2 = Integer.parseInt( Numero2 );

            int multi = num1 * num2; 

  
            JOptionPane.showMessageDialog( null, "O produto é " + multi, 
             "Multiplicação", JOptionPane.PLAIN_MESSAGE );
       }else{
         if (calcular == 3){
      
           String Sub1 = 
            JOptionPane.showInputDialog( "Digite o primeiro número para subtrair:" );
          String Sub2 =
          JOptionPane.showInputDialog( "Digite o segundo número para subtrair:" );

    
           int sub1 = Integer.parseInt( Sub1 ); 
           int sub2 = Integer.parseInt( Sub2 );

            int sub = sub1 - sub2; 

  
            JOptionPane.showMessageDialog( null, "O resultado da subtração é " + sub, 
             "Subtração", JOptionPane.PLAIN_MESSAGE );
            }else{
              if (calcular == 4){
      
                 String Div1 = 
                  JOptionPane.showInputDialog( "Digite o primeiro número para dividir:" );
                 String Div2 =
                   JOptionPane.showInputDialog( "Digite o segundo número para dividir:" );

    
                    float div1 = Integer.parseInt( Div1 ); 
                    float div2 = Integer.parseInt( Div2 );

                    float div = div1 / div2; 

  
                    JOptionPane.showMessageDialog( null, "O resultado da divisão é " + div, 
                     "Divisão", JOptionPane.PLAIN_MESSAGE );
                 }
              }
        }
      }
   }
}



