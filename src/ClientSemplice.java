dpublic class ClientSemplice {
    public static void main(String[] args) {
        final String hostname= "127.0.0.1";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            PrintWriter out = new PrinterWriter(socket.getOutputStream(), true);
            BufferedRefear in= new BufferedReader(new InputStreamReader(socket, getinputStream()));
            Scanner scanner= new Scanner(System.in);

            System.out.println("connesso al server: scrivi qualcosa");
            String userInput;fd
            while(userInput= scanner.nextLine()!= null){
                out.println(userInput);

            }
        } catch(IDException e){
            e.printStackTrace;
        }
    }
}
