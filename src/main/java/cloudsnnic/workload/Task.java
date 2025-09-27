package cloudsnnic.workload;


public class Task {
private int id;
private String name;
private String inputType;
private TaskClassifier.TaskType type;


public Task(int id, String name, String inputType) {
this.id = id;
this.name = name;
this.inputType = inputType;
}


public String getInputType() { return inputType; }
public void setType(TaskClassifier.TaskType t) { this.type = t; }
public TaskClassifier.TaskType getType() { return type; }
}