package device.repair;

import java.util.ArrayList;
import java.util.Scanner;

public class DeviceRepair {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<laptop> laptopList = new ArrayList<>();
    private static ArrayList<mobilephone> phoneList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to my repair shop");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1 - Add a phone");
            System.out.println("2 - Add a laptop");
            System.out.println("3 - View phones");
            System.out.println("4 - View laptops");
            System.out.println("0 - Exit");
            int userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    addPhone();
                    break;

                case 2:
                    addLaptop();
                    break;

                case 3:
                    viewPhones();
                    break;
                case 4:
                    viewLaptops();
                    break;

                case 0:
                    filehandling.writeFile(laptopList);
                    filehandling2.writeFile(phoneList);

                    System.exit(0);

            }

        }
    }

    public static void addPhone() {
        System.out.println("Please type in the make and model");
        input.nextLine();//to prevent skipping lines
        String makeandmodel = input.nextLine();
        System.out.println("Please type in a serial number");
        String serialn = input.next();
        System.out.println("Please type in the owner");
        input.nextLine();//to prevent skipping lines
        String owner = input.nextLine();
        System.out.println("Problem description");
        String problemd = input.nextLine();
        System.out.println("Please type in the repair notes");
        String repairn = input.next();
        System.out.println("Please type in its priority");
        input.nextLine();//to prevent skipping lines
        int priority = input.nextInt();
        System.out.println("Is it chargeable true or false");
        input.nextLine();//to prevent skipping lines
        boolean chargeable = input.nextBoolean();

        mobilephone myDevice = new mobilephone(makeandmodel, serialn, owner, problemd, repairn, priority, chargeable);
        phoneList.add(myDevice);

        System.out.println(myDevice.toString());

    }
public static void addLaptop() {
        System.out.println("Please type in the make and model");
        input.nextLine();//to prevent skipping lines
        String makeandmodel = input.nextLine();
        System.out.println("Please type in a serial number");
        String serialn = input.next();
        System.out.println("Please type in the owner");
        input.nextLine();//to prevent skipping lines
        String owner = input.nextLine();
        System.out.println("Problem description");
        String problemd = input.nextLine();
        System.out.println("Please type in the repair notes");
        String repairn = input.next();
        System.out.println("Please type in its priority");
        input.nextLine();//to prevent skipping lines
        int priority = input.nextInt();
        

        laptop myDevice = new laptop(makeandmodel, serialn, owner, problemd, repairn, priority );
        laptopList.add(myDevice);

        System.out.println(myDevice.toString());

    }
public static void viewLaptops(){
    if (laptopList.isEmpty()) {
            System.out.println("Sorry, there are no laptops at the moment");
        } else {
            for (int i = 0; i < laptopList.size(); i++) {
                System.out.println(laptopList.get(i).toString());
            }
        }
    
}
public static void viewPhones(){
    if (phoneList.isEmpty()) {
            System.out.println("Sorry, there are no phones at the moment");
        } else {
            for (int i = 0; i < phoneList.size(); i++) {
                System.out.println(phoneList.get(i).toString());
            }
        }
    
}
}
