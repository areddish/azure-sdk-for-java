/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies a list of virtual machine instance IDs from the VM scale set.
 */
public class VirtualMachineScaleSetVMInstanceRequiredIDs {
    /**
     * The virtual machine scale set instance ids.
     */
    @JsonProperty(value = "instanceIds", required = true)
    private List<String> instanceIds;

    /**
     * Get the instanceIds value.
     *
     * @return the instanceIds value
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds value.
     *
     * @param instanceIds the instanceIds value to set
     * @return the VirtualMachineScaleSetVMInstanceRequiredIDs object itself.
     */
    public VirtualMachineScaleSetVMInstanceRequiredIDs withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
