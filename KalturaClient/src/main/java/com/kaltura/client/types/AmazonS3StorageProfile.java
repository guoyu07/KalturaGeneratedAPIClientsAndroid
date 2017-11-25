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
import com.kaltura.client.enums.AmazonS3StorageProfileFilesPermissionLevel;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AmazonS3StorageProfile.Tokenizer.class)
public class AmazonS3StorageProfile extends StorageProfile {
	
	public interface Tokenizer extends StorageProfile.Tokenizer {
		String filesPermissionInS3();
		String s3Region();
		String sseType();
		String sseKmsKeyId();
		String signatureType();
		String endPoint();
	}

	private AmazonS3StorageProfileFilesPermissionLevel filesPermissionInS3;
	private String s3Region;
	private String sseType;
	private String sseKmsKeyId;
	private String signatureType;
	private String endPoint;

	// filesPermissionInS3:
	public AmazonS3StorageProfileFilesPermissionLevel getFilesPermissionInS3(){
		return this.filesPermissionInS3;
	}
	public void setFilesPermissionInS3(AmazonS3StorageProfileFilesPermissionLevel filesPermissionInS3){
		this.filesPermissionInS3 = filesPermissionInS3;
	}

	public void filesPermissionInS3(String multirequestToken){
		setToken("filesPermissionInS3", multirequestToken);
	}

	// s3Region:
	public String getS3Region(){
		return this.s3Region;
	}
	public void setS3Region(String s3Region){
		this.s3Region = s3Region;
	}

	public void s3Region(String multirequestToken){
		setToken("s3Region", multirequestToken);
	}

	// sseType:
	public String getSseType(){
		return this.sseType;
	}
	public void setSseType(String sseType){
		this.sseType = sseType;
	}

	public void sseType(String multirequestToken){
		setToken("sseType", multirequestToken);
	}

	// sseKmsKeyId:
	public String getSseKmsKeyId(){
		return this.sseKmsKeyId;
	}
	public void setSseKmsKeyId(String sseKmsKeyId){
		this.sseKmsKeyId = sseKmsKeyId;
	}

	public void sseKmsKeyId(String multirequestToken){
		setToken("sseKmsKeyId", multirequestToken);
	}

	// signatureType:
	public String getSignatureType(){
		return this.signatureType;
	}
	public void setSignatureType(String signatureType){
		this.signatureType = signatureType;
	}

	public void signatureType(String multirequestToken){
		setToken("signatureType", multirequestToken);
	}

	// endPoint:
	public String getEndPoint(){
		return this.endPoint;
	}
	public void setEndPoint(String endPoint){
		this.endPoint = endPoint;
	}

	public void endPoint(String multirequestToken){
		setToken("endPoint", multirequestToken);
	}


	public AmazonS3StorageProfile() {
		super();
	}

	public AmazonS3StorageProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filesPermissionInS3 = AmazonS3StorageProfileFilesPermissionLevel.get(GsonParser.parseString(jsonObject.get("filesPermissionInS3")));
		s3Region = GsonParser.parseString(jsonObject.get("s3Region"));
		sseType = GsonParser.parseString(jsonObject.get("sseType"));
		sseKmsKeyId = GsonParser.parseString(jsonObject.get("sseKmsKeyId"));
		signatureType = GsonParser.parseString(jsonObject.get("signatureType"));
		endPoint = GsonParser.parseString(jsonObject.get("endPoint"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAmazonS3StorageProfile");
		kparams.add("filesPermissionInS3", this.filesPermissionInS3);
		kparams.add("s3Region", this.s3Region);
		kparams.add("sseType", this.sseType);
		kparams.add("sseKmsKeyId", this.sseKmsKeyId);
		kparams.add("signatureType", this.signatureType);
		kparams.add("endPoint", this.endPoint);
		return kparams;
	}


    public static final Creator<AmazonS3StorageProfile> CREATOR = new Creator<AmazonS3StorageProfile>() {
        @Override
        public AmazonS3StorageProfile createFromParcel(Parcel source) {
            return new AmazonS3StorageProfile(source);
        }

        @Override
        public AmazonS3StorageProfile[] newArray(int size) {
            return new AmazonS3StorageProfile[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.filesPermissionInS3 == null ? -1 : this.filesPermissionInS3.ordinal());
        dest.writeString(this.s3Region);
        dest.writeString(this.sseType);
        dest.writeString(this.sseKmsKeyId);
        dest.writeString(this.signatureType);
        dest.writeString(this.endPoint);
    }

    public AmazonS3StorageProfile(Parcel in) {
        super(in);
        int tmpFilesPermissionInS3 = in.readInt();
        this.filesPermissionInS3 = tmpFilesPermissionInS3 == -1 ? null : AmazonS3StorageProfileFilesPermissionLevel.values()[tmpFilesPermissionInS3];
        this.s3Region = in.readString();
        this.sseType = in.readString();
        this.sseKmsKeyId = in.readString();
        this.signatureType = in.readString();
        this.endPoint = in.readString();
    }
}
