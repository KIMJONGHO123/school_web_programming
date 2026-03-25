public class _10_AbstractClass {
    public static void main(String[] args) {
        
        /**
            추상클래스 : 아직 완성하지 않은 클래스

            abstract class 클래스명{
                구현하지 않은 메서드();
            }
         */

            abstract class Shape{
                abstract double calculateArea();
            }

            class Square extends Shape{
                private double x;
                public Square(int x){
                    this.x = x;
                }
                public double calculateArea(){
                    return x*x;
                }
            }

            class Circle extends Shape{
                private double r;
                public Circle(int r){
                    this.r = r;
                }
                public double calculateArea(){
                    return r*r;
                }
            }

            Square Square = new Square(5);
            System.out.println(String.format("한변의 길이가 %s인 사각형의 넓이는 %.2f입니다.",5,Square.calculateArea()));

            Square Circle = new Square(3);
            System.out.println(String.format("반지름 길이가 %s인 원의 넓이는 %.2f입니다.",3,Circle.calculateArea()));
    }
    
}
