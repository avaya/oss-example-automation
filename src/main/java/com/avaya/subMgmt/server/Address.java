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
 * This class contains the Address request information for requests that contain addresses.
 */
public class Address {

    private String addressline1;
    private String addressline2;
    private String addressline3;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getAddressline3() {
        return addressline3;
    }

    public void setAddressline3(String addressline3) {
        this.addressline3 = addressline3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
