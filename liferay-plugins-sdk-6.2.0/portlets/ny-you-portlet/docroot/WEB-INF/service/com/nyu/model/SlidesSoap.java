/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nyu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Allwins Rajaiah
 * @generated
 */
public class SlidesSoap implements Serializable {
	public static SlidesSoap toSoapModel(Slides model) {
		SlidesSoap soapModel = new SlidesSoap();

		soapModel.setId(model.getId());
		soapModel.setDescription(model.getDescription());
		soapModel.setDescPosition(model.getDescPosition());
		soapModel.setImageLink(model.getImageLink());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static SlidesSoap[] toSoapModels(Slides[] models) {
		SlidesSoap[] soapModels = new SlidesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SlidesSoap[][] toSoapModels(Slides[][] models) {
		SlidesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SlidesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SlidesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SlidesSoap[] toSoapModels(List<Slides> models) {
		List<SlidesSoap> soapModels = new ArrayList<SlidesSoap>(models.size());

		for (Slides model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SlidesSoap[soapModels.size()]);
	}

	public SlidesSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDescPosition() {
		return _descPosition;
	}

	public void setDescPosition(String descPosition) {
		_descPosition = descPosition;
	}

	public String getImageLink() {
		return _imageLink;
	}

	public void setImageLink(String imageLink) {
		_imageLink = imageLink;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return _updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	private long _id;
	private String _description;
	private String _descPosition;
	private String _imageLink;
	private Date _createdDate;
	private long _createdBy;
	private Date _updatedDate;
	private long _updatedBy;
}