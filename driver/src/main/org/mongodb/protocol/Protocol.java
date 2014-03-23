/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.protocol;

import org.mongodb.MongoFuture;
import org.mongodb.connection.Connection;
import org.mongodb.connection.ServerDescription;

/**
 * An interface for the execution of a MongoDB wire protocol conversation
 *
 * @param <T> the return value of the Protocol response message
 * @since 3.0
 */
public interface Protocol<T> {
    /**
     * Execute the protocol.
     *
     * @return the response from execution of the protocol
     * @param connection the connection to execute the protocol on
     * @param serverDescription the description of the server that the connection is to
     */
    T execute(final Connection connection, final ServerDescription serverDescription);

    MongoFuture<T> executeAsync(final Connection connection, final ServerDescription serverDescription);
}