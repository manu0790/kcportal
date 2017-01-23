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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.nyu.NoSuchDocumentFileException;

import com.nyu.model.DocumentFile;
import com.nyu.model.impl.DocumentFileImpl;
import com.nyu.model.impl.DocumentFileModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the document file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFilePersistence
 * @see DocumentFileUtil
 * @generated
 */
public class DocumentFilePersistenceImpl extends BasePersistenceImpl<DocumentFile>
	implements DocumentFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentFileUtil} to access the document file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONIDCOLLECTION =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylessonIdCollection",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDCOLLECTION =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonIdCollection", new String[] { Long.class.getName() },
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONIDCOLLECTION = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonIdCollection", new String[] { Long.class.getName() });

	/**
	 * Returns all the document files where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdCollection(long lessonId)
		throws SystemException {
		return findBylessonIdCollection(lessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdCollection(long lessonId,
		int start, int end) throws SystemException {
		return findBylessonIdCollection(lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document files where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdCollection(long lessonId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDCOLLECTION;
			finderArgs = new Object[] { lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONIDCOLLECTION;
			finderArgs = new Object[] { lessonId, start, end, orderByComparator };
		}

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if ((lessonId != documentFile.getLessonId())) {
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

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_LESSONIDCOLLECTION_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBylessonIdCollection_First(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBylessonIdCollection_First(lessonId,
				orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBylessonIdCollection_First(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentFile> list = findBylessonIdCollection(lessonId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBylessonIdCollection_Last(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBylessonIdCollection_Last(lessonId,
				orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBylessonIdCollection_Last(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBylessonIdCollection(lessonId);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBylessonIdCollection(lessonId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where lessonId = &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBylessonIdCollection_PrevAndNext(
		long documentId, long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBylessonIdCollection_PrevAndNext(session,
					documentFile, lessonId, orderByComparator, true);

			array[1] = documentFile;

			array[2] = getBylessonIdCollection_PrevAndNext(session,
					documentFile, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBylessonIdCollection_PrevAndNext(
		Session session, DocumentFile documentFile, long lessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_LESSONIDCOLLECTION_LESSONID_2);

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where lessonId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonIdCollection(long lessonId)
		throws SystemException {
		for (DocumentFile documentFile : findBylessonIdCollection(lessonId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonIdCollection(long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONIDCOLLECTION;

		Object[] finderArgs = new Object[] { lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_LESSONIDCOLLECTION_LESSONID_2);

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

	private static final String _FINDER_COLUMN_LESSONIDCOLLECTION_LESSONID_2 = "documentFile.lessonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylessonIdWithCompanyId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylessonIdWithCompanyId",
			new String[] { Long.class.getName(), Long.class.getName() },
			DocumentFileModelImpl.COMPANYID_COLUMN_BITMASK |
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LESSONIDWITHCOMPANYID = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylessonIdWithCompanyId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the document files where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdWithCompanyId(long companyId,
		long lessonId) throws SystemException {
		return findBylessonIdWithCompanyId(companyId, lessonId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where companyId = &#63; and lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdWithCompanyId(long companyId,
		long lessonId, int start, int end) throws SystemException {
		return findBylessonIdWithCompanyId(companyId, lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document files where companyId = &#63; and lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBylessonIdWithCompanyId(long companyId,
		long lessonId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID;
			finderArgs = new Object[] { companyId, lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID;
			finderArgs = new Object[] {
					companyId, lessonId,
					
					start, end, orderByComparator
				};
		}

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if ((companyId != documentFile.getCompanyId()) ||
						(lessonId != documentFile.getLessonId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_COMPANYID_2);

			query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBylessonIdWithCompanyId_First(long companyId,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBylessonIdWithCompanyId_First(companyId,
				lessonId, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBylessonIdWithCompanyId_First(long companyId,
		long lessonId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentFile> list = findBylessonIdWithCompanyId(companyId,
				lessonId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBylessonIdWithCompanyId_Last(long companyId,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBylessonIdWithCompanyId_Last(companyId,
				lessonId, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBylessonIdWithCompanyId_Last(long companyId,
		long lessonId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylessonIdWithCompanyId(companyId, lessonId);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBylessonIdWithCompanyId(companyId,
				lessonId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBylessonIdWithCompanyId_PrevAndNext(
		long documentId, long companyId, long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBylessonIdWithCompanyId_PrevAndNext(session,
					documentFile, companyId, lessonId, orderByComparator, true);

			array[1] = documentFile;

			array[2] = getBylessonIdWithCompanyId_PrevAndNext(session,
					documentFile, companyId, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBylessonIdWithCompanyId_PrevAndNext(
		Session session, DocumentFile documentFile, long companyId,
		long lessonId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_COMPANYID_2);

		query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_LESSONID_2);

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where companyId = &#63; and lessonId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylessonIdWithCompanyId(long companyId, long lessonId)
		throws SystemException {
		for (DocumentFile documentFile : findBylessonIdWithCompanyId(
				companyId, lessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where companyId = &#63; and lessonId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param lessonId the lesson ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylessonIdWithCompanyId(long companyId, long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LESSONIDWITHCOMPANYID;

		Object[] finderArgs = new Object[] { companyId, lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_COMPANYID_2);

			query.append(_FINDER_COLUMN_LESSONIDWITHCOMPANYID_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_LESSONIDWITHCOMPANYID_COMPANYID_2 =
		"documentFile.companyId = ? AND ";
	private static final String _FINDER_COLUMN_LESSONIDWITHCOMPANYID_LESSONID_2 = "documentFile.lessonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentFilesListByStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentFilesListByStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK |
			DocumentFileModelImpl.RESOURCETYPE_COLUMN_BITMASK |
			DocumentFileModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYSTATUS =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentFilesListByStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByStatus(long lessonId,
		String resourceType, String status) throws SystemException {
		return findBydocumentFilesListByStatus(lessonId, resourceType, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByStatus(long lessonId,
		String resourceType, String status, int start, int end)
		throws SystemException {
		return findBydocumentFilesListByStatus(lessonId, resourceType, status,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByStatus(long lessonId,
		String resourceType, String status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS;
			finderArgs = new Object[] { lessonId, resourceType, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS;
			finderArgs = new Object[] {
					lessonId, resourceType, status,
					
					start, end, orderByComparator
				};
		}

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if ((lessonId != documentFile.getLessonId()) ||
						!Validator.equals(resourceType,
							documentFile.getResourceType()) ||
						!Validator.equals(status, documentFile.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_LESSONID_2);

			boolean bindResourceType = false;

			if (resourceType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_1);
			}
			else if (resourceType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_3);
			}
			else {
				bindResourceType = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindResourceType) {
					qPos.add(resourceType);
				}

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByStatus_First(long lessonId,
		String resourceType, String status, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByStatus_First(lessonId,
				resourceType, status, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", resourceType=");
		msg.append(resourceType);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByStatus_First(long lessonId,
		String resourceType, String status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentFile> list = findBydocumentFilesListByStatus(lessonId,
				resourceType, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByStatus_Last(long lessonId,
		String resourceType, String status, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByStatus_Last(lessonId,
				resourceType, status, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", resourceType=");
		msg.append(resourceType);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByStatus_Last(long lessonId,
		String resourceType, String status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentFilesListByStatus(lessonId, resourceType,
				status);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBydocumentFilesListByStatus(lessonId,
				resourceType, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBydocumentFilesListByStatus_PrevAndNext(
		long documentId, long lessonId, String resourceType, String status,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBydocumentFilesListByStatus_PrevAndNext(session,
					documentFile, lessonId, resourceType, status,
					orderByComparator, true);

			array[1] = documentFile;

			array[2] = getBydocumentFilesListByStatus_PrevAndNext(session,
					documentFile, lessonId, resourceType, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBydocumentFilesListByStatus_PrevAndNext(
		Session session, DocumentFile documentFile, long lessonId,
		String resourceType, String status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_LESSONID_2);

		boolean bindResourceType = false;

		if (resourceType == null) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_1);
		}
		else if (resourceType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_3);
		}
		else {
			bindResourceType = true;

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_2);
		}

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_2);
		}

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (bindResourceType) {
			qPos.add(resourceType);
		}

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where lessonId = &#63; and resourceType = &#63; and status = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentFilesListByStatus(long lessonId,
		String resourceType, String status) throws SystemException {
		for (DocumentFile documentFile : findBydocumentFilesListByStatus(
				lessonId, resourceType, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where lessonId = &#63; and resourceType = &#63; and status = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param status the status
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFilesListByStatus(long lessonId,
		String resourceType, String status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYSTATUS;

		Object[] finderArgs = new Object[] { lessonId, resourceType, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_LESSONID_2);

			boolean bindResourceType = false;

			if (resourceType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_1);
			}
			else if (resourceType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_3);
			}
			else {
				bindResourceType = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_2);
			}

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindResourceType) {
					qPos.add(resourceType);
				}

				if (bindStatus) {
					qPos.add(status);
				}

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

	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_LESSONID_2 =
		"documentFile.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_1 =
		"documentFile.resourceType IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_2 =
		"documentFile.resourceType = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_RESOURCETYPE_3 =
		"(documentFile.resourceType IS NULL OR documentFile.resourceType = '') AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_1 =
		"documentFile.status IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_2 =
		"documentFile.status = ?";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYSTATUS_STATUS_3 =
		"(documentFile.status IS NULL OR documentFile.status = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentFilesListByType",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentFilesListByType",
			new String[] { Long.class.getName(), String.class.getName() },
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK |
			DocumentFileModelImpl.RESOURCETYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYTYPE = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentFilesListByType",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the document files where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByType(long lessonId,
		String resourceType) throws SystemException {
		return findBydocumentFilesListByType(lessonId, resourceType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where lessonId = &#63; and resourceType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByType(long lessonId,
		String resourceType, int start, int end) throws SystemException {
		return findBydocumentFilesListByType(lessonId, resourceType, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the document files where lessonId = &#63; and resourceType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByType(long lessonId,
		String resourceType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE;
			finderArgs = new Object[] { lessonId, resourceType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE;
			finderArgs = new Object[] {
					lessonId, resourceType,
					
					start, end, orderByComparator
				};
		}

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if ((lessonId != documentFile.getLessonId()) ||
						!Validator.equals(resourceType,
							documentFile.getResourceType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_LESSONID_2);

			boolean bindResourceType = false;

			if (resourceType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_1);
			}
			else if (resourceType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_3);
			}
			else {
				bindResourceType = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindResourceType) {
					qPos.add(resourceType);
				}

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByType_First(long lessonId,
		String resourceType, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByType_First(lessonId,
				resourceType, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", resourceType=");
		msg.append(resourceType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByType_First(long lessonId,
		String resourceType, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentFile> list = findBydocumentFilesListByType(lessonId,
				resourceType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByType_Last(long lessonId,
		String resourceType, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByType_Last(lessonId,
				resourceType, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(", resourceType=");
		msg.append(resourceType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByType_Last(long lessonId,
		String resourceType, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentFilesListByType(lessonId, resourceType);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBydocumentFilesListByType(lessonId,
				resourceType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBydocumentFilesListByType_PrevAndNext(
		long documentId, long lessonId, String resourceType,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBydocumentFilesListByType_PrevAndNext(session,
					documentFile, lessonId, resourceType, orderByComparator,
					true);

			array[1] = documentFile;

			array[2] = getBydocumentFilesListByType_PrevAndNext(session,
					documentFile, lessonId, resourceType, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBydocumentFilesListByType_PrevAndNext(
		Session session, DocumentFile documentFile, long lessonId,
		String resourceType, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_LESSONID_2);

		boolean bindResourceType = false;

		if (resourceType == null) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_1);
		}
		else if (resourceType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_3);
		}
		else {
			bindResourceType = true;

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_2);
		}

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (bindResourceType) {
			qPos.add(resourceType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where lessonId = &#63; and resourceType = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentFilesListByType(long lessonId,
		String resourceType) throws SystemException {
		for (DocumentFile documentFile : findBydocumentFilesListByType(
				lessonId, resourceType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where lessonId = &#63; and resourceType = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param resourceType the resource type
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFilesListByType(long lessonId, String resourceType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYTYPE;

		Object[] finderArgs = new Object[] { lessonId, resourceType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_LESSONID_2);

			boolean bindResourceType = false;

			if (resourceType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_1);
			}
			else if (resourceType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_3);
			}
			else {
				bindResourceType = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (bindResourceType) {
					qPos.add(resourceType);
				}

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

	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_LESSONID_2 =
		"documentFile.lessonId = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_1 =
		"documentFile.resourceType IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_2 =
		"documentFile.resourceType = ?";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYTYPE_RESOURCETYPE_3 =
		"(documentFile.resourceType IS NULL OR documentFile.resourceType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLIST =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydocumentFilesList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLIST =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentFilesList", new String[] { Long.class.getName() },
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILESLIST = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentFilesList", new String[] { Long.class.getName() });

	/**
	 * Returns all the document files where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesList(long lessonId)
		throws SystemException {
		return findBydocumentFilesList(lessonId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesList(long lessonId, int start,
		int end) throws SystemException {
		return findBydocumentFilesList(lessonId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document files where lessonId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesList(long lessonId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLIST;
			finderArgs = new Object[] { lessonId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLIST;
			finderArgs = new Object[] { lessonId, start, end, orderByComparator };
		}

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if ((lessonId != documentFile.getLessonId())) {
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

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLIST_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesList_First(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesList_First(lessonId,
				orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesList_First(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentFile> list = findBydocumentFilesList(lessonId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesList_Last(long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesList_Last(lessonId,
				orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesList_Last(long lessonId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentFilesList(lessonId);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBydocumentFilesList(lessonId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where lessonId = &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBydocumentFilesList_PrevAndNext(long documentId,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBydocumentFilesList_PrevAndNext(session,
					documentFile, lessonId, orderByComparator, true);

			array[1] = documentFile;

			array[2] = getBydocumentFilesList_PrevAndNext(session,
					documentFile, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBydocumentFilesList_PrevAndNext(Session session,
		DocumentFile documentFile, long lessonId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTFILESLIST_LESSONID_2);

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where lessonId = &#63; from the database.
	 *
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentFilesList(long lessonId)
		throws SystemException {
		for (DocumentFile documentFile : findBydocumentFilesList(lessonId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where lessonId = &#63;.
	 *
	 * @param lessonId the lesson ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFilesList(long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILESLIST;

		Object[] finderArgs = new Object[] { lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILESLIST_LESSONID_2);

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

	private static final String _FINDER_COLUMN_DOCUMENTFILESLIST_LESSONID_2 = "documentFile.lessonId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYDOCUUID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentFilesListByDocUuid",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOCUMENTFILESLISTBYDOCUUID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countBydocumentFilesListByDocUuid",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @return the matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByDocUuid(String docUuid,
		long lessonId) throws SystemException {
		return findBydocumentFilesListByDocUuid(docUuid, lessonId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByDocUuid(String docUuid,
		long lessonId, int start, int end) throws SystemException {
		return findBydocumentFilesListByDocUuid(docUuid, lessonId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the document files where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findBydocumentFilesListByDocUuid(String docUuid,
		long lessonId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYDOCUUID;
		finderArgs = new Object[] {
				docUuid, lessonId,
				
				start, end, orderByComparator
			};

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentFile documentFile : list) {
				if (!Validator.equals(docUuid, documentFile.getDocUuid()) ||
						(lessonId == documentFile.getLessonId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_2);
			}

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_LESSONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

				qPos.add(lessonId);

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByDocUuid_First(String docUuid,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByDocUuid_First(docUuid,
				lessonId, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docUuid=");
		msg.append(docUuid);

		msg.append(", lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the first document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByDocUuid_First(
		String docUuid, long lessonId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentFile> list = findBydocumentFilesListByDocUuid(docUuid,
				lessonId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFilesListByDocUuid_Last(String docUuid,
		long lessonId, OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFilesListByDocUuid_Last(docUuid,
				lessonId, orderByComparator);

		if (documentFile != null) {
			return documentFile;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("docUuid=");
		msg.append(docUuid);

		msg.append(", lessonId=");
		msg.append(lessonId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentFileException(msg.toString());
	}

	/**
	 * Returns the last document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFilesListByDocUuid_Last(String docUuid,
		long lessonId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentFilesListByDocUuid(docUuid, lessonId);

		if (count == 0) {
			return null;
		}

		List<DocumentFile> list = findBydocumentFilesListByDocUuid(docUuid,
				lessonId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document files before and after the current document file in the ordered set where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param documentId the primary key of the current document file
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile[] findBydocumentFilesListByDocUuid_PrevAndNext(
		long documentId, String docUuid, long lessonId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			DocumentFile[] array = new DocumentFileImpl[3];

			array[0] = getBydocumentFilesListByDocUuid_PrevAndNext(session,
					documentFile, docUuid, lessonId, orderByComparator, true);

			array[1] = documentFile;

			array[2] = getBydocumentFilesListByDocUuid_PrevAndNext(session,
					documentFile, docUuid, lessonId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentFile getBydocumentFilesListByDocUuid_PrevAndNext(
		Session session, DocumentFile documentFile, String docUuid,
		long lessonId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

		boolean bindDocUuid = false;

		if (docUuid == null) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_1);
		}
		else if (docUuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_3);
		}
		else {
			bindDocUuid = true;

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_2);
		}

		query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_LESSONID_2);

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
			query.append(DocumentFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocUuid) {
			qPos.add(docUuid);
		}

		qPos.add(lessonId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document files where docUuid = &#63; and lessonId &ne; &#63; from the database.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentFilesListByDocUuid(String docUuid, long lessonId)
		throws SystemException {
		for (DocumentFile documentFile : findBydocumentFilesListByDocUuid(
				docUuid, lessonId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files where docUuid = &#63; and lessonId &ne; &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param lessonId the lesson ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFilesListByDocUuid(String docUuid, long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_DOCUMENTFILESLISTBYDOCUUID;

		Object[] finderArgs = new Object[] { docUuid, lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_2);
			}

			query.append(_FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

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

	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_1 =
		"documentFile.docUuid IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_2 =
		"documentFile.docUuid = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_DOCUUID_3 =
		"(documentFile.docUuid IS NULL OR documentFile.docUuid = '') AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILESLISTBYDOCUUID_LESSONID_2 =
		"documentFile.lessonId != ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTFILE = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBydocumentFile",
			new String[] { Long.class.getName(), Long.class.getName() },
			DocumentFileModelImpl.RESOURCEID_COLUMN_BITMASK |
			DocumentFileModelImpl.LESSONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILE = new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydocumentFile",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the document file where resourceId = &#63; and lessonId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	 *
	 * @param resourceId the resource ID
	 * @param lessonId the lesson ID
	 * @return the matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFile(long resourceId, long lessonId)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFile(resourceId, lessonId);

		if (documentFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("resourceId=");
			msg.append(resourceId);

			msg.append(", lessonId=");
			msg.append(lessonId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentFileException(msg.toString());
		}

		return documentFile;
	}

	/**
	 * Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param resourceId the resource ID
	 * @param lessonId the lesson ID
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFile(long resourceId, long lessonId)
		throws SystemException {
		return fetchBydocumentFile(resourceId, lessonId, true);
	}

	/**
	 * Returns the document file where resourceId = &#63; and lessonId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param resourceId the resource ID
	 * @param lessonId the lesson ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFile(long resourceId, long lessonId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { resourceId, lessonId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
					finderArgs, this);
		}

		if (result instanceof DocumentFile) {
			DocumentFile documentFile = (DocumentFile)result;

			if ((resourceId != documentFile.getResourceId()) ||
					(lessonId != documentFile.getLessonId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILE_RESOURCEID_2);

			query.append(_FINDER_COLUMN_DOCUMENTFILE_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceId);

				qPos.add(lessonId);

				List<DocumentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocumentFilePersistenceImpl.fetchBydocumentFile(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocumentFile documentFile = list.get(0);

					result = documentFile;

					cacheResult(documentFile);

					if ((documentFile.getResourceId() != resourceId) ||
							(documentFile.getLessonId() != lessonId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
							finderArgs, documentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
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
			return (DocumentFile)result;
		}
	}

	/**
	 * Removes the document file where resourceId = &#63; and lessonId = &#63; from the database.
	 *
	 * @param resourceId the resource ID
	 * @param lessonId the lesson ID
	 * @return the document file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile removeBydocumentFile(long resourceId, long lessonId)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findBydocumentFile(resourceId, lessonId);

		return remove(documentFile);
	}

	/**
	 * Returns the number of document files where resourceId = &#63; and lessonId = &#63;.
	 *
	 * @param resourceId the resource ID
	 * @param lessonId the lesson ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFile(long resourceId, long lessonId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILE;

		Object[] finderArgs = new Object[] { resourceId, lessonId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTFILE_RESOURCEID_2);

			query.append(_FINDER_COLUMN_DOCUMENTFILE_LESSONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceId);

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

	private static final String _FINDER_COLUMN_DOCUMENTFILE_RESOURCEID_2 = "documentFile.resourceId = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILE_LESSONID_2 = "documentFile.lessonId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBydocumentFileListByOnlyDocUuid",
			new String[] { String.class.getName() },
			DocumentFileModelImpl.DOCUUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentFileListByOnlyDocUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns the document file where docUuid = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	 *
	 * @param docUuid the doc uuid
	 * @return the matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFileListByOnlyDocUuid(String docUuid)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFileListByOnlyDocUuid(docUuid);

		if (documentFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docUuid=");
			msg.append(docUuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentFileException(msg.toString());
		}

		return documentFile;
	}

	/**
	 * Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param docUuid the doc uuid
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFileListByOnlyDocUuid(String docUuid)
		throws SystemException {
		return fetchBydocumentFileListByOnlyDocUuid(docUuid, true);
	}

	/**
	 * Returns the document file where docUuid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param docUuid the doc uuid
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFileListByOnlyDocUuid(String docUuid,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { docUuid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
					finderArgs, this);
		}

		if (result instanceof DocumentFile) {
			DocumentFile documentFile = (DocumentFile)result;

			if (!Validator.equals(docUuid, documentFile.getDocUuid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

				List<DocumentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocumentFilePersistenceImpl.fetchBydocumentFileListByOnlyDocUuid(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocumentFile documentFile = list.get(0);

					result = documentFile;

					cacheResult(documentFile);

					if ((documentFile.getDocUuid() == null) ||
							!documentFile.getDocUuid().equals(docUuid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
							finderArgs, documentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
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
			return (DocumentFile)result;
		}
	}

	/**
	 * Removes the document file where docUuid = &#63; from the database.
	 *
	 * @param docUuid the doc uuid
	 * @return the document file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile removeBydocumentFileListByOnlyDocUuid(String docUuid)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findBydocumentFileListByOnlyDocUuid(docUuid);

		return remove(documentFile);
	}

	/**
	 * Returns the number of document files where docUuid = &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFileListByOnlyDocUuid(String docUuid)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID;

		Object[] finderArgs = new Object[] { docUuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

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

	private static final String _FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_1 =
		"documentFile.docUuid IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_2 =
		"documentFile.docUuid = ?";
	private static final String _FINDER_COLUMN_DOCUMENTFILELISTBYONLYDOCUUID_DOCUUID_3 =
		"(documentFile.docUuid IS NULL OR documentFile.docUuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, DocumentFileImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBydocumentFileByUuidAndResourceId",
			new String[] { String.class.getName(), Long.class.getName() },
			DocumentFileModelImpl.DOCUUID_COLUMN_BITMASK |
			DocumentFileModelImpl.RESOURCEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID =
		new FinderPath(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentFileByUuidAndResourceId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the document file where docUuid = &#63; and resourceId = &#63; or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	 *
	 * @param docUuid the doc uuid
	 * @param resourceId the resource ID
	 * @return the matching document file
	 * @throws com.nyu.NoSuchDocumentFileException if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findBydocumentFileByUuidAndResourceId(String docUuid,
		long resourceId) throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchBydocumentFileByUuidAndResourceId(docUuid,
				resourceId);

		if (documentFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docUuid=");
			msg.append(docUuid);

			msg.append(", resourceId=");
			msg.append(resourceId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentFileException(msg.toString());
		}

		return documentFile;
	}

	/**
	 * Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param docUuid the doc uuid
	 * @param resourceId the resource ID
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFileByUuidAndResourceId(String docUuid,
		long resourceId) throws SystemException {
		return fetchBydocumentFileByUuidAndResourceId(docUuid, resourceId, true);
	}

	/**
	 * Returns the document file where docUuid = &#63; and resourceId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param docUuid the doc uuid
	 * @param resourceId the resource ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document file, or <code>null</code> if a matching document file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchBydocumentFileByUuidAndResourceId(String docUuid,
		long resourceId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { docUuid, resourceId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
					finderArgs, this);
		}

		if (result instanceof DocumentFile) {
			DocumentFile documentFile = (DocumentFile)result;

			if (!Validator.equals(docUuid, documentFile.getDocUuid()) ||
					(resourceId != documentFile.getResourceId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_2);
			}

			query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_RESOURCEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

				qPos.add(resourceId);

				List<DocumentFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocumentFilePersistenceImpl.fetchBydocumentFileByUuidAndResourceId(String, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocumentFile documentFile = list.get(0);

					result = documentFile;

					cacheResult(documentFile);

					if ((documentFile.getDocUuid() == null) ||
							!documentFile.getDocUuid().equals(docUuid) ||
							(documentFile.getResourceId() != resourceId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
							finderArgs, documentFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
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
			return (DocumentFile)result;
		}
	}

	/**
	 * Removes the document file where docUuid = &#63; and resourceId = &#63; from the database.
	 *
	 * @param docUuid the doc uuid
	 * @param resourceId the resource ID
	 * @return the document file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile removeBydocumentFileByUuidAndResourceId(
		String docUuid, long resourceId)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = findBydocumentFileByUuidAndResourceId(docUuid,
				resourceId);

		return remove(documentFile);
	}

	/**
	 * Returns the number of document files where docUuid = &#63; and resourceId = &#63;.
	 *
	 * @param docUuid the doc uuid
	 * @param resourceId the resource ID
	 * @return the number of matching document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentFileByUuidAndResourceId(String docUuid,
		long resourceId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID;

		Object[] finderArgs = new Object[] { docUuid, resourceId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTFILE_WHERE);

			boolean bindDocUuid = false;

			if (docUuid == null) {
				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_1);
			}
			else if (docUuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_3);
			}
			else {
				bindDocUuid = true;

				query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_2);
			}

			query.append(_FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_RESOURCEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocUuid) {
					qPos.add(docUuid);
				}

				qPos.add(resourceId);

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

	private static final String _FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_1 =
		"documentFile.docUuid IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_2 =
		"documentFile.docUuid = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_DOCUUID_3 =
		"(documentFile.docUuid IS NULL OR documentFile.docUuid = '') AND ";
	private static final String _FINDER_COLUMN_DOCUMENTFILEBYUUIDANDRESOURCEID_RESOURCEID_2 =
		"documentFile.resourceId = ?";

	public DocumentFilePersistenceImpl() {
		setModelClass(DocumentFile.class);
	}

	/**
	 * Caches the document file in the entity cache if it is enabled.
	 *
	 * @param documentFile the document file
	 */
	@Override
	public void cacheResult(DocumentFile documentFile) {
		EntityCacheUtil.putResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileImpl.class, documentFile.getPrimaryKey(), documentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
			new Object[] {
				documentFile.getResourceId(), documentFile.getLessonId()
			}, documentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
			new Object[] { documentFile.getDocUuid() }, documentFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
			new Object[] { documentFile.getDocUuid(), documentFile.getResourceId() },
			documentFile);

		documentFile.resetOriginalValues();
	}

	/**
	 * Caches the document files in the entity cache if it is enabled.
	 *
	 * @param documentFiles the document files
	 */
	@Override
	public void cacheResult(List<DocumentFile> documentFiles) {
		for (DocumentFile documentFile : documentFiles) {
			if (EntityCacheUtil.getResult(
						DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
						DocumentFileImpl.class, documentFile.getPrimaryKey()) == null) {
				cacheResult(documentFile);
			}
			else {
				documentFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document files.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentFileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentFileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document file.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentFile documentFile) {
		EntityCacheUtil.removeResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileImpl.class, documentFile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(documentFile);
	}

	@Override
	public void clearCache(List<DocumentFile> documentFiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentFile documentFile : documentFiles) {
			EntityCacheUtil.removeResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
				DocumentFileImpl.class, documentFile.getPrimaryKey());

			clearUniqueFindersCache(documentFile);
		}
	}

	protected void cacheUniqueFindersCache(DocumentFile documentFile) {
		if (documentFile.isNew()) {
			Object[] args = new Object[] {
					documentFile.getResourceId(), documentFile.getLessonId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE, args,
				documentFile);

			args = new Object[] { documentFile.getDocUuid() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
				args, documentFile);

			args = new Object[] {
					documentFile.getDocUuid(), documentFile.getResourceId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
				args, documentFile);
		}
		else {
			DocumentFileModelImpl documentFileModelImpl = (DocumentFileModelImpl)documentFile;

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTFILE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFile.getResourceId(), documentFile.getLessonId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE,
					args, documentFile);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { documentFile.getDocUuid() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
					args, documentFile);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFile.getDocUuid(), documentFile.getResourceId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
					args, documentFile);
			}
		}
	}

	protected void clearUniqueFindersCache(DocumentFile documentFile) {
		DocumentFileModelImpl documentFileModelImpl = (DocumentFileModelImpl)documentFile;

		Object[] args = new Object[] {
				documentFile.getResourceId(), documentFile.getLessonId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE, args);

		if ((documentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOCUMENTFILE.getColumnBitmask()) != 0) {
			args = new Object[] {
					documentFileModelImpl.getOriginalResourceId(),
					documentFileModelImpl.getOriginalLessonId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILE, args);
		}

		args = new Object[] { documentFile.getDocUuid() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
			args);

		if ((documentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID.getColumnBitmask()) != 0) {
			args = new Object[] { documentFileModelImpl.getOriginalDocUuid() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILELISTBYONLYDOCUUID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILELISTBYONLYDOCUUID,
				args);
		}

		args = new Object[] {
				documentFile.getDocUuid(), documentFile.getResourceId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
			args);

		if ((documentFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					documentFileModelImpl.getOriginalDocUuid(),
					documentFileModelImpl.getOriginalResourceId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DOCUMENTFILEBYUUIDANDRESOURCEID,
				args);
		}
	}

	/**
	 * Creates a new document file with the primary key. Does not add the document file to the database.
	 *
	 * @param documentId the primary key for the new document file
	 * @return the new document file
	 */
	@Override
	public DocumentFile create(long documentId) {
		DocumentFile documentFile = new DocumentFileImpl();

		documentFile.setNew(true);
		documentFile.setPrimaryKey(documentId);

		return documentFile;
	}

	/**
	 * Removes the document file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentId the primary key of the document file
	 * @return the document file that was removed
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile remove(long documentId)
		throws NoSuchDocumentFileException, SystemException {
		return remove((Serializable)documentId);
	}

	/**
	 * Removes the document file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document file
	 * @return the document file that was removed
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile remove(Serializable primaryKey)
		throws NoSuchDocumentFileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocumentFile documentFile = (DocumentFile)session.get(DocumentFileImpl.class,
					primaryKey);

			if (documentFile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentFile);
		}
		catch (NoSuchDocumentFileException nsee) {
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
	protected DocumentFile removeImpl(DocumentFile documentFile)
		throws SystemException {
		documentFile = toUnwrappedModel(documentFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentFile)) {
				documentFile = (DocumentFile)session.get(DocumentFileImpl.class,
						documentFile.getPrimaryKeyObj());
			}

			if (documentFile != null) {
				session.delete(documentFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (documentFile != null) {
			clearCache(documentFile);
		}

		return documentFile;
	}

	@Override
	public DocumentFile updateImpl(com.nyu.model.DocumentFile documentFile)
		throws SystemException {
		documentFile = toUnwrappedModel(documentFile);

		boolean isNew = documentFile.isNew();

		DocumentFileModelImpl documentFileModelImpl = (DocumentFileModelImpl)documentFile;

		Session session = null;

		try {
			session = openSession();

			if (documentFile.isNew()) {
				session.save(documentFile);

				documentFile.setNew(false);
			}
			else {
				session.merge(documentFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocumentFileModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDCOLLECTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFileModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONIDCOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDCOLLECTION,
					args);

				args = new Object[] { documentFileModelImpl.getLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONIDCOLLECTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDCOLLECTION,
					args);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFileModelImpl.getOriginalCompanyId(),
						documentFileModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONIDWITHCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID,
					args);

				args = new Object[] {
						documentFileModelImpl.getCompanyId(),
						documentFileModelImpl.getLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LESSONIDWITHCOMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LESSONIDWITHCOMPANYID,
					args);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFileModelImpl.getOriginalLessonId(),
						documentFileModelImpl.getOriginalResourceType(),
						documentFileModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS,
					args);

				args = new Object[] {
						documentFileModelImpl.getLessonId(),
						documentFileModelImpl.getResourceType(),
						documentFileModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYSTATUS,
					args);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFileModelImpl.getOriginalLessonId(),
						documentFileModelImpl.getOriginalResourceType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE,
					args);

				args = new Object[] {
						documentFileModelImpl.getLessonId(),
						documentFileModelImpl.getResourceType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLISTBYTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLISTBYTYPE,
					args);
			}

			if ((documentFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentFileModelImpl.getOriginalLessonId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLIST,
					args);

				args = new Object[] { documentFileModelImpl.getLessonId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTFILESLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTFILESLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
			DocumentFileImpl.class, documentFile.getPrimaryKey(), documentFile);

		clearUniqueFindersCache(documentFile);
		cacheUniqueFindersCache(documentFile);

		return documentFile;
	}

	protected DocumentFile toUnwrappedModel(DocumentFile documentFile) {
		if (documentFile instanceof DocumentFileImpl) {
			return documentFile;
		}

		DocumentFileImpl documentFileImpl = new DocumentFileImpl();

		documentFileImpl.setNew(documentFile.isNew());
		documentFileImpl.setPrimaryKey(documentFile.getPrimaryKey());

		documentFileImpl.setDocumentId(documentFile.getDocumentId());
		documentFileImpl.setCompanyId(documentFile.getCompanyId());
		documentFileImpl.setGroupId(documentFile.getGroupId());
		documentFileImpl.setLessonId(documentFile.getLessonId());
		documentFileImpl.setSectionId(documentFile.getSectionId());
		documentFileImpl.setDocumentName(documentFile.getDocumentName());
		documentFileImpl.setDocumentDesc(documentFile.getDocumentDesc());
		documentFileImpl.setDocumentPath(documentFile.getDocumentPath());
		documentFileImpl.setResourceId(documentFile.getResourceId());
		documentFileImpl.setCollectionId(documentFile.getCollectionId());
		documentFileImpl.setResourceType(documentFile.getResourceType());
		documentFileImpl.setDownloadUrl(documentFile.getDownloadUrl());
		documentFileImpl.setDocUuid(documentFile.getDocUuid());
		documentFileImpl.setHasAutoTranscript(documentFile.getHasAutoTranscript());
		documentFileImpl.setCreatedDate(documentFile.getCreatedDate());
		documentFileImpl.setPermission(documentFile.getPermission());
		documentFileImpl.setStatus(documentFile.getStatus());

		return documentFileImpl;
	}

	/**
	 * Returns the document file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document file
	 * @return the document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentFileException, SystemException {
		DocumentFile documentFile = fetchByPrimaryKey(primaryKey);

		if (documentFile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return documentFile;
	}

	/**
	 * Returns the document file with the primary key or throws a {@link com.nyu.NoSuchDocumentFileException} if it could not be found.
	 *
	 * @param documentId the primary key of the document file
	 * @return the document file
	 * @throws com.nyu.NoSuchDocumentFileException if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile findByPrimaryKey(long documentId)
		throws NoSuchDocumentFileException, SystemException {
		return findByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns the document file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document file
	 * @return the document file, or <code>null</code> if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocumentFile documentFile = (DocumentFile)EntityCacheUtil.getResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
				DocumentFileImpl.class, primaryKey);

		if (documentFile == _nullDocumentFile) {
			return null;
		}

		if (documentFile == null) {
			Session session = null;

			try {
				session = openSession();

				documentFile = (DocumentFile)session.get(DocumentFileImpl.class,
						primaryKey);

				if (documentFile != null) {
					cacheResult(documentFile);
				}
				else {
					EntityCacheUtil.putResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
						DocumentFileImpl.class, primaryKey, _nullDocumentFile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocumentFileModelImpl.ENTITY_CACHE_ENABLED,
					DocumentFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return documentFile;
	}

	/**
	 * Returns the document file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentId the primary key of the document file
	 * @return the document file, or <code>null</code> if a document file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentFile fetchByPrimaryKey(long documentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns all the document files.
	 *
	 * @return the document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @return the range of document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.nyu.model.impl.DocumentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document files
	 * @param end the upper bound of the range of document files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentFile> findAll(int start, int end,
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

		List<DocumentFile> list = (List<DocumentFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENTFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTFILE;

				if (pagination) {
					sql = sql.concat(DocumentFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentFile>(list);
				}
				else {
					list = (List<DocumentFile>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the document files from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocumentFile documentFile : findAll()) {
			remove(documentFile);
		}
	}

	/**
	 * Returns the number of document files.
	 *
	 * @return the number of document files
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

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTFILE);

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
	 * Initializes the document file persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.nyu.model.DocumentFile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocumentFile>> listenersList = new ArrayList<ModelListener<DocumentFile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocumentFile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocumentFileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCUMENTFILE = "SELECT documentFile FROM DocumentFile documentFile";
	private static final String _SQL_SELECT_DOCUMENTFILE_WHERE = "SELECT documentFile FROM DocumentFile documentFile WHERE ";
	private static final String _SQL_COUNT_DOCUMENTFILE = "SELECT COUNT(documentFile) FROM DocumentFile documentFile";
	private static final String _SQL_COUNT_DOCUMENTFILE_WHERE = "SELECT COUNT(documentFile) FROM DocumentFile documentFile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentFile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocumentFile exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentFilePersistenceImpl.class);
	private static DocumentFile _nullDocumentFile = new DocumentFileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocumentFile> toCacheModel() {
				return _nullDocumentFileCacheModel;
			}
		};

	private static CacheModel<DocumentFile> _nullDocumentFileCacheModel = new CacheModel<DocumentFile>() {
			@Override
			public DocumentFile toEntityModel() {
				return _nullDocumentFile;
			}
		};
}