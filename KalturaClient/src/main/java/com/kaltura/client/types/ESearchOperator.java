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
import com.kaltura.client.enums.ESearchOperatorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchOperator.Tokenizer.class)
public class ESearchOperator extends ESearchBaseItem {
	
	public interface Tokenizer extends ESearchBaseItem.Tokenizer {
		String operator();
		RequestBuilder.ListTokenizer<ESearchBaseItem.Tokenizer> searchItems();
	}

	private ESearchOperatorType operator;
	private List<ESearchBaseItem> searchItems;

	// operator:
	public ESearchOperatorType getOperator(){
		return this.operator;
	}
	public void setOperator(ESearchOperatorType operator){
		this.operator = operator;
	}

	public void operator(String multirequestToken){
		setToken("operator", multirequestToken);
	}

	// searchItems:
	public List<ESearchBaseItem> getSearchItems(){
		return this.searchItems;
	}
	public void setSearchItems(List<ESearchBaseItem> searchItems){
		this.searchItems = searchItems;
	}


	public ESearchOperator() {
		super();
	}

	public ESearchOperator(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		operator = ESearchOperatorType.get(GsonParser.parseInt(jsonObject.get("operator")));
		searchItems = GsonParser.parseArray(jsonObject.getAsJsonArray("searchItems"), ESearchBaseItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchOperator");
		kparams.add("operator", this.operator);
		kparams.add("searchItems", this.searchItems);
		return kparams;
	}


    public static final Creator<ESearchOperator> CREATOR = new Creator<ESearchOperator>() {
        @Override
        public ESearchOperator createFromParcel(Parcel source) {
            return new ESearchOperator(source);
        }

        @Override
        public ESearchOperator[] newArray(int size) {
            return new ESearchOperator[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.operator == null ? -1 : this.operator.ordinal());
        if(this.searchItems != null) {
            dest.writeInt(this.searchItems.size());
            dest.writeList(this.searchItems);
        } else {
            dest.writeInt(-1);
        }
    }

    public ESearchOperator(Parcel in) {
        super(in);
        int tmpOperator = in.readInt();
        this.operator = tmpOperator == -1 ? null : ESearchOperatorType.values()[tmpOperator];
        int searchItemsSize = in.readInt();
        if( searchItemsSize > -1) {
            this.searchItems = new ArrayList<>();
            in.readList(this.searchItems, ESearchBaseItem.class.getClassLoader());
        }
    }
}

