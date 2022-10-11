import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
     String[] People = {};
     People = new String [3];

     People[0]= "Bob";
     People[1]="Joe";
     People[2]="Ken";

     for(String Person: People ) {
         System.out.println(Person);
     };



}
    private static Person[] addPerson(Person[] people, Person newPerson){
    Person[] newArray = Arrays.copyOf(people, people.length+1);
        newArray[newArray.length - 1] = newPerson;
    return newArray;
    }

}
