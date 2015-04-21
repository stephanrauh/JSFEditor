package de.beyondjava.eclipse.jsfeditor.jsf;

import org.eclipse.ui.editors.text.TextEditor;

public class JSFEditor extends TextEditor {

	private ColorManager colorManager;

	public JSFEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
