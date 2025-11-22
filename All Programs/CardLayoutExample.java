import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample
{
    public static void main(String[] args) 
    {
        // Create frame
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create CardLayout and main panel
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create three panels (cards)
        JPanel card1 = new JPanel();
        card1.setBackground(Color.PINK);
        card1.add(new JLabel("This is Card 1"));

        JPanel card2 = new JPanel();
        card2.setBackground(Color.CYAN);
        card2.add(new JLabel("This is Card 2"));

        JPanel card3 = new JPanel();
        card3.setBackground(Color.LIGHT_GRAY);
        card3.add(new JLabel("This is Card 3"));

        // Add panels to cardPanel with names
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

        // Create navigation buttons
        JButton nextBtn = new JButton("Next");
        JButton prevBtn = new JButton("Previous");
        JButton show2Btn = new JButton("Go to Card 2");

        // Button panel
        JPanel controlPanel = new JPanel();
        controlPanel.add(prevBtn);
        controlPanel.add(nextBtn);
        controlPanel.add(show2Btn);

        // Add listeners
        nextBtn.addActionListener(e -> cardLayout.next(cardPanel));
        prevBtn.addActionListener(e -> cardLayout.previous(cardPanel));
        show2Btn.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));

        // Add panels to frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
