/*
 * TasksTest.java
 * 
 */

import java.io.*;
import java.util.*;
import dcsft.schedule.tasks.*;

public class TasksTest {
    public static void main(String args[]) throws IOException {
        Tasks uBGL = new Tasks(10);
        
        List<Task> SmallTaskList = uBGL.getTasks();
        List<Task> BigTaskList = new LinkedList<Task>();
        
        for (Task i : SmallTaskList) {
			System.out.print(i.getNodeCnt());
			System.out.print(' ');
			System.out.println(i.getTimeLimit());
        }
    }
} 