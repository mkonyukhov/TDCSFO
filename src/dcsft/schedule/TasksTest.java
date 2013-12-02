/*
 * TasksTest.java
 * 
 */

import java.io.*;
import java.util.*;
import dcsft.schedule.tasks.*;
import static dcsft.schedule.ffd.Ffd.*;

public class TasksTest {
    public static void main(String args[]) throws IOException {
        Tasks uBGL = new Tasks(100);
        int theta = uBGL.getTheta();       
        List<Task> SmallTaskList = uBGL.getTasks();
        LinkedList<Task> BigTaskList = new LinkedList<Task>();
        
        buildPacks(SmallTaskList, BigTaskList, theta);
    }
} 
