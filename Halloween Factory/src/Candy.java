public class Candy {

    String type;
    int calories;
    boolean IsSour;

    public Candy(String paramtype, int paramcalories, boolean paramIsSour){
        type = paramtype;
        calories = paramcalories;
        IsSour = paramIsSour;
    }

    public void printInfo() {
        System.out.println("Candy Type: " + type);
        System.out.println("Calories: " + calories);
        System.out.println("Is it sour? " + IsSour);

    }


}
