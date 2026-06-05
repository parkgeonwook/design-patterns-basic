package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {

    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void show() {
        System.out.println("폴더: " + name);
        for (FileSystemItem item : items) {
            item.show();
        }
    }
}
