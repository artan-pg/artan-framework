/*
 * Copyright 2024-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.artanpg.core.utils;

import java.util.Objects;

/**
 * Provides utility methods for {@link String} instances.
 *
 * @author Mohammad Yazdian
 */
public abstract class StringUtils {

    public static final String EMPTY = "";
    public static final String NULL = "null";

    private StringUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Check whether the given {@code String} is neither {@code null}
     * nor of length 0
     *
     * @param text the String to check
     * @return true, if the String is not null and has length
     */
    public static boolean hasLength(String text) {
        return Objects.nonNull(text) && !text.isEmpty();
    }

    /**
     * Check whether the given {@code String} contains actual text.
     *
     * @param text the String to check
     * @return true, if the String is not null, its length is greater than 0, and it does not contain whitespace only
     */
    public static boolean hasText(String text) {
        return Objects.nonNull(text) && !text.isBlank();
    }

    /**
     * Returns true if and only if this string contains the specified
     * sequence of char values.
     *
     * @param textToSearch the text to search
     * @param substring    the substring to find within the text
     * @return true, if this string contains {@code substring}, false otherwise
     */
    public static boolean contains(String textToSearch, String substring) {
        return (hasText(textToSearch) && hasText(substring) && textToSearch.contains(substring));
    }
}
