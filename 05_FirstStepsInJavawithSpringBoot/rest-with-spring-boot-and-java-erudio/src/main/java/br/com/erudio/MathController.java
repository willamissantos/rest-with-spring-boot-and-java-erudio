package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	private static AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double sum(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return convertToDouble(numberOne) + convertToDouble(numberTwo);		
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double subtraction(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double multiplication(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}

	@RequestMapping(value = "/division/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double division(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double mean(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return (convertToDouble(numberOne) + convertToDouble(numberTwo))/2;
	}
	
	@RequestMapping(value = "/squareRoot/{number}",
			method = RequestMethod.GET)
	public Double squareRoot(
			@PathVariable(name = "number") String number
			) throws Exception {
		
				if(!isNumeric(number)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return Math.sqrt(convertToDouble(number));
	}
	
	
	private Double convertToDouble(String strNumber) {
		
		if(strNumber == null) return 0D;
		
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
			
		return 0D;
	}

	private boolean isNumeric(String strNumber) {

		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
