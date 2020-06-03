/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutboundCrossClusterSearchConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutboundCrossClusterSearchConnectionMarshaller {

    private static final MarshallingInfo<StructuredPojo> SOURCEDOMAININFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceDomainInfo").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONDOMAININFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationDomainInfo").build();
    private static final MarshallingInfo<String> CROSSCLUSTERSEARCHCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrossClusterSearchConnectionId").build();
    private static final MarshallingInfo<String> CONNECTIONALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionAlias").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionStatus").build();

    private static final OutboundCrossClusterSearchConnectionMarshaller instance = new OutboundCrossClusterSearchConnectionMarshaller();

    public static OutboundCrossClusterSearchConnectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutboundCrossClusterSearchConnection outboundCrossClusterSearchConnection, ProtocolMarshaller protocolMarshaller) {

        if (outboundCrossClusterSearchConnection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outboundCrossClusterSearchConnection.getSourceDomainInfo(), SOURCEDOMAININFO_BINDING);
            protocolMarshaller.marshall(outboundCrossClusterSearchConnection.getDestinationDomainInfo(), DESTINATIONDOMAININFO_BINDING);
            protocolMarshaller.marshall(outboundCrossClusterSearchConnection.getCrossClusterSearchConnectionId(), CROSSCLUSTERSEARCHCONNECTIONID_BINDING);
            protocolMarshaller.marshall(outboundCrossClusterSearchConnection.getConnectionAlias(), CONNECTIONALIAS_BINDING);
            protocolMarshaller.marshall(outboundCrossClusterSearchConnection.getConnectionStatus(), CONNECTIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
