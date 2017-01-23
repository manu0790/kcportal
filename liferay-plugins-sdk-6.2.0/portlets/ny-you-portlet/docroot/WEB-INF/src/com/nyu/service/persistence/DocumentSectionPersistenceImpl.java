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

import com.nyu.NoSuchDocumentSectionException;

import com.nyu.model.DocumentSection;
import com.nyu.model.impl.DocumentSectionImpl;
import com.nyu.model.impl.DocumentSectionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the document section service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentSectionPersistence
 * @see DocumentSectionUtil
 * @generated
 */
public class DocumentSectionPersistenceImpl extends BasePersistenceImpl<DocumentSection>
	implements DocumentSectionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentSectionUtil} to access the document section persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentSectionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED,
			DocumentSectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED,
			DocumentSectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST =
		new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED,
			DocumentSectionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentSectionList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST =
		new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED,
			DocumentSectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentSectionList", new String[] { Long.class.getName() },
			DocumentSectionModelImpl.LESSONID_COLUMN_BITMASK |
			DocumentSectionModelImpl.ORDER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTSECTIONLIST = new FinderPath(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentSectionList", new String[] { Long.class.getName() });

	/**
	 * Returns all the document sections where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the matching document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findBydocumentSectionList(long lessonId)
		throws SystemException {
		return findBydocumentSectionList(lessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document sections where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document sections
	 * @param end the upper bound of the range of document sections (not inclusive)
	 * @return the range of matching document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findBydocumentSectionList(long lessonId,
		int start, int end) throws SystemException {
		return findBydocumentSectionList(lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document sections where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document sections
	 * @param end the upper bound of the range of document sections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findBydocumentSectionList(long lessonId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST;
			finderArgs = new Object[] { lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST;
			finderArgs = new Object[] { lessonId, start, end, orderByComparator };
		}

		List<DocumentSection> list = (List<DocumentSection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentSection documentSection : list) {
				if ((lessonId != documentSection.getLessonId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DOCUMENTSECTION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTSECTIONLIST_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentSectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<DocumentSection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentSection>(list);
				}
				else {
					list = (List<DocumentSection>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first document section in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document section
	 * @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection findBydocumentSectionList_First(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentSectionException, SystemException {
		DocumentSection documentSection = fetchBydocumentSectionList_First(lessonId,
				orderByComparator);

		if (documentSection != null) {
			return documentSection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentSectionException(msg.toString());
	}

	/**
	 * Returns the first document section in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document section, or <code>null</code> if a matching document section could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection fetchBydocumentSectionList_First(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentSection> list = findBydocumentSectionList(lessonId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document section in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document section
	 * @throws com.nyu.NoSuchDocumentSectionException if a matching document section could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection findBydocumentSectionList_Last(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentSectionException, SystemException {
		DocumentSection documentSection = fetchBydocumentSectionList_Last(lessonId,
				orderByComparator);

		if (documentSection != null) {
			return documentSection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentSectionException(msg.toString());
	}

	/**
	 * Returns the last document section in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document section, or <code>null</code> if a matching document section could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection fetchBydocumentSectionList_Last(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentSectionList(lessonId);

		if (count == 0) {
			return null;
		}

		List<DocumentSection> list = findBydocumentSectionList(lessonId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document sections before and after the current document section in the ordered set where lessonId = &#63;.
	 *
	 * @param id the primary key of the current document section
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document section
	 * @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection[] findBydocumentSectionList_PrevAndNext(long id,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentSectionException, SystemException {
		DocumentSection documentSection = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentSection[] array = new DocumentSectionImpl[3];

			array[0] = getBydocumentSectionList_PrevAndNext(session,
					documentSection, lessonId, orderByComparator, true);

			array[1] = documentSection;

			array[2] = getBydocumentSectionList_PrevAndNext(session,
					documentSection, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentSection getBydocumentSectionList_PrevAndNext(
		Session session, DocumentSection documentSection, long lessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTSECTION_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTSECTIONLIST_LESSONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DocumentSectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentSection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentSection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document sections where lessonId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentSectionList(long lessonId)
		throws SystemException {
		for (DocumentSection documentSection : findBydocumentSectionList(
				lessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentSection);
		}
	}

	/**
	 * Returns the number of document sections where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the number of matching document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentSectionList(long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTSECTIONLIST;

		Object[] finderArgs = new Object[] { lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTSECTION_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTSECTIONLIST_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

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

	private static final String _FINDER_COLUMN_DOCUMENTSECTIONLIST_LESSONID_2 = "documentSection.lessonId = ?";

	public DocumentSectionPersistenceImpl() {
		setModelClass(DocumentSection.class);
	}

	/**
	 * Caches the document section in the entity cache if it is enabled.
	 *
	 * @param documentSection the document section
	 */
	@Override
	public void cacheResult(DocumentSection documentSection) {
		EntityCacheUtil.putResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionImpl.class, documentSection.getPrimaryKey(),
			documentSection);

		documentSection.resetOriginalValues();
	}

	/**
	 * Caches the document sections in the entity cache if it is enabled.
	 *
	 * @param documentSections the document sections
	 */
	@Override
	public void cacheResult(List<DocumentSection> documentSections) {
		for (DocumentSection documentSection : documentSections) {
			if (EntityCacheUtil.getResult(
						DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
						DocumentSectionImpl.class,
						documentSection.getPrimaryKey()) == null) {
				cacheResult(documentSection);
			}
			else {
				documentSection.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document sections.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentSectionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentSectionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document section.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentSection documentSection) {
		EntityCacheUtil.removeResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionImpl.class, documentSection.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DocumentSection> documentSections) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentSection documentSection : documentSections) {
			EntityCacheUtil.removeResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
				DocumentSectionImpl.class, documentSection.getPrimaryKey());
		}
	}

	/**
	 * Creates a new document section with the primary key. Does not add the document section to the database.
	 *
	 * @param id the primary key for the new document section
	 * @return the new document section
	 */
	@Override
	public DocumentSection create(long id) {
		DocumentSection documentSection = new DocumentSectionImpl();

		documentSection.setNew(true);
		documentSection.setPrimaryKey(id);

		return documentSection;
	}

	/**
	 * Removes the document section with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document section
	 * @return the document section that was removed
	 * @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection remove(long id)
		throws NoSuchDocumentSectionException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the document section with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document section
	 * @return the document section that was removed
	 * @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection remove(Serializable primaryKey)
		throws NoSuchDocumentSectionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocumentSection documentSection = (DocumentSection)session.get(DocumentSectionImpl.class,
					primaryKey);

			if (documentSection == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentSectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentSection);
		}
		catch (NoSuchDocumentSectionException nsee) {
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
	protected DocumentSection removeImpl(DocumentSection documentSection)
		throws SystemException {
		documentSection = toUnwrappedModel(documentSection);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentSection)) {
				documentSection = (DocumentSection)session.get(DocumentSectionImpl.class,
						documentSection.getPrimaryKeyObj());
			}

			if (documentSection != null) {
				session.delete(documentSection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (documentSection != null) {
			clearCache(documentSection);
		}

		return documentSection;
	}

	@Override
	public DocumentSection updateImpl(
		com.nyu.model.DocumentSection documentSection)
		throws SystemException {
		documentSection = toUnwrappedModel(documentSection);

		boolean isNew = documentSection.isNew();

		DocumentSectionModelImpl documentSectionModelImpl = (DocumentSectionModelImpl)documentSection;

		Session session = null;

		try {
			session = openSession();

			if (documentSection.isNew()) {
				session.save(documentSection);

				documentSection.setNew(false);
			}
			else {
				session.merge(documentSection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocumentSectionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((documentSectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentSectionModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTSECTIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST,
					args);

				args = new Object[] { documentSectionModelImpl.getLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTSECTIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTSECTIONLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
			DocumentSectionImpl.class, documentSection.getPrimaryKey(),
			documentSection);

		return documentSection;
	}

	protected DocumentSection toUnwrappedModel(DocumentSection documentSection) {
		if (documentSection instanceof DocumentSectionImpl) {
			return documentSection;
		}

		DocumentSectionImpl documentSectionImpl = new DocumentSectionImpl();

		documentSectionImpl.setNew(documentSection.isNew());
		documentSectionImpl.setPrimaryKey(documentSection.getPrimaryKey());

		documentSectionImpl.setId(documentSection.getId());
		documentSectionImpl.setLessonId(documentSection.getLessonId());
		documentSectionImpl.setDocumentId(documentSection.getDocumentId());
		documentSectionImpl.setModifiedDate(documentSection.getModifiedDate());
		documentSectionImpl.setSectionTitle(documentSection.getSectionTitle());
		documentSectionImpl.setSectionNote(documentSection.getSectionNote());
		documentSectionImpl.setLessonObjectiveIds(documentSection.getLessonObjectiveIds());
		documentSectionImpl.setOrder(documentSection.getOrder());

		return documentSectionImpl;
	}

	/**
	 * Returns the document section with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document section
	 * @return the document section
	 * @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentSectionException, SystemException {
		DocumentSection documentSection = fetchByPrimaryKey(primaryKey);

		if (documentSection == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentSectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return documentSection;
	}

	/**
	 * Returns the document section with the primary key or throws a {@link com.nyu.NoSuchDocumentSectionException} if it could not be found.
	 *
	 * @param id the primary key of the document section
	 * @return the document section
	 * @throws com.nyu.NoSuchDocumentSectionException if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection findByPrimaryKey(long id)
		throws NoSuchDocumentSectionException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the document section with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document section
	 * @return the document section, or <code>null</code> if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocumentSection documentSection = (DocumentSection)EntityCacheUtil.getResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
				DocumentSectionImpl.class, primaryKey);

		if (documentSection == _nullDocumentSection) {
			return null;
		}

		if (documentSection == null) {
			Session session = null;

			try {
				session = openSession();

				documentSection = (DocumentSection)session.get(DocumentSectionImpl.class,
						primaryKey);

				if (documentSection != null) {
					cacheResult(documentSection);
				}
				else {
					EntityCacheUtil.putResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
						DocumentSectionImpl.class, primaryKey,
						_nullDocumentSection);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocumentSectionModelImpl.ENTITY_CACHE_ENABLED,
					DocumentSectionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return documentSection;
	}

	/**
	 * Returns the document section with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document section
	 * @return the document section, or <code>null</code> if a document section with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentSection fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the document sections.
	 *
	 * @return the document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document sections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document sections
	 * @param end the upper bound of the range of document sections (not inclusive)
	 * @return the range of document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document sections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentSectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document sections
	 * @param end the upper bound of the range of document sections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document sections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentSection> findAll(int start, int end,
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

		List<DocumentSection> list = (List<DocumentSection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENTSECTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTSECTION;

				if (pagination) {
					sql = sql.concat(DocumentSectionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocumentSection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentSection>(list);
				}
				else {
					list = (List<DocumentSection>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the document sections from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocumentSection documentSection : findAll()) {
			remove(documentSection);
		}
	}

	/**
	 * Returns the number of document sections.
	 *
	 * @return the number of document sections
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

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTSECTION);

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
	 * Initializes the document section persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.DocumentSection")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocumentSection>> listenersList = new ArrayList<ModelListener<DocumentSection>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocumentSection>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocumentSectionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCUMENTSECTION = "SELECT documentSection FROM DocumentSection documentSection";
	private static final String _SQL_SELECT_DOCUMENTSECTION_WHERE = "SELECT documentSection FROM DocumentSection documentSection WHERE ";
	private static final String _SQL_COUNT_DOCUMENTSECTION = "SELECT COUNT(documentSection) FROM DocumentSection documentSection";
	private static final String _SQL_COUNT_DOCUMENTSECTION_WHERE = "SELECT COUNT(documentSection) FROM DocumentSection documentSection WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentSection.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentSection exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocumentSection exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentSectionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "order"
			});
	private static DocumentSection _nullDocumentSection = new DocumentSectionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocumentSection> toCacheModel() {
				return _nullDocumentSectionCacheModel;
			}
		};

	private static CacheModel<DocumentSection> _nullDocumentSectionCacheModel = new CacheModel<DocumentSection>() {
			@Override
			public DocumentSection toEntityModel() {
				return _nullDocumentSection;
			}
		};
}