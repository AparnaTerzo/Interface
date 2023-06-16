public class Main {
    //constructor

    public static void main(String[] args) {

        //show(name -> System.out.println(name));
        //Method Refrence
        show(System.out::println);
    }
    public static void show(Animal animal){
        animal.display("Welcome to animal world");

    }
}