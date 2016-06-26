package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.JOptionPane;


/**
 *
 * @author Sondre
 */
public class VikingRaiders {
    private static ArrayList<String> farmers = new ArrayList<>();
    private static ArrayList<String> smiths = new ArrayList<>();
    private static ArrayList<String> farmhouses = new ArrayList<>();
    private static ArrayList<String> forges = new ArrayList<>();
    private static ArrayList<String> woodsmen = new ArrayList<>();
    private static ArrayList<String> woodshops = new ArrayList<>();
    private static ArrayList<String> boatbuilders = new ArrayList<>();

    
    private static ArrayList<String> fishingboats = new ArrayList<>();
    private static ArrayList<String> fishermen = new ArrayList<>();
    
    private static String missionResult = "";
    private static int upkeep = 0;
    private static int happiness = 100;
    private static int bank = 10;
    private static int incomeTick = 0;
    private static int food = 0;
    private static int iron = 0;
    private static int wood = 0;
    private static int ironIncome = 0;
    private static int woodIncome = 0;
    static Timer addIncome = new Timer();
    
    public static void main(String[] args) throws InterruptedException {
      
        farmhouses.add("Farmhouse");
      
        ScheduledTask st = new ScheduledTask();
        addIncome.schedule(st, 0 , 5000);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Current bank is:" + " " + bank);
            System.out.println("Current income is:" + " " + incomeTick);
            Thread.sleep(10000);
              
	}
    }
    public static void buyBoatbuilder() {
        int cost = 100;
        if (bank >= cost && woodshops.size() > 0 && woodsmen.size() > 0) {
            boatbuilders.add("Boatbuilder");
            bank = bank - cost;
            upkeep = upkeep + 10;
        }
        else if (woodshops.size() <= 0) {
            JOptionPane.showMessageDialog(null, "You have no woodshops. Boatbuilders require at least one woodshop");
        }
        else if (woodsmen.size() <= 0) {
            JOptionPane.showMessageDialog(null, "You have no woodsmen. Boatbuilders need woodsmen");
        }
        else if (bank <= cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }      
    }
    public static void buyFishingboat() {
        int cost = 150;
        int ironCost = 20;
        int woodCost = 200;
        
        if (bank >= cost && iron >= ironCost && wood >= woodCost) {
            fishingboats.add("Fishingboat");
            bank = bank - cost;
            iron = iron - ironCost;
            wood = wood - woodCost;
        }
        else if (boatbuilders.size()<= 0) {
            JOptionPane.showMessageDialog(null, "You have no boatbuilders");
        }
        else if (iron < ironCost) {
            JOptionPane.showMessageDialog(null, "Not enough iron");
        }
        else if (wood < woodCost) {
            JOptionPane.showMessageDialog(null, "Not enough wood");
        }
        else if (bank < cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
    }
    public static void buyFisherman() {
        int cost = 200;
        if (bank >= cost && fishingboats.size() > 0) {
            fishermen.add("Fisherman");
            bank = bank - cost;
            food = food + 20;
            incomeTick = incomeTick + 20;
        }
        
    }
    public static void buyFarmer() {
        int cost = 10;
        if (bank >= cost && farmhouses.size()*10 > farmers.size()) {
            farmers.add("Farmer");
            bank = bank - cost;
            incomeTick = incomeTick + 10000;
            food = food + 10;
            
        }
        else if (farmhouses.size()*10 <= farmers.size()) {
            JOptionPane.showMessageDialog(null, "Build more farmhouses to hire more farmers. One farmhouse can sustain 10 farmers");
        }
        else if (bank < cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
        
    

    }
    public static void buyForge() {
        int cost = 50;
        if (bank >= cost) {
            forges.add("Forge");
            bank = bank - 50;
        }
        else if (bank < cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
    }
        
    public static void buyFarmhouse() {
        int cost = 10;
        if (bank >= cost && farmers.size()>0) {
            farmhouses.add("Farmhouse");
            bank = bank - 10;
        }
        else if (farmers.size()<=0) {
            JOptionPane.showMessageDialog(null, "You have no farmers, no further farmhouses are required");
        }
        else if (bank <= cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
    }
            
    public static void buySmiths() {
        int cost = 50;
        if (bank >= cost && food > upkeep && forges.size()*10 > smiths.size()) {
            smiths.add("Smith");
            bank = bank - cost;
            incomeTick = incomeTick + 5;
            upkeep = upkeep + 5;
            ironIncome = ironIncome + 1;
        }
        else if (bank <= cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
        else if (food <= upkeep) {
            JOptionPane.showMessageDialog(null, "Upkeep is higher than food production. Hire more farmers");
        }
         else if (forges.size()*10 <= smiths.size()) {
            JOptionPane.showMessageDialog(null, "Build more forges to hire smiths. One forge can sustain 10 smiths");
        }
    }
    public static void buyWoodshop() {
        int cost = 400;
        int woodCost = 50;
        if (bank>= cost && woodsmen.size()>0 && woodCost < wood ) {
            woodshops.add("Woodshop");
            bank = bank - cost;
            wood = wood - woodCost;
        }
        else if (bank <= cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
        else if (wood <= woodCost) {
            JOptionPane.showMessageDialog(null, "Not enough wood");
        }
        else if (woodsmen.size()<= 0) {
            JOptionPane.showMessageDialog(null, "Woodshops require a woodsman to build them. Hire a woodsman!");
        }
    }
    public static void buyWoodsman() {
        int cost = 200;
        int ironCost = 10;
        if (bank>= cost && food > upkeep && smiths.size()>=1 && iron >= ironCost) {
            woodsmen.add("Woodsman");
            bank = bank - cost;
            iron = iron - ironCost;
            upkeep = upkeep + 10;
            woodIncome = woodIncome + 1;
        }
        else if (iron < ironCost) {
            JOptionPane.showMessageDialog(null, "Not enough iron." + "  " + ironCost + "  " + "iron required");
        }
        else if (bank < cost) {
            JOptionPane.showMessageDialog(null, "Not enough pennings");
        }
        else if (food <= upkeep) {
            JOptionPane.showMessageDialog(null, "Upkeep is higher than food production. Hire more farmers");
        }
        else if (smiths.size()<= 0) {
            JOptionPane.showMessageDialog(null, "Woodsmen require tools! You need to have at least 1 smith");
        }
        
    }
   

    public static void performMission() {
        

        int temp = (Math.random() <= 0.5) ? 1 : 2;
        switch (temp) {
            case 1: 
                setMissionResult("win");
                break;
                
            case 2:
                setMissionResult("loss");
                break;
        }
    }
    /**
     * Setters og getters for alle nødvendige variabler
     * @return 
     */
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
    public static int getUpkeep() {
        return upkeep;
    }
    public static int getFood() {
        return food;
    }
    public static int getForges() {
        return forges.size();
    }
    public static int getWoodIncome() {
        return woodIncome;
    }
    public static void setWoodIncome(int woodIncome) {
        VikingRaiders.woodIncome = woodIncome;
    }
    public static int getIronIncome() {
        return ironIncome;
    }
    public static void setIronIncome(int ironIncome) {
        VikingRaiders.ironIncome = ironIncome;
    }
    public static int getWood() {
        return wood;
    }
    public static void setWood(int wood) {
        VikingRaiders.wood = wood;
    }
    public static int getIron() {
        return iron;
    }
    public static void setIron(int iron) {
        VikingRaiders.iron = iron;
    }
    public static int getWoodsmen() {
        return woodsmen.size();
    }
    public static int getWoodshops() {
        return woodshops.size();
    }
    public static String getMissionResult() {
        return missionResult;
    }
    public static void setMissionResult(String missionResult) {
        VikingRaiders.missionResult = missionResult;
    }
    public static int getBoatbuilders() {
        return boatbuilders.size();
    }

    public static void setBoatbuilders(ArrayList<String> boatbuilders) {
        VikingRaiders.boatbuilders = boatbuilders;
    }

    public static int getFishingboats() {
        return fishingboats.size();
    }

    public static void setFishingboats(ArrayList<String> fishingboats) {
        VikingRaiders.fishingboats = fishingboats;
    }

    public static int getFishermen() {
        return fishermen.size();
    }

    public static void setFishermen(ArrayList<String> fishermen) {
        VikingRaiders.fishermen = fishermen;
    }
    /**
     * Usikker på om denne trengs, but why the eff not
     * @param i set upkeep
     */
    public static void setUpkeep(int i) {
        upkeep = i;
    }

   
}
