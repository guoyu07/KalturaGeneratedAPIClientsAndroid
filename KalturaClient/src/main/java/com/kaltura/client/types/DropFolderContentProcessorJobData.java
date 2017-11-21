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
import com.kaltura.client.enums.DropFolderContentFileHandlerMatchPolicy;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DropFolderContentProcessorJobData.Tokenizer.class)
public class DropFolderContentProcessorJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String dropFolderId();
		String dropFolderFileIds();
		String parsedSlug();
		String contentMatchPolicy();
		String conversionProfileId();
		String parsedUserId();
	}

	private Integer dropFolderId;
	private String dropFolderFileIds;
	private String parsedSlug;
	private DropFolderContentFileHandlerMatchPolicy contentMatchPolicy;
	private Integer conversionProfileId;
	private String parsedUserId;

	// dropFolderId:
	public Integer getDropFolderId(){
		return this.dropFolderId;
	}
	public void setDropFolderId(Integer dropFolderId){
		this.dropFolderId = dropFolderId;
	}

	public void dropFolderId(String multirequestToken){
		setToken("dropFolderId", multirequestToken);
	}

	// dropFolderFileIds:
	public String getDropFolderFileIds(){
		return this.dropFolderFileIds;
	}
	public void setDropFolderFileIds(String dropFolderFileIds){
		this.dropFolderFileIds = dropFolderFileIds;
	}

	public void dropFolderFileIds(String multirequestToken){
		setToken("dropFolderFileIds", multirequestToken);
	}

	// parsedSlug:
	public String getParsedSlug(){
		return this.parsedSlug;
	}
	public void setParsedSlug(String parsedSlug){
		this.parsedSlug = parsedSlug;
	}

	public void parsedSlug(String multirequestToken){
		setToken("parsedSlug", multirequestToken);
	}

	// contentMatchPolicy:
	public DropFolderContentFileHandlerMatchPolicy getContentMatchPolicy(){
		return this.contentMatchPolicy;
	}
	public void setContentMatchPolicy(DropFolderContentFileHandlerMatchPolicy contentMatchPolicy){
		this.contentMatchPolicy = contentMatchPolicy;
	}

	public void contentMatchPolicy(String multirequestToken){
		setToken("contentMatchPolicy", multirequestToken);
	}

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	public void setConversionProfileId(Integer conversionProfileId){
		this.conversionProfileId = conversionProfileId;
	}

	public void conversionProfileId(String multirequestToken){
		setToken("conversionProfileId", multirequestToken);
	}

	// parsedUserId:
	public String getParsedUserId(){
		return this.parsedUserId;
	}
	public void setParsedUserId(String parsedUserId){
		this.parsedUserId = parsedUserId;
	}

	public void parsedUserId(String multirequestToken){
		setToken("parsedUserId", multirequestToken);
	}


	public DropFolderContentProcessorJobData() {
		super();
	}

	public DropFolderContentProcessorJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		dropFolderId = GsonParser.parseInt(jsonObject.get("dropFolderId"));
		dropFolderFileIds = GsonParser.parseString(jsonObject.get("dropFolderFileIds"));
		parsedSlug = GsonParser.parseString(jsonObject.get("parsedSlug"));
		contentMatchPolicy = DropFolderContentFileHandlerMatchPolicy.get(GsonParser.parseInt(jsonObject.get("contentMatchPolicy")));
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		parsedUserId = GsonParser.parseString(jsonObject.get("parsedUserId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDropFolderContentProcessorJobData");
		kparams.add("dropFolderId", this.dropFolderId);
		kparams.add("dropFolderFileIds", this.dropFolderFileIds);
		kparams.add("parsedSlug", this.parsedSlug);
		kparams.add("contentMatchPolicy", this.contentMatchPolicy);
		kparams.add("conversionProfileId", this.conversionProfileId);
		kparams.add("parsedUserId", this.parsedUserId);
		return kparams;
	}


    public static final Creator<DropFolderContentProcessorJobData> CREATOR = new Creator<DropFolderContentProcessorJobData>() {
        @Override
        public DropFolderContentProcessorJobData createFromParcel(Parcel source) {
            return new DropFolderContentProcessorJobData(source);
        }

        @Override
        public DropFolderContentProcessorJobData[] newArray(int size) {
            return new DropFolderContentProcessorJobData[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeValue(this.dropFolderId);
        dest.writeString(this.dropFolderFileIds);
        dest.writeString(this.parsedSlug);
        dest.writeInt(this.contentMatchPolicy == null ? -1 : this.contentMatchPolicy.ordinal());
        dest.writeValue(this.conversionProfileId);
        dest.writeString(this.parsedUserId);
    }

    public DropFolderContentProcessorJobData(Parcel in) {
        super(in);
        this.dropFolderId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.dropFolderFileIds = in.readString();
        this.parsedSlug = in.readString();
        int tmpContentMatchPolicy = in.readInt();
        this.contentMatchPolicy = tmpContentMatchPolicy == -1 ? null : DropFolderContentFileHandlerMatchPolicy.values()[tmpContentMatchPolicy];
        this.conversionProfileId = (Integer)in.readValue(Integer.class.getClassLoader());
        this.parsedUserId = in.readString();
    }
}

