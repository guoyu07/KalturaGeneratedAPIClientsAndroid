// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import android.os.Parcel;
import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(WebexDropFolder.Tokenizer.class)
public class WebexDropFolder extends DropFolder {
	
	public interface Tokenizer extends DropFolder.Tokenizer {
		String webexUserId();
		String webexPassword();
		String webexSiteId();
		String webexPartnerId();
		String webexServiceUrl();
		String webexHostIdMetadataFieldName();
		String deleteFromRecycleBin();
		String webexServiceType();
		String deleteFromTimestamp();
	}

	private String webexUserId;
	private String webexPassword;
	private Integer webexSiteId;
	private String webexPartnerId;
	private String webexServiceUrl;
	private String webexHostIdMetadataFieldName;
	private Boolean deleteFromRecycleBin;
	private String webexServiceType;
	private Integer deleteFromTimestamp;

	// webexUserId:
	public String getWebexUserId(){
		return this.webexUserId;
	}
	public void setWebexUserId(String webexUserId){
		this.webexUserId = webexUserId;
	}

	public void webexUserId(String multirequestToken){
		setToken("webexUserId", multirequestToken);
	}

	// webexPassword:
	public String getWebexPassword(){
		return this.webexPassword;
	}
	public void setWebexPassword(String webexPassword){
		this.webexPassword = webexPassword;
	}

	public void webexPassword(String multirequestToken){
		setToken("webexPassword", multirequestToken);
	}

	// webexSiteId:
	public Integer getWebexSiteId(){
		return this.webexSiteId;
	}
	public void setWebexSiteId(Integer webexSiteId){
		this.webexSiteId = webexSiteId;
	}

	public void webexSiteId(String multirequestToken){
		setToken("webexSiteId", multirequestToken);
	}

	// webexPartnerId:
	public String getWebexPartnerId(){
		return this.webexPartnerId;
	}
	public void setWebexPartnerId(String webexPartnerId){
		this.webexPartnerId = webexPartnerId;
	}

	public void webexPartnerId(String multirequestToken){
		setToken("webexPartnerId", multirequestToken);
	}

	// webexServiceUrl:
	public String getWebexServiceUrl(){
		return this.webexServiceUrl;
	}
	public void setWebexServiceUrl(String webexServiceUrl){
		this.webexServiceUrl = webexServiceUrl;
	}

	public void webexServiceUrl(String multirequestToken){
		setToken("webexServiceUrl", multirequestToken);
	}

	// webexHostIdMetadataFieldName:
	public String getWebexHostIdMetadataFieldName(){
		return this.webexHostIdMetadataFieldName;
	}
	public void setWebexHostIdMetadataFieldName(String webexHostIdMetadataFieldName){
		this.webexHostIdMetadataFieldName = webexHostIdMetadataFieldName;
	}

	public void webexHostIdMetadataFieldName(String multirequestToken){
		setToken("webexHostIdMetadataFieldName", multirequestToken);
	}

	// deleteFromRecycleBin:
	public Boolean getDeleteFromRecycleBin(){
		return this.deleteFromRecycleBin;
	}
	public void setDeleteFromRecycleBin(Boolean deleteFromRecycleBin){
		this.deleteFromRecycleBin = deleteFromRecycleBin;
	}

	public void deleteFromRecycleBin(String multirequestToken){
		setToken("deleteFromRecycleBin", multirequestToken);
	}

	// webexServiceType:
	public String getWebexServiceType(){
		return this.webexServiceType;
	}
	public void setWebexServiceType(String webexServiceType){
		this.webexServiceType = webexServiceType;
	}

	public void webexServiceType(String multirequestToken){
		setToken("webexServiceType", multirequestToken);
	}

	// deleteFromTimestamp:
	public Integer getDeleteFromTimestamp(){
		return this.deleteFromTimestamp;
	}
	public void setDeleteFromTimestamp(Integer deleteFromTimestamp){
		this.deleteFromTimestamp = deleteFromTimestamp;
	}

	public void deleteFromTimestamp(String multirequestToken){
		setToken("deleteFromTimestamp", multirequestToken);
	}


	public WebexDropFolder() {
		super();
	}

	public WebexDropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		webexUserId = GsonParser.parseString(jsonObject.get("webexUserId"));
		webexPassword = GsonParser.parseString(jsonObject.get("webexPassword"));
		webexSiteId = GsonParser.parseInt(jsonObject.get("webexSiteId"));
		webexPartnerId = GsonParser.parseString(jsonObject.get("webexPartnerId"));
		webexServiceUrl = GsonParser.parseString(jsonObject.get("webexServiceUrl"));
		webexHostIdMetadataFieldName = GsonParser.parseString(jsonObject.get("webexHostIdMetadataFieldName"));
		deleteFromRecycleBin = GsonParser.parseBoolean(jsonObject.get("deleteFromRecycleBin"));
		webexServiceType = GsonParser.parseString(jsonObject.get("webexServiceType"));
		deleteFromTimestamp = GsonParser.parseInt(jsonObject.get("deleteFromTimestamp"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWebexDropFolder");
		kparams.add("webexUserId", this.webexUserId);
		kparams.add("webexPassword", this.webexPassword);
		kparams.add("webexSiteId", this.webexSiteId);
		kparams.add("webexPartnerId", this.webexPartnerId);
		kparams.add("webexServiceUrl", this.webexServiceUrl);
		kparams.add("webexHostIdMetadataFieldName", this.webexHostIdMetadataFieldName);
		kparams.add("deleteFromRecycleBin", this.deleteFromRecycleBin);
		kparams.add("webexServiceType", this.webexServiceType);
		kparams.add("deleteFromTimestamp", this.deleteFromTimestamp);
		return kparams;
	}


    public static final Creator<WebexDropFolder> CREATOR = new Creator<WebexDropFolder>() {
        @Override
        public WebexDropFolder createFromParcel(Parcel source) {
            return new WebexDropFolder(source);
        }

        @Override
        public WebexDropFolder[] newArray(int size) {
            return new WebexDropFolder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.webexUserId);
        dest.writeString(this.webexPassword);
        dest.writeValue(this.webexSiteId);
        dest.writeString(this.webexPartnerId);
        dest.writeString(this.webexServiceUrl);
        dest.writeString(this.webexHostIdMetadataFieldName);
        dest.writeValue(this.deleteFromRecycleBin);
        dest.writeString(this.webexServiceType);
        dest.writeValue(this.deleteFromTimestamp);
    }

    public WebexDropFolder(Parcel in) {
        super(in);
        this.webexUserId = in.readString();
        this.webexPassword = in.readString();
        this.webexSiteId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.webexPartnerId = in.readString();
        this.webexServiceUrl = in.readString();
        this.webexHostIdMetadataFieldName = in.readString();
        this.deleteFromRecycleBin = (Boolean)in.readValue(Boolean.class.getClassLoader());
        this.webexServiceType = in.readString();
        this.deleteFromTimestamp = (Integer)in.readValue(Integer.class.getClassLoader());
    }
}

