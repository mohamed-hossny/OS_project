package gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GanttChart extends JPanel {
    private List<priorityNonPreemptive.ProcessManager.Process> processes;

    public GanttChart(List<priorityNonPreemptive.ProcessManager.Process> processes) {
        this.processes = processes;
        setPreferredSize(new Dimension(calculateTotalWidth(), 150));
    }

    private int calculateTotalWidth() {
        int maxEndTime = 0;
        for (priorityNonPreemptive.ProcessManager.Process p : processes) {
            int endTime = p.startTime + p.burstTime;
            if (endTime > maxEndTime) {
                maxEndTime = endTime;
            }
        }
        return maxEndTime * 20 + 50;  // 20 px per time unit + buffer
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int y = 40;
        int height = 40;
        int unitWidth = 20;

        for (priorityNonPreemptive.ProcessManager.Process p : processes) {
            int barX = 20 + p.startTime * unitWidth;
            int barWidth = p.burstTime * unitWidth;

            // Draw bar
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(barX, y, barWidth, height);
            g.setColor(Color.BLACK);
            g.drawRect(barX, y, barWidth, height);

            // Draw process name in center
            g.drawString(p.name, barX + barWidth / 2 - 10, y + height / 2 + 5);

            // Draw start time
            g.drawString(String.valueOf(p.startTime), barX - 2, y + height + 20);
        }

        // Draw end time of last process
        priorityNonPreemptive.ProcessManager.Process last = processes.get(processes.size() - 1);
        int endX = 20 + (last.startTime + last.burstTime) * unitWidth;
        g.drawString(String.valueOf(last.startTime + last.burstTime), endX - 5, y + height + 20);
    }
}
