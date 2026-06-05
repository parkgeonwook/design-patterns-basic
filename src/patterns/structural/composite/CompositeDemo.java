package patterns.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        FileSystemItem file1 = new FileItem("a.txt");
        FileSystemItem file2 = new FileItem("b.txt");

        Folder folder1 = new Folder("문서");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("루트");
        folder2.add(folder1);
        folder2.add(new FileItem("readme.md"));

        folder2.show();
    }
}
