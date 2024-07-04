// This is our child class of our Pod Class "CommandPod."
// This means our command pod will inherit all the properties and methods of the Pod class.
// To do this we will use the keyword extends.
public class HeadQuartersPod extends Pod {
    
    // Create our constructor.
    public HeadQuartersPod(String podName){
        // We will call the parent constructor and pass in the name of the Pod.
        super(podName);
    }
    
}
