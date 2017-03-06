package com.yashwanth;

/**
 * Created by michael.kong on 2/18/16.
 */
public class Range {
	
	private int min;
	private int max;
	
	//Constructors
	Range(int min, int max){
		if(min <= max) {
			this.min = min;
			this.max = max;
		} else {
			this.min = max;
			this.max = min;	
		}
	}

	public int getmin() {
		return min;
	}

	public void setmin(int min) {
		this.min = min;
	}

	public int getmax() {
		return max;
	}

	public void setmax(int max) {
		this.max = max;
	}
	
	public String toString() {
		
		return String.format("['%d','%d']",min, max );
	}
	
	public boolean equals(Object other){
		boolean result = false;
        if (other instanceof Range) {
            Range that = (Range) other;
            result = (this.getmin()==that.getmin() && this.getmax() ==that.getmax() );
        }
        return result;
	}
	
	
}
