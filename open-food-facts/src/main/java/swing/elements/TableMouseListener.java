package swing.elements;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;

public class TableMouseListener extends MouseAdapter {
	
	private JTable table;
	
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
		if(event.getButton() == MouseEvent.BUTTON2) {
			Point point = event.getPoint();
			int currentRow = table.rowAtPoint(point);
			table.setRowSelectionInterval(currentRow, currentRow);
		}
	}
}
