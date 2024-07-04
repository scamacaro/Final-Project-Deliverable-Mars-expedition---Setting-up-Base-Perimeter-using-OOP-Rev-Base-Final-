// This is our child class of our Pod Class DormitoryPod "MedicalCenterPod"
// This means our command pod will inherit all the properties and methods of the Pod class.
// To do this we will use the keyword extends.
public class DormitoryPod extends Pod {

    // Properties
    // We want to add a property that is specific to the Dormitory pod.
    // We want to add a property that will hold the number of employees.
    int NumberOfEmployeesMax;
    // We want to add a property that will hold the number of beds.
    int NumberOfBedsMax;
    // We want to add a property that will hold the number of showers.
    int NumberOfShowersMax;

    // Create our constructor.
    public DormitoryPod(String podName, int numberOfEmployeesMax, int numberOfBedsMax, int numberOfShowersMax){
        // We will call the parent constructor and pass in the name of the pod.
        super(podName);
        // We will set the number of Employees max.
        NumberOfEmployeesMax = numberOfEmployeesMax;
        // We will set the number of beds max.
        NumberOfBedsMax = numberOfBedsMax;
        // We will set the number of showers max.
        NumberOfShowersMax = numberOfShowersMax;
    }

    // Methods
    // We want to add method that is specific to the Dormitory pod.
    // We want to add a method that will display the number of employees.
    public void DisplayNumberOfMaxEmployees(){
        // Display the number of Max patients.
        System.out.println("The Number of Max employees the "+ PodName +" can hold is "+ NumberOfEmployeesMax);
    }

    // Methods
    // We want to add method that is specific to the Dormitory pod.
    // We want to add a method that will display the number of beds.
    public void DisplayNumberOfMaxBeds(){
        // Display the number of Max beds.
        System.out.println("The Number of Max beds the " + PodName + " cand hold is " + NumberOfBedsMax);
    }

    // Methods
    // We want to add method that is specific to the Dormitory pod.
    // We want to add a method that will display the number of showers.
    public void DisplayNumberOfMaxShowers(){
        // Display the number of Max showers.
        System.out.println("The Number of Max Showers the " + PodName + " cand hold is " + NumberOfShowersMax);
    }

    
}
