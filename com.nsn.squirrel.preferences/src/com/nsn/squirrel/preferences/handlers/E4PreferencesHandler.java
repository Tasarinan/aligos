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
package com.nsn.squirrel.preferences.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.widgets.Shell;

import com.nsn.squirrel.preferences.internal.E4PreferenceRegistry;

public class E4PreferencesHandler
{

	@CanExecute
	public boolean canExecute()
	{

		return true;
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, E4PreferenceRegistry prefReg)
	{

		PreferenceManager pm = prefReg.getPreferenceManager();
		PreferenceDialog dialog = new PreferenceDialog(shell, pm);
		dialog.create();
		dialog.getTreeViewer().setComparator(new ViewerComparator());
		dialog.getTreeViewer().expandAll();
		dialog.open();
	}
}
