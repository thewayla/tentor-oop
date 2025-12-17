package b9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MediaGroup extends Media {
    private final List<Media> list;

    public MediaGroup(String title) {
        super(title);
        this.list = new ArrayList<Media>();
    }

    public void addMedia(Media media) {
        if (media == null) { throw new IllegalArgumentException("b9.Media is null"); }
        else if (this.list.contains(media)) { throw new IllegalArgumentException("b9.Media already exists in this list"); }

        this.list.add(media);
        setLastUpdated();
    }

    public ArrayList<Media> getList() {
        ArrayList<Media> copy = new ArrayList<Media>(this.list);
        copy.sort(Comparator.comparing(Media::getLastUpdated).reversed());

        return copy;
    }

    @Override
    public int compareTo(Media o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() + getList();
    }
}
