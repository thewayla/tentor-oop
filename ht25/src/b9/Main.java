package b9;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MediaGroup group1 = new MediaGroup("Group 1");

        Article article1 = new Article("B", "Hey!");
        Article article2 = new Article("C", "Hey x2!");

        System.out.println(group1.toString());

        group1.addMedia(article1);
        group1.addMedia(article2);

        System.out.println(article1.toString());
        System.out.println(group1.toString());

        Article article3 = new Article("A", "Sneaky article");
        group1.addMedia(article3);

        article1.setText("Edited!");
        System.out.println(article1.toString());
        System.out.println(group1.toString());

    }
}