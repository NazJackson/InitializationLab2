package jackson.nazhir.InitializationLab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class ThingContainerTest {


    @Test
    public void addTest(){
        ThingContainer thingy = new ThingContainer(1);
        ColorfulThing expected = new ColorfulThing(ColorfulThing.Color.BLUE);
        thingy.add(expected);
        ColorfulThing actual = thingy.getColorfulThing(0);


        Assert.assertEquals("you Array should have 1 blue", expected, actual);



    }
    @Test
    public void containerFullTest(){
        ThingContainer things = new ThingContainer(1);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        Assert.assertNull(things.message);
        things.add(blue);
        things.add(blue);
        String expected = "Container full man sorry :(";
        String actual = things.message;
        Assert.assertEquals("You should have gotten a Container full message", expected, actual);



    }
    @Test
    public void popTest(){
        ThingContainer things =new ThingContainer(2);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        things.add(blue);
        things.add(red);
        ColorfulThing expected = red;
        ColorfulThing actual = things.pop();

        Assert.assertEquals("you should get red", expected, actual);

    }
    @Test
    public void removeTest1(){
        ThingContainer things =new ThingContainer(2);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        things.add(blue);
        things.add(red);
        ColorfulThing expected = red;
        ColorfulThing actual = things.remove(red);

        Assert.assertEquals("you should get red", expected, actual);

    }

    @Test
    public void removeTest2(){
        ThingContainer things = new ThingContainer(2);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        things.add(blue);
        things.add(red);
        ColorfulThing.Color expected = ColorfulThing.Color.RED;
        ColorfulThing.Color actual = things.remove(ColorfulThing.Color.RED);

        Assert.assertEquals("you should get red", expected, actual);
    }

}
