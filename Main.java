public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command(editor);

        editor.setText("Texto original");
        editor.setCursor(0, 0);
        editor.setSelectionWidth(10);
        System.out.println("Estado inicial: " + editor);
        System.out.println(" ");

        command.performOperation("Novo texto", 5, 10, 15);
        System.out.println("Após a operação: " + editor);
        System.out.println(" ");

        command.undo();
        System.out.println("Após desfazer: " + editor);
        System.out.println(" ");
    }
}
