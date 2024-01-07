package TASK_8;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Meat", "Doghouse", "Hasky");
        animals[1] = new Cat("Milk", "House", "Gray");
        animals[2] = new Horse("Hay", "Stable", "Brown");

        Veterinary vet = new Veterinary();


        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}

