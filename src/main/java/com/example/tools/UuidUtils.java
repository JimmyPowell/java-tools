package com.example.tools;

import java.util.UUID;

/**
 * Utility methods for working with UUIDs.
 */
public final class UuidUtils {
    private UuidUtils() {
    }

    /**
     * Generate a random version 4 UUID string with dashes.
     *
     * @return UUID string with dashes
     */
    public static String randomUuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Generate a random version 4 UUID string without dashes.
     *
     * @return UUID string without dashes
     */
    public static String randomUuidWithoutDash() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
