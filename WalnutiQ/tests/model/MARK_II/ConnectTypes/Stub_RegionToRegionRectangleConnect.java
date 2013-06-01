package model.MARK_II.ConnectTypes;

import model.MARK_II.Stub_Cell;
import model.MARK_II.Stub_Column;
import model.MARK_II.Stub_Neuron;
import model.MARK_II.Stub_Region;
import model.MARK_II.Stub_Synapse;

public class Stub_RegionToRegionRectangleConnect implements Stub_RegionToRegionConnect{
    @Override
    public void connect(Stub_Region childRegion, Stub_Region parentRegion,
	    int numberOfColumnsToOverlapAlongXAxisOfRegion,
	    int numberOfColumnsToOverlapAlongYAxisOfRegion) {
	if (parentRegion == null) {
	    throw new IllegalArgumentException(
		    "parentRegion in connect method cannot be null");
	} else if (childRegion == null) {
	    throw new IllegalArgumentException(
		    "childRegion in connect method cannot be null");
	}
	Stub_Column[][] parentRegionColumns = parentRegion.getColumns();
	int parentRegionXAxisLength = parentRegionColumns.length; // = 8
	int parentRegionYAxisLength = parentRegionColumns[0].length; // = 8

	Stub_Column[][] childRegionColumns = childRegion.getColumns();
	int childRegionXAxisLength = childRegionColumns.length; // = 66
	int childRegionYAxisLength = childRegionColumns[0].length; // = 66

	// TODO: add missing exceptions for connectingRectangle dimension >= 8

	// TODO: view formula derivation and details at www.walnutiq.com/...
	int connectingRectangleXAxisLength = Math
		.round((childRegionXAxisLength
			+ numberOfColumnsToOverlapAlongXAxisOfRegion
			* parentRegionXAxisLength - numberOfColumnsToOverlapAlongXAxisOfRegion)
			/ parentRegionXAxisLength); // = 10
	int connectingRectangleYAxisLength = Math
		.round((childRegionYAxisLength
			+ numberOfColumnsToOverlapAlongXAxisOfRegion
			* parentRegionYAxisLength - numberOfColumnsToOverlapAlongYAxisOfRegion)
			/ parentRegionYAxisLength); // = 10

	int shiftAmountXAxis = connectingRectangleXAxisLength - numberOfColumnsToOverlapAlongXAxisOfRegion; // = 10 - 2
	int shiftAmountYAxis = connectingRectangleYAxisLength - numberOfColumnsToOverlapAlongYAxisOfRegion; // = 10 - 2
	for (int parentColumnX = 0; parentColumnX < (parentRegionXAxisLength-shiftAmountXAxis); parentColumnX++) {
	    for (int parentColumnY = 0; parentColumnY < (parentRegionYAxisLength-shiftAmountYAxis); parentColumnY++) {

		// xStart = 0, 8, 16, 24, 32, 40, 48, 56
		// yStart = 0, 8, 16, 24, 32, 40, 48, 56
		int xStart = parentColumnX * shiftAmountXAxis;
		int yStart = parentColumnY * shiftAmountYAxis;

		// xEnd = 10, 18, 26, 34, 42, 50, 58, 66
		// yEnd = 10, 18, 26, 34, 42, 50, 58, 66
		int xEnd = xStart + connectingRectangleXAxisLength;
		int yEnd = yStart + connectingRectangleYAxisLength;

		Stub_Column parentColumn = parentRegionColumns[parentColumnX][parentColumnY];

		for (int childColumnX = xStart; childColumnX < xEnd; childColumnX++) {
		    for (int childColumnY = yStart; childColumnY < yEnd; childColumnY++) {

			for (Stub_Neuron childColumnXYNeuron : childRegionColumns[childColumnX][childColumnY]
				.getNeurons()) {
			    // # of synapses connected/add = connectingRectangleXAxisLength *
			    // connectingRectangleYAxisLength * column.getNeurons.length
			    parentColumn.getProximalSegment().addSynapse(
				    new Stub_Synapse<Stub_Cell>(childColumnXYNeuron));
			}
		    }
		}
	    }
	}
    }
}