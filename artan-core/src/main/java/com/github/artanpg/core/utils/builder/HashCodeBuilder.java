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

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Assists in implementing {@link Object#hashCode()} methods.
 *
 * @author Mohammad Yazdian
 */
public class HashCodeBuilder implements Builder<Integer> {

    private static final int CONSTANT = 37;

    /**
     * Running total of the hashCode.
     */
    private int iTotal;

    private HashCodeBuilder() {
        iTotal = 17;
    }

    public static HashCodeBuilder of() {
        return new HashCodeBuilder();
    }

    /**
     * Append a {@code hashCode} for a {@code boolean} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(boolean value) {
        iTotal = iTotal * CONSTANT + (value ? Boolean.hashCode(true) : Boolean.hashCode(false));
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code boolean[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(boolean[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code byte} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(byte value) {
        iTotal = iTotal * CONSTANT + value;
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code byte[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(byte[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code char} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(char value) {
        iTotal = iTotal * CONSTANT + value;
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code char[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(char[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code short} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(short value) {
        iTotal = iTotal * CONSTANT + value;
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code short[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(short[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code int} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(int value) {
        iTotal = iTotal * CONSTANT + value;
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code int[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(int[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code long} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(long value) {
        iTotal = iTotal * CONSTANT + Long.hashCode(value);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code long[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(long[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code float} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(float value) {
        iTotal = iTotal * CONSTANT + Float.hashCode(value);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code float[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(float[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code double} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(double value) {
        iTotal = iTotal * CONSTANT + Double.hashCode(value);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code double[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(double[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code Object} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(Object value) {
        iTotal = iTotal * CONSTANT + Objects.hashCode(value);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code Object[]} values.
     *
     * @param values the values to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public HashCodeBuilder append(Object[] values) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(values);
        return this;
    }

    /**
     * Append a {@code hashCode} for a {@code Object} value.
     *
     * @param value the value to add to the {@code hashCode}
     * @return {@code this} instance.
     */
    public <T> HashCodeBuilder append(Collection<T> value) {
        iTotal = iTotal * CONSTANT + Arrays.hashCode(value.toArray());
        return this;
    }

    /**
     * Adds the result of super.hashCode() to this builder.
     *
     * @param superHashCode the result of calling {@code super.hashCode()}
     * @return {@code this} instance.
     */
    public HashCodeBuilder appendSuper(int superHashCode) {
        iTotal = iTotal * CONSTANT + superHashCode;
        return this;
    }

    /**
     * Gets the computed {@code hashCode}.
     *
     * @return {@code hashCode} based on the fields appended
     */
    public int toHashCode() {
        return iTotal;
    }

    @Override
    public Integer build() {
        return toHashCode();
    }
}
