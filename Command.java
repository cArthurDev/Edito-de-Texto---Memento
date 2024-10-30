
class Command {
    private Snapshot backup;
    private final Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup() {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restore();
        }
    }

    public void performOperation(String newText, int newX, int newY, int newSelectionWidth) {
        makeBackup();
        editor.setText(newText);
        editor.setCursor(newX, newY);
        editor.setSelectionWidth(newSelectionWidth);
    }
}
