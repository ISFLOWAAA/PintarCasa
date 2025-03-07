/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import javax.swing.*;
import java.awt.*;

public class PintarCasa extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar el cuerpo de la casa (rectángulo)
        g2d.setColor(new Color(150, 75, 0)); // Marrón
        g2d.fillRect(100, 200, 200, 150);

        // Dibujar el techo (triángulo)
        g2d.setColor(new Color(139, 0, 0)); // Rojo oscuro
        int[] xPoints = {100, 300, 200}; // Puntos X del triángulo
        int[] yPoints = {200, 200, 100}; // Puntos Y del triángulo
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Dibujar la puerta (rectángulo)
        g2d.setColor(new Color(102, 51, 0)); // Marrón oscuro
        g2d.fillRect(175, 275, 50, 75);

        // Dibujar ventana izquierda (rectángulo)
        g2d.setColor(Color.BLUE);
        g2d.fillRect(120, 220, 50, 50);

        // Dibujar ventana derecha (rectángulo)
        g2d.setColor(Color.BLUE);
        g2d.fillRect(230, 220, 50, 50);

        // Dibujar el sol (óvalo)
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(50, 50, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo de una Casa en Java 2D");
        PintarCasa panel = new PintarCasa();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
