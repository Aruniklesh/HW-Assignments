package week2.assignments;

public class JavaConnection implements DatabseConnection {

	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();

	}

	public void connect() {
		System.out.println("Connected Successfully");
	}

	public void disconnect() {
		System.out.println("Dis - Connected Successfully");

	}

	public void executeUpdate() {
		System.out.println("Update Successfully");

	}

}
