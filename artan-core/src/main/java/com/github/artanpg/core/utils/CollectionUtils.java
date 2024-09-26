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
 * Provides utility methods for {@link Collection} instances.
 *
 * @author Mohammad Yazdian
 */
public abstract class CollectionUtils {

    private CollectionUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Checks if the given collection is {@code null} or {@code empty}.
     *
     * @param collection the Collection to check
     * @return true; if the collection is null or empty, otherwise false
     */
    public static boolean isEmpty(Collection<?> collection) {
        return (Objects.isNull(collection) || collection.isEmpty());
    }

    /**
     * Checks if the given map is {@code null} or {@code empty}.
     *
     * @param map the Map to check
     * @return true; if the map is null or empty, otherwise false
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return (Objects.isNull(map) || map.isEmpty());
    }

    /**
     * Checks if the given collection is not {@code null} or {@code empty}.
     *
     * @param collection the Collection to check
     * @return true; if the collection is not null or empty, otherwise false
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * Checks if the given map is not {@code null} or {@code empty}.
     *
     * @param map the Map to check
     * @return true; if the map is not null or empty, otherwise false
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    /**
     * Check whether the given Iterator contains the given element.
     *
     * @param iterator the Iterator to check
     * @param element  the element to look for
     * @return true, if found, false otherwise
     */
    public static boolean contains(Iterator<?> iterator, Object element) {
        if (Objects.nonNull(iterator) && iterator.hasNext()) {
            while (iterator.hasNext()) {
                Object candidate = iterator.next();
                if (Objects.equals(candidate, element)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check that all items of the given iterator are not
     * {@code null} or {@code empty}.
     *
     * @param iterator the iterator to check
     * @return true, if all items in the iterator are not empty or null, otherwise false
     */
    public static boolean noNullElements(Iterator<?> iterator) {
        Asserts.notNull(iterator, "iterator cannot be null or empty");
        while (iterator.hasNext()) {
            Object item = iterator.next();
            if (Objects.isNull(item)) {
                return false;
            }
        }
        return true;
    }
}
