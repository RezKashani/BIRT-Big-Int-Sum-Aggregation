package org.eclipse.birt.aggregate.bigintsum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.birt.data.engine.api.aggregation.IAggrFunction;
import org.eclipse.birt.data.engine.api.aggregation.IAggregationFactory;

public class BigIntSumAggregationFactory implements IAggregationFactory
{
	private Map aggrMap = new HashMap( );
	private List aggregations = new ArrayList( );
	private void populateAggregations( )
	{
		final BigIntSum bigintsum = new BigIntSum( );
		aggrMap.put( "PREVVAL", bigintsum);
		aggregations.add( bigintsum );

	}
	public BigIntSumAggregationFactory( )
	{
		populateAggregations( );
	}
	public List getAggregations( )
	{
		return aggregations;
	}
	public IAggrFunction getAggregation( String name )
	{
		return (IAggrFunction) aggrMap.get( name.toUpperCase( ) );
	}
}
