package br.com.erudion.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo){
		return numberOne + numberTwo;		
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo){				
		return numberOne * numberTwo;
	}

	public Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double mean(Double numberOne,Double numberTwo) {
		return (numberOne + numberTwo)/2;
	}
	
	public Double squareRoot(Double number) {
		return Math.sqrt(number);
	}

	
}
