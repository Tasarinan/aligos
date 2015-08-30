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
package com.nsn.squirrel.tab.event;

/**
 * E4 UI part event constants.
 * Occurs on the part.
 *
 */
public final class PartEvents extends BaseEvents
{

	/**
	 * Base name of all path events
	 */
	public static final String TOPIC_BASE_PART = TOPIC_BASE + "/part/"; //$NON-NLS-1$
	/**
	 * Sent when opening new path in active tab.
	 */
	public static final String TOPIC_PART_PATH_OPEN = TOPIC_BASE_PART + "path/open"; //$NON-NLS-1$
	/**
	 * Sent when necessary to remove selection from opposite tab.
	 */
	public static final String TOPIC_PART_REMOVE_SELECTION = "com/nsn/squirrel/tab/events/part/selection/remove"; //$NON-NLS-1$
}
