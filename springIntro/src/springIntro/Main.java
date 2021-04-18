package springIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		manager.add();
	}

}
