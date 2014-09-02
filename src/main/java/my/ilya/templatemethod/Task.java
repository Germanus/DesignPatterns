package my.ilya.templatemethod;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Kazakevich Ilya
 */
class Task extends ProjectItem {
    
	private static final long serialVersionUID = -7279027930376764305L;
	private ArrayList<ProjectItem> projectItems = new ArrayList<ProjectItem>();
    private double taskTimeRequired;

    public Task() {
    }

    public Task(String newName, String newDescription, double newTaskTimeRequired, double newRate) {
        super(newName, newDescription, newRate);
        taskTimeRequired = newTaskTimeRequired;
    }

    public void setTaskTimeRequired(double newTaskTimeRequired) {
        taskTimeRequired = newTaskTimeRequired;
    }

    public void addProjectItem(ProjectItem element) {
        if (!projectItems.contains(element)) {
            projectItems.add(element);
        }
    }

    public void removeProjectItem(ProjectItem element) {
        projectItems.remove(element);
    }

    public double getTaskTimeRequired() {
        return taskTimeRequired;
    }

    public Iterator<ProjectItem> getProjectItemIterator() {
        return projectItems.iterator();
    }

    public double getMaterialsCost() {
        double totalCost = 0;
        Iterator<ProjectItem> items = getProjectItemIterator();
        while (items.hasNext()) {
            totalCost += ((ProjectItem) items.next()).getMaterialsCost();
        }
        return totalCost;
    }

    public double getTimeRequired() {
        double totalTime = taskTimeRequired;
        Iterator<ProjectItem> items = getProjectItemIterator();
        while (items.hasNext()) {
            totalTime += ((ProjectItem) items.next()).getTimeRequired();
        }
        return totalTime;
    }
}
