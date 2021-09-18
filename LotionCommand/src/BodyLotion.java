
public class BodyLotion implements LotionDevice{

	@Override
	public void start() {
		 System.out.println("Body lotion making process started ");
		
	}

	@Override
	public void stop() {
		 System.out.println("Body lotion making process stopped ");
		
	}

	@Override
	public void add(String item) {
		 
		 System.out.println("Adding "+item+" while making body lotion");
	}

}
