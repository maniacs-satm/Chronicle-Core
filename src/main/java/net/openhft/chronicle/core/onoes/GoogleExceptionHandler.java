/*
 * Copyright 2016 higherfrequencytrading.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.openhft.chronicle.core.onoes;

/**
 * Created by Peter on 07/04/2016.
 */
public class GoogleExceptionHandler extends WebExceptionHandler {
    public static final ExceptionHandler WARN = new GoogleExceptionHandler(Slf4jExceptionHandler.WARN);

    public GoogleExceptionHandler(ExceptionHandler fallBack) {
        super("Google.properties", fallBack);
    }
}
