package cloudsnnic.monitoring;


import cloudsnnic.simulation.NeuromorphicVM;
import org.cloudbus.cloudsim.vms.Vm;


public class TelemetryCollector {
public void collectMetrics(Vm vm) {
System.out.println("Telemetry: VM " + vm.getId() + " | MIPS=" + vm.getMips());
if (vm instanceof NeuromorphicVM neu) {
System.out.println(" - SpikeRate: " + neu.getSpikeRate());
}
}
}