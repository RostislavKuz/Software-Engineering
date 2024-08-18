import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lessonsArray = scanner.nextLine().split(", ");
        List<String> lessons = new ArrayList<>();
        for (String string : lessonsArray) {
            lessons.add(string);
        }

        String input = scanner.nextLine();

        while (!input.equals("course start")) {

            String[] command = input.split(":");
            String lessonTitle = command[1];
            String exercise = lessonTitle + "-Exercise";

            switch (command[0]) {
                case "Add":
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    lessons.remove(lessonTitle);
                    lessons.remove(exercise);
                    break;
                case "Swap":
                    String firstLesson = command[1];
                    String secondLesson = command[2];
                    int firstLessonIndex = lessons.indexOf(firstLesson);
                    int secondLessonIndex = lessons.indexOf(secondLesson);
                    String firstLessonExercise = firstLesson + "-Exercise";
                    String secondLessonExercise = secondLesson + "-Exercise";
                    if (lessons.contains(firstLesson) && lessons.contains(secondLesson)) {
                        lessons.set(firstLessonIndex, secondLesson);
                        lessons.set(secondLessonIndex, firstLesson);

                        if (lessons.contains(firstLessonExercise)) {
                            lessons.remove(firstLessonExercise);
                            lessons.add(secondLessonIndex + 1, firstLessonExercise);
                        }
                        if (lessons.contains(secondLessonExercise)) {
                            lessons.remove(secondLessonExercise);
                            lessons.add(firstLessonIndex + 1, secondLessonExercise);
                        }
                    }
                    break;
                case "Exercise":
                    //String exercise = lessonTitle + "-Exercise";
                    if (lessons.contains(lessonTitle)) {
                        if (!lessons.contains(exercise)) {
                            int lessonTitleIndex = lessons.indexOf(lessonTitle);
                            lessons.add(lessonTitleIndex + 1, exercise);
                        }
                    } else {
                        lessons.add(lessonTitle);
                        lessons.add(exercise);
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        for (int i = 1; i <= lessons.size(); i++) {
            System.out.printf("%d.%s%n", i, lessons.get(i - 1));
        }


    }
}
