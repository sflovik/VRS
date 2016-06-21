package main;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;


/**
 *
 * @author Sondre
 */
public class VikingRaiders {
    private static ArrayList<String> farmers = new ArrayList<>();
    private static ArrayList<String> smiths = new ArrayList<>();
    private static ArrayList<String> farmhouses = new ArrayList<>();
    private static ArrayList<String> forges = new ArrayList<>();
    private static int happiness = 100;
    private static int bank = 10;
    private static int incomeTick = 0;
    
    public static void main(String[] args) throws InterruptedException {
      
       
        Timer addIncome = new Timer();
        ScheduledTask st = new ScheduledTask();
        addIncome.schedule(st, 0 , 5000);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Current bank is:" + " " + bank);
            System.out.println("Current income is:" + " " + incomeTick);
            Thread.sleep(10000);
              
	}
    }
    public static void buyFarmer() {
        int cost = 10;
        if (bank > cost || bank == cost) {
            farmers.add("Farmer");
            bank = bank - cost;
            incomeTick = incomeTick + 1;
        }
        else {
            System.out.println("You're broke");
        }


    }
    public static void buySmiths() {
        int cost = 50;
        if (bank > cost || bank == cost) {
            smiths.add("Smith");
            bank = bank - 50;
            incomeTick = incomeTick + 5;
        }
        else {
            System.out.println("You're broke");
        }

    }
    public static int getHappiness() {
        return happiness;
    }
    public static void setHappiness(int i) {
        happiness = happiness - i;
    }
    public static int getFarmhouses() {
        return farmhouses.size();
    }
    public static void addFarmhouses(String s) {
        farmhouses.add(s);
    }
    public static int getBank() {
        return bank;
    }
    public static void setBank(int i) {
        bank = i;
    }
    public static int getIncomeTick() {
        return incomeTick;
    }
    public static void setIncomeTick(int i) {
        incomeTick = i;
    }
    public static int getFarmers() {
        return farmers.size();
    }
    public static int getSmiths() {
        return smiths.size();
    }

   
}
