import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();
        String[] input = scanner.nextLine().split(", ");
        Article a = new Article(input[0], input[1], input[2]);
        articles.add(a);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]) {
                case "Edit":
                    String editedContent = command[1];
                    articles.get(0).edit(editedContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = command[1];
                    articles.get(0).changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = command[1];
                    articles.get(0).rename(newTitle);
                    break;
            }


        }

        for (Article article : articles) {
            System.out.println(article.getTitle() + " - " + article.getContent() + ": " + article.getAuthor());
        }


    }


    static class Article {

        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        void edit(String content) {
            setContent(content);
        }

        void changeAuthor(String newAuthor) {
            setAuthor(newAuthor);
        }

        void rename(String newTitle) {
            setTitle(newTitle);
        }

    }
}
