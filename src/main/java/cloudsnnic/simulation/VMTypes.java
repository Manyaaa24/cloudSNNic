package cloudsnnic.simulation;


import org.cloudbus.cloudsim.vms.Vm;


public class VMTypes {
public static Vm createCpuVm(int id) {
return new Vm(id, 0, 1000, 2048, 1000, 10000, "Xen");
}


public static Vm createGpuVm(int id) {
return new Vm(id, 0, 3000, 4096, 2000, 20000, "GPU");
}
}