// This is our child class of our Pod Class Cafeteria Pod.
// This means our command pod will inherit all the properties and methods of the Pod class.
// To do this we will use the keyword extends.
public class CafeteriaPod extends Pod {

    // Properties
    // We want to add a property that is specific to the Cafeteria pod.
    // We want to add a property that will hold the number of stations.
    int NumberOfStationsMax;
    int NumberOfTablesMax;
    
    // Create our constructor.
    public CafeteriaPod(String podName, int numberOfStationsMax, int numberOfTablesMax){
        // We will call the parent constructor and pass in the name of the Pod.
        super(podName);
        // We will set the number of Employees max.
        NumberOfStationsMax = numberOfStationsMax;
        // We will set the number of Employees max.
        NumberOfTablesMax = numberOfTablesMax;
    }

    // Methods
    // We want to add method that is specific to the Cafeteria pod.
    // We want to add a method that will display the number of stations.
    public void DisplayNumberOfMaxStations(){
        // Display the number of Max patients.
        System.out.println("The Number of Max Stations the "+ PodName +" can hold is "+ NumberOfStationsMax);
    }

    // We want to add a method that will display the number of stations.
    public void DisplayNumberOfMaxTables(){
        // Display the number of Max tables.
        System.out.println("The Number of Max Tables the "+ PodName +" can hold is "+ NumberOfTablesMax);
    }
}
