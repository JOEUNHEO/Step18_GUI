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
	//JTextField 객체의 참조값을 저장할 필드 선언
	JTextField inputNum1, inputNum2, result;
		
	//생성자 
	public MyFrame7() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성
		JPanel panel = new JPanel();
		
		//문자열을 입력 받을 수 있는 JTextField 객체 생성
		inputNum1 = new JTextField(10);
		inputNum2 = new JTextField(10);
		result = new JTextField(10);
		
		//버튼 객체 생성
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiplyBtn = new JButton("*");
		JButton divisionBtn = new JButton("/");
		
		// 버튼에 Action Listener 객체 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiplyBtn.addActionListener(this);
		divisionBtn.addActionListener(this);
		
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiplyBtn.setActionCommand("multi");
		divisionBtn.setActionCommand("division");
		
		//레이블 객체 생성
		JLabel equalLabel = new JLabel("=");
		
		// 패널에 UI 추가
		panel.add(inputNum1);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiplyBtn);
		panel.add(divisionBtn);
		
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);
		//페널을 프레임의 위쪽(북쪽) 에 배치
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 800, 500);
		// x 를 눌러서 창을 닫았을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록 
		setVisible(true);
	}
	//메인 메소드 
	public static void main(String[] args) {
		new MyFrame7();
	}
	//버튼을 누르면 실행되는 메소드(ActionListener 인터페이스에 구현된 메소드)
	@Override
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열을 숫자로 바꿔서 얻어들이기
		double num1 = Double.parseDouble(inputNum1.getText());
		double num2 = Double.parseDouble(inputNum2.getText());
		
		//action command 읽어오기
		String command = e.getActionCommand();
		
		//결과 값을 담을 변수 만들기
		double result = 0;
		
		//부호에 따라 공식을 세운다.
		if(command.equals("plus")) {
			//두수의 합을 구한다.
			result = num1 + num2;
		}else if(command.equals("minus")) {
			//두수의 차를 구한다.
			result = num1 - num2;
		}else if(command.equals("multi")) {
			//두수의 곱을 구한다.
			result = num1 * num2;
		}else if(command.equals("division")) {
			//두수의 몫을 구한다.
			result = num1 / num2;
		}
				
		//출력하기
		this.result.setText(Double.toString(result));
	}
}






