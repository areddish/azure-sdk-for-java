/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.CertificateDescription;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.CertificateProperties;

class CertificateDescriptionImpl extends CreatableUpdatableImpl<CertificateDescription, CertificateDescriptionInner, CertificateDescriptionImpl> implements CertificateDescription, CertificateDescription.Definition, CertificateDescription.Update {
    private final IoTHubManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String certificateName;

    CertificateDescriptionImpl(String name, IoTHubManager manager) {
        super(name, new CertificateDescriptionInner());
        this.manager = manager;
        // Set resource name
        this.certificateName = name;
        //
    }

    CertificateDescriptionImpl(CertificateDescriptionInner inner, IoTHubManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.certificateName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "IotHubs");
        this.certificateName = IdParsingUtils.getValueFromIdByName(inner.id(), "certificates");
        //
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CertificateDescription> createResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.certificateName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CertificateDescription> updateResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.certificateName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CertificateDescriptionInner> getInnerAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.certificateName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CertificateProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CertificateDescriptionImpl withExistingIotHub(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

}
