package patterns.structural.composite;

public class FileItem extends FileSystemItem {
    public FileItem(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("파일: " + name);
    }
}
