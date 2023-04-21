package swing.elements;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;

import javax.swing.JTable;

import entites.Produit;
import entites.Stock;

public class TableMouseListener extends MouseAdapter {
	
	private JTable table;
	private int rowSelected;
	
	public TableMouseListener(JTable table) {
		this.setTable(table);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
	public void mousePressed(MouseEvent event) {
		Point point = event.getPoint();
		int currentRow = table.rowAtPoint(point);
		table.setRowSelectionInterval(currentRow, currentRow);
		setRowSelected(currentRow);
		System.out.println("Select : " + rowSelected);
	}

	/** Getter
	 * @return the rowSelected
	 */
	public int getRowSelected() {
		return rowSelected;
	}

	/** Setter
	 * @param rowSelected the rowSelected to set
	 */
	public void setRowSelected(int rowSelected) {
		this.rowSelected = rowSelected;
	}
	
	
}
