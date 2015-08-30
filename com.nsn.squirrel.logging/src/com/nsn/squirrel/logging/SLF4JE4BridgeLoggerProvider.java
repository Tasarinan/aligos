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

import org.eclipse.e4.core.services.log.ILoggerProvider;
import org.eclipse.e4.core.services.log.Logger;

/**
 * An {@link ILoggerProvider} that yields the {@link SLF4JE4LoggerBridge} used
 * to divert logging messages to the SLF4J framework.
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public class SLF4JE4BridgeLoggerProvider implements ILoggerProvider
{

	@Override
	public Logger getClassLogger(Class<?> clazz)
	{
		return new SLF4JE4LoggerBridge(clazz);
	}

}
