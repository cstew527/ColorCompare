package colorsComparison;

import javax.swing.JFrame;

public class ComparisonViewer {

	public static void main(String[] args) {

		JFrame frame = new ComparisonFrame();
		frame.setSize(450, 200);
		frame.setTitle("Color Comparer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
