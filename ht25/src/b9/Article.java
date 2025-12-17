package b9;

public class Article extends Media {
    private String text;

    public Article(String title, String text) {
        super(title);
        setText(text);
    }

    public void setText(String text) {
        if (text != null && text.length() > 140) {
            throw new IllegalArgumentException("Text is longer than 140 char");
        }
        this.text = text;
        setLastUpdated();
    }

    @Override
    public int compareTo(Media o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() + "Content: " + this.text + "\n";
    }
}
