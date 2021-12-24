import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login {
    login() {
        // JFrame fake = new JFrame("Fake");

        // fake.setVisible(true);
        // fake.setSize(400, 400);
        // fake.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // fake.setLayout(null);

        // JLabel fake_label = new JLabel("Fake Title");
        
        // fake_label.setHorizontalAlignment(SwingConstants.CENTER);
        // fake_label.setVerticalAlignment(SwingConstants.CENTER);


        // fake.add(fake_label);
        JFrame login_frame = new JFrame("login");

        JLabel title = new JLabel("login");
        title.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        title.setBounds(270, 50, 200, 40);

        JLabel username_label = new JLabel("username");
        
        username_label.setBounds(160, 115, 100, 40);
        
        JLabel password_label = new JLabel("password");
        
        password_label.setBounds(160, 150, 100, 40);

        JButton login_button = new JButton("login");
        
        login_button.setBounds(260, 200, 80, 25);

        JTextField username_input = new JTextField();
        
        username_input.setBounds(240, 120, 200, 30);

        JTextField password_input = new JTextField();
       
        password_input.setBounds(240, 155, 200, 30);

        // setBounds(x, y, width, height);
        // setLayout must be set to null
        login_frame.setVisible(true);
        login_frame.setSize(600, 400);
        login_frame.setLayout(null);
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_frame.setLocationRelativeTo(null);
        login_frame.setResizable(false);
        login_frame.add(username_label);
        login_frame.add(password_label);
        login_frame.add(login_button);
        login_frame.add(username_input);
        login_frame.add(password_input);
        login_frame.add(title);
    }
}