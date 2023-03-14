
class hi {
    public void show(){
        for(int i = 0; i <= 5;i++){
            System.out.println("Hi");
        }
    }
}

class hello {
    public void  show(){
        for(int i = 0;i <= 5; i++){
            System.out.println("Hello");
        }
    }
}



public class threading {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();
        obj1.show();
        obj2.show();

    }
}
