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
import com.kaltura.client.types.ESearchOperator;
import com.kaltura.client.types.ESearchOrderBy;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchParams.Tokenizer.class)
public class ESearchParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		ESearchOperator.Tokenizer searchOperator();
		String objectStatuses();
		String objectId();
		ESearchOrderBy.Tokenizer orderBy();
		String useHighlight();
	}

	private ESearchOperator searchOperator;
	private String objectStatuses;
	private String objectId;
	private ESearchOrderBy orderBy;
	private Boolean useHighlight;

	// searchOperator:
	public ESearchOperator getSearchOperator(){
		return this.searchOperator;
	}
	public void setSearchOperator(ESearchOperator searchOperator){
		this.searchOperator = searchOperator;
	}

	// objectStatuses:
	public String getObjectStatuses(){
		return this.objectStatuses;
	}
	public void setObjectStatuses(String objectStatuses){
		this.objectStatuses = objectStatuses;
	}

	public void objectStatuses(String multirequestToken){
		setToken("objectStatuses", multirequestToken);
	}

	// objectId:
	public String getObjectId(){
		return this.objectId;
	}
	public void setObjectId(String objectId){
		this.objectId = objectId;
	}

	public void objectId(String multirequestToken){
		setToken("objectId", multirequestToken);
	}

	// orderBy:
	public ESearchOrderBy getOrderBy(){
		return this.orderBy;
	}
	public void setOrderBy(ESearchOrderBy orderBy){
		this.orderBy = orderBy;
	}

	// useHighlight:
	public Boolean getUseHighlight(){
		return this.useHighlight;
	}
	public void setUseHighlight(Boolean useHighlight){
		this.useHighlight = useHighlight;
	}

	public void useHighlight(String multirequestToken){
		setToken("useHighlight", multirequestToken);
	}


	public ESearchParams() {
		super();
	}

	public ESearchParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchOperator = GsonParser.parseObject(jsonObject.getAsJsonObject("searchOperator"), ESearchOperator.class);
		objectStatuses = GsonParser.parseString(jsonObject.get("objectStatuses"));
		objectId = GsonParser.parseString(jsonObject.get("objectId"));
		orderBy = GsonParser.parseObject(jsonObject.getAsJsonObject("orderBy"), ESearchOrderBy.class);
		useHighlight = GsonParser.parseBoolean(jsonObject.get("useHighlight"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchParams");
		kparams.add("searchOperator", this.searchOperator);
		kparams.add("objectStatuses", this.objectStatuses);
		kparams.add("objectId", this.objectId);
		kparams.add("orderBy", this.orderBy);
		kparams.add("useHighlight", this.useHighlight);
		return kparams;
	}


    public static final Creator<ESearchParams> CREATOR = new Creator<ESearchParams>() {
        @Override
        public ESearchParams createFromParcel(Parcel source) {
            return new ESearchParams(source);
        }

        @Override
        public ESearchParams[] newArray(int size) {
            return new ESearchParams[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.searchOperator, flags);
        dest.writeString(this.objectStatuses);
        dest.writeString(this.objectId);
        dest.writeParcelable(this.orderBy, flags);
        dest.writeValue(this.useHighlight);
    }

    public ESearchParams(Parcel in) {
        super(in);
        this.searchOperator = in.readParcelable(ESearchOperator.class.getClassLoader());
        this.objectStatuses = in.readString();
        this.objectId = in.readString();
        this.orderBy = in.readParcelable(ESearchOrderBy.class.getClassLoader());
        this.useHighlight = (Boolean)in.readValue(Boolean.class.getClassLoader());
    }
}
