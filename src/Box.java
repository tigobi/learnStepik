public class Box {
    double length;
    double width;
    double height;
    Box(double size){
        this(size, size, size);
    }
    Box(){
        this(10);
    }
    Box(Box another){
        this(another.length, another.width, another.height);
    }
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box copy(){
        return new Box(length,width,height);
    }
    Box increase(){
        return new Box(length*2,width*2,height*2);
    }
    void setDimens(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double getVolume(){
        return length*width*height;
    }
    void showVolume(){
        System.out.println(getVolume());
    }
}
