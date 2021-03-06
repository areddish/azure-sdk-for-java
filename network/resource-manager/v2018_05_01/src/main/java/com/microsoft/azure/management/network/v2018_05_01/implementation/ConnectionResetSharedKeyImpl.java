/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.ConnectionResetSharedKey;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ConnectionResetSharedKeyImpl extends WrapperImpl<ConnectionResetSharedKeyInner> implements ConnectionResetSharedKey {
    private final NetworkManager manager;
    ConnectionResetSharedKeyImpl(ConnectionResetSharedKeyInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public int keyLength() {
        return this.inner().keyLength();
    }

}
