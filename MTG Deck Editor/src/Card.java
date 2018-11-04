import com.sun.istack.internal.Nullable;

public class Card {
    int multiID;
    String name;
    String type;
    int cmc;
    String color;
    String flavor;
    int power = 0;
    int toughness = 0;

    public Card(int id, String n, String t, int c, String col, String flav, @Nullable int p, @Nullable int tou)
    {

        multiID = id;
        name = n;
        type = t;
        cmc = c;
        color = col;
        flavor = flav;
        power = p;
        toughness = tou;

    }

}
