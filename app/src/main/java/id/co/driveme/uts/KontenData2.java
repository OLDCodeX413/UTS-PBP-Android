package id.co.driveme.uts;

public class KontenData2 {

    private int img;
    private String tgl;
    private String author;
    private String genre;

    public KontenData2(int img, String tgl, String author, String genre) {
        this.img = img;
        this.tgl = tgl;
        this.author = author;
        this.genre = genre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String author) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Konten{" +
                "img=" + img +
                ", tgl='" + tgl + '\'' +
                ", author='" + author + '\'' +
                ", desc='" + genre + '\'' +
                '}';
    }
}
