package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * 	MyFrame4 ��ü��
 * 	Component type �� �ǰ�
 * 	JFrame type �� �ǰ�
 * 	ActionListener type �� �ȴ�.
 */
public class MyFrame5 extends JFrame implements ActionListener{
	//������ 
	public MyFrame5() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel = new JPanel();
		//��ư ��ü ����
		JButton button1 = new JButton("�Է�");
		JButton button2 = new JButton("����");
		JButton button3 = new JButton("����");
		//��ư�� action command ���
		button1.setActionCommand("input");
		button2.setActionCommand("update");
		button3.setActionCommand("delete");
		
		//��ư�� ActionListener ����ϱ� 
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		//��ư�� ��ο� �߰�
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
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
		new MyFrame5();
	}
	//��ư�� ������ ����Ǵ� �޼ҵ�(ActionListener �������̽��� ������ �޼ҵ�)
	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� ������ ������
		JButton btn = (JButton)e.getSource();
		// ��ư�� ������ action command �� �о�´�.
		String command = btn.getActionCommand();
		// java ���� ���ڿ� �񱳴� �ݵ��
		// .equals() �޼ҵ带 �̿��ؼ� ���Ѵ�.
		if(command.equals("input")) {
			JOptionPane.showMessageDialog(this, "�Է��մϴ�.");
		}else if(command.equals("update")) {
			JOptionPane.showMessageDialog(this, "�����մϴ�.");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "�����մϴ�.");
		}
		
	}
}






