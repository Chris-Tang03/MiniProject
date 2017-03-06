public class PetOwner {
    public static void main(String[] args) {
        //Creating a new instance Puppy through the variable myPuppy
        Puppy myPuppy = new Puppy();

        //calling the method name from the Puppy class
        myPuppy.name();

        //Creating a variable pupViewsOnLife
        String pupViewsOnLife;

        //Specifying the variable pupViewsOnLife to store the value of myPuppy.life
        pupViewsOnLife = myPuppy.life("life!");

        //Prints out the value of pupViewsOnLife
        System.out.println(pupViewsOnLife);

        //calling the method eat
        myPuppy.eat();

        //calling the method run
        myPuppy.run(3);

        //calling the method sleep
        myPuppy.sleep();
    }
}


// Had a problem with compiler output, but fixed it by specifying the project's directory followed with "/out"