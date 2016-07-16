import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class TestPicoPlaca {

	@Test
	public void test() {
		 String fecha  = "2016/07/12" ; String hora = "17:00" ; String placa = "AAC-0123" ;
		    try {
				assertEquals(0, PicoyPlacaPredict.getInfo(placa, hora, fecha));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
