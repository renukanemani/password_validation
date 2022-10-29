package com.problem.password.validation;

import com.problem.password.exception.InvalidPasswordException;

public class PasswordValidator {
	public boolean isValid(String password) throws InvalidPasswordException {

		boolean isValidAndContainsLowerChar = false;
		if (!password.isEmpty()) {

			// checking small letters
			for (int i = 90; i <= 122; i++) {

				// type casting
				char c = (char) i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					isValidAndContainsLowerChar = true;
				}
			}
			if (!isValidAndContainsLowerChar) {
				throw new InvalidPasswordException(5);
			}
		} else {
			throw new InvalidPasswordException(2);
		}

		// for checking if password length
		// is between 8 and 15
		if (isValidAndContainsLowerChar && (password.length() < 8)) {
			throw new InvalidPasswordException(1);
		}

		if (isValidAndContainsLowerChar) {
			int count = 0;

			// check digits from 0 to 9
			for (int i = 0; i <= 9; i++) {

				// to convert int to string
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(3);
			}
		}

		if (isValidAndContainsLowerChar) {
			int count = 0;

			// checking capital letters
			for (int i = 65; i <= 90; i++) {

				// type casting
				char c = (char) i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(4);
			}
		}
		return true;
	}

}