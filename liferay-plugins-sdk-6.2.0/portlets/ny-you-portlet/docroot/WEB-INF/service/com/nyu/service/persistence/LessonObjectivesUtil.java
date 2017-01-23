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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.nyu.model.LessonObjectives;

import java.util.List;

/**
 * The persistence utility for the lesson objectives service. This utility wraps {@link LessonObjectivesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see LessonObjectivesPersistence
 * @see LessonObjectivesPersistenceImpl
 * @generated
 */
public class LessonObjectivesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LessonObjectives lessonObjectives) {
		getPersistence().clearCache(lessonObjectives);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LessonObjectives> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LessonObjectives> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LessonObjectives> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LessonObjectives update(LessonObjectives lessonObjectives)
		throws SystemException {
		return getPersistence().update(lessonObjectives);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LessonObjectives update(LessonObjectives lessonObjectives,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lessonObjectives, serviceContext);
	}

	/**
	* Returns all the lesson objectiveses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the matching lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findBylessonObjectivesList(
		long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonObjectivesList(lessonId);
	}

	/**
	* Returns a range of all the lesson objectiveses where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of lesson objectiveses
	* @param end the upper bound of the range of lesson objectiveses (not inclusive)
	* @return the range of matching lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findBylessonObjectivesList(
		long lessonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylessonObjectivesList(lessonId, start, end);
	}

	/**
	* Returns an ordered range of all the lesson objectiveses where lessonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lessonId the lesson ID
	* @param start the lower bound of the range of lesson objectiveses
	* @param end the upper bound of the range of lesson objectiveses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findBylessonObjectivesList(
		long lessonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylessonObjectivesList(lessonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first lesson objectives in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson objectives
	* @throws com.nyu.NoSuchLessonObjectivesException if a matching lesson objectives could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives findBylessonObjectivesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonObjectivesException {
		return getPersistence()
				   .findBylessonObjectivesList_First(lessonId, orderByComparator);
	}

	/**
	* Returns the first lesson objectives in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lesson objectives, or <code>null</code> if a matching lesson objectives could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives fetchBylessonObjectivesList_First(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonObjectivesList_First(lessonId,
			orderByComparator);
	}

	/**
	* Returns the last lesson objectives in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson objectives
	* @throws com.nyu.NoSuchLessonObjectivesException if a matching lesson objectives could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives findBylessonObjectivesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonObjectivesException {
		return getPersistence()
				   .findBylessonObjectivesList_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the last lesson objectives in the ordered set where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lesson objectives, or <code>null</code> if a matching lesson objectives could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives fetchBylessonObjectivesList_Last(
		long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylessonObjectivesList_Last(lessonId, orderByComparator);
	}

	/**
	* Returns the lesson objectiveses before and after the current lesson objectives in the ordered set where lessonId = &#63;.
	*
	* @param id the primary key of the current lesson objectives
	* @param lessonId the lesson ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lesson objectives
	* @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives[] findBylessonObjectivesList_PrevAndNext(
		long id, long lessonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonObjectivesException {
		return getPersistence()
				   .findBylessonObjectivesList_PrevAndNext(id, lessonId,
			orderByComparator);
	}

	/**
	* Removes all the lesson objectiveses where lessonId = &#63; from the database.
	*
	* @param lessonId the lesson ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylessonObjectivesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylessonObjectivesList(lessonId);
	}

	/**
	* Returns the number of lesson objectiveses where lessonId = &#63;.
	*
	* @param lessonId the lesson ID
	* @return the number of matching lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylessonObjectivesList(long lessonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylessonObjectivesList(lessonId);
	}

	/**
	* Caches the lesson objectives in the entity cache if it is enabled.
	*
	* @param lessonObjectives the lesson objectives
	*/
	public static void cacheResult(
		com.nyu.model.LessonObjectives lessonObjectives) {
		getPersistence().cacheResult(lessonObjectives);
	}

	/**
	* Caches the lesson objectiveses in the entity cache if it is enabled.
	*
	* @param lessonObjectiveses the lesson objectiveses
	*/
	public static void cacheResult(
		java.util.List<com.nyu.model.LessonObjectives> lessonObjectiveses) {
		getPersistence().cacheResult(lessonObjectiveses);
	}

	/**
	* Creates a new lesson objectives with the primary key. Does not add the lesson objectives to the database.
	*
	* @param id the primary key for the new lesson objectives
	* @return the new lesson objectives
	*/
	public static com.nyu.model.LessonObjectives create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the lesson objectives with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lesson objectives
	* @return the lesson objectives that was removed
	* @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonObjectivesException {
		return getPersistence().remove(id);
	}

	public static com.nyu.model.LessonObjectives updateImpl(
		com.nyu.model.LessonObjectives lessonObjectives)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lessonObjectives);
	}

	/**
	* Returns the lesson objectives with the primary key or throws a {@link com.nyu.NoSuchLessonObjectivesException} if it could not be found.
	*
	* @param id the primary key of the lesson objectives
	* @return the lesson objectives
	* @throws com.nyu.NoSuchLessonObjectivesException if a lesson objectives with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.nyu.NoSuchLessonObjectivesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the lesson objectives with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lesson objectives
	* @return the lesson objectives, or <code>null</code> if a lesson objectives with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.nyu.model.LessonObjectives fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the lesson objectiveses.
	*
	* @return the lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lesson objectiveses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson objectiveses
	* @param end the upper bound of the range of lesson objectiveses (not inclusive)
	* @return the range of lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lesson objectiveses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.LessonObjectivesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lesson objectiveses
	* @param end the upper bound of the range of lesson objectiveses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.nyu.model.LessonObjectives> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lesson objectiveses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lesson objectiveses.
	*
	* @return the number of lesson objectiveses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LessonObjectivesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LessonObjectivesPersistence)PortletBeanLocatorUtil.locate(com.nyu.service.ClpSerializer.getServletContextName(),
					LessonObjectivesPersistence.class.getName());

			ReferenceRegistry.registerReference(LessonObjectivesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LessonObjectivesPersistence persistence) {
	}

	private static LessonObjectivesPersistence _persistence;
}