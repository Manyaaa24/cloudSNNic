package cloudsnnic.evaluation;


import org.cloudbus.cloudsim.vms.Vm;
import cloudsnnic.simulation.NeuromorphicVM;


public class PerformanceMetrics {
public void logMetrics(Vm vm) {
System.out.println("PerformanceMetrics: VM " + vm.getId() + " ExecutionTime ~ simulated");
if (vm instanceof NeuromorphicVM neu) {
System.out.println(" - Energy efficiency factor based on spikes: " + neu.getSpikeRate());
}
}
}