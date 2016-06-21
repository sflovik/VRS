/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.TimerTask;

/**
 *
 * @author Sondre
 */
public class ScheduledTask extends TimerTask {
    mainWindowGUI gui = new mainWindowGUI();
    @Override
    public void run() {
        int Bank = VikingRaiders.getBank();
        int income = VikingRaiders.getIncomeTick();
        int updatedBank = Bank + income;
        VikingRaiders.setBank(updatedBank);
        gui.setVisible(true);
        if (VikingRaiders.getFarmers() > 10 && VikingRaiders.getFarmhouses() == 0) {
            int happiness = VikingRaiders.getHappiness();
            VikingRaiders.setHappiness(happiness-1);
        }
        gui.updateLabels();
      
    }
}

