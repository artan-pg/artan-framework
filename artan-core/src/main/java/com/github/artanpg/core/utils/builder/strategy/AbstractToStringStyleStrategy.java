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

import com.github.artanpg.core.utils.ArrayUtils;
import com.github.artanpg.core.utils.Asserts;
import com.github.artanpg.core.utils.CollectionUtils;
import com.github.artanpg.core.utils.StringUtils;

import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

/**
 * Abstract implementation strategy of the {@link Object#toString()}.
 *
 * @author Mohammad Yazdian
 */
public abstract class AbstractToStringStyleStrategy implements ToStringStyleStrategy {

    /**
     * To specify the use of field names in {@code toString}.
     */
    private boolean useFieldNames = true;

    /**
     * Title of the class.
     */
    private String className;

    /**
     * String starter symbol.
     */
    private String stringStarter = "(";

    /**
     * String terminator symbol.
     */
    private String stringTerminator = ")";

    /**
     * String starter symbol for field names and values.
     */
    private String contentStarter = "'";

    /**
     * String terminator symbol for field names and values.
     */
    private String contentTerminator = "'";

    /**
     * String separator symbol for field names and values.
     */
    private String contentSeparator = "=";

    /**
     * Array starter symbol for values.
     */
    private String arrayStarter = "{";

    /**
     * Array terminator symbol for values.
     */
    private String arrayTerminator = "}";

    private final StringBuilder builder;

    protected AbstractToStringStyleStrategy() {
        this.builder = new StringBuilder(2048);
    }

    /**
     * Appends class name to the {@code toString}.
     */
    protected void appendClassName() {
        if (StringUtils.hasText(className)) {
            builder.append(className);
        }
    }

    /**
     * Appends string starter to the {@code toString}.
     */
    protected void appendStringStarter() {
        Asserts.hasText(stringStarter, "The string starter can not be null or empty");
        builder.append(stringStarter);
    }

    /**
     * Appends string terminator to the {@code toString}.
     */
    protected void appendStringTerminator() {
        Asserts.hasText(stringTerminator, "The string terminator can not be null or empty");
        builder.append(stringTerminator);
    }

    /**
     * Appends an indicator for {@code null} to the {@code toString}.
     */
    protected void appendNullText() {
        builder.append(StringUtils.NULL);
    }

    /**
     * If the field name are not {@code null} and {@code useFieldNames = true},
     * it adds to {@code toString}.
     *
     * @param fieldName the field name to add to the toString
     */
    protected void appendFieldNames(String fieldName) {
        if (useFieldNames && Objects.nonNull(fieldName)) {
            builder.append(contentStarter).append(fieldName).append(contentTerminator).append(contentSeparator);
        }
    }

