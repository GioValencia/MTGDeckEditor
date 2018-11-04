import com.sun.istack.internal.Nullable;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Deck {

    String name;
    ArrayList<Tuple> deck;

    public Deck(String n)
    {
        this.name = n;
    }

    void add(Card card, @Nullable Integer quantity)
    {
        Tuple x;
        if (quantity == null)
        {
            x = new Tuple(card, 1);
        }
        else
        {
            x = new Tuple(card, quantity);
        }

        this.deck.add(x);

    }

    void saveToFile()
    {
        try
        {
            deleteFile();

            FileWriter fw=new FileWriter("C:\\" + this.name +".txt");
            for (Tuple x : this.deck)
            {
                fw.write(x.quantity + " " + x.card.name);
            }
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Save to file successful");
    }

    void deleteFile()
    {
        File f = new File("C:\\" + this.name +".txt");

        if(f.delete())
        {
            System.out.println("File " + this.name +".txt deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete file " + this.name + ".txt");
        }
    }

}
