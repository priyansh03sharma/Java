public class TrafficLight {
    public static void main(String[] args) {
        String currentState = "Red"; 

        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cycle " + i + ": " + currentState);

            
            switch (currentState) {
                case "Red":
                    currentState = "Green";
                    break;
                case "Green":
                    currentState = "Yellow";
                    break;
                case "Yellow":
                    currentState = "Red";
                    break;
                default:
                    System.out.println("Invalid state: " + currentState);
                    return; 
            }

            
            // try {
            //     Thread.sleep(2000); 
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

