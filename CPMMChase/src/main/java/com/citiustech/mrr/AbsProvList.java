package com.citiustech.mrr;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AbsProvList implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    
    private java.util.List<com.citiustech.mrr.CPMM1> cpmm = new java.util.ArrayList<com.citiustech.mrr.CPMM1>();

    private java.lang.Integer cpmmSize;

    private java.util.List<com.citiustech.mrr.CPMM1> cpmmOnHold = new java.util.ArrayList<com.citiustech.mrr.CPMM1>();

    private java.util.List<java.lang.Integer> cpmmProcessId = new java.util.ArrayList<java.lang.Integer>();


	public AbsProvList() {
	}

	public java.util.List<com.citiustech.mrr.CPMM1> getCpmm() {
		return this.cpmm;
	}

	public void setCpmm(java.util.List<com.citiustech.mrr.CPMM1> cpmm) {
		this.cpmm = cpmm;
	}

	public java.lang.Integer getCpmmSize() {
		return this.cpmmSize;
	}

	public void setCpmmSize(java.lang.Integer cpmmSize) {
		this.cpmmSize = cpmmSize;
	}

	public java.util.List<com.citiustech.mrr.CPMM1> getCpmmOnHold() {
		return this.cpmmOnHold;
	}

	public void setCpmmOnHold(
			java.util.List<com.citiustech.mrr.CPMM1> cpmmOnHold) {
		this.cpmmOnHold = cpmmOnHold;
	}

	public java.util.List<java.lang.Integer> getCpmmProcessId() {
		return this.cpmmProcessId;
	}

	public void setCpmmProcessId(java.util.List<java.lang.Integer> cpmmProcessId) {
		this.cpmmProcessId = cpmmProcessId;
	}

	public AbsProvList(java.util.List<com.citiustech.mrr.CPMM1> cpmm,
			java.lang.Integer cpmmSize,
			java.util.List<com.citiustech.mrr.CPMM1> cpmmOnHold,
			java.util.List<java.lang.Integer> cpmmProcessId) {
		this.cpmm = cpmm;
		this.cpmmSize = cpmmSize;
		this.cpmmOnHold = cpmmOnHold;
		this.cpmmProcessId = cpmmProcessId;
	}

}