package cn.merryyou.java8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 2018/3/8.
 *
 * @author zlf
 * @since 1.0
 */
public class lambda_02_JButton {

    public static void main(String[] args) {
        JButton show = new JButton("show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("without lambda expression is boring");
            }
        });

        show.addActionListener((e) -> System.out.println("Action !! lambda expressions Rocks"));
    }
}
