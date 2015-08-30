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
package com.nsn.squirrel.tab.service;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

import com.nsn.squirrel.tab.model.spi.ITabService;

/**
 * TODO
 */
public class TabServiceContextFunction extends ContextFunction
{

	@Override
	public Object compute(IEclipseContext context, String contextKey)
	{

		ITabService partService = ContextInjectionFactory.make(TabServiceImpl.class, context);
		MApplication app = context.get(MApplication.class);
		if(app != null)
		{
			IEclipseContext appCtx = app.getContext();
			if(appCtx != null)
			{
				appCtx.set(ITabService.class, partService);
			}
		}
		return partService;
	}
}
