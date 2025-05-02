package com.mycompany.process_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.List;
import java.util.Arrays;

public class GanttChartPanel extends JPanel {

    public static class Task {
        String name;
        int start;
        int duration;

     public Task(String name, int start, int duration) {
            this.name = name;
            this.start = start;
            this.duration = duration;
        }
    }

    private List<Task> tasks = Arrays.asList(
        new Task("P1", 0, 3),
        new Task("P2", 3, 5),
        new Task("P3", 8, 2)
    );
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        repaint();  // Repaint the panel when tasks are updated
    }
    public GanttChartPanel() {
        setPreferredSize(new Dimension(600, 100));
        setBackground(Color.decode("#f4f6f8"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 10;
        int y = 30;
        int height = 50;
        int scale = 30; // pixels per time unit

        for (Task t : tasks) {
            int width = t.duration * scale;

            g.setColor(Color.decode("#f4f6f8")); // light blue
            g.fillRect(x + t.start * scale, y, width, height);

            g.setColor(Color.BLACK);
            g.drawRect(x + t.start * scale, y, width, height);

            g.setFont(new Font("Segoe UI", Font.BOLD, 14));
            g.drawString(t.name, x + t.start * scale + width / 2 - 10, y + height / 2 + 5);

            g.drawString(String.valueOf(t.start), x + t.start * scale, y + height + 15);
            g.drawString(String.valueOf(t.start + t.duration), x + t.start * scale + width - 10, y + height + 15);
        }
    }
}
