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
public class RequestLessonFinderUtil {
	public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> findAllrequestCategories() {
		return getFinder().findAllrequestCategories();
	}

	public static java.util.Map<java.lang.String, java.lang.String> findAllrequestCategoryAnswer() {
		return getFinder().findAllrequestCategoryAnswer();
	}

	public static java.util.List<com.nyu.model.RequestLesson> findAssetRequestsByCategory(
		long categoryId, int start, int end) {
		return getFinder().findAssetRequestsByCategory(categoryId, start, end);
	}

	public static java.util.List<java.lang.Long> findUsersContribution(
		long startPeriod, int start, int end) {
		return getFinder().findUsersContribution(startPeriod, start, end);
	}

	public static RequestLessonFinder getFinder() {
		if (_finder == null) {
			_finder = (RequestLessonFinder)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					RequestLessonFinder.class.getName());

			ReferenceRegistry.registerReference(RequestLessonFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(RequestLessonFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(RequestLessonFinderUtil.class,
			"_finder");
	}

	private static RequestLessonFinder _finder;
}