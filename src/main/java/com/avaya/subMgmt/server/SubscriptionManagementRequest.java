/*
* Copyright (c) 20XX -2015 by Avaya Inc. All rights reserved.
* Redistribution and use in source and binary forms of the software (“Software”), with or without modification, are
* permitted provided that the following conditions are met:
* (a) Redistributions of source code must retain the above copyright notice and the entire license.
* (b) Redistributions in binary form must reproduce the above copyright notice and this entire license in the
* documentation and/or other materials provided with the distribution.
* (c) Redistribution of the Software is solely for the purpose of initiating product provisioning when OneSource Cloud events happen. 
* (d) BY USING AND REDISTRIBUTING THE SOFTWARE, YOU, ON BEHALF OF YOURSELF AND THE
* ENTITY FOR WHOM YOU USE THE SOFTWARE AGREE TO ALL THE TERMS AND CONDITIONS OF
* THIS LICENSE AND CREATE A BINDING CONTRACT BETWEEN YOU AND AVAYA INC.
* THIS SOFTWARE IS PROVIDED BY AVAYA INC. "AS IS" AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
* MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE, AND NON-INFRINGEMENT ARE DISCLAIMED. IN NO EVENT
* SHALL AVAYA INC. BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, 
* OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
* SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
* INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
* STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
* OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.avaya.subMgmt.server;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * This class is the root request object that is sent in every REST operation.
 */
public class SubscriptionManagementRequest {

    /**
     * Current values are "allocate", "deallocate", "changeSubscriptionType", and "test". An enum is not used so that the
     * effective enumeration can be expanded in OSS without breaking existing action implementations in the partner.
     */
    private String action;

    private String webLMURL;

    private String webLMHostId;

    /**
     * Will be null for the test action.
     */
    private String subscriptionId;

    /**
     * Will be null for the test action.
     */
    private String clid;

    /**
     * Will be null for the test and deallocate action.
     */
    private Subscription subscriptionData;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getWebLMURL() {
        return webLMURL;
    }

    public void setWebLMURL(String webLMURL) {
        this.webLMURL = webLMURL;
    }

    public String getWebLMHostId() {
        return webLMHostId;
    }

    public void setWebLMHostId(String webLMHostId) {
        this.webLMHostId = webLMHostId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public Subscription getSubscriptionData() {
        return subscriptionData;
    }

    public void setSubscriptionData(Subscription subscriptionData) {
        this.subscriptionData = subscriptionData;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return Utils.convertToJsonString(this);
    }
}
