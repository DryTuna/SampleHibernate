import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dry.tuna.model.Player;
import dry.tuna.util.Util;

public class SampleHibernateMain {
	public static void main (String[] args) {
		//Util create SessionFactory as a Singleton
		Session sess = Util.getSessionFactory().openSession();
		//Transaction tran = sess.beginTransaction();  
		try{
			Query query = sess.createQuery("FROM Player");
			
			//Polymorphism - List can be of either type List or ArrayList
			List<Player> results_1 = query.list();
			List<Player> results_2 = (ArrayList<Player>)query.list();
			
			System.out.println("LIST RESULT");
			for (Player p: results_1) {
				System.out.println(p.getUserName());
			}
			
			System.out.println("\nARRAY_LIST RESULT");
			for (Player p: results_2) {
				System.out.println(p.getUserName());
			}
			
/* OUTPUT

LIST RESULT
drytuna
windsaiyan
utpieu
Titania1

ARRAY_LIST RESULT
drytuna
windsaiyan
utpieu
Titania1

 * 			
 */
			
		} catch(Exception e){
			System.out.println(e.getMessage());
			Util.closeSessionFactory();
		} finally {
			sess.close();
		}
		
	}
}
