
import java.awt.*;
import javax.swing.*;
class BarsaKotar extends JFrame {
    int BarsaScore  = 0;
    int KotarScore = 0;

    JButton btn1 = new JButton("Barsa");
    JButton btn2 = new JButton("Kotar");

    JLabel text1 = new JLabel("Result: 0 X 0");
    JLabel text2 = new JLabel("Last Scorer: N/A");
    Label  text3 = new Label("Winner: N/A");

    void printResults()
    {
        text1.setText(String.format("Result: %d X %d", BarsaScore, KotarScore));

        if (BarsaScore > KotarScore) text3.setText("Winner: Barsa");
        else text3.setText("Winner: Kotar");
    }
    public BarsaKotar() {
        super("Kek4");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(300, 300);
        setLayout(new FlowLayout());

        add(btn1);
        add(btn2);

        add(text1);
        add(text2);
        add(text3);

        btn1.addActionListener(ae -> {
            BarsaScore++;
            text2.setText("Last Scorer: Barsa");

            printResults();
        });

        btn2.addActionListener(ae-> {
            KotarScore++;
            text2.setText("Last Scorer: Kotar");

            printResults();
        });
    }
    public static void main(String[] args) {
        new BarsaKotar().setVisible(true);
    }
}
