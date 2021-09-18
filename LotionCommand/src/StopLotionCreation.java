
public class StopLotionCreation implements LotionCommand {
	

	
	private LotionDevice lotionDevice ;
	
	private String item ;

	public StopLotionCreation(LotionDevice lotion) {
		lotionDevice = lotion;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public void execute() {
		lotionDevice.stop();
		
	}

	public LotionDevice getLotionDevice() {
		return lotionDevice;
	}

	public void setLotionDevice(LotionDevice lotionDevice) {
		this.lotionDevice = lotionDevice;
	}

	@Override
	public void addItem(String item) {
		// TODO Auto-generated method stub
		
	}
	
	 

	 


}
