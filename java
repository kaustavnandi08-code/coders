package coder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class GameGUI extends JFrame implements ActionListener {
JButton rock, paper, scissors;
JLabel result;  
String[]  choices = {"rock", "paper", "scissors"};
public GameGUI() {
     setTitle("Rock Paper Scissors");
 setSize(700, 500);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setBackground(new Color(30, 30, 60));
JLabel title = new JLabel("Rock Paper Scissors Game");
title.setFont(new Font("Arial", Font.BOLD, 30));
title.setForeground(Color.GREEN);
rock = new JButton("Rock🪨🪨");
rock.setPreferredSize(new Dimension(150, 50));
paper = new JButton("Paper📄📄");
paper.setPreferredSize(new Dimension(150, 50));
scissors = new JButton("Scissors✂️✂️");
scissors.setPreferredSize(new Dimension(150, 50));
result = new JLabel("Make your choice!");
rock.addActionListener(this);
paper.addActionListener(this);
scissors.addActionListener(this);
add(rock);
add(paper);
add(scissors);
add(result);
setVisible(true);
}
public void actionPerformed(ActionEvent e) {
    String playerChoice = "";
    if (e.getSource() == rock) {
        playerChoice = "rock";
    } else if (e.getSource() == paper) {
        playerChoice = "paper";
    } else if (e.getSource() == scissors) {
        playerChoice = "scissors";
    }
    String computerChoice = choices[new Random().nextInt(choices.length)];
    String outcome = GameLogic.checkWinner(playerChoice, computerChoice);
    result.setText("You chose: " + playerChoice + ", Computer chose: " + computerChoice + ". " + outcome);
}
public static void main(String[] args) {
    new GameGUI();
}
}