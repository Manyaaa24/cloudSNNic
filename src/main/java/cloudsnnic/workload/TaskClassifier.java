package cloudsnnic.workload;


public class TaskClassifier {
public enum TaskType { ML, SNN }


public TaskType classify(Task task) {
return task.getInputType().equalsIgnoreCase("SNN") ? TaskType.SNN : TaskType.ML;
}
}