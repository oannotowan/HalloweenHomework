public class Halloween {

    String location;
    int temperature;
    int year;

    public static void main(String[] args) {
        Halloween HalloweenNight = new Halloween();
        HalloweenNight.location = "Milton";
        HalloweenNight.year = 2011;
        HalloweenNight.temperature = 67;

        System.out.println("Today is October 31, Halloween Night, and the year is " + HalloweenNight.year + "." +
                " The current temperature is " + HalloweenNight.temperature + " degrees farenheit.");
    }

    public Halloween() {
        Candy Candy1;
        Candy1 = new Candy("100 Grand",201,false);
        Candy1.printInfo();
        Candy Candy2;
        Candy2 = new Candy("Sour Patch Kids",156,true);
        Candy2.printInfo();
        Student Student1;
        Student1 = new Student("Aang",2000000,"Fire Nation's Zuko");
        Student1.printInfo();
        Student Student2;
        Student2 = new Student("Eren Yeager",1,"A Happy Family");
        Student2.printInfo();


    }

}



