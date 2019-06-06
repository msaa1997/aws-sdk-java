/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThreatIntelSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format of the file that contains the ThreatIntelSet.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * </p>
     */
    private String location;
    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * </p>
     */
    private Boolean activate;
    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     * </p>
     * 
     * @return The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account for which you want to create a threatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @return A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *         IP addresses included in this ThreatIntelSet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP
     * addresses included in this ThreatIntelSet.
     * </p>
     * 
     * @param name
     *        A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves
     *        IP addresses included in this ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @return The format of the file that contains the ThreatIntelSet.
     * @see ThreatIntelSetFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public CreateThreatIntelSetRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the file that contains the ThreatIntelSet.
     * </p>
     * 
     * @param format
     *        The format of the file that contains the ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelSetFormat
     */

    public CreateThreatIntelSetRequest withFormat(ThreatIntelSetFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * </p>
     * 
     * @return The URI of the file that contains the ThreatIntelSet. For example
     *         (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The URI of the file that contains the ThreatIntelSet. For example
     * (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * </p>
     * 
     * @param location
     *        The URI of the file that contains the ThreatIntelSet. For example
     *        (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * </p>
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public void setActivate(Boolean activate) {
        this.activate = activate;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * </p>
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public Boolean getActivate() {
        return this.activate;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * </p>
     * 
     * @param activate
     *        A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withActivate(Boolean activate) {
        setActivate(activate);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * </p>
     * 
     * @return A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
     */

    public Boolean isActivate() {
        return this.activate;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @return The idempotency token for the create request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThreatIntelSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getActivate() != null)
            sb.append("Activate: ").append(getActivate()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThreatIntelSetRequest == false)
            return false;
        CreateThreatIntelSetRequest other = (CreateThreatIntelSetRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getActivate() == null ^ this.getActivate() == null)
            return false;
        if (other.getActivate() != null && other.getActivate().equals(this.getActivate()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getActivate() == null) ? 0 : getActivate().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateThreatIntelSetRequest clone() {
        return (CreateThreatIntelSetRequest) super.clone();
    }

}
