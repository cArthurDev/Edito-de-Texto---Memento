class Editor {
    private String text;
    private int curX, curY, selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", curX=" + curX +
                ", curY=" + curY +
                ", selectionWidth=" + selectionWidth +
                '}';
    }
}
