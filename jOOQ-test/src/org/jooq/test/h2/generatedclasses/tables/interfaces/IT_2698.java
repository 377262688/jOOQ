package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_2698 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_2698.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_2698.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_2698.XX</code>. 
	 */
	public void setXx(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_2698.XX</code>. 
	 */
	public java.lang.Integer getXx();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_2698
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2698 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_2698
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2698> E into(E into);
}
