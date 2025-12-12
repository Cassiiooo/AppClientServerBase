import java.io.PrintWriter;
import java.net.Socket;

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                BufferedRefear in = new BufferedReader(new InputStreamReader(socket, getinputStream()));
                PrintWriter out = new PrinterWriter(socket.getOutputStream(), true);
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if ("BYE".equalsIgnoreCase(inputLine)) break;
                String response = inputLine.toUpperCase();
                out.println("ECHO: " + response);
            }
        } catch (IDException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IDException e) {
                System.out.println(e.toString());
            }
        }
    }
}