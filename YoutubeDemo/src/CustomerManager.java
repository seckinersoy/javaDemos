
public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, TeacherCrediManager teacherCrediManager) {
		
		_customer = customer;
		_creditManager = teacherCrediManager;
	}
	
	public void Save() {
		
		System.out.println("Musteri kaydedildi");
		
	}
	public void Delete() {
		
		System.out.println("Musteri silindi");
		
	}
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
		
	}

	public Customer get_customer() {
		return _customer;
	}

	public void set_customer(Customer _customer) {
		this._customer = _customer;
	}
	
}
