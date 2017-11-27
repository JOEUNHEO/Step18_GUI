package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame implements ActionListener{
		
	//������ 
	public MyFrame3() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel = new JPanel();
		//��ư ��ü ����
		JButton button = new JButton("��������");
		//��ư�� ActionListener ����ϱ� 
		button.addActionListener(this);
		//��ư�� ��ο� �߰�
		panel.add(button);
		//����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame3();
	}
	//��ư�� ������ ����Ǵ� �޼ҵ�(ActionListener �������̽��� ������ �޼ҵ�)
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("��ư�� �����׿�?");
		JOptionPane.showMessageDialog(this, "��ư�� ������?");
	}
}






