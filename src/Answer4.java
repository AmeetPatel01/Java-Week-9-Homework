import java.util.ArrayList;
public class Answer4 {
    public static void main(String[] args) {
        ArrayList<String> favoriteColours= new ArrayList();
        favoriteColours.add("Blue");
        favoriteColours.add("Red");
        favoriteColours.add("Green");
        favoriteColours.add("Yellow");
        favoriteColours.add("Black");
        favoriteColours.add("Purple");

        for (String taskThreeColours : favoriteColours) {
            System.out.println(taskThreeColours);

        }
    }
}
