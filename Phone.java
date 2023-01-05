import java.util.Scanner;
import java.util.ArrayList;
public class Phone {
    private String number;
    private String model;
    private double weight;
    public static ArrayList<String> phoneNumbers = new ArrayList<String>();
    public Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this(number,model,0.25);
    }
    public Phone(){
        this.number = "0";
        this.model = "?";
        this.weight = 0;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void receiveCall(String name, String number){
        System.out.println(name +" "+ number +  " is ringing");
    }

    public static void sendMessage(String number){
        phoneNumbers.add(number);
        System.out.print("Message sent to ");
        for(int i = 0; i < phoneNumbers.size(); i++){
            if(i < (phoneNumbers.size() - 1)){
                System.out.print(phoneNumbers.get(i) + ", ");
            }
            else{
            System.out.println(phoneNumbers.get(i));
            }
        }
    }
}