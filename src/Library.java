import java.util.List;
import java.util.ArrayList;

 public class Library {
     private static List<BibliographicItem> itens = new ArrayList<>();


     public Library() {
         this.itens = new ArrayList<>();
     }

     public void addItem(BibliographicItem item) {
         itens.add(item);
     }

     public void toListItens() {
         if (itens.isEmpty()) {
             System.out.println("A biblioteca está vazia.");
         } else {
             for (BibliographicItem item : itens) {
                 System.out.println(item);
             }
         }
     }

     public static BibliographicItem searchItemByCode(String code) {
         for (BibliographicItem item : itens) {
             if (item.getCode().equals(code)) {
                 return item;
             }
         }
         return null;
     }

     @Override
     public String toString() {
         return "Bibligraphic{" +
                 "itens=" + itens +
                 '}';
     }
 }