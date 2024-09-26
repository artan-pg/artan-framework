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
 * An implementation of the {@link ToStringStyleStrategy} that produces the
 * output of the {@code toString} method with default parameters.
 *
 * @author Mohammad Yazdian
 */
public class DefaultToStringStyle extends AbstractToStringStyleStrategy {

    private DefaultToStringStyle(Class<?> aClass) {
        setClassName(aClass.getSimpleName());
    }

    public static <T> DefaultToStringStyle of(Class<T> aClass) {
        return new DefaultToStringStyle(aClass);
    }

    @Override
    public void append(String fieldName, boolean value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, boolean[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, byte value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, byte[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, char value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, char[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, short value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, short[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, int value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, int[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, long value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, long[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, float value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, float[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, double value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, double[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, String value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, String[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, Date value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, Date[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, TemporalAccessor value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public void append(String fieldName, TemporalAccessor[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public <T> void append(String fieldName, Collection<T> values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public <T> void append(String fieldName, T value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }

    @Override
    public <T> void append(String fieldName, T[] values) {
        appendFieldNames(fieldName);
        appendValues(values);
    }

    @Override
    public void append(String fieldName, Enum<?> value) {
        appendFieldNames(fieldName);
        appendValues(value);
    }
}
