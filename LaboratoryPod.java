

// This is our child class of our Pod Class Laboratory.
// This means our command pod will inherit all the properties and methods of the Pod class.
// To do this we will use the keyword extends.
public class LaboratoryPod extends Pod {
    
    // Create our constructor.
   
    public LaboratoryPod(String podName){
        // We will call the parent constructor and pass in the name of the Pod.
        super(podName);
        
    }
}
