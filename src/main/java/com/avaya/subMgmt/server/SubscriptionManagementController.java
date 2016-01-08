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

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller contains the single REST controller for this server. All REST requests arrive here.
 */
@RestController
public class SubscriptionManagementController {

    @RequestMapping(value = "/subscriptionMgmt", method = RequestMethod.POST)
    public void post(@RequestBody SubscriptionManagementRequest request, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

        System.out.println();
        if ("allocate".equals(request.getAction())) {
            System.out.println("ALLOCATE received at " + (new Date()));
            System.out.println(Utils.convertToJsonString(request));
        } else if ("deallocate".equals(request.getAction())) {
            System.out.println("DEALLOCATE received at " + (new Date()));
            System.out.println(Utils.convertToJsonString(request));
        } else if ("changeSubscriptionType".equals(request.getAction())) {
            System.out.println("CHANGE SUBSCRIPTION TYPE received at " + (new Date()));
            System.out.println(Utils.convertToJsonString(request));
        } else if ("test".equals(request.getAction())) {
            System.out.println("TEST received at " + (new Date()));
            System.out.println(Utils.convertToJsonString(request));
        } else {
            System.out.println("UNKNOWN action received: " + request.getAction());
            httpResponse.setStatus(400);
            System.out.println("FAILED (400)");
            return;
        }

        // This is not part of the protocol.  This is only here to allow the OSS to use this server for failure testing.
        if (httpRequest.getQueryString() == null) {
            System.out.println("PASSED (200)");
        } else {
            httpResponse.setStatus(400);
            System.out.println("FAILED (400)");
        }
    }
}
