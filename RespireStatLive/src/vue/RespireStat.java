package vue;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class RespireStat {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				SimpleFenetre fenetre = new SimpleFenetre();
				fenetre.setVisible(true);//On la rend visible
			}
		});
		
		
		
	}
}
