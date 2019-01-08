/**
 * Copyright (c) 2013 SMC Treviso Srl. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.smc.calendar.caldav.sync.util;

/**
 * @author Fabio Pezzutto
 * @author Luca Comin
 */
import com.liferay.portal.kernel.servlet.HttpMethods;
public interface CalDAVHttpMethods extends HttpMethods {

	public static final String MOVE = "MOVE";

	public static final String PROPFIND = "PROPFIND";

	public static final String PROPPATCH = "PROPPATCH";

	public static final String REPORT = "REPORT";

}