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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpsItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     */
    private String opsItemId;

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem that you want to get.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * 
     * @return The ID of the OpsItem that you want to get.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem that you want to get.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem that you want to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpsItemRequest withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpsItemRequest == false)
            return false;
        GetOpsItemRequest other = (GetOpsItemRequest) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        return hashCode;
    }

    @Override
    public GetOpsItemRequest clone() {
        return (GetOpsItemRequest) super.clone();
    }

}
