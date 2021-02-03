/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device.repair;

import java.util.ArrayList;

/**
 *
 * @author tim
 */
public class laptop extends device {

    ArrayList<component> mycomponents = new ArrayList<>();

    public laptop(String makeandmodel, String serialnumber, String owner, String problemdescription, String repairnotes, int priority) {
        super(makeandmodel, serialnumber, owner, problemdescription, repairnotes, priority);
    }

    @Override
//it looks for one with the same method signatuere
//run subclass one instead and ignore superclass
    public String toString() {
        return makeandmodel + ", " + serialnumber + ", " + owner + ", " + problemdescription + ", " + repairnotes + ", " + priority + ", " + mycomponents.toString();
    }

    public ArrayList<component> getcomponents() {
        return mycomponents;
    }

    public void AddComponent(component component1) {
        mycomponents.add(component1);

    }

    public void deleteComponent(int index) {
        //5 things in it, indexes 0-4
        if (index >= 0 && index < mycomponents.size()) {
            mycomponents.remove(index);
        }
    }
}
