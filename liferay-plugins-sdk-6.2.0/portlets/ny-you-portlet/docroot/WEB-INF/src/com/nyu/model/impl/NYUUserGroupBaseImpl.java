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

package com.nyu.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.nyu.model.NYUUserGroup;

import com.nyu.service.NYUUserGroupLocalServiceUtil;

/**
 * The extended model base implementation for the NYUUserGroup service. Represents a row in the &quot;nyyou_NYUUserGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NYUUserGroupImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see NYUUserGroupImpl
 * @see com.nyu.model.NYUUserGroup
 * @generated
 */
public abstract class NYUUserGroupBaseImpl extends NYUUserGroupModelImpl
	implements NYUUserGroup {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a n y u user group model instance should use the {@link NYUUserGroup} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NYUUserGroupLocalServiceUtil.addNYUUserGroup(this);
		}
		else {
			NYUUserGroupLocalServiceUtil.updateNYUUserGroup(this);
		}
	}
}