public class PetOwner {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        //Creating a new instance Puppy through the variable myPuppy

        myPuppy.name();
        //calling the method name from the Puppy class

        String pupViewsOnLife;
        //the variable pupViewsOnLife stores the value for the method life

        pupViewsOnLife = myPuppy.life("life!");
        //Specifying the variable pupViewsOnLife to store the value of myPuppy.life

        System.out.println(pupViewsOnLife);
        //Prints out the value of pupViewsOnLife

        myPuppy.eat();
        //calling the method eat

        myPuppy.run(3);
        //calling the method run

        myPuppy.sleep();
        //calling the method sleep

    }
}


// Had a problem with compiler output, but fixed it by specifying the project's directory followed with "/out"