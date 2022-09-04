package day42_abstraction.exercise;

public class Gym {

    public static void main(String[] args) {
        //Exercise obj = new Exercise(); not valid because Exercise is abstract- cannot create onj from it.

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

    }
}
