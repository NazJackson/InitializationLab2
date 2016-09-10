package jackson.nazhir.InitializationLab2;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class ColorfulThing {
    private Color color;

    public ColorfulThing(Color color){
        this.color = color;
    }


    public String getColor(){
        return String.valueOf(color);
    }
    public enum Color{
        BLUE,
        RED,
        ORANGE,
        PURPLE,
        GREEN
    }

}
