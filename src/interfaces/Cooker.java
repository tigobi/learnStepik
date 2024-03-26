package interfaces;

public class Cooker implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Получаю 25$ в час");
    }

    @Override
    public void drive() {
        System.out.println("Еее, веду машину(повар)");
    }
}
