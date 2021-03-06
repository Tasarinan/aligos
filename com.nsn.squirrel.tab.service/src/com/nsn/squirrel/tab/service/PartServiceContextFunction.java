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

import com.nsn.squirrel.tab.model.spi.IPartService;

/**
 * Part service context function
 */
public class PartServiceContextFunction extends ContextFunction
{

	@Override
	public Object compute(IEclipseContext context, String contextKey)
	{

		// delegate to ContextInjectionFactory
		// instead of creating a new PartServiceImpl with the new operator.
		// because PartServiceImpl itself uses injection
		IPartService partService = ContextInjectionFactory.make(PartServiceImpl.class, context);
		// cache the newly created part Service in the application context for
		// the next time somebody requests it (this prevents this
		// ContextFunction
		// from being called again).
		// get application ctx (to make it available to all parts)
		// and register partService obj with appCtx
		MApplication app = context.get(MApplication.class);
		if(app != null)
		{
			IEclipseContext appCtx = app.getContext();
			if(appCtx != null)
			{
				appCtx.set(IPartService.class, partService);
			}
		}
		// return model for current invocation
		// next invocation uses object from application context
		return partService;
	}
}
