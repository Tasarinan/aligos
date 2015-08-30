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

import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.equinox.log.Logger;
import org.osgi.framework.Bundle;
import org.osgi.service.log.LogService;

/**
 * An {@link ExtendedLogService} implementation that delegates logging to the
 * SLF4J logging mechanism.
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public class SLF4JExtendedLogService extends SLF4JOSGiLogServiceBridge implements ExtendedLogService
{

	@SuppressWarnings("nls")
	@Override
	public void log(Object context, int level, String message)
	{
		log(level, (context == null ? "" : context.getClass().getCanonicalName() + " - ") + message);
	}

	@SuppressWarnings("nls")
	@Override
	public void log(Object context, int level, String message, Throwable exception)
	{
		log(level, (context == null ? "" : context.getClass().getCanonicalName() + " - ") + message, exception);
	}

	@Override
	public boolean isLoggable(int level)
	{
		switch (level)
		{
		case LogService.LOG_DEBUG:
			return logger.isDebugEnabled();
		case LogService.LOG_INFO:
			return logger.isInfoEnabled();
		case LogService.LOG_WARNING:
			return logger.isWarnEnabled();
		case LogService.LOG_ERROR:
			return logger.isErrorEnabled();
		default:
			return logger.isTraceEnabled();
		}
	}

	@Override
	public String getName()
	{
		return logger.getName();
	}

	@Override
	public Logger getLogger(String loggerName)
	{
		return this;
	}

	@Override
	public Logger getLogger(Bundle bundle, String loggerName)
	{
		return this;
	}


}
