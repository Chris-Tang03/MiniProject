public class Puppy {
    int currentDistance=0;

    public void name(){
        //public method that can be called from any classes, void returns no data, and empty parentheses accept no arguments

        System.out.println("Ruff, I'm Zar!");
        //println returns the value within the string quotes
    }

    public void eat(){
        System.out.println("Ruff, Treats!");
    }


    public void sleep(){
        System.out.println("What a Ruff night!");
    }


    public String life(String bark){
        //another public method that has to return the String life method with a String bark argument

        String petLife = "It's a Ruff, Ruff " + bark;
        return petLife;
    }

    public int run(int distance) {
        //public method that returns an integer data with the distance argument, telling the distance the dog has ran.

        currentDistance = currentDistance + distance;
        //Declare a class variable currentDistance in addition to the distance the dog has ran through the integer argument

        System.out.println("Exercising is fun! Ruff! I ran for " +
                distance + " miles with my owner! Ruff!");
        //Concatenated strings and integer distance in the print line

        return currentDistance;
        //return ends the function
    }
}
