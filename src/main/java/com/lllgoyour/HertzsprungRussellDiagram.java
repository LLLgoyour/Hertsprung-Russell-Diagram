package com.lllgoyour;

import javax.swing.*;
import java.awt.*;

public class HertzsprungRussellDiagram extends JFrame {
    private final JPanel chartPanel;

    public HertzsprungRussellDiagram() {
        setTitle("Hertzsprung-Russell Diagram");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chartPanel = new ChartPanel();
        add(chartPanel, BorderLayout.CENTER);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: to complete constructing the HR Diagram by running StellarMotionCalculator class.
                chartPanel.repaint();
            }
        });
        add(calculateButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HertzsprungRussellDiagram app = new HertzsprungRussellDiagram();
                app.setVisible(true);
            }
        });
    }

    private class ChartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // TODO: to complete the code to graph HR Diagram
            // TODO: use Graphics to graph stellar locations and properties.
        }
    }
}