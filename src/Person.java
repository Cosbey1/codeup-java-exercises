import java.util.Scanner;

public class Person {
    private String name;

    public static void main(String[] args) {
       Person person = new Person();
        System.out.println(person.getName());

    }

    public String getName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        name = scanner.nextLine();
        return String.format("Hello %s", name);
    }

    public void setName(String name){

//TODO: change the name field to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
    }
}
