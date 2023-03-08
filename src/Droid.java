/*
Build a basic droid
 */

public class Droid {

    int batteryLevel = 100;
    String name;

    public Droid(String droidName){
        name = droidName;
    }

    public String toString(){
        return "Hello, I’m the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing " + task);
        batteryLevel = batteryLevel -10;
    }

    public void energyReport(){
        System.out.println("The battery level is currently: " + batteryLevel);
    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");

        System.out.println(myDroid.toString());

        myDroid.performTask("dancing");

        myDroid.energyReport();



    }
}