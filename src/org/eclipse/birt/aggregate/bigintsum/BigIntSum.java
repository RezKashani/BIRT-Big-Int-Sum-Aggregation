package org.eclipse.birt.aggregate.bigintsum;


import org.eclipse.birt.core.data.DataType;



import org.eclipse.birt.data.engine.api.aggregation.Accumulator;
import org.eclipse.birt.data.engine.api.aggregation.IAggrFunction;
import org.eclipse.birt.data.engine.api.aggregation.IParameterDefn;

public class BigIntSum implements IAggrFunction

{
	public static final int[] CALCULATABLE = new int[]{
		DataType.BOOLEAN_TYPE,
		DataType.INTEGER_TYPE, 
		DataType.DOUBLE_TYPE,
		DataType.DECIMAL_TYPE, 
		DataType.STRING_TYPE,
		DataType.DATE_TYPE,
		DataType.SQL_DATE_TYPE,
		DataType.SQL_TIME_TYPE
	};

	public Object getDefaultValue( )
	{
		return null;
	}

	public int getNumberOfPasses( )
	{
		return 1;

	}
	
	public boolean isDataOrderSensitive( )
	{
		return false;
	}
	
	public String getName( )
	{
		return "BIGINTSUM";
	}

	public int getType( )
	{
		return RUNNING_AGGR;
	}

	public int getDataType( )
	{
		return DataType.ANY_TYPE;
	}

	public Accumulator newAccumulator( )
	{
		return new BigIntSumAccum();
	}

	public String getDescription( )
	{
		return "Summation on big integers without losing percision"; //$NON-NLS-1$
	}

	public String getDisplayName( )
	{
		return "BIGINTSUM"; //$NON-NLS-1$
	}

	public IParameterDefn[] getParameterDefn( )
	{
		return new IParameterDefn[]{
				new BigIntSumParm()
		};
	}
}
