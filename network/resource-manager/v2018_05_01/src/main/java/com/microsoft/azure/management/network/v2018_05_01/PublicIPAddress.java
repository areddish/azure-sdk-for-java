/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.implementation.PublicIPAddressInner;

/**
 * Type representing PublicIPAddress.
 */
public interface PublicIPAddress extends HasInner<PublicIPAddressInner>, Resource, GroupableResourceCore<NetworkManager, PublicIPAddressInner>, HasResourceGroup, Refreshable<PublicIPAddress>, Updatable<PublicIPAddress.Update>, HasManager<NetworkManager> {
    /**
     * @return the dnsSettings value.
     */
    PublicIPAddressDnsSettings dnsSettings();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the ipConfiguration value.
     */
    IPConfiguration ipConfiguration();

    /**
     * @return the ipTags value.
     */
    List<IpTag> ipTags();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicIPAddressVersion value.
     */
    IPVersion publicIPAddressVersion();

    /**
     * @return the publicIPAllocationMethod value.
     */
    IPAllocationMethod publicIPAllocationMethod();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the sku value.
     */
    PublicIPAddressSku sku();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the PublicIPAddress definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PublicIPAddress definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PublicIPAddress definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PublicIPAddress definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the publicipaddress update allowing to specify DnsSettings.
         */
        interface WithDnsSettings {
            /**
             * Specifies dnsSettings.
             */
            WithCreate withDnsSettings(PublicIPAddressDnsSettings dnsSettings);
        }

        /**
         * The stage of the publicipaddress update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the publicipaddress update allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the publicipaddress update allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             */
            WithCreate withIpAddress(String ipAddress);
        }

        /**
         * The stage of the publicipaddress update allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             */
            WithCreate withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipaddress update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipaddress update allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             */
            WithCreate withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipaddress update allowing to specify PublicIPAllocationMethod.
         */
        interface WithPublicIPAllocationMethod {
            /**
             * Specifies publicIPAllocationMethod.
             */
            WithCreate withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod);
        }

        /**
         * The stage of the publicipaddress update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the publicipaddress update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(PublicIPAddressSku sku);
        }

        /**
         * The stage of the publicipaddress update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PublicIPAddress>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDnsSettings, DefinitionStages.WithEtag, DefinitionStages.WithIdleTimeoutInMinutes, DefinitionStages.WithIpAddress, DefinitionStages.WithIpTags, DefinitionStages.WithProvisioningState, DefinitionStages.WithPublicIPAddressVersion, DefinitionStages.WithPublicIPAllocationMethod, DefinitionStages.WithResourceGuid, DefinitionStages.WithSku, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a PublicIPAddress update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PublicIPAddress>, Resource.UpdateWithTags<Update>, UpdateStages.WithDnsSettings, UpdateStages.WithEtag, UpdateStages.WithIdleTimeoutInMinutes, UpdateStages.WithIpAddress, UpdateStages.WithIpTags, UpdateStages.WithProvisioningState, UpdateStages.WithPublicIPAddressVersion, UpdateStages.WithPublicIPAllocationMethod, UpdateStages.WithResourceGuid, UpdateStages.WithSku, UpdateStages.WithZones {
    }

    /**
     * Grouping of PublicIPAddress update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the publicipaddress {0} allowing to specify DnsSettings.
         */
        interface WithDnsSettings {
            /**
             * Specifies dnsSettings.
             */
            Update withDnsSettings(PublicIPAddressDnsSettings dnsSettings);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             */
            Update withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             */
            Update withIpAddress(String ipAddress);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify IpTags.
         */
        interface WithIpTags {
            /**
             * Specifies ipTags.
             */
            Update withIpTags(List<IpTag> ipTags);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify PublicIPAddressVersion.
         */
        interface WithPublicIPAddressVersion {
            /**
             * Specifies publicIPAddressVersion.
             */
            Update withPublicIPAddressVersion(IPVersion publicIPAddressVersion);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify PublicIPAllocationMethod.
         */
        interface WithPublicIPAllocationMethod {
            /**
             * Specifies publicIPAllocationMethod.
             */
            Update withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            Update withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(PublicIPAddressSku sku);
        }

        /**
         * The stage of the publicipaddress {0} allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             */
            Update withZones(List<String> zones);
        }

    }
}
