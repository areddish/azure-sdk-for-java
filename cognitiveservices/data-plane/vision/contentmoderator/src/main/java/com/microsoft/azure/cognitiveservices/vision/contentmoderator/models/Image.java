/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image Properties.
 */
public class Image {
    /**
     * Content Id.
     */
    @JsonProperty(value = "ContentId")
    private String contentId;

    /**
     * Advanced info list.
     */
    @JsonProperty(value = "AdditionalInfo")
    private List<ImageAdditionalInfoItem> additionalInfo;

    /**
     * Status details.
     */
    @JsonProperty(value = "Status")
    private Status status;

    /**
     * Tracking Id.
     */
    @JsonProperty(value = "TrackingId")
    private String trackingId;

    /**
     * Get content Id.
     *
     * @return the contentId value
     */
    public String contentId() {
        return this.contentId;
    }

    /**
     * Set content Id.
     *
     * @param contentId the contentId value to set
     * @return the Image object itself.
     */
    public Image withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Get advanced info list.
     *
     * @return the additionalInfo value
     */
    public List<ImageAdditionalInfoItem> additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Set advanced info list.
     *
     * @param additionalInfo the additionalInfo value to set
     * @return the Image object itself.
     */
    public Image withAdditionalInfo(List<ImageAdditionalInfoItem> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Get status details.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set status details.
     *
     * @param status the status value to set
     * @return the Image object itself.
     */
    public Image withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get tracking Id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set tracking Id.
     *
     * @param trackingId the trackingId value to set
     * @return the Image object itself.
     */
    public Image withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

}
