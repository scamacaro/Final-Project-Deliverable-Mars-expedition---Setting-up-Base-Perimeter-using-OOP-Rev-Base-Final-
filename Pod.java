// This will be our parent class for all pods.
// We will not allow this class to be instantiated.
public class Pod {
   // We want to put properties in here that all pods will inherit.
   boolean IsLightsOn = false;
   String PodName;
   boolean IsWaterOn = false;
   boolean IsStatusOpen = false;
   boolean IsCleanOn = false;
   boolean IsSecurityOn = false;
   boolean IsLevelOneOpen = false;
   boolean IsIncreaseTemperatureOn = false;

   // create a constructor.
   public Pod(String podName){
    // This is where we will initialize our properties.
    // We will set the lights to off.
    IsLightsOn = false;
    // We will set the water off.
    IsWaterOn = false;
    // We will set the status to closed.
    IsStatusOpen = false;
    // We will set the status to not clean.
    IsCleanOn = false;
    // We will set the status to not secured.
    IsSecurityOn = false;
    // We will set the level not to open.
    IsLevelOneOpen = false;
    // We will set the temperature to decrease.
    IsIncreaseTemperatureOn = false;
    // We will set the pod name to whatever is passed in.
    PodName = podName;
   }

   // We want to put methods in here that all pods will inherit.

   // This method will turn the lights on
   public void TurnLightsOn(){
    // Set the lights to on 
    System.out.println("\nThe lights are turning on in the "+ PodName +" Pod.\n");
    IsLightsOn = true;
   }

   // This method will turn the lights off
   public void TurnLightsOff(){
    // Set the lights to off
    System.out.println("\nThe lights are turned off in the " + PodName +" Pod.\n");
    IsLightsOn = false;
   }

   // This method will turn the water on
   public void TurnWaterOn(){
    // Set the lights to on 
    System.out.println("\nThe Water is turning on in the "+ PodName +" Pod.\n");
    IsWaterOn = true;
   }

   // This method will turn the water off
   public void TurnWaterOff(){
    // Set the lights to off
    System.out.println("\nThe Water is turned off in the " + PodName +" Pod.\n");
    IsWaterOn = false;
   }

   // This method will turn set the status to open.
   public void TurnStatusOpen(){
    // Set the lights to on 
    System.out.println("\nIt's open for business in the "+ PodName +" Pod.\n");
    IsStatusOpen = true;
   }

   // This method will turn the water off
   public void TurnStatusClosed(){
    // Set the lights to off
    System.out.println("\nIt's closed for business in the " + PodName +" Pod.\n");
    IsStatusOpen = false;
   }

   // This method will turn set the status to open.
   public void TurnCleanOn(){
    // Set the lights to on 
    System.out.println("\nIt's clean in the "+ PodName +" Pod.\n");
    IsCleanOn = true;
   }

   // This method will turn the water off
   public void TurnCleanOff(){
    // Set the lights to off
    System.out.println("\nIt's not clean in the " + PodName +" Pod.\n");
    IsCleanOn = false;
   }

   // This method will turn set the security on.
   public void TurnSecurityOn(){
    // Set the security to on. 
    System.out.println("\nThis is a secured level of "+ PodName +" Pod.\n");
    IsSecurityOn = true;
   }

   // This method will turn the security off.
   public void TurnSecurityOff(){
    // Set the security off.
    System.out.println("\nThis is not a secured level of " + PodName +" Pod.\n");
    IsSecurityOn = false;
   }

   // This method will turn set the security on.
   public void TurnLevelOneOpen(){
    // Set the security to on. 
    System.out.println("\nThis is a open level of "+ PodName +" Pod.\n");
    IsSecurityOn = true;
   }

   // This method will turn the security off.
   public void TurnLevelOneLocked(){
    // Set the security off.
    System.out.println("\nThis is a locked level of " + PodName +" Pod.\n");
    IsSecurityOn = false;
   }

   // This method will increase the temperature.
   public void IncreaseTemperature(){
    // increase temperature.
    System.out.println("\nThe temperature is increasing in the "+ PodName +" Pod.\n");
    IsIncreaseTemperatureOn = true;
   }

   // This method will turn the security off.
   public void DecreaseTemperature(){
    // Set the security off.
    System.out.println("\nThe temperature is decreasing " + PodName +" Pod.\n");
    IsIncreaseTemperatureOn = false;
   }

   // This method will display the status of the lights.
   public void DisplayLightStatus(){
    // Display the status of the lights.
    if(IsLightsOn){
        System.out.println("\nThe lights are on in the " + PodName +" Pod.\n");
    }else{
        System.out.println("\nThe lights are off in the " + PodName+" Pod.\n");
    }
   }

   // This method will display the status of the lights.
   public void DisplayWaterStatus(){
    // Display the status of the lights.
    if(IsWaterOn){
        System.out.println("\nThe Water is on in the " + PodName +" Pod.\n");
    }else{
        System.out.println("\nThe Water is off in the " + PodName+" Pod.\n");
    }
   }

   // This method will display the status of the Open Status.
   public void DisplayStatusStatus(){
    // Display the status of Open Status.
    if(IsStatusOpen){
        System.out.println("\nIt's open for business in the" + PodName +" Pod.\n");
    }else{
        System.out.println("\nIt's closed for business in the " + PodName+" Pod.\n");
    }
   }

   // This method will display the cleanliness status.
   public void DisplayCleanStatus(){
    // Display the status of Open Status.
    if(IsCleanOn){
        System.out.println("\nIt's clean in the" + PodName +" Pod.\n");
    }else{
        System.out.println("\nIt's not clean in the " + PodName+" Pod.\n");
    }
   }

   // This method will display the cleanliness status.
   public void DisplaySecurityStatus(){
    // Display the status of Open Status.
    if(IsSecurityOn){
        System.out.println("\nThis is a secured level of " + PodName +" Pod.\n");
    }else{
        System.out.println("\nThis is not a secured level of " + PodName+" Pod.\n");
    }
   }

   // This method will display the level one status.
   public void DisplayLevelOneStatus(){
    // Display the status of Open Status.
    if(IsLevelOneOpen){
        System.out.println("\nThis is level one and is an open room of " + PodName +" Pod.\n");
    }else{
        System.out.println("\n Level one is a closed floor of " + PodName+" Pod.\n");
    }
   }

    // This method will display the temperature status.
    public void DisplayTemperatureStatus(){
        // Display the temperature status.
        if(IsLevelOneOpen){
            System.out.println("\nThe temperature is increasing in " + PodName +" Pod.\n");
        }else{
            System.out.println("\n The temperature is decreasing in " + PodName+" Pod.\n");
        }
       }

}
