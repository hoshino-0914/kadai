class NeteruState extends DogState{
	private static NeteruState s = new NeteruState();
	private NeteruState(){}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto){
		moto.changeState(FutsuuState.getInstance());
	}
	public void tabeta(Dog moto){
		//なにもしない;
	}
	public String toString(){
		return "睡眠状態";
	}
}