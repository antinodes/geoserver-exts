package org.opengeo.gsr.ms.service;

import java.util.ArrayList;
import java.util.List;

import org.geoserver.catalog.LayerInfo;
/**
 * 
 * @author Brett Antonides - LMN Solutions
 *
 */
public class Layer {
	private int id;
	
	private String name;
	
	private boolean defaultVisibility;
	
	private int parentLayerId;

	private List<Integer> subLayerIds;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDefaultVisibility() {
		return defaultVisibility;
	}

	public void setDefaultVisibility(boolean defaultVisibility) {
		this.defaultVisibility = defaultVisibility;
	}

	public int getParentLayerId() {
		return parentLayerId;
	}

	public void setParentLayerId(int parentLayerId) {
		this.parentLayerId = parentLayerId;
	}

	public List<Integer> getSubLayerIds() {
		return subLayerIds;
	}

	public void setSubLayerIds(List<Integer> subLayerIds) {
		this.subLayerIds = subLayerIds;
	}
	
	public Layer(int id, LayerInfo layerInfo) {
		this.id = id;
		this.name = layerInfo.getName();
		this.defaultVisibility = layerInfo.isEnabled();
		this.parentLayerId = -1;
		this.subLayerIds = null;
	}
	
}
