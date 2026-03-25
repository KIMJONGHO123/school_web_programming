public class _11_Interface {
    public static void main(String[] args) {
        
        /*
            인터페이스 : 클래스의 뼈대

            Java는 클래스를 다중 상속받을 수 없다.
            다중 상속받기 위해 인터페이스를 사용.

            interface 인터페이스명 {
            
            }

        */
        
            interface Shape {
                double calculateArea();
            }

            class Square implements Shape {
                public double x;
                public Square(double x){
                    this.x = x;
                }
                public double calculateArea(){
                    return x*x;
                }
                
            }
            Square square = new Square(5);
            System.out.println(square.calculateArea());
    }
    
}
