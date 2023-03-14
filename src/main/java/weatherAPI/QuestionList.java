package weatherAPI;

import java.util.*;

public class QuestionList {
    public static void main(String[] args) {

    String question = "What is the most popular programming language?";
    Map<Enum, String> options = new LinkedHashMap<>();
        options.put(Choice.A, "Java");
        options.put(Choice.B, "Python");
        options.put(Choice.C, "C++");
        options.put(Choice.D, "JavaScript");
        Map<Enum, String> answers = new LinkedHashMap<>();
        options.put(Choice.A, "Java");


    System.out.println(question);

    for (Map.Entry<Enum, String> entry: options.entrySet()){
            System.out.println(entry.getKey()+". "+ entry.getValue());
        }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your answer A, B, C or D");
    System.out.println();
    String userInput = scanner.nextLine().toUpperCase();

    while (userInput.equals(true)){


    }



//      String[] userAnswers = userInput.split(",");
//      List<String> userAnswerList = new ArrayList<>();
//        for (String each : userAnswers) {
//        userAnswerList.add(each.trim());
//    }
//        if (userAnswerList.containsAll(List.of(answers))) {
//        System.out.println("Correct!");
//    } else {
//        System.out.println("Incorrect.");
//    }
  }
}

