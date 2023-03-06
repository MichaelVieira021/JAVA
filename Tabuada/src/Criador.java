import java.util.Scanner;

public class Criador {
   static Scanner scan = new Scanner(System.in);
   static Scanner scan2 = new Scanner(System.in);
   static int count;
   static long numero;


   //Certifica que seja digitado apenas números.
   public static int CriarAltenticador() {
      System.out.print("Escolha um número para conferir a tabuada: ");
      while (true) {
         try {
            return Integer.parseInt(scan.nextLine());
         } catch (NumberFormatException e) {
            System.out.print("Número inválido!\nDigite apenas números: ");
         }
      }
   }


   //Desenvolve e exibe a tabuada
   public static void criarTabuada() {
      count = 1;
      while (count <= 10) {
         System.out.println(count + " X " + numero + " = " + (numero * count));
         count++;
      }
   }


   //Desenvolve e exibe a condição
   public static void criarCondicao() {
      System.out.print("Quer conferir outra tabuada? ('Y' ou 'N')\n");
      String opcao = scan2.next();
      while (!"Y".equals(opcao) | !"N".equals(opcao) | !"n".equals(opcao) | !"y".equals(opcao)) {
         if ("Y".equals(opcao) | "y".equals(opcao)) {
            numero = CriarAltenticador();
            criarTabuada();
         } else if ("N".equals(opcao) | "n".equals(opcao)) {
            System.out.print("Programa finalizado!\n");
            break;
         }
         System.out.print("Quer conferir outra tabuada? ('Y' ou 'N')\n");
         opcao = scan2.next();
      }
   }
}
