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
package com.nsn.squirrel.tab.model.spi;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

/**
 * Service for model of tabs.
 */
public interface ITabService
{

	/**
	 * @param part
	 *            MPart associated with IDynamicTab
	 * @return IDynamicTab association
	 */
	public IDynamicTab getTab(MPart part);

	/**
	 * @param part
	 *            given part
	 * @return tab id or -1
	 */
	public int getTabId(MPart part);

	/**
	 * Clear table selection on the tab
	 * 
	 * @param part
	 *            MPart associated with IDynamicTab
	 */
	public void clearSelection(MPart part);

	/**
	 * Set table focus and selection on the tab
	 * 
	 * @param part
	 *            MPart associated with IDynamicTab
	 */
	public void setSelection(MPart part);
}
