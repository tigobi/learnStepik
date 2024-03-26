package interfaces;

public class Director implements Worker {
    @Override
    public void work() {
        System.out.println("получаю 100$ в час");
    }
}
