
public class RemoteControl {
	
	private LotionCommand command ;
	
	private String item ;

	public RemoteControl(LotionCommand  command) {
		 this.command=command;
	}

	public RemoteControl(LotionCommand command, String item) {
		 this.command=command;
		 this.item = item;
		 
	}

	public LotionCommand getCommand() {
		return command;
	}

	public void setCommand(LotionCommand command) {
		this.command = command;
	}
	
	public void buttonPress() {
		command.execute();
	}
	
	public void addItemButtonPress() {
		command.addItem(item);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
