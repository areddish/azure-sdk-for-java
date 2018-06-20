/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information for the Azure IaaS VM workload-specific job.
 */
public class AzureIaaSVMJobExtendedInfo {
    /**
     * List of tasks associated with this job.
     */
    @JsonProperty(value = "tasksList")
    private List<AzureIaaSVMJobTaskDetails> tasksList;

    /**
     * Job properties.
     */
    @JsonProperty(value = "propertyBag")
    private Map<String, String> propertyBag;

    /**
     * Indicates progress of the job. Null if it has not started or completed.
     */
    @JsonProperty(value = "progressPercentage")
    private Double progressPercentage;

    /**
     * Non-localized error message for job execution.
     */
    @JsonProperty(value = "dynamicErrorMessage")
    private String dynamicErrorMessage;

    /**
     * Get list of tasks associated with this job.
     *
     * @return the tasksList value
     */
    public List<AzureIaaSVMJobTaskDetails> tasksList() {
        return this.tasksList;
    }

    /**
     * Set list of tasks associated with this job.
     *
     * @param tasksList the tasksList value to set
     * @return the AzureIaaSVMJobExtendedInfo object itself.
     */
    public AzureIaaSVMJobExtendedInfo withTasksList(List<AzureIaaSVMJobTaskDetails> tasksList) {
        this.tasksList = tasksList;
        return this;
    }

    /**
     * Get job properties.
     *
     * @return the propertyBag value
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set job properties.
     *
     * @param propertyBag the propertyBag value to set
     * @return the AzureIaaSVMJobExtendedInfo object itself.
     */
    public AzureIaaSVMJobExtendedInfo withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

    /**
     * Get indicates progress of the job. Null if it has not started or completed.
     *
     * @return the progressPercentage value
     */
    public Double progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Set indicates progress of the job. Null if it has not started or completed.
     *
     * @param progressPercentage the progressPercentage value to set
     * @return the AzureIaaSVMJobExtendedInfo object itself.
     */
    public AzureIaaSVMJobExtendedInfo withProgressPercentage(Double progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * Get non-localized error message for job execution.
     *
     * @return the dynamicErrorMessage value
     */
    public String dynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    /**
     * Set non-localized error message for job execution.
     *
     * @param dynamicErrorMessage the dynamicErrorMessage value to set
     * @return the AzureIaaSVMJobExtendedInfo object itself.
     */
    public AzureIaaSVMJobExtendedInfo withDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }

}