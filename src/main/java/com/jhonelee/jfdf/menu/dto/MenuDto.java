package com.jhonelee.jfdf.menu.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jhonelee.jfdf.resource.entity.Resource;

public class MenuDto {
	
	private String menuName;
	
	private Resource.ResourceIconType iconType;
	
	private String iconPath;
	
	private String url;
	
	private Set<String> authorities = new HashSet<String>();
	
	private MenuDto parent;
	
	private List<MenuDto> children = new ArrayList<MenuDto>();

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Resource.ResourceIconType getIconType() {
		return iconType;
	}

	public void setIconType(Resource.ResourceIconType iconType) {
		this.iconType = iconType;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}

	public MenuDto getParent() {
		return parent;
	}

	public void setParent(MenuDto parent) {
		this.parent = parent;
	}

	public List<MenuDto> getChildren() {
		return children;
	}

	public void setChildren(List<MenuDto> children) {
		this.children = children;
	}

}