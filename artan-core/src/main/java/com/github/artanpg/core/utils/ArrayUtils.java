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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Provides utility methods for array instances.
 *
 * @author Mohammad Yazdian
 */
public abstract class ArrayUtils {

    /**
     * The index value when an element is not found in an array.
     */
    public static final int INDEX_NOT_FOUND = -1;

    private static final String SOURCE_IS_NULL_MESSAGE = "The source array can not be null";
    private static final String INDEX_LESS_THAN_ZERO_MESSAGE = "The given index cannot be less than zero";
    private static final String INDEX_NOT_VALID_MESSAGE = "Index %d out of bounds for length %d";

    private ArrayUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Checks if a {@code boolean} array is {@code null} or {@code empty}.
     *
     * @param values the boolean array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(boolean[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code byte} array is {@code null} or {@code empty}.
     *
     * @param values the byte array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(byte[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code char} array is {@code null} or {@code empty}.
     *
     * @param values the char array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(char[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code short} array is {@code null} or {@code empty}.
     *
     * @param values the short array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(short[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if an {@code int} array is {@code null} or {@code empty}.
     *
     * @param values the int array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(int[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code long} array is {@code null} or {@code empty}.
     *
     * @param values the long array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(long[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code float} array is {@code null} or {@code empty}.
     *
     * @param values the float array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(float[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code double} array is  {@code null} or{@code empty}.
     *
     * @param values the double array to check
     * @return true, if the array is empty, otherwise false
     */
    public static boolean isEmpty(double[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if an {@code Object} array is {@code null} or {@code empty}.
     *
     * @param values the object array to check
     * @return true, if the array is null or empty, otherwise false
     */
    public static boolean isEmpty(Object[] values) {
        return Objects.isNull(values) || values.length == 0;
    }

    /**
     * Checks if a {@code boolean} array is not {@code empty}.
     *
     * @param values the boolean array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(boolean[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code byte} array is not {@code empty}.
     *
     * @param values the byte array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(byte[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code char} array is not {@code empty}.
     *
     * @param values the char array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(char[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code short} array is not {@code empty}.
     *
     * @param values the short array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(short[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if an {@code int} array is not {@code empty}.
     *
     * @param values the int array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(int[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code long} array is not {@code empty}.
     *
     * @param values the long array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(long[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code float} array is not {@code empty}.
     *
     * @param values the float array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(float[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if a {@code double} array is not {@code empty}.
     *
     * @param values the double array to check
     * @return true, if the array is not empty, otherwise false
     */
    public static boolean isNotEmpty(double[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * Checks if an {@code Object} array is not {@code null} or {@code empty}.
     *
     * @param values the Object to check
     * @return true, if the array is not null or empty, otherwise false
     */
    public static boolean isNotEmpty(Object[] values) {
        return Objects.nonNull(values) && values.length > 0;
    }

    /**
     * The adds the given {@code boolean} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static boolean[] add(boolean[] source, boolean element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        boolean[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code byte} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static byte[] add(byte[] source, byte element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        final byte[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code char} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static char[] add(char[] source, char element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        final char[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code short} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static short[] add(short[] source, short element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        short[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code int} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static int[] add(int[] source, int element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        int[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code long} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static long[] add(long[] source, long element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        long[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code float} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static float[] add(float[] source, float element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        float[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code double} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static double[] add(double[] source, double element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        double[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code Object} element at the end of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @return An array containing the existing elements plus the new element
     */
    public static <T> T[] add(T[] source, T element) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);

        T[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[source.length] = element;

        return newArray;
    }

    /**
     * The adds the given {@code boolean} element at the given index of the
     * array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static boolean[] add(boolean[] source, boolean element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        boolean[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code byte} element at the given index of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static byte[] add(byte[] source, byte element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        byte[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code char} element at the given index of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static char[] add(char[] source, char element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        char[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code short} element at the given index of the
     * array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static short[] add(short[] source, short element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        short[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code int} element at the given index of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static int[] add(int[] source, int element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        int[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code long} element at the given index of the array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static long[] add(long[] source, long element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        long[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code float} element at the given index of the
     * array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static float[] add(float[] source, float element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        float[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code double} element at the given index of the
     * array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static double[] add(double[] source, double element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        double[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    /**
     * The adds the given {@code Object} element at the given index of the
     * array.
     *
     * @param source  the array to add the element to
     * @param element the value to add
     * @param index   the position within array to add the new element
     * @return An array containing the existing elements plus the new element
     */
    public static <T> T[] add(T[] source, T element, int index) {
        Asserts.notNull(source, SOURCE_IS_NULL_MESSAGE);
        validationIndex(index, source);

        T[] newArray = Arrays.copyOf(source, source.length + 1);
        System.arraycopy(source, index, newArray, index + 1, source.length - index - 1);
        newArray[index] = element;

        return newArray;
    }

    private static void validationIndex(int index, Object source) {
        if (index < 0) {
            throw new IndexOutOfBoundsException(INDEX_LESS_THAN_ZERO_MESSAGE);
        }
        int length = Array.getLength(source);
        if (index > length) {
            throw new IndexOutOfBoundsException(String.format(INDEX_NOT_VALID_MESSAGE, index, length));
        }
    }

    /**
     * Check whether the given array contains the given element.
     *
     * @param array   the array to check
     * @param element the element to look for
     * @return true, if found, otherwise false
     */
    public static <T> boolean contains(T[] array, T element) {
        return indexOf(array, element) != INDEX_NOT_FOUND;
    }

    /**
     * Finds the index of the given value in the array. <br/>
     *
     * @param source      the array to search through for the object
     * @param valueToFind the value to find
     * @return index of the value found in the array, otherwise -1
     */
    public static <T> int indexOf(T[] source, T valueToFind) {
        return indexOf(source, valueToFind, 0);
    }

    /**
     * Finds the index of the given value in the array starting at the given
     * index.
     *
     * @param array       the array to search through for the object
     * @param valueToFind the value to find
     * @param startIndex  the index to start searching at
     * @return index of the value found in the array, otherwise -1
     */
    public static <T> int indexOf(T[] array, T valueToFind, int startIndex) {
        if (isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        for (int i = getIndexLoopStarter(startIndex); i < array.length; i++) {
            if (Objects.equals(valueToFind, array[i])) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }

    private static int getIndexLoopStarter(int startIndex) {
        return Math.max(startIndex, 0);
    }

    /**
     * Check that all items of the given array are not {@code null} or
     * {@code empty}.
     *
     * @param array the array to check
     * @return true, if all items in the array are not empty or null, otherwise false
     */
    public static boolean noNullElements(Object[] array) {
        Asserts.notNull(array, "array cannot be null or empty");
        for (Object element : array) {
            if (Objects.isNull(element)) {
                return false;
            }
        }
        return true;
    }
}
