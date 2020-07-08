import javax.swing.JOptionPane;

class Conversao{
public static void main(String args[]){
// Três tipos de conversões
// 1º Conversão implícita (entre dados compatíveis)
int qtde=10;
float resultado = qtde * 10.5f;
System.out.println(resultado);
// 2ª Conversão explícita "cast" (entre dados compatíveis)
float x=500f;
byte b =(byte) x;
System.out.println(b);


}
}