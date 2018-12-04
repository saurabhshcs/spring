/**
 * 
 */
package com.tsz.springpro.courseapi.topic;

/**
 * @author saurabhshcs
 *
 */
public class Topic {
	
	private String id;
	private String name;
	private String description;
	
	/**
	 * 
	 */
	public Topic() {
	}


	/**
	 * @param id
	 * @param description
	 * @param name
	 */
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
