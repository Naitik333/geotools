/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2012, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.wcs.v2_0;

import java.util.Map;

import org.geotools.wcs.bindings.DescribeEOCoverageSetBinding;
import org.geotools.wcs.bindings.SectionsBinding;
import org.geotools.xml.Configuration;

/**
 * Parser configuration for the http://www.opengis.net/wcs/range-subsetting/1.0 schema.
 * 
 * @generated
 */
public class WCSEOConfiguration extends Configuration {
    
    

    /**
     * Creates a new configuration.
     * 
     * @generated
     */
    public WCSEOConfiguration() {
        super(WCSEO.getInstance());
        addDependency(new WCSConfiguration());
    }

    /**
     * Registers the bindings for the configuration.
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    protected final void registerBindings(Map bindings) {
        // manually setup bindings
        bindings.put(WCSEO.DescribeEOCoverageSetType, new DescribeEOCoverageSetBinding());
        bindings.put(WCSEO.Sections, new SectionsBinding());
    }

}