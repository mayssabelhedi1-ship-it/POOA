package mediatheque;

public abstract class Document implements Comparable<Document> {
    protected final String titre;
    protected final int annee;

    protected Document(String titre, int annee) {
        this.titre = titre;
        this.annee = annee;
    }

    public String getTitre() { return titre; }
    public int getAnnee() { return annee; }

    public abstract String descriptionCourte();

    @Override
    public int compareTo(Document autre) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.titre, autre.titre);
    }
}
