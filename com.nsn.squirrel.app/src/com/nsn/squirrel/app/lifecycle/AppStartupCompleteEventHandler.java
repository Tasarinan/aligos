/*******************************************************************************
 * Copyright (c) 2015 Nethead Group.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Nethead Group - initial API and implementation
 *******************************************************************************/
package com.nsn.squirrel.app.lifecycle;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppStartupCompleteEventHandler implements EventHandler
{

	private static final Logger log = LoggerFactory.getLogger(AppStartupCompleteEventHandler.class);

	@Override
	public void handleEvent(final Event event)
	{

		log.debug("Application startup completed."); //$NON-NLS-1$
	}
}