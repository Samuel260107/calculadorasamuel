import java.util.Scanner;

public class CalculadoraSimples1{

    public static void main(String[] args) {

        //Declaração de variáveis
        int n1, n2, total, op;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\t\t -- Calculadora Simples --\n");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print(" Opção: ");
            op = entrada.nextInt();
               
            if(op == 1){
                System.out.println("\n\t\t\t -- Soma --\n");
                //Entrada
                System.out.println("Informe N1: ");
                n1 = entrada.nextInt();
                System.out.println("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 + n2;

                //Saida
                System.out.printf("%d + %d = %d", n1, n2, total);
            }else if (op == 2){
                
                //Entrada
                System.out.println("Informe N1: ");
                n1 = entrada.nextInt();
                System.out.println("Informe N2: ");
                n2 = entrada.nextInt();

                //Processamento
                total = n1 - n2;

                //Saida
                System.out.printf("%d + %d = %d", n1, n2, total);

                System.out.println("\n\t\t\t -- Subtração --\n");
            }else if(op == 3){
                System.out.println("Forte abraço!");
            }else{
                System.out.println("Opção" + op + " incorreta!");
            }

        }while(op!=3);
        

    }

    
}