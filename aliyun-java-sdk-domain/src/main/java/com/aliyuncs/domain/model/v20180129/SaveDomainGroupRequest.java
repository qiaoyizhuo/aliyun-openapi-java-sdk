/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveDomainGroupRequest extends RpcAcsRequest<SaveDomainGroupResponse> {
	
	public SaveDomainGroupRequest() {
		super("Domain", "2018-01-29", "SaveDomainGroup");
	}

	private String userClientIp;

	private String domainGroupName;

	private String lang;

	private Long domainGroupId;

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getDomainGroupName() {
		return this.domainGroupName;
	}

	public void setDomainGroupName(String domainGroupName) {
		this.domainGroupName = domainGroupName;
		if(domainGroupName != null){
			putQueryParameter("DomainGroupName", domainGroupName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Long getDomainGroupId() {
		return this.domainGroupId;
	}

	public void setDomainGroupId(Long domainGroupId) {
		this.domainGroupId = domainGroupId;
		if(domainGroupId != null){
			putQueryParameter("DomainGroupId", domainGroupId.toString());
		}
	}

	@Override
	public Class<SaveDomainGroupResponse> getResponseClass() {
		return SaveDomainGroupResponse.class;
	}

}
