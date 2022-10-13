class Student {

    String name;
    int age;


    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }


    Student() {
        System.out.println(" hello students");
    }
}

class OOPS {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "gokul";
        s1.age = 22;
        s1.printinfo();

        new Student();

    }
}


