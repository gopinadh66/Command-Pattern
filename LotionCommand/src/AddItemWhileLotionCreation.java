
public class AddItemWhileLotionCreation implements LotionCommand {
	
	private LotionDevice lotionDevice ;
	
	private String item ;

	public AddItemWhileLotionCreation(LotionDevice addLotion, String addItem) {
		lotionDevice = addLotion;
		item = addItem;
	}

	public AddItemWhileLotionCreation(LotionDevice device) {
		lotionDevice = device;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public void execute() {
		 
		
	}

	public LotionDevice getLotionDevice() {
		return lotionDevice;
	}

	public void setLotionDevice(LotionDevice lotionDevice) {
		this.lotionDevice = lotionDevice;
	}

	@Override
	public void addItem(String item) {
		lotionDevice.add(item);
		
	}
	
	 

	 
}