    /**
     * Appends to the {@code toString} a {@code boolean} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(boolean value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code boolean[]} values.
     *
     * @param values the value array to add to the {@code toString}
     */
    protected void appendValues(boolean[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (boolean value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code byte} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(byte value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code byte[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(byte[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (byte value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code char} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(char value) {
        builder.append("'").append(value).append("'").append(',');
    }

    /**
     * Appends to the {@code toString} a {@code char[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(char[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (char value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code shor} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(short value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code short[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(short[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (short value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code int} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(int value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code int[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(int[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (int value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code long} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(long value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code long[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(long[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (long value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code float} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(float value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code float[]} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(float[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (float value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code double} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(double value) {
        builder.append(value).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code double[} values.
     *
     * @param values the values to add to the {@code toString}
     */
    protected void appendValues(double[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (double value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code String} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(String value) {
        if (Objects.isNull(value)) {
            appendNullText();
            builder.append(',');
        } else {
            builder.append(contentStarter).append(value).append(contentTerminator).append(',');
        }
    }

    /**
     * Appends to the {@code toString} a {@code String[]} values.
     *
     * @param values the value array to add to the {@code toString}
     */
    protected void appendValues(String[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (String value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code Date} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(Date value) {
        if (Objects.isNull(value)) {
            appendNullText();
            builder.append(',');
        } else {
            appendValues(value.toString());
        }
    }

    /**
     * Appends to the {@code toString} a {@code Date[]} values.
     *
     * @param values the value array to add to the {@code toString}
     */
    protected void appendValues(Date[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (Date value : values) {
                appendValues(value.toString());
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code TemporalAccessor} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(TemporalAccessor value) {
        if (Objects.isNull(value)) {
            appendNullText();
            builder.append(',');
        } else {
            appendValues(value.toString());
        }
    }

    /**
     * Appends to the {@code toString} a {@code TemporalAccessor[]} values.
     *
     * @param values the value array to add to the {@code toString}
     */
    protected void appendValues(TemporalAccessor[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (TemporalAccessor value : values) {
                appendValues(value.toString());
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code Collection<?>} values.
     *
     * @param values the value collection to add to the {@code toString}
     */
    protected void appendValues(Collection<?> values) {
        builder.append(arrayStarter);
        if (CollectionUtils.isNotEmpty(values)) {
            for (Object value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Appends to the {@code toString} a {@code Enum<?>} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected void appendValues(Enum<?> value) {
        if (Objects.isNull(value)) {
            appendNullText();
            builder.append(',');
        } else {
            appendValues(value.toString());
        }
    }

    /**
     * Appends to the {@code toString} a {@code Object} value.
     *
     * @param value the value to add to the {@code toString}
     */
    protected <T> void appendValues(T value) {
        if (Objects.isNull(value)) {
            appendNullText();
            builder.append(',');
        } else if (value instanceof String string) {
            appendValues(string);
        } else {
            builder.append(value).append(',');
        }
    }

    /**
     * Appends to the {@code toString} a {@code Object[]} values.
     *
     * @param values the value array to add to the {@code toString}
     */
    protected <T> void appendValues(T[] values) {
        builder.append(arrayStarter);
        if (ArrayUtils.isNotEmpty(values)) {
            for (Object value : values) {
                appendValues(value);
            }
            removeLastContentSeparator();
        }
        builder.append(arrayTerminator).append(',');
    }

    /**
     * Remove the last field separator from the {@code toString}.
     */
    protected void removeLastContentSeparator() {
        if (builder.toString().endsWith(",")) {
            builder.setLength(builder.length() - 1);
        }
    }

    @Override
    public void appendStarter() {
        appendClassName();
        appendStringStarter();
    }

    @Override
    public void append(String toString) {
        if (StringUtils.hasText(toString)) {
            int pos1 = toString.indexOf(stringStarter) + stringStarter.length();
            int pos2 = toString.lastIndexOf(stringTerminator);
            if (pos1 != pos2 && pos1 >= 0 && pos2 >= 0) {
                builder.append(toString, pos1, pos2);
            }
        }
    }

    @Override
    public void appendTerminator() {
        removeLastContentSeparator();
        appendStringTerminator();
    }

    @Override
    public String toString() {
        appendTerminator();
        String toString = builder.toString();
        builder.setLength(0);
        return toString;
    }

    /**
     * Gets whether to use the field names in {@code toString}.
     *
     * @return the current useFieldNames value
     */
    public boolean isUseFieldNames() {
        return useFieldNames;
    }

    /**
     * Determines whether to use field names in {@code toString}.
     *
     * @param useFieldNames the new useFieldNames value
     */
    public void setUseFieldNames(boolean useFieldNames) {
        this.useFieldNames = useFieldNames;
    }

    /**
     * Returns the name of the class used in the output of {@code toString()}
     *
     * @return the current class name value
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the name of the class used in the output of {@code toString()}.
     * If it is null, nothing will be displayed in {@code toString}
     *
     * @param className the class name value
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Returns the string starter symbol used in the output of
     * {@code toString()}.
     *
     * @return the current string starter value
     */
    public String getStringStarter() {
        return stringStarter;
    }

    /**
     * Sets the string starter symbol used in the output of {@code toString()}.
     *
     * @param stringStarter the string starter value
     */
    public void setStringStarter(String stringStarter) {
        this.stringStarter = stringStarter;
    }

    /**
     * Returns the string terminator symbol used in the output of
     * {@code toString()}.
     *
     * @return the current string terminator value
     */
    public String getStringTerminator() {
        return stringTerminator;
    }

    /**
     * Sets the string terminator symbol used in the output of
     * {@code toString()}.
     *
     * @param stringTerminator the string terminator value
     */
    public void setStringTerminator(String stringTerminator) {
        this.stringTerminator = stringTerminator;
    }

    /**
     * Returns the string starter symbol for field names and values used in the
     * output of {@code toString()}.
     *
     * @return the current content starter value
     */
    public String getContentStarter() {
        return contentStarter;
    }

    /**
     * Sets the string starter symbol for field names and values used in the
     * output of {@code toString()}.
     *
     * @param contentStarter the content starter value
     */
    public void setContentStarter(String contentStarter) {
        this.contentStarter = contentStarter;
    }

    /**
     * Returns the string terminator symbol for field names and values used in
     * the output of {@code toString()}.
     *
     * @return the current content terminator value
     */
    public String getContentTerminator() {
        return contentTerminator;
    }

    /**
     * Sets the string terminator symbol for field names and values used in the
     * output of {@code toString()}.
     *
     * @param contentTerminator the content terminator value
     */
    public void setContentTerminator(String contentTerminator) {
        this.contentTerminator = contentTerminator;
    }

    /**
     * Returns the string separator symbol for field names and values used in
     * the output of {@code toString()}.
     *
     * @return the current content terminator value
     */
    public String getContentSeparator() {
        return contentSeparator;
    }

    /**
     * Sets the string separator symbol for field names and values used in the
     * output of {@code toString()}.
     *
     * @param contentSeparator the content separator value
     */
    public void setContentSeparator(String contentSeparator) {
        this.contentSeparator = contentSeparator;
    }

    /**
     * Returns the string array starter symbol for values used in the output of
     * {@code toString()}.
     *
     * @return the current array starter value
     */
    public String getArrayStarter() {
        return arrayStarter;
    }

    /**
     * Sets the string array starter symbol for values used in the output of
     * {@code toString()}.
     *
     * @param arrayStarter the array starter value
     */
    public void setArrayStarter(String arrayStarter) {
        this.arrayStarter = arrayStarter;
    }

    /**
     * Returns the string array terminator symbol for values used in the output
     * of {@code toString()}.
     *
     * @return the current array terminator value
     */
    public String getArrayTerminator() {
        return arrayTerminator;
    }

    /**
     * Sets the string array terminator symbol for values used in the output of
     * {@code toString()}.
     *
     * @param arrayTerminator the array terminator value
     */
    public void setArrayTerminator(String arrayTerminator) {
        this.arrayTerminator = arrayTerminator;
    }

    /**
     * Returns the object created to generate the {@code toString} string.
     *
     * @return the current {@code StringBuilder} object
     */
    protected StringBuilder getBuilder() {
        return builder;
    }
}
