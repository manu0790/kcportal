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

/**
 * @author Allwins Rajaiah
 */
public interface RequestLessonFinder {
	public java.util.Map<java.lang.String, java.util.List<java.lang.String>> findAllrequestCategories();

	public java.util.Map<java.lang.String, java.lang.String> findAllrequestCategoryAnswer();

	public java.util.List<com.nyu.model.RequestLesson> findAssetRequestsByCategory(
		long categoryId, int start, int end);

	public java.util.List<java.lang.Long> findUsersContribution(
		long startPeriod, int start, int end);
}