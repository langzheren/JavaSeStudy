package excercise.e4_10;

import java.awt.Color;   
import java.awt.Font;   
import java.awt.Insets;   
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;   
  
import javax.swing.*;   
  
public class TestFrame extends JFrame implements ActionListener {   
    /**  
     *   
     */  
    public static void main(String[] args) {   
        new TestFrame();   
    }      
       
    private static final long serialVersionUID = 1L;   
    JLabel la1 = new JLabel("请在下面输入框中输入要查询笔画的汉字");   
    JLabel la2 = new JLabel("汉字对应的笔画数为");   
    JButton btn = new JButton("确定");   
    JTextField jf = new JTextField("涛声依旧");   
    JTextArea ta = new JTextArea();   
    JScrollPane jsp;   
    public TestFrame() {   
        setTitle("玩转汉字笔画");   
        setBounds(400, 200, 400, 400);   
        setLayout(null);   
        la1.setBounds(70, 20, 250, 30);   
        la1.setForeground(Color.RED);   
        la1.setBackground(Color.cyan);   
        jf.setBounds(70, 50, 175, 30);   
        jf.setOpaque(true);   
        btn.setBounds(245, 50, 60, 30);   
        btn.setBackground(Color.cyan);   
        btn.addActionListener(this);   
        btn.setMargin(new Insets(0,0,0,0));   
        la2.setBounds(70, 90, 120, 30);   
        la2.setBackground(Color.cyan);   
        la2.setForeground(Color.RED);   
        jsp = new JScrollPane(ta);   
        jsp.setBounds(70, 130, 245, 200);   
        ta.setBackground(Color.gray);   
        ta.setForeground(Color.YELLOW);   
        ta.setLineWrap(true);   
        ta.setFont(new Font("宋体", Font.PLAIN, 20));   
        getContentPane().setBackground(Color.cyan);   
        add(la1);   
        add(jf);   
        add(btn);   
        add(la2);   
        add(jsp);   
        setResizable(false);   
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }   
  
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            String cnStr = jf.getText();   
            String temp = new String("\n");   
            char[] chars = cnStr.toCharArray();   
            for(int i = 0; i < chars.length; i++) {   
                temp += "  "+chars[i]+"的笔画数为："+CnToStrokeCount.getStrokeCount(chars[i])+"\n";   
            }   
            temp += "\n有什么问题与涛涛联系，谢谢！";   
            ta.setText(chars.toString());   
        }   
    }   
       

} 