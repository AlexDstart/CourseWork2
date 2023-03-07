package project;

import interfaces.DateInterfaces;
import service.TaskService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, DateInterfaces> mapOfTasks = new HashMap<>();
        List<DateInterfaces> removedTasks = new ArrayList<>();

        TaskService scheduler = new TaskService();
        scheduler.mainWindow(mapOfTasks, removedTasks);

    }
}
