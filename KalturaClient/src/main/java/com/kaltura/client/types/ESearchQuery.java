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
@MultiRequestBuilder.Tokenizer(ESearchQuery.Tokenizer.class)
public class ESearchQuery extends ESearchBaseItem {
	
	public interface Tokenizer extends ESearchBaseItem.Tokenizer {
		String eSearchQuery();
	}

	private String eSearchQuery;

	// eSearchQuery:
	public String getESearchQuery(){
		return this.eSearchQuery;
	}
	public void setESearchQuery(String eSearchQuery){
		this.eSearchQuery = eSearchQuery;
	}

	public void eSearchQuery(String multirequestToken){
		setToken("eSearchQuery", multirequestToken);
	}


	public ESearchQuery() {
		super();
	}

	public ESearchQuery(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		eSearchQuery = GsonParser.parseString(jsonObject.get("eSearchQuery"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchQuery");
		kparams.add("eSearchQuery", this.eSearchQuery);
		return kparams;
	}


    public static final Creator<ESearchQuery> CREATOR = new Creator<ESearchQuery>() {
        @Override
        public ESearchQuery createFromParcel(Parcel source) {
            return new ESearchQuery(source);
        }

        @Override
        public ESearchQuery[] newArray(int size) {
            return new ESearchQuery[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.eSearchQuery);
    }

    public ESearchQuery(Parcel in) {
        super(in);
        this.eSearchQuery = in.readString();
    }
}

