import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private  List<Item> Items;
    public static void main(String[] args) throws java.io.IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("OMGHAI!");

        Main app = new Main();
        app.Items = Arrays.asList(
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        );

        app.UpdateQuality();

        System.in.read();
    }

    public void UpdateQuality()
    {
        for (var i = 0; i < Items.size(); i++)
        {
            if (Items.get(i).name != "Aged Brie" && Items.get(i).name != "Backstage passes to a TAFKAL80ETC concert")
            {
                if (Items.get(i).quality > 0)
                {
                    if (Items.get(i).name != "Sulfuras, Hand of Ragnaros")
                    {
                        Items.get(i).quality = Items.get(i).quality - 1;
                    }
                }
            }
            else
            {
                if (Items.get(i).quality < 50)
                {
                    Items.get(i).quality = Items.get(i).quality + 1;

                    if (Items.get(i).name == "Backstage passes to a TAFKAL80ETC concert")
                    {
                        if (Items.get(i).sellIn < 11)
                        {
                            if (Items.get(i).quality < 50)
                            {
                                Items.get(i).quality = Items.get(i).quality + 1;
                            }
                        }

                        if (Items.get(i).sellIn < 6)
                        {
                            if (Items.get(i).quality < 50)
                            {
                                Items.get(i).quality = Items.get(i).quality + 1;
                            }
                        }
                    }
                }
            }

            if (Items.get(i).name != "Sulfuras, Hand of Ragnaros")
            {
                Items.get(i).sellIn = Items.get(i).sellIn - 1;
            }

            if (Items.get(i).sellIn < 0)
            {
                if (Items.get(i).name != "Aged Brie")
                {
                    if (Items.get(i).name != "Backstage passes to a TAFKAL80ETC concert")
                    {
                        if (Items.get(i).quality > 0)
                        {
                            if (Items.get(i).name != "Sulfuras, Hand of Ragnaros")
                            {
                                Items.get(i).quality = Items.get(i).quality - 1;
                            }
                        }
                    }
                    else
                    {
                        Items.get(i).quality = Items.get(i).quality - Items.get(i).quality;
                    }
                }
                else
                {
                    if (Items.get(i).quality < 50)
                    {
                        Items.get(i).quality = Items.get(i).quality + 1;
                    }
                }
            }
        }
    }
}

