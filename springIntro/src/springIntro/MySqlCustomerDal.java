package springIntro;

public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("MysSql veritabanýna eklendi");
		
	}
}
