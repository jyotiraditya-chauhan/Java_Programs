public class OPPS1 {
    public static void main(String[] args) {

        Rectangle val = new Rectangle(20,12);
        val.sum();
        Rectangle val1 = new Rectangle(10);
        
        val1.sum();
        
    }
}


class Rectangle {
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    };

    public Rectangle(double height) {
        this.height = height;
    }

    void sum() {
        double sum = height + (width == 0.0 ? height : width ) ;
        System.out.println("Addition : " + sum);
    }


}