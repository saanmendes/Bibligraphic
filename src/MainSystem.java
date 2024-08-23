import java.util.ArrayList;
import java.util.List;

public class MainSystem {
    private List<BibliographicItem> itens;

   public MainSystem() {
       this.itens = new ArrayList<>();
   }

    public void run(){
        int control = 1;
        while (control == 1){
            int option = IO.menu();
            if(option == 2){
                addItem();
            } else if (option == 3) {
                toListItens();
            } else if (option == 4) {
                searchItemByCode();
            }
        }
    }

    private void addItem() {
        String code = IO.input("Digite o codigo do livro").nextLine();
        String title = IO.input("Digite o titulo do livro").nextLine();
        String author = IO.input("Digite o autor do livro").nextLine();
        String isbn = IO.input("Digite o isbn").nextLine();
    }

    public void toListItens() {
        if (itens.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (BibliographicItem item : itens) {
                System.out.println("Livros: ");
            }
        }
    }

    private void searchItemByCode() {
        String code = IO.input("Digite um codigo: ").nextLine();
        Library.searchItemByCode(code);
        if (itens.isEmpty()){
            System.out.println("O campo está vazio.");
        }
    }

    @Override
    public String toString() {
        return "MainSystem{" +
                "itens=" + itens +
                '}';
    }
}




