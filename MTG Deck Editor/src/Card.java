import com.sun.istack.internal.Nullable;

public class Card {
    public final int multiID;
    public final String name;
    public final String type;
    public final int cmc;
    public final String color;
    public final String flavor;
    public final int power;
    public final int toughness;

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
