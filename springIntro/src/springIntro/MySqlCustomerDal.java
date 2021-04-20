package springIntro;

public class MySqlCustomerDal implements ICustomerDal {

	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Connetion String : "+this.connectionString);
		System.out.println("MysSql veritabanýna eklendi");
		
	}
}
