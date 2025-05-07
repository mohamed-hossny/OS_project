
package gui;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GanttWindow extends JFrame {
    private List<priorityNonPreemptive.ProcessManager.Process> processes;

    public GanttWindow(List<priorityNonPreemptive.ProcessManager.Process> processes) {
        this.processes = processes;
        setTitle("Gantt Chart");
        setSize(800, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setResizable(true);  

 
        GanttChart ganttChart = new GanttChart(processes);
        
        // Wrap the GanttChart inside a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(ganttChart, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        // Set the scroll pane as the content of the window
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}


