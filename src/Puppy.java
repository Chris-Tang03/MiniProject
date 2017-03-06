public class Puppy {
    int currentDistance=0;

    //public method that can be called from any classes, void returns no data, and empty parentheses accept no arguments
    public void name(){

        //println returns the value within the string quotes
        System.out.println("Ruff, I'm Zar!");
    }

    //public method that can be called from any classes, void returns no data, and empty parentheses accept no arguments
    public void eat(){
        System.out.println("Ruff, Treats!");
    }

    //public method that can be called from any classes, void returns no data, and empty parentheses accept no arguments
    public void sleep(){
        System.out.println("What a Ruff night!");
    }

    //another public method that has to return the String life method with a String bark argument
    public String life(String bark){

        String petLife = "It's a Ruff, Ruff " + bark;
        return petLife;
    }

    //public method that returns an integer data with the distance argument, telling the distance the dog has ran.
    public int run(int distance) {

        //Declare a class variable currentDistance in addition to the distance the dog has ran through the integer argument
        currentDistance = currentDistance + distance;

        //Concatenated strings and integer distance in the print line
        System.out.println("Exercising is fun! Ruff! I ran for " +
                distance + " miles with my owner! Ruff!");

        //return ends the function
        return currentDistance;
    }
}
