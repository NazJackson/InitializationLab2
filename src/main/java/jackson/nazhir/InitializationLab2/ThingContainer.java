package jackson.nazhir.InitializationLab2;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class ThingContainer {
    int count = 0;
    ColorfulThing[] arrayOfThings;
    String message ;

    public ThingContainer(ColorfulThing[] arrayOfThings){
        this.arrayOfThings = arrayOfThings;

    }
    public ThingContainer(int sizeOfArray){

        arrayOfThings = new ColorfulThing[sizeOfArray];


    }
    public void add(ColorfulThing color){

      if (arrayOfThings.length != count){
          arrayOfThings[count] = color;
          count ++;
      }
      else {
          message =  "Container full man sorry :(";
          System.out.println(message);
      }

    }
    public ColorfulThing getColorfulThing(int i){

        return arrayOfThings[i];
    }

    public ColorfulThing pop(){
        ColorfulThing color = arrayOfThings[arrayOfThings.length-1];
        arrayOfThings[arrayOfThings.length-1] = null;
        count --;
        return color;
    }
    public void printThings(){
        for (int i = 0; i < arrayOfThings.length; i++) {
            System.out.print(arrayOfThings[i].getColor() + " ");
        }

    }
    public void shiftArray(){
        ColorfulThing temp;
        for(int i = 0; i < arrayOfThings.length; i++){
            if(arrayOfThings[i].equals(null)){
                temp = arrayOfThings[i];
                arrayOfThings[i] = arrayOfThings[i+1];
                arrayOfThings[i+1] = temp;
            }

        }

    }
    public ColorfulThing remove(ColorfulThing color){
        for(int i=0; i< arrayOfThings.length; i++){

            if(color.equals(arrayOfThings[i])){
                ColorfulThing color2 = color;
                arrayOfThings[i] = null;
                count --;
                shiftArray();
                return color2;

            }


        }
        return null;
    }
    public ColorfulThing.Color remove(ColorfulThing.Color color) {
        for (int i = 0; i < arrayOfThings.length; i++) {

            if (String.valueOf(color).equals(arrayOfThings[i].getColor())) {
                ColorfulThing.Color color2 = color;
                arrayOfThings[i] = null;
                count --;
                shiftArray();
                return color2;
            }

        }
        return null;
    }
    public static void main(String[] args) {


        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing[] colorArray = {red, blue};
        ThingContainer thing1 = new ThingContainer(colorArray);
        thing1.add(blue);
        thing1.add(red);
        thing1.printThings();

    }
}
