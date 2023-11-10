package springbook.user.dao;

public class SingletonUserDao {
	private static SingletonUserDao INSTANCE;
	
	private ConnectionMaker connectionMaker;
	
	private SingletonUserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	public static synchronized SingletonUserDao getInstance(ConnectionMaker connectionMaker) {
		if (INSTANCE == null)
			INSTANCE = new SingletonUserDao(connectionMaker);
		return INSTANCE;
	}
}
