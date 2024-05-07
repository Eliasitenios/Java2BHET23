package at.ac.htlstp.et.sj23.k2b.paint;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class PaintProgram extends JFrame {

    private int lastX, lastY;
    private boolean isDrawing = true;
    private int eraserSize = 10; // Default eraser size
    private int lineWidth = 1; // Default line width
    private Color selectedColor = Color.BLACK; // Default color

    public PaintProgram() {
        setTitle("Simple Paint Program");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanel for drawing area
        JPanel canvas = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        canvas.setBackground(Color.WHITE);
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                int x = e.getX();
                int y = e.getY();
                if (isDrawing) {
                    g.setColor(selectedColor);
                    ((Graphics2D) g).setStroke(new BasicStroke(lineWidth));
                    g.drawLine(lastX, lastY, x, y);
                } else {
                    int halfSize = eraserSize / 2;
                    g.setColor(Color.WHITE);
                    g.fillRect(x - halfSize, y - halfSize, eraserSize, eraserSize);
                }
                lastX = x;
                lastY = y;
            }
        });
        add(canvas);

        // Create toolbar with pencil, eraser, line width, color, and spray options
        JToolBar toolBar = new JToolBar();
        JButton pencilButton = new JButton("Pencil");
        JButton eraserButton = new JButton("Eraser");
        JLabel lineWidthLabel = new JLabel("Line Width:");
        JSlider lineWidthSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, lineWidth);
        lineWidthSlider.setMajorTickSpacing(1);
        lineWidthSlider.setPaintTicks(true);
        lineWidthSlider.setPaintLabels(true);
        lineWidthSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                lineWidth = lineWidthSlider.getValue();
            }
        });
        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e -> {
            selectedColor = JColorChooser.showDialog(null, "Choose a color", selectedColor);
        });
        JLabel eraserSizeLabel = new JLabel("Eraser Size:");
        JSlider eraserSizeSlider = new JSlider(JSlider.HORIZONTAL, 1, 50, eraserSize);
        eraserSizeSlider.setMajorTickSpacing(10);
        eraserSizeSlider.setMinorTickSpacing(1);
        eraserSizeSlider.setPaintTicks(true);
        eraserSizeSlider.setPaintLabels(true);
        eraserSizeSlider.setEnabled(false); // Initially disabled
        eraserSizeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                eraserSize = eraserSizeSlider.getValue();
            }
        });
        JButton sprayButton = new JButton("Spray");
        sprayButton.addActionListener(e -> {
            isDrawing = true; // Enable drawing mode for the spray tool
            pencilButton.setSelected(false);
            eraserButton.setSelected(false);
            eraserSizeSlider.setEnabled(false);
        });
        pencilButton.setSelected(true); // Pencil as default option
        pencilButton.addActionListener(e -> {
            isDrawing = true;
            pencilButton.setSelected(true);
            eraserButton.setSelected(false);
            eraserSizeSlider.setEnabled(false); // Disable eraser size slider
        });
        eraserButton.addActionListener(e -> {
            isDrawing = false;
            pencilButton.setSelected(false);
            eraserButton.setSelected(true);
            eraserSizeSlider.setEnabled(true); // Enable eraser size slider
        });
        toolBar.add(pencilButton);
        toolBar.add(eraserButton);
        toolBar.add(lineWidthLabel);
        toolBar.add(lineWidthSlider);
        toolBar.add(colorButton);
        toolBar.add(eraserSizeLabel);
        toolBar.add(eraserSizeSlider);
        toolBar.add(sprayButton); // Add the spray button to the toolbar
        add(toolBar, BorderLayout.NORTH);
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            PaintProgram paintProgram = new PaintProgram();
            paintProgram.setVisible(true);
        });
    }
}
