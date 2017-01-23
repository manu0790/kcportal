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

import com.nyu.model.DocumentFile;

import com.nyu.service.DocumentFileLocalServiceUtil;

/**
 * The extended model base implementation for the DocumentFile service. Represents a row in the &quot;nyyou_DocumentFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DocumentFileImpl}.
 * </p>
 *
 * @author Allwins Rajaiah
 * @see DocumentFileImpl
 * @see com.nyu.model.DocumentFile
 * @generated
 */
public abstract class DocumentFileBaseImpl extends DocumentFileModelImpl
	implements DocumentFile {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document file model instance should use the {@link DocumentFile} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentFileLocalServiceUtil.addDocumentFile(this);
		}
		else {
			DocumentFileLocalServiceUtil.updateDocumentFile(this);
		}
	}
}