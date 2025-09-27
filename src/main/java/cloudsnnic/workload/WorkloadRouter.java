package cloudsnnic.workload;


import cloudsnnic.simulation.NeuromorphicVM;
import org.cloudbus.cloudsim.vms.Vm;


public class WorkloadRouter {
public void route(Task task, Vm[] vms) {
for (Vm vm : vms) {
if (task.getType() == TaskClassifier.TaskType.SNN && vm instanceof NeuromorphicVM) {
System.out.println("Routing SNN task to Neuromorphic VM " + vm.getId());
return;
}
}
System.out.println("Routing ML task to CPU/GPU VM");
}
}