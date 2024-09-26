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
package com.github.artanpg.core.utils.builder.strategy;

import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.Date;

/**
 * An interface to override the {@link Object#toString()} method.
 * <p>Three phases will be used to create the value of the {@code toString} method:
 *
 * <li>The first phase is implemented by the {@link #appendStarter} method</li>
 * <li>The second phase is implemented by {@link #append} methods</li>
 * <li>The third phase is implemented by the {@link #appendTerminator} method</li>
 *
 * @author Mohammad Yazdian
 */
public interface ToStringStyleStrategy {

    /**
     * Appends to the toString the string starter.
     */
    void appendStarter();

    /**
     * Appends the field name to {@code toString} along with a {@code boolean}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the boolean value to add to the {@code toString}
     */
    void append(String fieldName, boolean value);

    /**
     * Appends the field name to {@code toString} along with a
     * {@code boolean[]} array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the boolean array to add to the {@code toString}
     */
    void append(String fieldName, boolean[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code byte}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the byte value to add to the {@code toString}
     */
    void append(String fieldName, byte value);

    /**
     * Appends the field name to {@code toString} along with a {@code byte[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the byte array to add to the {@code toString}
     */
    void append(String fieldName, byte[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code char}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the char value to add to the {@code toString}
     */
    void append(String fieldName, char value);

    /**
     * Appends the field name to {@code toString} along with a {@code char[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the char array to add to the {@code toString}
     */
    void append(String fieldName, char[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code short}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the short value to add to the {@code toString}
     */
    void append(String fieldName, short value);

    /**
     * Appends the field name to {@code toString} along with a {@code short[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the short array to add to the {@code toString}
     */
    void append(String fieldName, short[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code int}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the int value to add to the {@code toString}
     */
    void append(String fieldName, int value);

    /**
     * Appends the field name to {@code toString} along with a {@code int[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the int array to add to the {@code toString}
     */
    void append(String fieldName, int[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code long}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the long value to add to the {@code toString}
     */
    void append(String fieldName, long value);

    /**
     * Appends the field name to {@code toString} along with a {@code long[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the long array to add to the {@code toString}
     */
    void append(String fieldName, long[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code float}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the float value to add to the {@code toString}
     */
    void append(String fieldName, float value);

    /**
     * Appends the field name to {@code toString} along with a {@code float[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the float array to add to the {@code toString}
     */
    void append(String fieldName, float[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code double}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the double value to add to the {@code toString}
     */
    void append(String fieldName, double value);

    /**
     * Appends the field name to {@code toString} along with a {@code double[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the double array to add to the {@code toString}
     */
    void append(String fieldName, double[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code String}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the String value to add to the {@code toString}
     */
    void append(String fieldName, String value);

    /**
     * Appends the field name to {@code toString} along with a {@code String[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the String array to add to the {@code toString}
     */
    void append(String fieldName, String[] values);

    /**
     * Appends the field name to {@code toString} along with a {@code Date}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Date value to add to the {@code toString}
     */
    void append(String fieldName, Date value);

    /**
     * Appends the field name to {@code toString} along with a {@code Date[]}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the Date array to add to the {@code toString}
     */
    void append(String fieldName, Date[] values);

    /**
     * Appends the field name to {@code toString} along with a
     * {@code TemporalAccessor} value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the TemporalAccessor value to add to the
     *                  {@code toString}
     */
    void append(String fieldName, TemporalAccessor value);

    /**
     * Appends the field name to {@code toString} along with a
     * {@code TemporalAccessor[]} array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the TemporalAccessor array to add to the
     *                  {@code toString}
     */
    void append(String fieldName, TemporalAccessor[] values);

    /**
     * Appends the field name to {@code toString} along with a
     * {@code Collection<?>} value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Collection<?> value to add to the {@code toString}
     */
    <T> void append(String fieldName, Collection<T> value);

    /**
     * Appends the field name to {@code toString} along with a {@code Enum<?>}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Enum<?> value to add to the {@code toString}
     */
    void append(String fieldName, Enum<?> value);

    /**
     * Appends the field name to {@code toString} along with a {@code Object}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Object value to add to the {@code toString}
     */
    <T> void append(String fieldName, T value);

    /**
     * Appends the field name to {@code toString} along with a {@code Object}
     * array.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the Object array to add to the {@code toString}
     */
    <T> void append(String fieldName, T[] values);

    /**
     * Append the {@code toString} from another object or {@code super} object.
     *
     * @param toString the result of {@code toString()} on another object or
     *                 super object
     */
    void append(String toString);

    /**
     * Appends to the toString the string terminator.
     */
    void appendTerminator();

    String toString();
}
