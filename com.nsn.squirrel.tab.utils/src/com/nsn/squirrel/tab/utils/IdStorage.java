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
package com.nsn.squirrel.tab.utils;

/**
 * All id's contains in this file available as well in the model.
 * 
 */
public final class IdStorage
{

	/**
	 * ID's
	 */
	/** application plug-in id */
	public static final String PLUGIN_ID = "com.nsn.squirrel.tab"; //$NON-NLS-1$
	/** preferences plug-in id */
	public static final String PREF_PLUGIN_ID = "com.nsn.squirrel.tab.preferences"; //$NON-NLS-1$
	/** application id */
	public static final String APPLICATION_ID = "com.nsn.squirrel.tab.application" //$NON-NLS-1$
	.intern();
	/** window id */
	public static final String WINDOW_ID = "com.nsn.squirrel.tab.trimmedwindow" //$NON-NLS-1$
	.intern();
	/** perspective id */
	public static final String MAIN_PERSPECTIVE_ID = "com.nsn.squirrel.tab.perspective.main"; //$NON-NLS-1$
	/** part descriptor id */
	public static final String DYNAMIC_PART_DESCRIPTOR_ID = "com.nsn.squirrel.tab.partdescriptor.dynamic" //$NON-NLS-1$
	.intern();
	public static final String DYNAMIC_PART_ELEMENT_PREFIX_ID = "com.nsn.squirrel.tab.part.dynamictab." //$NON-NLS-1$
	.intern();
	/** panel id's */
	public static String LEFT_PANEL_ID = "com.nsn.squirrel.tab.partstack.left" //$NON-NLS-1$
	.intern();
	public static String RIGHT_PANEL_ID = "com.nsn.squirrel.tab.partstack.right" //$NON-NLS-1$
	.intern();
	/**
	 * STATES
	 */
	/** root path */
	public static final String STATE_ROOT_PATH = "rootPath".intern(); //$NON-NLS-1$
}
