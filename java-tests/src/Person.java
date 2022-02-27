 
public class Person extends Creature implements HasFriend <Person>{
	
	private Person per;
	
	
	public Person(String name, Person per) {
		super(name);
		this.per=per;
	}

	@Override
	public Person friend(){
		return per;
	}

	
}
