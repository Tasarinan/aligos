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

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.log.Logger;
import org.slf4j.LoggerFactory;

/**
 * A bridge class that diverts log messages sent to an E4 Logger instance to the
 * SLF4J framework.
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
@Creatable
@Singleton
public class SLF4JE4LoggerBridge extends Logger
{

	private static final String DEFAULT_NAME = "e4"; //$NON-NLS-1$

	private final org.slf4j.Logger logger;

	public SLF4JE4LoggerBridge(String name)
	{
		logger = LoggerFactory.getLogger(name == null ? DEFAULT_NAME : name);
	}

	@Inject
	public SLF4JE4LoggerBridge(IEclipseContext context)
	{
		this(DEFAULT_NAME);
		context.set(Logger.class, this);
	}

	public SLF4JE4LoggerBridge(Class<?> clazz)
	{
		this(clazz == null ? null : clazz.getCanonicalName());
	}

	@Override
	public boolean isErrorEnabled()
	{
		return logger.isErrorEnabled();
	}

	@Override
	public void error(Throwable t, String message)
	{
		logger.error(message, t);
	}

	@Override
	public boolean isWarnEnabled()
	{
		return logger.isWarnEnabled();
	}

	@Override
	public void warn(Throwable t, String message)
	{
		logger.warn(message, t);
	}

	@Override
	public boolean isInfoEnabled()
	{
		return logger.isInfoEnabled();
	}

	@Override
	public void info(Throwable t, String message)
	{
		logger.info(message, t);
	}

	@Override
	public boolean isTraceEnabled()
	{
		return logger.isTraceEnabled();
	}

	@Override
	public void trace(Throwable t, String message)
	{
		logger.trace(message, t);
	}

	@Override
	public boolean isDebugEnabled()
	{
		return logger.isDebugEnabled();
	}

	@Override
	public void debug(Throwable t)
	{
		logger.debug("An exception occurred", t); //$NON-NLS-1$
	}

	@Override
	public void debug(Throwable t, String message)
	{
		logger.debug(message, t);
	}

}
