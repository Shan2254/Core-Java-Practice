package com.Collections.Queues;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {

	String name;
	int priority;
	Task(String name, int priority)
	{
		this.name = name;
		this.priority = priority;
	}
	@Override
	public int compareTo(Task other) {
		// TODO Auto-generated method stub
		return other.priority - this.priority;
	}
	
}

public class TaskScheduler {

	public static void main(String[] args) {
		
		PriorityQueue<Task> taskQueue = new PriorityQueue<>();
		
		taskQueue.add(new Task("Task A", 2));
		taskQueue.add(new Task("Task B", 4));
		taskQueue.add(new Task("Task C", 1));
		taskQueue.add(new Task("Task D", 3));
		
		while(!taskQueue.isEmpty()) {
			Task task = taskQueue.poll();
			System.out.println("Executing: " + task.name +" (Priority "+ task.priority +")");
		}
	}
}
