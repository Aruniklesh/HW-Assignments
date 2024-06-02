package week2.assignments;

public interface DatabseConnection {
	//no need of highlighting the abstract keyword, if indicate that also allows
	abstract void connect();
	void disconnect();
	abstract void executeUpdate();
	
}
