package fr.diginamic.ia;

import java.util.Arrays;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.util.TransferFunctionType;

public class TestNeuroph {

	public static void main(String[] args) {
		
		MultiLayerPerceptron multiLayer = new MultiLayerPerceptron(TransferFunctionType.TANH, 2, 4, 1);
		
		DataSet dataSet = new DataSet(2, 1);
		DataSetRow rowOne = new DataSetRow(new double[] {0, 0}, new double[] {0});
		DataSetRow rowTwo = new DataSetRow(new double[] {0, 1}, new double[] {1});
		DataSetRow rowThree = new DataSetRow(new double[] {1, 0}, new double[] {1});
		DataSetRow rowFour = new DataSetRow(new double[] {1, 1}, new double[] {1});
		
		dataSet.add(rowOne);
		dataSet.add(rowTwo);
		dataSet.add(rowThree);
		dataSet.add(rowFour);
		
		int essais = 0;
		boolean precisionOk = false;
		multiLayer.learn(dataSet);
		while(!precisionOk) {
			multiLayer.learn(dataSet);
			precisionOk = testIA(multiLayer, dataSet);
			essais++;
		}
		
		System.out.println("Apprentissage terminé en " + essais + " essais");
	}
	
	public static boolean testIA(MultiLayerPerceptron layer, DataSet testSet) {
		boolean retour = false;
		for(DataSetRow dataRow : testSet.getRows()) {
			layer.setInput(dataRow.getInput());
			layer.calculate();
			double[] output = layer.getOutput();
			System.out.println("Input : " + Arrays.toString(dataRow.getInput()));
			System.out.println("Output : " + Arrays.toString(output));
			for(double unOutput : output) {
				if(unOutput < 0.0001) {
					retour = true;
				}
			}
			System.out.println();
		}
		return retour;
	}

}
