package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private static AtomicLong counter = new AtomicLong();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new Exception();
				}
				
			return convertToDouble(numberOne) + convertToDouble(numberTwo);
			
		}

	private Double convertToDouble(String strNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isNumeric(String strNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
