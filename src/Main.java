import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green ");
        colors.add("black");
        colors.add("white");
        colors.add("pink");
        colors.add("yellow");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors + "     По алфавиту");
        Collections.reverse(colors);
        System.out.println(colors + "       Обратное");
        Collections.shuffle(colors);
        System.out.println(colors + "      Рандомно ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("********* ");
        for (String color : colors) {
            System.out.println(color);
        }
        Player player1=new Player("Ron",24);
        Player player2=new Player("Zuk",37);
        Player player3=new Player("Bob",28);
        ArrayList<Player> players=new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        System.out.println("Коллекция"+players);

    }
}

