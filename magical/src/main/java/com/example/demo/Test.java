package com.example.demo;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	static int pIMin;
	static int pIMax;
	public static final Logger LOG = LoggerFactory.getLogger(Test.class);

	public Boolean isplayMagicalNumber(int pIMin, int pIMax) {

		if (pIMin > pIMax)
			throw new IllegalArgumentException("min integer should be less than max integer !");
		StringBuilder sb = new StringBuilder();
		for (int i = pIMin; i <= pIMax; i++) {
			if (i != pIMin)
				sb.append(" ** ");
			if (i % 3 == 0)
				sb.append("H");
			else {
				if (i % 5 == 0)
					sb.append("S");
				else {
					sb.append(Integer.toString(i));
				}
			}
		}
		LOG.info("Result = [{}]", sb.toString());
		return true;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		LOG.info("Enter a number: ");
		pIMin = reader.nextInt();
		LOG.info("Enter a number: ");
		pIMax = reader.nextInt();
		reader.close();
		Test test = new Test();
		test.isplayMagicalNumber(pIMin, pIMax);



	}

}
