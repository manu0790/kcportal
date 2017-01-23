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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchBasnoException;

import com.nyu.model.Basno;
import com.nyu.model.impl.BasnoImpl;
import com.nyu.model.impl.BasnoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the basno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see BasnoPersistence
 * @see BasnoUtil
 * @generated
 */
public class BasnoPersistenceImpl extends BasePersistenceImpl<Basno>
	implements BasnoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BasnoUtil} to access the basno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BasnoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoModelImpl.FINDER_CACHE_ENABLED, BasnoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoModelImpl.FINDER_CACHE_ENABLED, BasnoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BasnoPersistenceImpl() {
		setModelClass(Basno.class);
	}

	/**
	 * Caches the basno in the entity cache if it is enabled.
	 *
	 * @param basno the basno
	 */
	@Override
	public void cacheResult(Basno basno) {
		EntityCacheUtil.putResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoImpl.class, basno.getPrimaryKey(), basno);

		basno.resetOriginalValues();
	}

	/**
	 * Caches the basnos in the entity cache if it is enabled.
	 *
	 * @param basnos the basnos
	 */
	@Override
	public void cacheResult(List<Basno> basnos) {
		for (Basno basno : basnos) {
			if (EntityCacheUtil.getResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
						BasnoImpl.class, basno.getPrimaryKey()) == null) {
				cacheResult(basno);
			}
			else {
				basno.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all basnos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BasnoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BasnoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the basno.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Basno basno) {
		EntityCacheUtil.removeResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoImpl.class, basno.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Basno> basnos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Basno basno : basnos) {
			EntityCacheUtil.removeResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
				BasnoImpl.class, basno.getPrimaryKey());
		}
	}

	/**
	 * Creates a new basno with the primary key. Does not add the basno to the database.
	 *
	 * @param badgeId the primary key for the new basno
	 * @return the new basno
	 */
	@Override
	public Basno create(long badgeId) {
		Basno basno = new BasnoImpl();

		basno.setNew(true);
		basno.setPrimaryKey(badgeId);

		return basno;
	}

	/**
	 * Removes the basno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param badgeId the primary key of the basno
	 * @return the basno that was removed
	 * @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno remove(long badgeId)
		throws NoSuchBasnoException, SystemException {
		return remove((Serializable)badgeId);
	}

	/**
	 * Removes the basno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the basno
	 * @return the basno that was removed
	 * @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno remove(Serializable primaryKey)
		throws NoSuchBasnoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Basno basno = (Basno)session.get(BasnoImpl.class, primaryKey);

			if (basno == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBasnoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(basno);
		}
		catch (NoSuchBasnoException nsee) {
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
	protected Basno removeImpl(Basno basno) throws SystemException {
		basno = toUnwrappedModel(basno);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(basno)) {
				basno = (Basno)session.get(BasnoImpl.class,
						basno.getPrimaryKeyObj());
			}

			if (basno != null) {
				session.delete(basno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (basno != null) {
			clearCache(basno);
		}

		return basno;
	}

	@Override
	public Basno updateImpl(com.nyu.model.Basno basno)
		throws SystemException {
		basno = toUnwrappedModel(basno);

		boolean isNew = basno.isNew();

		Session session = null;

		try {
			session = openSession();

			if (basno.isNew()) {
				session.save(basno);

				basno.setNew(false);
			}
			else {
				session.merge(basno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
			BasnoImpl.class, basno.getPrimaryKey(), basno);

		return basno;
	}

	protected Basno toUnwrappedModel(Basno basno) {
		if (basno instanceof BasnoImpl) {
			return basno;
		}

		BasnoImpl basnoImpl = new BasnoImpl();

		basnoImpl.setNew(basno.isNew());
		basnoImpl.setPrimaryKey(basno.getPrimaryKey());

		basnoImpl.setBadgeId(basno.getBadgeId());
		basnoImpl.setCompanyId(basno.getCompanyId());
		basnoImpl.setGroupId(basno.getGroupId());
		basnoImpl.setBadgeName(basno.getBadgeName());
		basnoImpl.setBadgeUrl(basno.getBadgeUrl());
		basnoImpl.setDescription(basno.getDescription());
		basnoImpl.setTargetPoints(basno.getTargetPoints());
		basnoImpl.setCreatedDate(basno.getCreatedDate());
		basnoImpl.setCreatedBy(basno.getCreatedBy());
		basnoImpl.setUpdatedDate(basno.getUpdatedDate());
		basnoImpl.setUpdatedBy(basno.getUpdatedBy());

		return basnoImpl;
	}

	/**
	 * Returns the basno with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the basno
	 * @return the basno
	 * @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBasnoException, SystemException {
		Basno basno = fetchByPrimaryKey(primaryKey);

		if (basno == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBasnoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return basno;
	}

	/**
	 * Returns the basno with the primary key or throws a {@link com.nyu.NoSuchBasnoException} if it could not be found.
	 *
	 * @param badgeId the primary key of the basno
	 * @return the basno
	 * @throws com.nyu.NoSuchBasnoException if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno findByPrimaryKey(long badgeId)
		throws NoSuchBasnoException, SystemException {
		return findByPrimaryKey((Serializable)badgeId);
	}

	/**
	 * Returns the basno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the basno
	 * @return the basno, or <code>null</code> if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Basno basno = (Basno)EntityCacheUtil.getResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
				BasnoImpl.class, primaryKey);

		if (basno == _nullBasno) {
			return null;
		}

		if (basno == null) {
			Session session = null;

			try {
				session = openSession();

				basno = (Basno)session.get(BasnoImpl.class, primaryKey);

				if (basno != null) {
					cacheResult(basno);
				}
				else {
					EntityCacheUtil.putResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
						BasnoImpl.class, primaryKey, _nullBasno);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BasnoModelImpl.ENTITY_CACHE_ENABLED,
					BasnoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return basno;
	}

	/**
	 * Returns the basno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param badgeId the primary key of the basno
	 * @return the basno, or <code>null</code> if a basno with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Basno fetchByPrimaryKey(long badgeId) throws SystemException {
		return fetchByPrimaryKey((Serializable)badgeId);
	}

	/**
	 * Returns all the basnos.
	 *
	 * @return the basnos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Basno> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basnos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basnos
	 * @param end the upper bound of the range of basnos (not inclusive)
	 * @return the range of basnos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Basno> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the basnos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.BasnoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of basnos
	 * @param end the upper bound of the range of basnos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of basnos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Basno> findAll(int start, int end,
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

		List<Basno> list = (List<Basno>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BASNO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BASNO;

				if (pagination) {
					sql = sql.concat(BasnoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Basno>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Basno>(list);
				}
				else {
					list = (List<Basno>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the basnos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Basno basno : findAll()) {
			remove(basno);
		}
	}

	/**
	 * Returns the number of basnos.
	 *
	 * @return the number of basnos
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

				Query q = session.createQuery(_SQL_COUNT_BASNO);

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

	/**
	 * Initializes the basno persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.Basno")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Basno>> listenersList = new ArrayList<ModelListener<Basno>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Basno>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BasnoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BASNO = "SELECT basno FROM Basno basno";
	private static final String _SQL_COUNT_BASNO = "SELECT COUNT(basno) FROM Basno basno";
	private static final String _ORDER_BY_ENTITY_ALIAS = "basno.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Basno exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BasnoPersistenceImpl.class);
	private static Basno _nullBasno = new BasnoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Basno> toCacheModel() {
				return _nullBasnoCacheModel;
			}
		};

	private static CacheModel<Basno> _nullBasnoCacheModel = new CacheModel<Basno>() {
			@Override
			public Basno toEntityModel() {
				return _nullBasno;
			}
		};
}