import javax.swing.JOptionPane;

class Ex02{
public static void main(String args[]){


float valor=Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto"));
int formaPagto=Integer.parseInt(JOptionPane.showInputDialog("Qual a forma de pagamento?"));

switch (formaPagto) {
case 1: {System.out.println("Valor a pagar R$ " + valor * 0.9);
break;
}
case 2: {System.out.println("Valor a pagar R$ " + valor * 0.95);
break;
}
case 3: {System.out.println("Valor a pagar R$ " + valor + " (em 2x R$ " + valor / 2 + ")"  );
break;
}
case 4: {System.out.println("Valor a pagar R$ " + valor * 1.1 + " (em 3x R$ " + (valor*1.1) / 2 + ")"  );
break;
}
default: {System.out.println("Forma de pagamento invalida");
}
}

}
}
