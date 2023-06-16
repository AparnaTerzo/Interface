// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Demo {
    public static void main(String[] args){
        greet(new Animal() {
            @Override
            public void display(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Animal animal){

        System.out.println("It is a lion");
    }
    }
