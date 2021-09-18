
public class TestDemoForComand {

	public static void main(String args[]) {

		LotionDevice bodyLotion = new BodyLotion();

		StartLotionCreation makingBodyLotion = new StartLotionCreation(bodyLotion);
		RemoteControl bodyLotionControl = new RemoteControl(makingBodyLotion);
		bodyLotionControl.buttonPress();
		
		
		StopLotionCreation stopBodyLotion = new StopLotionCreation(bodyLotion);
		RemoteControl stopbodyLotionControl = new RemoteControl(stopBodyLotion);
		stopbodyLotionControl.buttonPress();
		
		System.out.println("\n");
		
		LotionDevice faceLotion = new FaceLotion();
		
		StartLotionCreation startFaceLotion = new StartLotionCreation(faceLotion);
		RemoteControl faceLotionControl = new RemoteControl(startFaceLotion);
		faceLotionControl.buttonPress();
		
		AddItemWhileLotionCreation addItem = new AddItemWhileLotionCreation(faceLotion);
		 RemoteControl faceRemoteControl = new RemoteControl(addItem,"Glycerin");
		 faceRemoteControl.addItemButtonPress();
		 
		 StopLotionCreation stopFaceLotion = new StopLotionCreation(faceLotion);
			RemoteControl stopfaceLotionControl = new RemoteControl(stopFaceLotion);
			stopfaceLotionControl.buttonPress();
		 
	}

}
