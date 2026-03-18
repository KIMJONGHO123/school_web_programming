public class _09_Class {
    public static void main(String[] args) {
        
        /*
            클래스 : 설계도
            객체 : 설계도를 통해 만들어진 제품

            class className(Parmaeter){
                인스턴스 변수
                클래스 변수

                인스턴스 메서드
                클래스 메서드
            }
        
        */
       class Person{
            String name;
            int age;

            public Person(String name, int age){
                this.name= name;
                this.age = age;

            }
            public void introduce(){
                System.out.println(String.format("이름 : %s",this.name));
            }

            static String hobby;
            public static void introduceHobby(){
                System.out.println(String.format("취미 : %s",hobby));
            }

            //getter
            public String getName(){
                return this.name;
            }

            // setter
            public void SetName(String name){
                this.name = name;
            }

       }
       Person person = new Person("홍길동", 20);
       person.introduce();
       person.name="이대호";
    //    person.SetName("이대호");
       person.introduce();

       Person.hobby = "축구";
       Person.introduceHobby();
    }
    
}
