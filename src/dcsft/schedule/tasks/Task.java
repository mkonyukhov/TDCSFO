/*
 * Tasks.java
 * 
 */

package dcsft.schedule.tasks;

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Task {
	public Task(int timeLimit, int nodeCnt) {
		this.timeLimit = timeLimit;
		this.nodeCnt = nodeCnt;
	}
	
	public int getTimeLimit() {
		return timeLimit;
	}
	
	public int getNodeCnt() {
		return nodeCnt;
	}
	
	public void addTask(int time) {
		this.timeLimit += time;
	}

	private int timeLimit;
	private int nodeCnt;
	private static int id = 0;
}