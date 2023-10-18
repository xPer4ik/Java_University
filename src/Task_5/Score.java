package Task_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private final JLabel scoreLabel;
    private final JLabel lastScorerLabel;
    private final JLabel winnerLabel;

    public Score() {
        setTitle("Футбольный матч: Милан vs Мадрид");
        setSize(5000, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        scoreLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });
        add(milanButton);
        add(madridButton);
        add(scoreLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateLabels(String lastScorer) {
        scoreLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        }
        else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        Score frame = new Score();
        frame.setVisible(true);


    }
}