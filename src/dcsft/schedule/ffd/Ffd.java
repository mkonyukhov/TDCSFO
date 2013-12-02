/**
 * Parent.java
 * @author Mikhail Konyukhov
 */

package dcsft.schedule.ffd;

import java.util.*;
import dcsft.schedule.tasks.*;

public abstract class Ffd {
    public static void buildPacks(List<Task> src,
			LinkedList<Task> dest, int theta) {
		int time, cnt;
        
        for (Task i : src) {
			time = i.getTimeLimit();
			cnt = i.getNodeCnt();
						
			if (dest.isEmpty() ||
				dest.getLast().getNodeCnt() != cnt ||
				dest.getLast().getTimeLimit() + time > theta) {
				dest.add(new Task(time, cnt));
			} else {
				dest.getLast().addTask(time);
			}
        }
               
        System.out.println("theta = " + theta);
        
        for (Task i : dest) {
			System.out.print(i.getNodeCnt());
			System.out.print(' ');
			System.out.println(i.getTimeLimit());
        }
    }
}