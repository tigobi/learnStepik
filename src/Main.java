public class Main {
    public static void main(String[] args) {
        Box current = new Box(10);
        Box another = current.increase();
        current.showVolume();
        another.showVolume();
    }
}
