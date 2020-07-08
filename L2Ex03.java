import java.util.Scanner;

class Ex03{
public static void main(String args[]){

Scanner teclado = new Scanner(System.in);
System.out.println("Digite o primeiro valor");
int valor1 = teclado.nextInt();
System.out.println("Digite o segundo valor");
int valor2 = teclado.nextInt();
System.out.println("Digite a operacao desejada");
String operacao = teclado.next();

switch (operacao) {
case "+": {System.out.println("Valor = " + (valor1 + valor2));
break;
}
case "-": {System.out.println("Valor = " + (valor1 - valor2));
break;
}
case "*": {System.out.println("Valor =" + (valor1 * valor2));
break;
}
case "/": {System.out.println("Valor = " + (valor1 / valor2) );
break;
}
default: {System.out.println("Operacao invalida");
}
}

}
}
