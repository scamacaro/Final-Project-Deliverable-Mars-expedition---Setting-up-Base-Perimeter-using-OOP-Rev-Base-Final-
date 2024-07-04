// This is our child class of our Pod Class StoragePod.
// This means our command pod will inherit all the properties and methods of the Pod class.
// To do this we will use the keyword extends.
public class StoragePod  extends Pod {

    // Properties
    // We want to add a property that is specific to the Cafeteria pod.
    // We want to add a property that will hold the number of stations.
    int NumberOfCapacityMax;

    // Create our constructor.
    public StoragePod(String podName, int numberOfCapacityMax){
        // We will call the parent constructor and pass in the name of the Pod.
        super(podName);
        // We will set the number of Capacity max.
        NumberOfCapacityMax = numberOfCapacityMax;
    }

    // Methods
    // We want to add method that is specific to the Cafeteria pod.
    // We want to add a method that will display the number of stations.
    public void DisplayNumberOfMaxCapacity(){
        // Display the number of Max capacity.
        System.out.println("The Number of Max Capacity in the "+ PodName +" can hold is "+ NumberOfCapacityMax);
    }

}
