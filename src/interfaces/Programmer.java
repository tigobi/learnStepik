package interfaces;

public class Programmer implements Worker, Driver{

    @Override
    public void work() {
        System.out.println("Получаю 50$ в час");
    }

    @Override
    public void drive() {
        System.out.println("Еее, веду машину");
    }
}
