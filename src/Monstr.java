import java.awt.*;

public class Monstr {
    int eyesCount;
    int armsCount;
    int legsCount;
    int everythingCount;
    Monstr(){
        eyesCount = 2;
        armsCount = 2;
        legsCount = 2;
    }
    Monstr(int everythingCount){
        eyesCount = everythingCount;
        armsCount = everythingCount;
        legsCount = everythingCount;
    }
    Monstr(int eyesCount, int armsCount, int legsCount){
        this.eyesCount = eyesCount;
        this.armsCount = armsCount;
        this.legsCount = legsCount;
    }
    public void voice(){
        System.out.println("grrrrrrrrrrrrrr");
    }
    public void voice(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("grrrrrrrrrrrrrrrr");
        }
    }
    public void voice(int count, String scream){
        for (int i = 0; i < count; i++) {
            System.out.println(scream);
        }
    }
}
