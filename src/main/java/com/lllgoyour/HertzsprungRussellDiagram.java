package com.lllgoyour;

import javax.swing.*;
import java.awt.*;

/**
 * This is the Main class.
 */
public class HertzsprungRussellDiagram extends JFrame{
    private JPanel chartPanel;

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
                // 在这里执行计算和更新赫罗图的逻辑
                // TODO: to complete constructing the HR Diagram by running StellarMotionCalculator class.
                chartPanel.repaint();
            }
        });
        add(calculateButton, BorderLayout.SOUTH);
    }

    private class ChartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // TODO: 在这里绘制赫罗图的逻辑to complete the code to graph HR Diagram
            // TODO: Use Graphics to graph stellar locations and properties.
        }
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
}