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
public class mobilephone extends device{
    public boolean Chargeable;

    public mobilephone(String makeandmodel, String serialnumber, String owner, String problemdescription, String repairnotes, int priority, boolean Chargeable) {
        super(makeandmodel, serialnumber, owner, problemdescription, repairnotes, priority);
    }

    @Override
//it looks for one with the same method signatuere
//run subclass one instead and ignore superclass
    public String toString() {
        return makeandmodel + ", " + serialnumber + ", " + owner + ", " + problemdescription + ", " + repairnotes + ", " + priority + ", " + Chargeable;
}
}
