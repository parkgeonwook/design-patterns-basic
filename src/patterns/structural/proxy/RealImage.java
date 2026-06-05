package patterns.structural.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(fileName + " 이미지를 로딩합니다");
    }

    @Override
    public void display() {
        System.out.println(fileName + " 이미지를 출력합니다.");
    }
}
