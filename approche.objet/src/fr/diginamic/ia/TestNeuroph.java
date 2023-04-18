package fr.diginamic.ia;

import java.util.Arrays;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.util.TransferFunctionType;

public class TestNeuroph {

	public static void main(String[] args) {
		
		MultiLayerPerceptron multiLayer = new MultiLayerPerceptron(TransferFunctionType.TANH, 2, 1, 1);
		DataSet dataSet = new DataSet(2, 1);
		DataSetRow rowOne = new DataSetRow(new double[] {0, 0}, new double[] {0});
		DataSetRow rowTwo = new DataSetRow(new double[] {0, 1}, new double[] {1});
		DataSetRow rowThree = new DataSetRow(new double[] {1, 0}, new double[] {1});
		DataSetRow rowFour = new DataSetRow(new double[] {1, 1}, new double[] {1});
		dataSet.add(rowOne);
		dataSet.add(rowTwo);
		dataSet.add(rowThree);
		dataSet.add(rowFour);
		
		multiLayer.learn(dataSet);
		
		testIA(multiLayer, dataSet);
	}
	
	public static void testIA(MultiLayerPerceptron layer, DataSet testSet) {
		for(DataSetRow dataRow : testSet.getRows()) {
			layer.setInput(dataRow.getInput());
			layer.calculate();
			double[] output = layer.getOutput();
			System.out.println("Input : " + Arrays.toString(dataRow.getInput()));
			System.out.println("Output : " + Arrays.toString(output));
		}
	}

}
