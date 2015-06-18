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

package org.openecard.crypto.common.asn1.eac.oid;


/**
 * See BSI-TR-03110, version 2.10
 *
 * @author Moritz Horsch
 */
public class PKObjectIdentifier extends EACObjectIdentifier {

    /**
     * id-PK-DH OBJECT IDENTIFIER ::= {id-PK 1}
     */
    public static final String id_PK_DH = id_PK + ".1";
    /**
     * id-PK-ECDH OBJECT IDENTIFIER ::= {id-PK 2}
     */
    public static final String id_PK_ECDH = id_PK + ".2";

}
