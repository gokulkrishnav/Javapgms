public class swap {

    public static void main(String [] args){

        int c =10;
        int d = 20;
        String name  = "gokul";

        swap(c,d);
//        System.out.println(a +" "+ b);
        changename(name);

    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " \nb = "+ b);



    }
    static void changename(String naam){
        System.out.println(naam);

    }
}
