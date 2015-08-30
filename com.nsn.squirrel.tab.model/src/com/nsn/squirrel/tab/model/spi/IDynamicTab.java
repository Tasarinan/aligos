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

import java.nio.file.Path;

/**
 * Defines dynamic tab interface for the Tab Service.
 */
public interface IDynamicTab {

    // public PathNatTable getTable();

    /**
     * @return root path of tab
     */
    public Path getRootPath();

    /**
     * clear selected path in the path table
     */
    public void clearSelection();

    /**
     * set selection via selection service
     */
    public void setSelection();

    /**
     * set focus on the tab
     */
    public void setFocus();
}
