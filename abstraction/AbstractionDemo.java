public class AbstractionDemo {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        Appliance myTV = new TV();
        
        myFan.turnOn();
        myTV.turnOn();
    }
}