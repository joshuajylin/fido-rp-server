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
 * Response to the validation of the transaction authentication.
 * 
 * @author Daon
 *
 */
public class ValidateTransactionAuthResponse {
	
	private String fidoAuthenticationResponse;
	private Long fidoResponseCode;
	private String fidoResponseMsg;
	
	public String getFidoAuthenticationResponse() {
		return fidoAuthenticationResponse;
	}
	public void setFidoAuthenticationResponse(String fidoAuthenticationResponse) {
		this.fidoAuthenticationResponse = fidoAuthenticationResponse;
	}
	public Long getFidoResponseCode() {
		return fidoResponseCode;
	}
	public void setFidoResponseCode(Long fidoResponseCode) {
		this.fidoResponseCode = fidoResponseCode;
	}
	public String getFidoResponseMsg() {
		return fidoResponseMsg;
	}
	public void setFidoResponseMsg(String fidoResponseMsg) {
		this.fidoResponseMsg = fidoResponseMsg;
	}
}
