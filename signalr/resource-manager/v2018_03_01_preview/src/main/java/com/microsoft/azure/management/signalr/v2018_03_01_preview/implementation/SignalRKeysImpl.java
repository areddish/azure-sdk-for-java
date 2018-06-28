/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.signalr.v2018_03_01_preview.SignalRKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SignalRKeysImpl extends WrapperImpl<SignalRKeysInner> implements SignalRKeys {
    private final SignalRServiceManager manager;
    SignalRKeysImpl(SignalRKeysInner inner, SignalRServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRServiceManager manager() {
        return this.manager;
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
