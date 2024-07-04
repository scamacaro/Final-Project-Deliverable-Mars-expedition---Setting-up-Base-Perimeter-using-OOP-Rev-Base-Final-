/*
 Sanyerlis Camacaro - Sanyerliscamacaro@uat.edu - CSC203
 Final Project Deliverable: Mars expedition - Setting up Base Perimeter using OOP

 Objective:

Final Project - Develop an application using objects and classes. 
 */

// Create our Main class.
public class Main {
    // Create our main method
    public static void main(String[] args){
        // Display a title for the program called Mars Base
        System.out.println("\n\n\t *** Rev Base***\n\n");

        // Displat intro to the program
        System.out.println("\nWelcome to Rev Base. You are the leading commander of the rebel tribe at Rev Base.\n");
        System.out.println("\nOther Members of the Base have helped set up the essential units to survive.");
        System.out.println("\nIt's your mission to mantain, and keep expanding the base.\n");
        System.out.println("\nYour first mission is to visit every Pod, and make sure everything is working alright!\n");
        System.out.println("\nIf something is off you need to report it to Starbase 13!\n");
        System.out.println("\nHere's the current status of the Pods at Rev Base: ");

        
        // Create a new pod objects.
        // Create our command pod.
        HeadQuartersPod headquartersPod01 = new HeadQuartersPod("HeadQuarters 01");
        DormitoryPod dormitoryPod01 = new DormitoryPod("Dormitory 01", 100, 160,110);
        CafeteriaPod cafeteriaPod01 = new CafeteriaPod("Cafeteria 01", 10,50);
        LaboratoryPod laboratoryPod01 = new LaboratoryPod("Laboratory 01");
        StoragePod storagePod01 = new StoragePod("Storage 01", 300);
        

        // Use our objects.
        headquartersPod01.DisplayLightStatus();
        dormitoryPod01.DisplayLightStatus();
        dormitoryPod01.TurnLightsOn();
        dormitoryPod01.DisplayLightStatus();
        dormitoryPod01.DisplayWaterStatus();
        dormitoryPod01.TurnWaterOn();
        dormitoryPod01.DisplayWaterStatus();
        dormitoryPod01.TurnWaterOff();
        cafeteriaPod01.DisplayWaterStatus();
        cafeteriaPod01.TurnWaterOn();
        cafeteriaPod01.TurnWaterOff();
        cafeteriaPod01.TurnStatusClosed();
        cafeteriaPod01.TurnCleanOn();
        laboratoryPod01.TurnSecurityOn();
        laboratoryPod01.TurnSecurityOff();
        headquartersPod01.TurnSecurityOn();
        storagePod01.DisplayTemperatureStatus();
        storagePod01.IncreaseTemperature();

        System.out.println("------------------------------------------------------------");
        
        dormitoryPod01.DisplayNumberOfMaxEmployees();
        System.out.println("\n");
        dormitoryPod01.DisplayNumberOfMaxBeds();
        System.out.println("\n");
        dormitoryPod01.DisplayNumberOfMaxShowers();
        System.out.println("\n");
        cafeteriaPod01.DisplayNumberOfMaxStations();
        System.out.println("\n");
        cafeteriaPod01.DisplayNumberOfMaxTables();
        System.out.println("\n");
        storagePod01.DisplayNumberOfMaxCapacity();

        


        // End of Program.
        System.out.println("\nWe hope you enjoyed the tour, and listened carefully. Everything you learn today will be part of YOUR mission.\n");
        System.out.println("\nClick DELETE to exit mission.\n"); // Exit Line.
    }

}
