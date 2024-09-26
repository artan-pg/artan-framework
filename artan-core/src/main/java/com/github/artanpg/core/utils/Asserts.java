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

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Assertion utility class that assists in validating arguments.
 *
 * @author Mohammad Yazdian
 */
public abstract class Asserts {

    private Asserts() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Assert that a conditional expression is {@code true}.
     *
     * @param expression conditional expression for comparison
     * @param message    the exception message to use if the assertion fails
     */
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that a conditional expression is {@code false}.
     *
     * @param expression conditional expression for comparison
     * @param message    the exception message to use if the assertion fails
     */
    public static void isFalse(boolean expression, String message) {
        if (expression) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an object is {@code null}.
     *
     * @param object  the object to check
     * @param message the exception message to use if the assertion fails
     */
    public static void isNull(Object object, String message) {
        if (Objects.nonNull(object)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an object is not {@code null}.
     *
     * @param object  the object to check
     * @param message the exception message to use if the assertion fails
     */
    public static void notNull(Object object, String message) {
        if (Objects.isNull(object)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given String contains valid text content. That
     * is, it must not be {@code null} and must contain at least one
     * non-whitespace character.
     *
     * @param text    the string to check
     * @param message the exception message to use if the assertion fails
     */
    public static void hasText(String text, String message) {
        if (!StringUtils.hasText(text)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given String is not empty. That is, it must
     * not be {@code null} and not the {@code empty} String.
     *
     * @param text    the string to check
     * @param message the exception message to use if the assertion fails
     */
    public static void hasLength(String text, String message) {
        if (!StringUtils.hasLength(text)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given Array is not empty. That is, it must
     * not be {@code null} and not the {@code empty} Array.
     *
     * @param objects the array to check
     * @param message the exception message to use if the assertion fails
     */
    public static void hasLength(Object[] objects, String message) {
        if (Objects.isNull(objects) || objects.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given Collection is not empty. That is, it
     * must not be {@code null} and not the {@code empty} Collection.
     *
     * @param objects the collection to check
     * @param message the exception message to use if the assertion fails
     */
    public static void hasLength(Collection<?> objects, String message) {
        if (Objects.isNull(objects) || objects.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given Map is not empty. That is, it
     * must not be {@code null} and not the {@code empty} Map.
     *
     * @param objects the map to check
     * @param message the exception message to use if the assertion fails
     */
    public static void hasLength(Map<?, ?> objects, String message) {
        if (Objects.isNull(objects) || objects.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given text does contain the given substring.
     *
     * @param textToSearch the text to search
     * @param substring    the substring to find within the text
     * @param message      the exception message to use if the assertion fails
     */
    public static void doesContain(String textToSearch, String substring, String message) {
        if (!StringUtils.contains(textToSearch, substring)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given array does contain the given object.
     *
     * @param objectToSearch the array to search
     * @param subObject      the sub-object to find within the array
     * @param message        the exception message to use if the assertion fails
     */
    public static void doesContain(Object[] objectToSearch, Object subObject, String message) {
        if (!ArrayUtils.contains(objectToSearch, subObject)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given collection does contain the given
     * object.
     *
     * @param collectionToSearch the collection to search
     * @param subObject          the sub-object to find within the collection
     * @param message            the exception message to use if the assertion fails
     */
    public static void doesContain(Collection<?> collectionToSearch, Object subObject, String message) {
        if (!CollectionUtils.contains(collectionToSearch.iterator(), subObject)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given text does not contain the given
     * substring.
     *
     * @param textToSearch the text to search
     * @param substring    the substring to find within the text
     * @param message      the exception message to use if the assertion fails
     */
    public static void doesNotContain(String textToSearch, String substring, String message) {
        if (StringUtils.contains(textToSearch, substring)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given array does not contain the given object.
     *
     * @param objectToSearch the array to search
     * @param subObject      the sub-object to find within the array
     * @param message        the exception message to use if the assertion fails
     */
    public static void doesNotContain(Object[] objectToSearch, Object subObject, String message) {
        if (ArrayUtils.contains(objectToSearch, subObject)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that the given collection does not contain the given
     * object.
     *
     * @param collectionToSearch the collection to search
     * @param subObject          the sub-object to find within the collection
     * @param message            the exception message to use if the assertion fails
     */
    public static void doesNotContain(Collection<?> collectionToSearch, Object subObject, String message) {
        if (CollectionUtils.contains(collectionToSearch.iterator(), subObject)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an array contains no {@code null} elements.
     *
     * @param array   the array to check
     * @param message the exception message to use if the assertion fails
     */
    public static void noNullElements(Object[] array, String message) {
        if (!ArrayUtils.noNullElements(array)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Assert that an iterator contains no {@code null} elements.
     *
     * @param iterator the iterator to check
     * @param message  the exception message to use if the assertion fails
     */
    public static void noNullElements(Iterator<?> iterator, String message) {
        if (!CollectionUtils.noNullElements(iterator)) {
            throw new IllegalArgumentException(message);
        }
    }
}
