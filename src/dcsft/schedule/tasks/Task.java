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

	private int timeLimit;
	private int nodeCnt;
}