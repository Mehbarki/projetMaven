package vue;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class RespireStat {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JWindow
				JWindow window = new JWindow();
				window.setSize(300, 200);//On lui donne une taille pour qu'on puisse la voir
				window.setVisible(true);//On la rend visible
			}
		});
		
	}
}
