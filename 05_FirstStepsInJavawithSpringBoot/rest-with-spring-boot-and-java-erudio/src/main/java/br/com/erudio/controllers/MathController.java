package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudion.math.SimpleMath;

@RestController
public class MathController {

	private static AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double sum(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.sum(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));		
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double subtraction(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.subtraction(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double multiplication(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.multiplication(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/division/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double division(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.division(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double mean(
			@PathVariable(name = "numberOne") String numberOne,
			@PathVariable(name = "numberTwo") String numberTwo
			) throws Exception {
		
				if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.mean(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/squareRoot/{number}",
			method = RequestMethod.GET)
	public Double squareRoot(
			@PathVariable(name = "number") String number
			) throws Exception {
		
				if(!NumberConverter.isNumeric(number)){
					throw new UnsupportedMathOperationException("Please set a numeric value");
				}
				
			return math.squareRoot(NumberConverter.convertToDouble(number));
	}
	
}
