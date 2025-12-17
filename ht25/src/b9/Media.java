package b9;

import java.time.LocalDateTime;

public abstract class Media implements Comparable<Media> {
    private LocalDateTime lastUpdated;
    private final String title;

    public Media(String title) {
        this.title = title;
        this.lastUpdated = LocalDateTime.now();
    }

    public void setLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    @Override
    public int compareTo(Media other) {
        return other.lastUpdated.compareTo(this.lastUpdated);
    }

    private String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Last updated: " + lastUpdated.toLocalDate() + " (" + lastUpdated.toLocalTime() + ")" + "\n";
    }
}
