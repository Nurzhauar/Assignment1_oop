package TASK_8;

public class Horse extends Animal {
    private String maneColor;

    public Horse(String food, String location, String maneColor) {
        super(food, location);
        this.maneColor = maneColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is neighing");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating hay");
    }
}

