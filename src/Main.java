import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static final int CELL = 50;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int ROW = WIDTH / CELL;
    public static final int COLUMN = HEIGHT / CELL;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }


    @Override
    public void paintComponent(Graphics g) {

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack(); // 讓元件自動依視窗調整大小
        window.setLocationRelativeTo(null); // 設定為 null，讓視窗維持在螢幕中間
        window.setVisible(true); // 顯示視窗
        window.setResizable(false); // 禁止使用者調整視窗大小
    }
}