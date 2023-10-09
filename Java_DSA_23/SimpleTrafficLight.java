public class SimpleTrafficLight {
    public static void main(String[] args) {
        TrafficLightState currentState = TrafficLightState.RED;

        for (int i = 0; i < 10; i++) { // Simulate 10 cycles of the traffic light
            System.out.println("Current state: " + currentState);

            switch (currentState) {
                case RED:
                    // Transition from RED to GREEN
                    currentState = TrafficLightState.GREEN;
                    break;
                case YELLOW:
                    // Transition from YELLOW to RED
                    currentState = TrafficLightState.RED;
                    break;
                case GREEN:
                    // Transition from GREEN to YELLOW
                    currentState = TrafficLightState.YELLOW;
                    break;
            }

            // Pause for a moment to simulate the traffic light change
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Enumeration to represent traffic light states
    enum TrafficLightState {
        RED, YELLOW, GREEN
    }
}
