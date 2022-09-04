package day42_abstraction.exercise;

public abstract class Exercise {

    public abstract void perform();// final or static we can't put it. Because these can't be overidden.

    public abstract  void getCaloriesBurned(int minutes);

}
