package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame7 extends JFrame implements ActionListener{
	//JTextField ��ü�� �������� ������ �ʵ� ����
	JTextField inputNum1, inputNum2, result;
		
	//������ 
	public MyFrame7() {
		initUI();
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//��� ��ü ����
		JPanel panel = new JPanel();
		
		//���ڿ��� �Է� ���� �� �ִ� JTextField ��ü ����
		inputNum1 = new JTextField(10);
		inputNum2 = new JTextField(10);
		result = new JTextField(10);
		
		//��ư ��ü ����
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiplyBtn = new JButton("*");
		JButton divisionBtn = new JButton("/");
		
		// ��ư�� Action Listener ��ü ���
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiplyBtn.addActionListener(this);
		divisionBtn.addActionListener(this);
		
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiplyBtn.setActionCommand("multi");
		divisionBtn.setActionCommand("division");
		
		//���̺� ��ü ����
		JLabel equalLabel = new JLabel("=");
		
		// �гο� UI �߰�
		panel.add(inputNum1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiplyBtn);
		panel.add(divisionBtn);
		
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);
		//����� �������� ����(����) �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 800, 500);
		// x �� ������ â�� �ݾ����� ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame7();
	}
	//��ư�� ������ ����Ǵ� �޼ҵ�(ActionListener �������̽��� ������ �޼ҵ�)
	@Override
	public void actionPerformed(ActionEvent e) {
		//�Է��� ���ڿ��� ���ڷ� �ٲ㼭 �����̱�
		double num1 = Double.parseDouble(inputNum1.getText());
		double num2 = Double.parseDouble(inputNum2.getText());
		
		//action command �о����
		String command = e.getActionCommand();
		
		//��� ���� ���� ���� �����
		double result = 0;
		
		//��ȣ�� ���� ������ �����.
		if(command.equals("plus")) {
			//�μ��� ���� ���Ѵ�.
			result = num1 + num2;
		}else if(command.equals("minus")) {
			//�μ��� ���� ���Ѵ�.
			result = num1 - num2;
		}else if(command.equals("multi")) {
			//�μ��� ���� ���Ѵ�.
			result = num1 * num2;
		}else if(command.equals("division")) {
			//�μ��� ���� ���Ѵ�.
			result = num1 / num2;
		}
				
		//����ϱ�
		this.result.setText(Double.toString(result));
	}
}






