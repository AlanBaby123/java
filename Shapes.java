public class Shapes {
    int area(int a){
        return a*a;
    }
    double area(int b,int h){
        return 0.5*b*h;
    }
    double area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args){
        Shapes obj = new Shapes();
        System.out.println("Area of square:" + obj.area(5));
        System.out.println("Area of triangle:" + obj.area(2,4));
        System.out.println("Area of circle:" + obj.area(2.5));
    }
}


