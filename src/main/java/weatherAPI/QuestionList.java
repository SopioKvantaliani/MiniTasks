package weatherAPI;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class QuestionList {
    public static void main(String[] args) {

    String question = "What is the most popular programming language?";
    Map<String, String> options = new LinkedHashMap<>();
        options.put("A", "Java");
        options.put("B", "Python");
        options.put("C", "C++");
        options.put("D", "JavaScript");

        Map<String, String> answers = new HashMap<>();
        answers.put("A", "Java");

        System.out.println(question);

        for (Map.Entry<String, String> entry: options.entrySet()){
                System.out.println(entry.getKey()+". "+ entry.getValue());
            }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your answer A, B, C or D");
    System.out.println();
    String userInput = scanner.nextLine().toUpperCase();

     while (!answers.containsKey(userInput)){

         System.out.println("Try again");
         userInput = scanner.nextLine().toUpperCase();

     }

        System.out.println("Good Job!");

  }
}

