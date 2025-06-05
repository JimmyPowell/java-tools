package com.example.tools;

import java.security.SecureRandom;

/**
 * Utility for generating numeric captcha codes.
 */
public final class CaptchaUtils {
    private static final SecureRandom RANDOM = new SecureRandom();

    private CaptchaUtils() {
    }

    /**
     * Generate a numeric captcha code of the given length.
     *
     * @param length length of the code
     * @return numeric string
     */
    public static String numericCode(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("length must be positive");
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(RANDOM.nextInt(10));
        }
        return sb.toString();
    }
}
