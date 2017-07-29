package org.eclipse.birt.aggregate.bigintsum;

import java.math.BigInteger;

import org.eclipse.birt.data.engine.api.aggregation.Accumulator;
import org.eclipse.birt.data.engine.core.DataException;
import org.eclipse.birt.data.engine.i18n.ResourceConstants;


public class BigIntSumAccum extends Accumulator {

	private BigInteger sum = new BigInteger("0");
	
	public void finish() throws DataException {
		super.finish();
	}
	public void start() throws DataException {
		sum = new BigInteger("0");
		super.start();
	}

	public Object getValue() throws DataException {
		return sum;
	}
	public void onRow(Object[] args) throws DataException {
		if (args[0] != null) {
			try {
				sum = sum.add(new BigInteger(args[0].toString()));
			} catch (Exception e) {
				throw new DataException(ResourceConstants.DATATYPEUTIL_ERROR, e);
			}
		}
	}
}
