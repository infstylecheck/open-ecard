/****************************************************************************
 * Copyright (C) 2013-2014 ecsec GmbH.
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

package org.openecard.addon.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.openecard.addon.utils.LocalizedStringExtractor;


/**
 *
 * @author Tobias Wich <tobias.wich@ecsec.de>
 * @author Dirk Petrautzki <petrautzki@hs-coburg.de>
 * @author Hans-Martin Haase <hans-martin.haase@ecsec.de>
 */
@XmlRootElement(name = "AppPluginSpecification")
@XmlType(propOrder = { "className", "loadOnStartup", "localizedName", "localizedDescription", "resourceName",
	    "configDescription", "parameters", "body", "attachments" })
@XmlAccessorType(XmlAccessType.FIELD)
public class AppPluginSpecification {

    @XmlElement(name = "ClassName")
    private String className;
    @XmlElement(name = "LoadOnStartup", required = false, defaultValue = "false")
    private Boolean loadOnStartup;
    @XmlElement(name = "LocalizedName")
    private final List<LocalizedString> localizedName = new ArrayList<>();
    @XmlElement(name = "LocalizedDescription")
    private final List<LocalizedString> localizedDescription = new ArrayList<>();
    @XmlElement(name = "ConfigDescription")
    private Configuration configDescription;
    @XmlElement(name = "Parameter")
    private final List<ParameterType> parameters = new ArrayList<>();
    @XmlElement(name = "ResourceName")
    private String resourceName;
    @XmlElement(name = "Body")
    private BodyType body;
    @XmlElement(name = "Attachment")
    private final List<AttachmentType> attachments = new ArrayList<>();

    public String getClassName() {
	return className;
    }

    public void setClassName(String className) {
	this.className = className;
    }


    public Boolean isLoadOnStartup() {
	if (loadOnStartup == null) {
	    return false;
	}
	return loadOnStartup;
    }


    public String getResourceName() {
	return resourceName;
    }


    public List<LocalizedString> getLocalizedName() {
	return localizedName;
    }


    public List<LocalizedString> getLocalizedDescription() {
	return localizedDescription;
    }


    public Configuration getConfigDescription() {
	return configDescription;
    }


    public void setLoadOnStartup(Boolean loadOnStartup) {
	this.loadOnStartup = loadOnStartup;
    }

    public void setConfigDescription(Configuration configDescription) {
	this.configDescription = configDescription;
    }

    public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
    }

    public void setBody(BodyType body) {
	this.body = body;
    }

    public BodyType getBody() {
	return body;
    }

    public List<ParameterType> getParameters() {
	return parameters;
    }

    public List<AttachmentType> getAttachments() {
	return attachments;
    }

    public String getLocalizedName(String languageCode) {
	return LocalizedStringExtractor.getLocalizedString(localizedName, languageCode);
    }

    public String getLocalizedDescription(String languageCode) {
	return LocalizedStringExtractor.getLocalizedString(localizedDescription, languageCode);
    }
}
