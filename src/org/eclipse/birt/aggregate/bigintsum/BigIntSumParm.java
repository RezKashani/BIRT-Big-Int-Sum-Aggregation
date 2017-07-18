package org.eclipse.birt.aggregate.bigintsum;

import org.eclipse.birt.core.data.DataType;
import org.eclipse.birt.data.engine.api.aggregation.IParameterDefn;

public class BigIntSumParm implements IParameterDefn {
	public static final int[] DTTYPES = new int[]{
		DataType.BOOLEAN_TYPE,
		DataType.INTEGER_TYPE, 
		DataType.DOUBLE_TYPE,
		DataType.DECIMAL_TYPE, 
		DataType.STRING_TYPE,
		DataType.DATE_TYPE,
		DataType.SQL_DATE_TYPE,
		DataType.SQL_TIME_TYPE
	};
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Provides a Summation using big int without losing percision";
	}

	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Column";
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Column";
	}

	public boolean isDataField() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isOptional() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportDataType(int dataType) {
		if( dataType == DataType.UNKNOWN_TYPE )
			return true;

		for ( int i = 0; i < DTTYPES.length; i++ )
		{
			if ( DTTYPES[i] == DataType.ANY_TYPE || DTTYPES[i] == dataType )
			{
				return true;
			}
		}
		return false;
	}
}
