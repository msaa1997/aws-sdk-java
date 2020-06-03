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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Vp8Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Vp8SettingsJsonUnmarshaller implements Unmarshaller<Vp8Settings, JsonUnmarshallerContext> {

    public Vp8Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Vp8Settings vp8Settings = new Vp8Settings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bitrate", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    context.nextToken();
                    vp8Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vp8Settings;
    }

    private static Vp8SettingsJsonUnmarshaller instance;

    public static Vp8SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Vp8SettingsJsonUnmarshaller();
        return instance;
    }
}
