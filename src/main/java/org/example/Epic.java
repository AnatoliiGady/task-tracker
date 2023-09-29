package org.example;

import java.util.ArrayList;
import java.util.List;

public class Epic extends AbstractTask {
    private final List<Integer> idSubTasks = new ArrayList<>();

    public Epic(int id) {
        super(id);
    }

    public void addSubTaskId(Integer idSubTask) {
        this.idSubTasks.add(idSubTask);
    }

    public List<Integer> getIdSubTasks() {
        return idSubTasks;
    }

    @Override
    public String toString() {
        return "Epic{"
                + "id=" + getId()
                + ", title='" + getTitle() + '\''
                + ", description='" + getDescription() + '\''
                + ", status=" + getStatus()
                + "subTasks=" + idSubTasks
                + '}';
    }
}
