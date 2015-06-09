package model.experiments.vision.MARK_II;

import model.MARK_II.connectTypes.AbstractRegionToRegionConnect;
import model.MARK_II.connectTypes.AbstractSensorCellsToRegionConnect;

import java.awt.*;

/**
 * PROBLEM: When a user wants to create a NervousSystem object that is too large for
 * the Java Heap. This is usually when you want to build a NervousSystem with 0.5+ million Neurons.
 *
 * SOLUTION: This class provides a easy to use API for creating your NervousSystem as separately
 * saved JSON files.
 *
 * @author Q Liu (quinnliu@vt.edu)
 * @date 5/27/2015.
 */
public class BigNervousSystem {

    private int maxSizeOfAnyObjectInMB;

    public BigNervousSystem(int maxSizeOfARegionInMB, BigNeocortex bigNeocortex, Dimension retinaDimension,
                            AbstractSensorCellsToRegionConnect opticNerve,
                            String[] retinaConnectionParameterListInOrder) {

    }

    boolean saveConnectedNervousSystemInFolder(String folderName) {
        // TODO:
        return false;
    }
}