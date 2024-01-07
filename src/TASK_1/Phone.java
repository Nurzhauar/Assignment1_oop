package TASK_1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone(){
        this.number = "N/A";
        this.model = "N/A";
        this.weight = 0.0;
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " звонит");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " звонит с номера: " + callerNumber);
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Отправка сообщения на номера: ");
        for (String number : phoneNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("87076232537", "iPhone 15 pro max", 0.2);
        Phone phone2 = new Phone("87758096800", "Redmi note 12");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1: Номер - " + phone1.getNumber() + ", Модель - " + phone1.model + ", Вес - " + phone1.weight);
        System.out.println("Телефон 2: Номер - " + phone2.getNumber() + ", Модель - " + phone2.model + ", Вес - " + phone2.weight);
        System.out.println("Телефон 3: Номер - " + phone3.getNumber() + ", Модель - " + phone3.model + ", Вес - " + phone3.weight);

        phone1.receiveCall("Nina");
        phone2.receiveCall("Merey", "87076232537");

        phone3.receiveCall("Amir", "87751367575");

        phone1.sendMessage("87076232537", "87758096800");
        phone2.sendMessage("87057777890");
    }
}