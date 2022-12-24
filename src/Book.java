public class Book {
    private String name;
    private int numberOfPage;
    private String author;
    public String releaseDate;

    public Book(String name, int numberOfPage, String author, String releaseDate) {
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Kitap Adı='" + name + '\'' +
                ", Sayfa Sayısı=" + numberOfPage +
                ", Yazar='" + author + '\'' +
                ", Yayınlanma Tarihi='" + releaseDate + '\'';
    }
}
