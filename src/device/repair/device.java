/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device.repair;

/**
 *
 * @author tim
 */
public class device {
    protected String makeandmodel;
    protected String serialnumber;
    protected String owner;
    protected String problemdescription;
    protected String repairnotes;
    protected int priority;

    public device(String makeandmodel, String serialnumber, String owner, String problemdescription, String repairnotes, int priority) {
        this.makeandmodel = makeandmodel;
        this.serialnumber = serialnumber;
        this.owner = owner;
        this.problemdescription = problemdescription;
        this.repairnotes = repairnotes;
        this.priority = priority;
    }
    
    

        
    
public String toString(){
        return makeandmodel +", "+serialnumber+", "+owner+", "+problemdescription+", "+repairnotes+", "+priority;
    }

    public String getMakeandmodel() {
        return makeandmodel;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getProblemdescription() {
        return problemdescription;
    }

    public String getRepairnotes() {
        return repairnotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setMakeandmodel(String makeandmodel) {
        this.makeandmodel = makeandmodel;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setProblemdescription(String problemdescription) {
        this.problemdescription = problemdescription;
    }

    public void setRepairnotes(String repairnotes) {
        this.repairnotes = repairnotes;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}