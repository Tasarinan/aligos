/*******************************************************************************
 * Copyright (c) 2014 Nethead Group.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Nethead Group - initial API and implementation
 *******************************************************************************/
package com.nsn.squirrel.logging;

import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A bridge between the OSGi LogService and SLF4j framework
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public class SLF4JOSGiLogServiceBridge implements LogService
{

	protected static final Logger logger = LoggerFactory.getLogger("e4"); //$NON-NLS-1$

	@Override
	public void log(int level, String message)
	{
		switch (level)
		{
		case LogService.LOG_DEBUG:
			logger.debug(message);
			break;
		case LogService.LOG_INFO:
			logger.info(message);
			break;
		case LogService.LOG_WARNING:
			logger.warn(message);
			break;
		case LogService.LOG_ERROR:
			logger.error(message);
			break;
		default:
			logger.trace(message);
			break;
		}
	}

	@Override
	public void log(int level, String message, Throwable exception)
	{
		switch (level)
		{
		case LogService.LOG_DEBUG:
			logger.debug(message, exception);
			break;
		case LogService.LOG_INFO:
			logger.info(message, exception);
			break;
		case LogService.LOG_WARNING:
			logger.warn(message, exception);
			break;
		case LogService.LOG_ERROR:
			logger.error(message, exception);
			break;
		default:
			logger.trace(message);
			break;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void log(ServiceReference sr, int level, String message)
	{
		log(level, message);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void log(ServiceReference sr, int level, String message, Throwable exception)
	{
		log(level, message, exception);
	}

}
