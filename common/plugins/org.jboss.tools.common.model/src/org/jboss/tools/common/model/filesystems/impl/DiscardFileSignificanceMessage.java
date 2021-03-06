/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.common.model.filesystems.impl;

import org.jboss.tools.common.meta.*;
import org.jboss.tools.common.meta.action.*;
import org.jboss.tools.common.model.*;

public class DiscardFileSignificanceMessage implements SignificanceMessage {

	public String getMessage(XAction action, XModelObject object, XModelObject[] objects) {
		String d = "Discard changes in";
		XAttribute e = object.getModelEntity().getAttribute(XModelObjectConstants.ATTR_ELEMENT_TYPE);
		String type = (e == null || !e.isVisible()) ? "" : object.getAttributeValue(XModelObjectConstants.ATTR_ELEMENT_TYPE);
		if(type.length() > 0) type += " ";
		String what = (objects != null && objects.length > 1) ? objects.length + " selected objects" :
					  type + "'" + object.getPresentationString() + "'";
		return d + " " + what;
	}

}
