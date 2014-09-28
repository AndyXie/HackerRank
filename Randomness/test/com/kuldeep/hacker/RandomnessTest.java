package com.kuldeep.hacker;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class RandomnessTest {

	@Test
	public void testRandomness() {
		
		Scanner in = new Scanner(System.in);
//		in.nextInt();
//		in.nextInt();
		String originalString = in.next();
		Randomness randomness = new Randomness(originalString);
		int count = randomness.countDistinctSubstrings();
		System.out.println(count);
		
		int position = in.nextInt();
		char newCharacter = in.next().charAt(0);
		int newCount = randomness.replaceCharacter(position, newCharacter);
		System.out.println(newCount);
	}

}
