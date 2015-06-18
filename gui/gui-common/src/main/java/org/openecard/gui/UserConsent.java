/****************************************************************************
 * Copyright (C) 2012 ecsec GmbH.
 * All rights reserved.
 * Contact: ecsec GmbH (info@ecsec.de)
 *
 * This file is part of the Open eCard App.
 *
 * GNU General Public License Usage
 * This file may be used under the terms of the GNU General Public
 * License version 3.0 as published by the Free Software Foundation
 * and appearing in the file LICENSE.GPL included in the packaging of
 * this file. Please review the following information to ensure the
 * GNU General Public License version 3.0 requirements will be met:
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * Other Usage
 * Alternatively, this file may be used in accordance with the terms
 * and conditions contained in a signed written agreement between
 * you and ecsec GmbH.
 *
 ***************************************************************************/

package org.openecard.gui;

import org.openecard.gui.definition.UserConsentDescription;


/**
 * Abstract entry interface of every GUI implementation.
 *
 * @author Tobias Wich
 */
public interface UserConsent {

    /**
     * Obtain an instance of a user consent navigator.
     * It is up to the implementation whether the navigator can be reused after display.
     *
     * @param uc The abstract description of the user consent and its components. May not be null.
     * @return A class instance implementing the {@link UserConsentNavigator} interface.
     */
    UserConsentNavigator obtainNavigator(UserConsentDescription uc);

    /**
     * Obtain an instance of a file dialog.
     * It is up to the implementation whether the dialog can be reused after display.
     *
     * @return A class instance implementing the {@link FileDialog} interface.
     */
    FileDialog obtainFileDialog();

    /**
     * Obtain an instance of a message dialog.
     * It is up to the implementation whether the dialog can be reused after display.
     *
     * @return A class instance implementing the {@link MessageDialog} interface.
     */
    MessageDialog obtainMessageDialog();

}
