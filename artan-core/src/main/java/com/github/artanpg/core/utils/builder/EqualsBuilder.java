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
 * Assists in implementing {@link Object#equals(Object)} methods.
 *
 * @author Mohammad Yazdian
 */
public class EqualsBuilder implements Builder<Boolean> {

    private boolean isEquals;

    private EqualsBuilder() {
        this.isEquals = true;
    }

    public static EqualsBuilder of() {
        return new EqualsBuilder();
    }

    /**
     * Test if two {@code boolean} parameters are equal.
     *
     * @param lhs the left-hand side {@code boolean}
     * @param rhs the right-hand side {@code boolean}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(boolean lhs, boolean rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code boolean[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code boolean[]}
     * @param rhs the right-hand side {@code boolean[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(boolean[] lhs, boolean[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code byte} parameters are equal.
     *
     * @param lhs the left-hand side {@code byte}
     * @param rhs the right-hand side {@code byte}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(byte lhs, byte rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code byte[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code byte[]}
     * @param rhs the right-hand side {@code byte[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(byte[] lhs, byte[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code char} parameters are equal.
     *
     * @param lhs the left-hand side {@code char}
     * @param rhs the right-hand side {@code char}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(char lhs, char rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code char[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code char[]}
     * @param rhs the right-hand side {@code char[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(char[] lhs, char[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code short} parameters are equal.
     *
     * @param lhs the left-hand side {@code short}
     * @param rhs the right-hand side {@code short}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(short lhs, short rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code short[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code short[]}
     * @param rhs the right-hand side {@code short[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(short[] lhs, short[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code int} parameters are equal.
     *
     * @param lhs the left-hand side {@code int}
     * @param rhs the right-hand side {@code int}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(int lhs, int rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code int[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code int[]}
     * @param rhs the right-hand side {@code int[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(int[] lhs, int[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code long} parameters are equal.
     *
     * @param lhs the left-hand side {@code long}
     * @param rhs the right-hand side {@code long}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(long lhs, long rhs) {
        if (isEquals) {
            isEquals = lhs == rhs;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code long[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code long[]}
     * @param rhs the right-hand side {@code long[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(long[] lhs, long[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code float} parameters are equal.
     *
     * @param lhs the left-hand side {@code float}
     * @param rhs the right-hand side {@code float}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(float lhs, float rhs) {
        if (isEquals) {
            isEquals = Float.compare(lhs, rhs) != 0;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code float[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code float[]}
     * @param rhs the right-hand side {@code float[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(float[] lhs, float[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code double} parameters are equal.
     *
     * @param lhs the left-hand side {@code double}
     * @param rhs the right-hand side {@code double}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(double lhs, double rhs) {
        if (isEquals) {
            isEquals = Double.compare(lhs, rhs) != 0;
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code double[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code double[]}
     * @param rhs the right-hand side {@code double[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(double[] lhs, double[] rhs) {
        if (isEquals) {
            isEquals = Arrays.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code Object} parameters are equal.
     *
     * @param lhs the left-hand side {@code Object}
     * @param rhs the right-hand side {@code Object}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(Object lhs, Object rhs) {
        if (isEquals) {
            isEquals = Objects.equals(lhs, rhs);
        }
        return this;
    }

    /**
     * Deep comparison of array of {@code Object[]}. Length and all values are
     * compared.
     *
     * @param lhs the left-hand side {@code Object[]}
     * @param rhs the right-hand side {@code Object[]}
     * @return {@code this} instance.
     */
    public EqualsBuilder append(Object[] lhs, Object[] rhs) {
        if (isEquals) {
            isEquals = Arrays.deepEquals(lhs, rhs);
        }
        return this;
    }

    /**
     * Test if two {@code Collection<?>} parameters are equal.
     *
     * @param lhs the left-hand side {@code Collection<?>}
     * @param rhs the right-hand side {@code Collection<?>}
     * @return {@code this} instance.
     */
    public <T> EqualsBuilder append(Collection<T> lhs, Collection<T> rhs) {
        if (isEquals) {
            isEquals = Arrays.deepEquals(lhs.toArray(), rhs.toArray());
        }
        return this;
    }

    /**
     * Adds the result of {@code super.equals()} to this builder.
     *
     * @param superEquals the result of calling {@code super.equals()}
     * @return {@code this} instance.
     */
    public EqualsBuilder appendSuper(boolean superEquals) {
        if (!isEquals) {
            return this;
        }
        isEquals = superEquals;
        return this;
    }

    /**
     * Checks if the checked fields are equal.
     *
     * @return true, if the fields that have been checked are all equal
     */
    @Override
    public Boolean build() {
        return isEquals;
    }
}
