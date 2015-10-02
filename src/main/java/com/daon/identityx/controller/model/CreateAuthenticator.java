/*
 * Copyright Daon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.daon.identityx.controller.model;

/***
 * The request to create a new authenticator.
 * 
 * @author Daon
 *
 */
public class CreateAuthenticator {

	private String fidoReqistrationResponse;
	private String registrationChallengeId;
	
	public CreateAuthenticator() {
	}

	public String getRegistrationChallengeId() {
		return registrationChallengeId;
	}

	public void setRegistrationChallengeId(String registrationChallengeId) {
		this.registrationChallengeId = registrationChallengeId;
	}

	public String getFidoReqistrationResponse() {
		return fidoReqistrationResponse;
	}

	public void setFidoReqistrationResponse(String fidoReqistrationResponse) {
		this.fidoReqistrationResponse = fidoReqistrationResponse;
	}

}
