/* Copyright (c) 2001 - 2012 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.opengeo.gsr.ms.service;

import java.util.List;

import org.opengeo.gsr.core.geometry.Envelope;
import org.opengeo.gsr.core.geometry.SpatialReference;
import org.opengeo.gsr.service.AbstractService;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author Juan Marin, OpenGeo
 * @author Brett Antonides, LMN Solutions
 * 
 */

@XStreamAlias("")
public class MapService implements AbstractService {

    private String mapName;
    
    private String serviceDescription;
    
    private String description;
    
    private String copyright;

    private double currentVersion;
    
    private Envelope fullExtent;
    
    private Envelope initialExtent;
    
    private SpatialReference spatialReference;
    
    private List<Layer> layers;
    
    public SpatialReference getSpatialReference() {
		return spatialReference;
	}

	public void setSpatialReference(SpatialReference spatialReference) {
		this.spatialReference = spatialReference;
	}

	public Envelope getInitialExtent() {
		return initialExtent;
	}

	public void setInitialExtent(Envelope intialExtent) {
		this.initialExtent = intialExtent;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public String getMapName() {
        return mapName;
    }

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Envelope getFullExtent() {
		return fullExtent;
	}

	public void setFullExtent(Envelope fullExtent) {
		this.fullExtent = fullExtent;
	}

    public List<Layer> getLayers() {
		return layers;
	}

	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}

	public MapService(String name, double currentVersion, Envelope extent, List<Layer> layers) {
        mapName = name;
        this.currentVersion = currentVersion;
        this.fullExtent = extent;
        this.initialExtent = extent;
        this.spatialReference = extent.getSpatialReference();
        this.layers = layers;
        serviceDescription = "N/A";
        description = "N/A";
        copyright = "N/A";
    }
    
    public MapService(String name, double currentVersion, Envelope fullExtent, Envelope initialExtent, List<Layer> layers) {
        mapName = name;
        this.currentVersion = currentVersion;
        this.fullExtent = fullExtent;
        this.initialExtent = initialExtent;
        this.spatialReference = fullExtent.getSpatialReference();
        this.layers = layers;
        serviceDescription = "N/A";
        description = "N/A";
        copyright = "N/A";
    }
}
