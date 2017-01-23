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
 * The base model interface for the Keywords service. Represents a row in the &quot;nyyou_Keywords&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.nyu.model.impl.KeywordsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.nyu.model.impl.KeywordsImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see Keywords
 * @see com.nyu.model.impl.KeywordsImpl
 * @see com.nyu.model.impl.KeywordsModelImpl
 * @generated
 */
public interface KeywordsModel extends BaseModel<Keywords> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a keywords model instance should use the {@link Keywords} interface instead.
	 */

	/**
	 * Returns the primary key of this keywords.
	 *
	 * @return the primary key of this keywords
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this keywords.
	 *
	 * @param primaryKey the primary key of this keywords
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this keywords.
	 *
	 * @return the ID of this keywords
	 */
	public long getId();

	/**
	 * Sets the ID of this keywords.
	 *
	 * @param id the ID of this keywords
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this keywords.
	 *
	 * @return the company ID of this keywords
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this keywords.
	 *
	 * @param companyId the company ID of this keywords
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this keywords.
	 *
	 * @return the group ID of this keywords
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this keywords.
	 *
	 * @param groupId the group ID of this keywords
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the keyword of this keywords.
	 *
	 * @return the keyword of this keywords
	 */
	@AutoEscape
	public String getKeyword();

	/**
	 * Sets the keyword of this keywords.
	 *
	 * @param keyword the keyword of this keywords
	 */
	public void setKeyword(String keyword);

	/**
	 * Returns the description of this keywords.
	 *
	 * @return the description of this keywords
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this keywords.
	 *
	 * @param description the description of this keywords
	 */
	public void setDescription(String description);

	/**
	 * Returns the created date of this keywords.
	 *
	 * @return the created date of this keywords
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this keywords.
	 *
	 * @param createdDate the created date of this keywords
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the created by of this keywords.
	 *
	 * @return the created by of this keywords
	 */
	public long getCreatedBy();

	/**
	 * Sets the created by of this keywords.
	 *
	 * @param createdBy the created by of this keywords
	 */
	public void setCreatedBy(long createdBy);

	/**
	 * Returns the updated date of this keywords.
	 *
	 * @return the updated date of this keywords
	 */
	public Date getUpdatedDate();

	/**
	 * Sets the updated date of this keywords.
	 *
	 * @param updatedDate the updated date of this keywords
	 */
	public void setUpdatedDate(Date updatedDate);

	/**
	 * Returns the updated by of this keywords.
	 *
	 * @return the updated by of this keywords
	 */
	public long getUpdatedBy();

	/**
	 * Sets the updated by of this keywords.
	 *
	 * @param updatedBy the updated by of this keywords
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
	public int compareTo(Keywords keywords);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Keywords> toCacheModel();

	@Override
	public Keywords toEscapedModel();

	@Override
	public Keywords toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}