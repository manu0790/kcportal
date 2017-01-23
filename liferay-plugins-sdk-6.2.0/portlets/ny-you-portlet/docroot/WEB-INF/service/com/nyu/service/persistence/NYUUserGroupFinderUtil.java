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

package com.nyu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Allwins Rajaiah
 */
public class NYUUserGroupFinderUtil {
	public static java.util.List<com.liferay.portal.model.UserGroup> findUserGroupByType(
		int start, int end) {
		return getFinder().findUserGroupByType(start, end);
	}

	public static NYUUserGroupFinder getFinder() {
		if (_finder == null) {
			_finder = (NYUUserGroupFinder)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					NYUUserGroupFinder.class.getName());

			ReferenceRegistry.registerReference(NYUUserGroupFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(NYUUserGroupFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(NYUUserGroupFinderUtil.class,
			"_finder");
	}

	private static NYUUserGroupFinder _finder;
}