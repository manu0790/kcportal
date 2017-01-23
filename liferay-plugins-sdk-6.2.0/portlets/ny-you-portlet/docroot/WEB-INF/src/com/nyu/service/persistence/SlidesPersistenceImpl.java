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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchSlidesException;

import com.nyu.model.Slides;
import com.nyu.model.impl.SlidesImpl;
import com.nyu.model.impl.SlidesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the slides service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see SlidesPersistence
 * @see SlidesUtil
 * @generated
 */
public class SlidesPersistenceImpl extends BasePersistenceImpl<Slides>
	implements SlidesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SlidesUtil} to access the slides persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SlidesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesModelImpl.FINDER_CACHE_ENABLED, SlidesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesModelImpl.FINDER_CACHE_ENABLED, SlidesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_GETSLIDE = new FinderPath(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesModelImpl.FINDER_CACHE_ENABLED, SlidesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSlide",
			new String[] { Long.class.getName() },
			SlidesModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GETSLIDE = new FinderPath(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSlide",
			new String[] { Long.class.getName() });

	/**
	 * Returns the slides where id = &#63; or throws a {@link com.nyu.NoSuchSlidesException} if it could not be found.
	 *
	 * @param id the ID
	 * @return the matching slides
	 * @throws com.nyu.NoSuchSlidesException if a matching slides could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides findBygetSlide(long id)
		throws NoSuchSlidesException, SystemException {
		Slides slides = fetchBygetSlide(id);

		if (slides == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchSlidesException(msg.toString());
		}

		return slides;
	}

	/**
	 * Returns the slides where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the ID
	 * @return the matching slides, or <code>null</code> if a matching slides could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides fetchBygetSlide(long id) throws SystemException {
		return fetchBygetSlide(id, true);
	}

	/**
	 * Returns the slides where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching slides, or <code>null</code> if a matching slides could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides fetchBygetSlide(long id, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_GETSLIDE,
					finderArgs, this);
		}

		if (result instanceof Slides) {
			Slides slides = (Slides)result;

			if ((id != slides.getId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SLIDES_WHERE);

			query.append(_FINDER_COLUMN_GETSLIDE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				List<Slides> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETSLIDE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"SlidesPersistenceImpl.fetchBygetSlide(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Slides slides = list.get(0);

					result = slides;

					cacheResult(slides);

					if ((slides.getId() != id)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETSLIDE,
							finderArgs, slides);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETSLIDE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Slides)result;
		}
	}

	/**
	 * Removes the slides where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @return the slides that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides removeBygetSlide(long id)
		throws NoSuchSlidesException, SystemException {
		Slides slides = findBygetSlide(id);

		return remove(slides);
	}

	/**
	 * Returns the number of slideses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching slideses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygetSlide(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GETSLIDE;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SLIDES_WHERE);

			query.append(_FINDER_COLUMN_GETSLIDE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETSLIDE_ID_2 = "slides.id = ?";

	public SlidesPersistenceImpl() {
		setModelClass(Slides.class);
	}

	/**
	 * Caches the slides in the entity cache if it is enabled.
	 *
	 * @param slides the slides
	 */
	@Override
	public void cacheResult(Slides slides) {
		EntityCacheUtil.putResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesImpl.class, slides.getPrimaryKey(), slides);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETSLIDE,
			new Object[] { slides.getId() }, slides);

		slides.resetOriginalValues();
	}

	/**
	 * Caches the slideses in the entity cache if it is enabled.
	 *
	 * @param slideses the slideses
	 */
	@Override
	public void cacheResult(List<Slides> slideses) {
		for (Slides slides : slideses) {
			if (EntityCacheUtil.getResult(
						SlidesModelImpl.ENTITY_CACHE_ENABLED, SlidesImpl.class,
						slides.getPrimaryKey()) == null) {
				cacheResult(slides);
			}
			else {
				slides.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all slideses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SlidesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SlidesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the slides.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Slides slides) {
		EntityCacheUtil.removeResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesImpl.class, slides.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(slides);
	}

	@Override
	public void clearCache(List<Slides> slideses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Slides slides : slideses) {
			EntityCacheUtil.removeResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
				SlidesImpl.class, slides.getPrimaryKey());

			clearUniqueFindersCache(slides);
		}
	}

	protected void cacheUniqueFindersCache(Slides slides) {
		if (slides.isNew()) {
			Object[] args = new Object[] { slides.getId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETSLIDE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETSLIDE, args,
				slides);
		}
		else {
			SlidesModelImpl slidesModelImpl = (SlidesModelImpl)slides;

			if ((slidesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_GETSLIDE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { slides.getId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GETSLIDE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_GETSLIDE, args,
					slides);
			}
		}
	}

	protected void clearUniqueFindersCache(Slides slides) {
		SlidesModelImpl slidesModelImpl = (SlidesModelImpl)slides;

		Object[] args = new Object[] { slides.getId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETSLIDE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETSLIDE, args);

		if ((slidesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_GETSLIDE.getColumnBitmask()) != 0) {
			args = new Object[] { slidesModelImpl.getOriginalId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GETSLIDE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_GETSLIDE, args);
		}
	}

	/**
	 * Creates a new slides with the primary key. Does not add the slides to the database.
	 *
	 * @param id the primary key for the new slides
	 * @return the new slides
	 */
	@Override
	public Slides create(long id) {
		Slides slides = new SlidesImpl();

		slides.setNew(true);
		slides.setPrimaryKey(id);

		return slides;
	}

	/**
	 * Removes the slides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the slides
	 * @return the slides that was removed
	 * @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides remove(long id) throws NoSuchSlidesException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the slides with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the slides
	 * @return the slides that was removed
	 * @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides remove(Serializable primaryKey)
		throws NoSuchSlidesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Slides slides = (Slides)session.get(SlidesImpl.class, primaryKey);

			if (slides == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSlidesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(slides);
		}
		catch (NoSuchSlidesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Slides removeImpl(Slides slides) throws SystemException {
		slides = toUnwrappedModel(slides);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(slides)) {
				slides = (Slides)session.get(SlidesImpl.class,
						slides.getPrimaryKeyObj());
			}

			if (slides != null) {
				session.delete(slides);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (slides != null) {
			clearCache(slides);
		}

		return slides;
	}

	@Override
	public Slides updateImpl(com.nyu.model.Slides slides)
		throws SystemException {
		slides = toUnwrappedModel(slides);

		boolean isNew = slides.isNew();

		Session session = null;

		try {
			session = openSession();

			if (slides.isNew()) {
				session.save(slides);

				slides.setNew(false);
			}
			else {
				session.merge(slides);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SlidesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
			SlidesImpl.class, slides.getPrimaryKey(), slides);

		clearUniqueFindersCache(slides);
		cacheUniqueFindersCache(slides);

		return slides;
	}

	protected Slides toUnwrappedModel(Slides slides) {
		if (slides instanceof SlidesImpl) {
			return slides;
		}

		SlidesImpl slidesImpl = new SlidesImpl();

		slidesImpl.setNew(slides.isNew());
		slidesImpl.setPrimaryKey(slides.getPrimaryKey());

		slidesImpl.setId(slides.getId());
		slidesImpl.setDescription(slides.getDescription());
		slidesImpl.setDescPosition(slides.getDescPosition());
		slidesImpl.setImageLink(slides.getImageLink());
		slidesImpl.setCreatedDate(slides.getCreatedDate());
		slidesImpl.setCreatedBy(slides.getCreatedBy());
		slidesImpl.setUpdatedDate(slides.getUpdatedDate());
		slidesImpl.setUpdatedBy(slides.getUpdatedBy());

		return slidesImpl;
	}

	/**
	 * Returns the slides with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the slides
	 * @return the slides
	 * @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSlidesException, SystemException {
		Slides slides = fetchByPrimaryKey(primaryKey);

		if (slides == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSlidesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return slides;
	}

	/**
	 * Returns the slides with the primary key or throws a {@link com.nyu.NoSuchSlidesException} if it could not be found.
	 *
	 * @param id the primary key of the slides
	 * @return the slides
	 * @throws com.nyu.NoSuchSlidesException if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides findByPrimaryKey(long id)
		throws NoSuchSlidesException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the slides with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the slides
	 * @return the slides, or <code>null</code> if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Slides slides = (Slides)EntityCacheUtil.getResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
				SlidesImpl.class, primaryKey);

		if (slides == _nullSlides) {
			return null;
		}

		if (slides == null) {
			Session session = null;

			try {
				session = openSession();

				slides = (Slides)session.get(SlidesImpl.class, primaryKey);

				if (slides != null) {
					cacheResult(slides);
				}
				else {
					EntityCacheUtil.putResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
						SlidesImpl.class, primaryKey, _nullSlides);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SlidesModelImpl.ENTITY_CACHE_ENABLED,
					SlidesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return slides;
	}

	/**
	 * Returns the slides with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the slides
	 * @return the slides, or <code>null</code> if a slides with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Slides fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the slideses.
	 *
	 * @return the slideses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Slides> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the slideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of slideses
	 * @param end the upper bound of the range of slideses (not inclusive)
	 * @return the range of slideses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Slides> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the slideses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.SlidesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of slideses
	 * @param end the upper bound of the range of slideses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of slideses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Slides> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Slides> list = (List<Slides>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SLIDES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SLIDES;

				if (pagination) {
					sql = sql.concat(SlidesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Slides>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Slides>(list);
				}
				else {
					list = (List<Slides>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the slideses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Slides slides : findAll()) {
			remove(slides);
		}
	}

	/**
	 * Returns the number of slideses.
	 *
	 * @return the number of slideses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SLIDES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the slides persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.Slides")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Slides>> listenersList = new ArrayList<ModelListener<Slides>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Slides>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SlidesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SLIDES = "SELECT slides FROM Slides slides";
	private static final String _SQL_SELECT_SLIDES_WHERE = "SELECT slides FROM Slides slides WHERE ";
	private static final String _SQL_COUNT_SLIDES = "SELECT COUNT(slides) FROM Slides slides";
	private static final String _SQL_COUNT_SLIDES_WHERE = "SELECT COUNT(slides) FROM Slides slides WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "slides.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Slides exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Slides exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SlidesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static Slides _nullSlides = new SlidesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Slides> toCacheModel() {
				return _nullSlidesCacheModel;
			}
		};

	private static CacheModel<Slides> _nullSlidesCacheModel = new CacheModel<Slides>() {
			@Override
			public Slides toEntityModel() {
				return _nullSlides;
			}
		};
}