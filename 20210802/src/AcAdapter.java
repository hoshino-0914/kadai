class AcAdapter extends Dengen{
	JapaneseConsent jc = new JapaneseConsent();

	public int kyuuden(){
		return (int)(jc.power() * 0.16);
	}
}
