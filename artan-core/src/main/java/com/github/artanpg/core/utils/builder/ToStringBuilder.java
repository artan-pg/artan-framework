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
package com.github.artanpg.core.utils.builder;

import com.github.artanpg.core.utils.Asserts;
import com.github.artanpg.core.utils.StringUtils;
import com.github.artanpg.core.utils.builder.strategy.DefaultToStringStyle;
import com.github.artanpg.core.utils.builder.strategy.JsonToStringStyle;
import com.github.artanpg.core.utils.builder.strategy.ToStringStyleStrategy;

import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.Date;

/**
 * Assists in implementing {@link Object#toString()} methods.
 *
 * @author Mohammad Yazdian
 */
public class ToStringBuilder implements Builder<String> {

    /**
     * The style of output to use for override {@code toString} method.
     */
    private final ToStringStyleStrategy styleStrategy;

    /**
     * Constructs a builder for using the defined output style.
     *
     * @param styleStrategy the style of the {@code toString} to create
     */
    private ToStringBuilder(ToStringStyleStrategy styleStrategy) {
        Asserts.notNull(styleStrategy, "The styleStrategy can not be null");

        this.styleStrategy = styleStrategy;
        styleStrategy.appendStarter();
    }

    /**
     * Constructs for using the json format style.
     *
     * @return {@code this} instance
     */
    public static ToStringBuilder jsonStyle() {
        return new ToStringBuilder(JsonToStringStyle.of());
    }

    /**
     * Constructs for using the default format style.
     *
     * @return {@code this} instance
     */
    public static <T> ToStringBuilder defaultStyle(Class<T> aClass) {
        return new ToStringBuilder(DefaultToStringStyle.of(aClass));
    }

    /**
     * Constructs for using the costume defined style.
     *
     * @param styleStrategy the style of the {@code toString} to create
     * @return {@code this} instance
     */
    public static ToStringBuilder costumeStyle(ToStringStyleStrategy styleStrategy) {
        return new ToStringBuilder(styleStrategy);
    }

    /**
     * Appends the field name to {@code toString} along with a {@code boolean}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the boolean value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, boolean value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code boolean[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the boolean values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, boolean[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code byte}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the byte value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, byte value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code byte[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the boolean values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, byte[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code char}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the char value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, char value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code char[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the char values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, char[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code short}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the short value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, short value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code short[]}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the short values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, short[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code int}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the int value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, int value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code int[]}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the int values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, int[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code long}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the long value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, long value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code long[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the long values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, long[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code float}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the float value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, float value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code float[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the float values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, float[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code double}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the double value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, double value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code double[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the double values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, double[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code String}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the string value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, String value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code String[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the string values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, String[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code Date}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Date value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, Date value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code Date[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the Date values to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, Date[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a
     * {@code TemporalAccessor} value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the TemporalAccessor value to add to the
     *                  {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, TemporalAccessor value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with
     * {@code TemporalAccessor[]} values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the TemporalAccessor values to add to the
     *                  {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, TemporalAccessor[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a
     * {@code Collection<?>} value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Collection<?> value to add to the {@code toString}
     * @return {@code this} instance
     */
    public <T> ToStringBuilder append(String fieldName, Collection<T> value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code Enum<?>}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the Enum<?> value to add to the {@code toString}
     * @return {@code this} instance
     */
    public ToStringBuilder append(String fieldName, Enum<?> value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with a {@code Object}
     * value.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param value     the object value to add to the {@code toString}
     * @return {@code this} instance
     */
    public <T> ToStringBuilder append(String fieldName, T value) {
        styleStrategy.append(fieldName, value);
        return this;
    }

    /**
     * Appends the field name to {@code toString} along with {@code Object[]}
     * values.
     *
     * @param fieldName the field name to add to the {@code toString}
     * @param values    the object values to add to the {@code toString}
     * @return {@code this} instance
     */
    public <T> ToStringBuilder append(String fieldName, T[] values) {
        styleStrategy.append(fieldName, values);
        return this;
    }

    /**
     * Append the {@code toString} from another object or {@code super} object.
     *
     * @param toString the result of {@code toString()} on another object or
     *                 super object
     * @return {@code this} instance
     */
    public ToStringBuilder appendToString(String toString) {
        if (StringUtils.hasText(toString)) {
            styleStrategy.append(toString);
        }
        return this;
    }

    /**
     * Returns the String that was build as an object representation.
     *
     * @return the String {@code toString}
     */
    @Override
    public String build() {
        return toString();
    }

    @Override
    public String toString() {
        return styleStrategy.toString();
    }
}
