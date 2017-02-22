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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Slides}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Slides
 * @generated
 */
public class SlidesWrapper implements Slides, ModelWrapper<Slides> {
	public SlidesWrapper(Slides slides) {
		_slides = slides;
	}

	@Override
	public Class<?> getModelClass() {
		return Slides.class;
	}

	@Override
	public String getModelClassName() {
		return Slides.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("description", getDescription());
		attributes.put("descPosition", getDescPosition());
		attributes.put("imageLink", getImageLink());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String descPosition = (String)attributes.get("descPosition");

		if (descPosition != null) {
			setDescPosition(descPosition);
		}

		String imageLink = (String)attributes.get("imageLink");

		if (imageLink != null) {
			setImageLink(imageLink);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	/**
	* Returns the primary key of this slides.
	*
	* @return the primary key of this slides
	*/
	@Override
	public long getPrimaryKey() {
		return _slides.getPrimaryKey();
	}

	/**
	* Sets the primary key of this slides.
	*
	* @param primaryKey the primary key of this slides
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_slides.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this slides.
	*
	* @return the ID of this slides
	*/
	@Override
	public long getId() {
		return _slides.getId();
	}

	/**
	* Sets the ID of this slides.
	*
	* @param id the ID of this slides
	*/
	@Override
	public void setId(long id) {
		_slides.setId(id);
	}

	/**
	* Returns the description of this slides.
	*
	* @return the description of this slides
	*/
	@Override
	public java.lang.String getDescription() {
		return _slides.getDescription();
	}

	/**
	* Sets the description of this slides.
	*
	* @param description the description of this slides
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_slides.setDescription(description);
	}

	/**
	* Returns the desc position of this slides.
	*
	* @return the desc position of this slides
	*/
	@Override
	public java.lang.String getDescPosition() {
		return _slides.getDescPosition();
	}

	/**
	* Sets the desc position of this slides.
	*
	* @param descPosition the desc position of this slides
	*/
	@Override
	public void setDescPosition(java.lang.String descPosition) {
		_slides.setDescPosition(descPosition);
	}

	/**
	* Returns the image link of this slides.
	*
	* @return the image link of this slides
	*/
	@Override
	public java.lang.String getImageLink() {
		return _slides.getImageLink();
	}

	/**
	* Sets the image link of this slides.
	*
	* @param imageLink the image link of this slides
	*/
	@Override
	public void setImageLink(java.lang.String imageLink) {
		_slides.setImageLink(imageLink);
	}

	/**
	* Returns the created date of this slides.
	*
	* @return the created date of this slides
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _slides.getCreatedDate();
	}

	/**
	* Sets the created date of this slides.
	*
	* @param createdDate the created date of this slides
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_slides.setCreatedDate(createdDate);
	}

	/**
	* Returns the created by of this slides.
	*
	* @return the created by of this slides
	*/
	@Override
	public long getCreatedBy() {
		return _slides.getCreatedBy();
	}

	/**
	* Sets the created by of this slides.
	*
	* @param createdBy the created by of this slides
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_slides.setCreatedBy(createdBy);
	}

	/**
	* Returns the updated date of this slides.
	*
	* @return the updated date of this slides
	*/
	@Override
	public java.util.Date getUpdatedDate() {
		return _slides.getUpdatedDate();
	}

	/**
	* Sets the updated date of this slides.
	*
	* @param updatedDate the updated date of this slides
	*/
	@Override
	public void setUpdatedDate(java.util.Date updatedDate) {
		_slides.setUpdatedDate(updatedDate);
	}

	/**
	* Returns the updated by of this slides.
	*
	* @return the updated by of this slides
	*/
	@Override
	public long getUpdatedBy() {
		return _slides.getUpdatedBy();
	}

	/**
	* Sets the updated by of this slides.
	*
	* @param updatedBy the updated by of this slides
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_slides.setUpdatedBy(updatedBy);
	}

	@Override
	public boolean isNew() {
		return _slides.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_slides.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _slides.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_slides.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _slides.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _slides.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_slides.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _slides.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_slides.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_slides.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_slides.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SlidesWrapper((Slides)_slides.clone());
	}

	@Override
	public int compareTo(Slides slides) {
		return _slides.compareTo(slides);
	}

	@Override
	public int hashCode() {
		return _slides.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Slides> toCacheModel() {
		return _slides.toCacheModel();
	}

	@Override
	public Slides toEscapedModel() {
		return new SlidesWrapper(_slides.toEscapedModel());
	}

	@Override
	public Slides toUnescapedModel() {
		return new SlidesWrapper(_slides.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _slides.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _slides.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_slides.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SlidesWrapper)) {
			return false;
		}

		SlidesWrapper slidesWrapper = (SlidesWrapper)obj;

		if (Validator.equals(_slides, slidesWrapper._slides)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Slides getWrappedSlides() {
		return _slides;
	}

	@Override
	public Slides getWrappedModel() {
		return _slides;
	}

	@Override
	public void resetOriginalValues() {
		_slides.resetOriginalValues();
	}

	private Slides _slides;
}