public abstract class BibliographicItem {
    private String code;
    private String title;
    private int publicationYear;

    public BibliographicItem(String code, String title, int publicationYear) {
        this.code = code;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean validateFields(){
       if (code.trim().isEmpty()){
           throw new RuntimeException("O codigo esta vazio");

       } else if (title.trim().isEmpty()) {
           throw new RuntimeException("O codigo esta vazio");

       } else if (publicationYear < 1000 || publicationYear > 2024) {
           throw new RuntimeException("O ano de publicação esta entre 1000 e 2024");
       }
       return true;
    }

    @Override
    public String toString() {
        return "Bibliographic_item{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}




