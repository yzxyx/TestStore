package pe.edu.ulasalle.dima.pauldata.tts.library;
import pe.edu.ulasalle.dima.pauldata.dto.DivisionItem;

public interface ITts {
	
	public byte[] mp3(String text);
	public byte[] mp3(DivisionItem divisionItem);
	public byte[] mp3(DivisionItem[] divisionItem);
	public byte[] aac(DivisionItem[] divisionItem);
	public byte[] aac(DivisionItem divisionItem);
	public byte[] aac(String text); 

}
