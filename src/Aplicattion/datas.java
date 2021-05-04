package Aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data1 = sdf.parse("24/08/2020");
		Date date2 = sdf.parse("24/08/2020");
		long dia = date2.getTime() - data1.getTime();
	
	
		//encontrando diferença de dias nas datas//
		System.out.println( dia /  1000 / 60 / 60 / 24 );
	}

}
