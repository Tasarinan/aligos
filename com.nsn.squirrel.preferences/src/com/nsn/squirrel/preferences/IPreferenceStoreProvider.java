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
package com.nsn.squirrel.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This interface can be implemented to provide a PreferenceStore for a given
 * plugin.
 * This associatino must be done in the e4PreferenceStoreProvider extension
 * point.
 * 
 *
 */
public interface IPreferenceStoreProvider
{

	/** Must be implemented to return a preference store */
	public IPreferenceStore getPreferenceStore();
}