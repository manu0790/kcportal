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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Slides service. Represents a row in the &quot;nyyou_Slides&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.SlidesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.SlidesImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Slides
 * @see com.nyu.model.impl.SlidesImpl
 * @see com.nyu.model.impl.SlidesModelImpl
 * @generated
 */
public interface SlidesModel extends BaseModel<Slides> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a slides model instance should use the {@link Slides} interface instead.
	 */

	/**
	 * Returns the primary key of this slides.
	 *
	 * @return the primary key of this slides
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this slides.
	 *
	 * @param primaryKey the primary key of this slides
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this slides.
	 *
	 * @return the ID of this slides
	 */
	public long getId();

	/**
	 * Sets the ID of this slides.
	 *
	 * @param id the ID of this slides
	 */
	public void setId(long id);

	/**
	 * Returns the description of this slides.
	 *
	 * @return the description of this slides
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this slides.
	 *
	 * @param description the description of this slides
	 */
	public void setDescription(String description);

	/**
	 * Returns the desc position of this slides.
	 *
	 * @return the desc position of this slides
	 */
	@AutoEscape
	public String getDescPosition();

	/**
	 * Sets the desc position of this slides.
	 *
	 * @param descPosition the desc position of this slides
	 */
	public void setDescPosition(String descPosition);

	/**
	 * Returns the image link of this slides.
	 *
	 * @return the image link of this slides
	 */
	@AutoEscape
	public String getImageLink();

	/**
	 * Sets the image link of this slides.
	 *
	 * @param imageLink the image link of this slides
	 */
	public void setImageLink(String imageLink);

	/**
	 * Returns the created date of this slides.
	 *
	 * @return the created date of this slides
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this slides.
	 *
	 * @param createdDate the created date of this slides
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the created by of this slides.
	 *
	 * @return the created by of this slides
	 */
	public long getCreatedBy();

	/**
	 * Sets the created by of this slides.
	 *
	 * @param createdBy the created by of this slides
	 */
	public void setCreatedBy(long createdBy);

	/**
	 * Returns the updated date of this slides.
	 *
	 * @return the updated date of this slides
	 */
	public Date getUpdatedDate();

	/**
	 * Sets the updated date of this slides.
	 *
	 * @param updatedDate the updated date of this slides
	 */
	public void setUpdatedDate(Date updatedDate);

	/**
	 * Returns the updated by of this slides.
	 *
	 * @return the updated by of this slides
	 */
	public long getUpdatedBy();

	/**
	 * Sets the updated by of this slides.
	 *
	 * @param updatedBy the updated by of this slides
	 */
	public void setUpdatedBy(long updatedBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Slides slides);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Slides> toCacheModel();

	@Override
	public Slides toEscapedModel();

	@Override
	public Slides toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}