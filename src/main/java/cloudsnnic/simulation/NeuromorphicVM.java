package cloudsnnic.simulation;


import org.cloudbus.cloudsim.vms.Vm;


public class NeuromorphicVM extends Vm {
private double spikeRate;


public NeuromorphicVM(int id, int userId, double mips, int ram, long bw, long size, String vmm, double spikeRate) {
super(id, userId, mips, ram, bw, size, vmm);
this.spikeRate = spikeRate;
}


public double getSpikeRate() { return spikeRate; }
}