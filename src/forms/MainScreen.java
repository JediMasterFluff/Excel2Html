package forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTree;

public class MainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1075, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(new Color(127, 255, 0));
		frame.getContentPane().add(MainPanel);
		MainPanel.setLayout(null);
		
		JPanel EditorPanel = new JPanel();
		EditorPanel.setBounds(0, 0, 415, 269);
		EditorPanel.setBackground(new Color(138, 43, 226));
		MainPanel.add(EditorPanel);
		
		JPanel TreePanel = new JPanel();
		TreePanel.setBounds(425, 0, 634, 269);
		TreePanel.setBackground(new Color(255, 0, 0));
		MainPanel.add(TreePanel);
		TreePanel.setLayout(null);
		
		JTree tree = new JTree();
		tree.setBounds(403, 0, 231, 269);
		tree.setSelectionRows(new int[] {1});
		tree.setSelectionRow(1);
		tree.setEditable(true);
		TreePanel.add(tree);
		
		
		//JFXPanel;
		JPanel ViewPanel = new JPanel();
		ViewPanel.setBackground(new Color(255, 255, 0));
		ViewPanel.setBounds(0, 280, 1059, 416);
		MainPanel.add(ViewPanel);
	}
}
