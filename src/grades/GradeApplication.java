package grades;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GradeApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Bob");
        student1.addGrade(55);
        student1.addGrade(88);
        student1.addGrade(33);

        Student student2 = new Student("Jane");
        student2.addGrade(75);
        student2.addGrade(36);
        student2.addGrade(86);

        Student student3 = new Student("Allen");
        student3.addGrade(90);
        student3.addGrade(42);
        student3.addGrade(85);

        Student student4 = new Student("Kenny");
                student4.addGrade(87);
                student4.addGrade(25);
                student4.addGrade(76);


//        students.put(student2.getName(),student2);
        students.put("GiJane", student2);
//        students.put(student1.getName(),student1);
        students.put("BobtheBuilder", student1);
//        students.put(student3.getName(),student3);
        students.put("TheAnswer", student3);
        students.put("KennyMcCormick", student4);
        StringBuilder student = new StringBuilder();
        for (Map.Entry<String,Student> entry : students.entrySet()){
            student.append("|").append(entry.getKey()).append(" |");
            System.out.println(entry.getKey());
        }

        System.out.println(student);

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();

        boolean conversation = false;
        do {
            System.out.println("Which Student would you like more information on ?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (students.containsKey(input)) {
               System.out.println(students.get(input).getGradeAverage() + " " + students.get(input).getName());
            }

            System.out.println("Would you like info on another student? [y/n]");
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("y")){
                conversation = true;
            }else if(userInput.equalsIgnoreCase("n")){
                conversation = false;
                System.out.println("Have a great day!");
            }
        }while(conversation);
//         if (input.endsWith("y")){
//             continue;
//         } else {
//             if(input.endsWith("n")){
//                 break;
//                 System.out.println("Have a great day!");
//             }
//         }


    }


//        StringBuilder str  = new StringBuilder();

//        if (input = Student) {
//            return ;
//        }
//        System.out.println(students.get("BobtheBuilder").getGradeAverage());



    }

