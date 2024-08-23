public class Periodic extends BibliographicItem {
private String periodicity;
private int volume;

    public Periodic(String code, String title, int publicationYear, String periodicity, int volume) {
        super(code, title, publicationYear);
        this.periodicity = periodicity;
        this.volume = volume;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean validateFieldsForPeriodic(){
        if (periodicity.trim().isEmpty()){
            throw new RuntimeException("Este campo esta invalidoha'");

        } else if (volume < 0) {
            throw new RuntimeException("Campo do volume invalido");
        }
        return false;
    }

    @Override
    public boolean validateFields() {
        return super.validateFields();
    }
    @Override
    public String toString() {
        return "Periodic{" +
                "periodicity='" + periodicity + '\'' +
                ", volume=" + volume +
                '}';
    }
}
