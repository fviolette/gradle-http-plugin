/*
 * Copyright (C) 2017 HttpBuilder-NG Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.httpbuilderng.http

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic @TupleConstructor
enum HttpLibrary {
    CORE, APACHE, OKHTTP

    static HttpLibrary fromName(final String name) {
        HttpLibrary library = values().find { it.name().equalsIgnoreCase(name) }
        if (library) {
            return library
        } else {
            throw new IllegalArgumentException("Specified library ($name) is unknown.")
        }
    }
}