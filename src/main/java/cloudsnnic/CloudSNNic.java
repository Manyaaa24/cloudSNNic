package cloudsnnic;

import cloudsnnic.simulation.*;
import cloudsnnic.workload.*;
import cloudsnnic.scheduling.*;
import cloudsnnic.monitoring.*;
import cloudsnnic.evaluation.*;
import org.cloudbus.cloudsim.vms.VmSimple;  // Use VmSimple in CloudSim 7
import java.util.*;

public class CloudSNNic {
    public static void main(String[] args) {
        System.out.println("=== CloudSNNic Simulation Started ===");

        // Create VM list using CloudSim 7
        List<VmSimple> vmList = new ArrayList<>();
        vmList.add(VMTypes.createCpuVm(1));  // Ensure VMTypes returns VmSimple
        vmList.add(VMTypes.createGpuVm(2));
        vmList.add(new NeuromorphicVM(3, 0, 500, 1024, 500, 5000, "NVM", 0.7)); // NeuromorphicVM must extend VmSimple

        // Create task list
        List<Task> tasks = List.of(
            new Task(1, "image_classification", "ML"),
            new Task(2, "spike_processing", "SNN")
        );

        // Initialize classifier and router
        TaskClassifier classifier = new TaskClassifier();
        WorkloadRouter router = new WorkloadRouter();

        // Classify and route tasks
        for (Task t : tasks) {
            t.setType(classifier.classify(t));
            router.route(t, vmList.toArray(new VmSimple[0])); // Use VmSimple array
        }

        // Optimize scheduling
        new AdaptiveScheduler().optimizeScheduling(vmList, tasks);

        // Collect telemetry
        TelemetryCollector telemetry = new TelemetryCollector();
        vmList.forEach(telemetry::collectMetrics);

        // Log performance metrics
        PerformanceMetrics metrics = new PerformanceMetrics();
        vmList.forEach(metrics::logMetrics);

        System.out.println("=== Simulation Completed ===");
    }
}
