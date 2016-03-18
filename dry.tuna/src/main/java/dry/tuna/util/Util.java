package dry.tuna.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	public static final SessionFactory sf = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory sessionfactory = config.buildSessionFactory();
			return sessionfactory;
		} catch (Throwable e) {
			System.err.println(e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	public static void closeSessionFactory() {
		sf.close();
	}
}
