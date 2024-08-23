public class Book extends BibliographicItem {
    private String author;
    private String isbn;

    public Book(String code, String title, int publicationYear, String author, String isbn) {
        super(code, title, publicationYear);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean validateFieldsForBooks(){
        if (author.trim().isEmpty()){
            throw new RuntimeException("Campo do autor invalido");

        } else if (isbn.equals("10") || isbn.equals("13")) {
            throw new RuntimeException("Campo do isbn invalido");

        }
        return false;
    }

    @Override
    public boolean validateFields() {
        return super.validateFields();
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

