import java.util.Scanner;

public class IO {
     public static Scanner input(String message){
         System.out.println(message);
         return new Scanner(System.in);
     }

     public static int menu(){
         StringBuilder model = new StringBuilder();
         model.append("Digite 2 para adicionar item");
         model.append("\n");
         model.append("Digite 3 para listar itens da biblioteca");
         model.append("\n");
         model.append("Digite 4 para pesquisar itens da biblioteca");
         System.out.println(model);
         return new Scanner(System.in).nextInt();

     }
}
