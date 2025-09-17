package OOPS;

//consider the class to be a movie class, here is all the different types of constructor definition.

public class ConstructorsDemo {
    private String movieName;
    private int movieDuration;

    //custom Default Constructor -> just a default constructor just overwritten the values.
//    ConstructorsDemo(){
//        this.movieDuration = 148;
//        this.movieName = "Avengers";
//    }

    //parameterized constructors
    public ConstructorsDemo(String movieName, int movieDuration){
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    //used to create a similar object
    public ConstructorsDemo(ConstructorsDemo other){
        this.movieName = other.movieName;
        this.movieDuration = other.movieDuration;
    }

    //private constructors used to make singleton class.
    private ConstructorsDemo() {};
}
