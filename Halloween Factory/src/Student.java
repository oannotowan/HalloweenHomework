public class Student {

    String name;
    int Ncandy;
    String costume;

    public Student(String paramname, int paramNcandy, String paramcostume){
        name = paramname;
        Ncandy = paramNcandy;
        costume = paramcostume;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("# of candies aquired: " + Ncandy);
        System.out.println("Dressed up as: " + costume);

    }

}
