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

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * General utilities.
 */
public class Utils {

    /**
     * This method converts any pojo (usually a request object) into a JSON string.
     * 
     * @param pojo
     * @return
     */
    public static String convertToJsonString(Object pojo) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        //mapper.disableDefaultTyping();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(pojo);
        } catch (IOException e) {
            jsonString = "ERROR: JSON Marshall Failed.";
            e.printStackTrace();
        }

        return jsonString;
    }

    /**
     * This is used to make dates safer since they are mutable.
     * 
     * @param date
     * @return
     */
    public static Date dateClone(Date date) {
        return (date != null) ? new Date(date.getTime()) : null;
    }
}
