//*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain {

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - start");

		// 2.
		btn.addActionListener(new ActionListener() { // 익명(무명) 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();

			}
		});
		
		// 3. 
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			} // 무명 클래스
			
		});
		
		frame.add(btn); // 버튼 컴포넌트를 프레임에 붙인다.
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);

	}
}
//*/

/*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain {
	
//	class EventHandler implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("ActionEvent 발생했습니다.");
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
//			System.out.println();
//		}
//		
//	}

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - start");

		// 2.
		btn.addActionListener(new ActionListener() { // 익명(무명) 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println();

			}
		});

		frame.add(btn); // 버튼 컴포넌트를 프레임에 붙인다.
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);

	}
}
*/

/*
package ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEventMain {
	
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생했습니다.");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임(화면)
		Button btn = new Button("Button - start");
		
		// 1.
		EventHandler handler = new InnerEventMain().new EventHandler();
		btn.addActionListener(handler); // 버튼에 액션이벤트를 추가
		
		frame.add(btn); // 버튼 컴포넌트를 프레임에 붙인다.
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
		
	}
}
*/