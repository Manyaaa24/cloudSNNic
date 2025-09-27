package cloudsnnic.simulation;


import java.util.PriorityQueue;


public class EventScheduler {
private PriorityQueue<Runnable> events = new PriorityQueue<>((a, b) -> 0);


public void schedule(Runnable event) {
events.add(event);
}


public void processAll() {
while (!events.isEmpty()) {
events.poll().run();
}
}
}