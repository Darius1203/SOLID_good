package test;

import bad.AnotherBadClient;
import bad.BadClient;
import bad.BadServer;
import good.AnotherGoodClient;
import good.Client_I;
import good.GoodClient;
import good.GoodServer;

public class OMain {

    public static void main(String[] args) {
        testBadO();
        testGoodO();
    }

    private static void testBadO() {
        BadClient client = new BadClient();
        BadServer server = new BadServer();
        server.reactToClient(client);

        AnotherBadClient anotherBadClient = new AnotherBadClient();
        //server.reactToClient(anotherBadClient);


    }

    private static void testGoodO() {
        Client_I client = new GoodClient();
        GoodServer server = new GoodServer();
        server.reactToClient(client);

        AnotherGoodClient anotherGoodClient = new AnotherGoodClient();
        server.reactToClient(anotherGoodClient);
    }

}