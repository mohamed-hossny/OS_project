
package gui;

import java.util.ArrayList;
import java.util.List;

public class priorityNonPreemptive{

    public static class ProcessManager {

            public static class Process {
                String name;
                int arrivalTime = 0;
                int burstTime;
                int priority;
                int completionTime;
                public int waitingTime;
                public int turnaroundTime;
                public int responseTime;
                boolean isCompleted = false;
                int startTime;


                public Process(String name, int burstTime, int priority) {
                    this.name = name;
                    this.burstTime = burstTime;
                    this.priority = priority;
                }
            }

            private List<Process> processes = new ArrayList<>();

            public void addProcess(String name, int burst, int priority) {
                processes.add(new Process(name, burst, priority));
            }

            public List<Process> getProcesses() {
                return processes;
            }

            public void scheduleProcesses() {
                PriorityNonPreemptive.schedule((ArrayList<Process>) processes);
            }
        }


        public static class PriorityNonPreemptive {
            public static ArrayList<ProcessManager.Process> schedule(ArrayList<ProcessManager.Process> processes) {
                int currentTime = 0;
                int completed = 0;
                int n = processes.size();

                ArrayList<ProcessManager.Process> executionOrder = new ArrayList<>();
                   
                while (completed < n) {
                    ProcessManager.Process next = null;

                    for (ProcessManager.Process p : processes) {
                        if (!p.isCompleted && p.arrivalTime <= currentTime) {
                            if (next == null || p.priority < next.priority ||
                                    (p.priority == next.priority && p.arrivalTime < next.arrivalTime)) {
                                next = p;
                            }
                        }
                    }

                    if (next != null) {
                        int startTime = currentTime;
                        int endTime = currentTime + next.burstTime;

                        next.completionTime = endTime;
                        next.turnaroundTime = endTime - next.arrivalTime;
                        next.waitingTime = startTime - next.arrivalTime;
                        next.responseTime = startTime - next.arrivalTime;
                        next.startTime = currentTime;
                        endTime = currentTime + next.burstTime;


                        next.isCompleted = true;
                        completed++;
                        currentTime = endTime;
                        executionOrder.add(next);
                        
                    } else {
                        currentTime++; // idle time
                        }
                }
                return executionOrder;
            }
        }

}