package codeforgood.codeforgoodspeech;

/**
 * Created by Nebidimka on 10/29/2016.
 */

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class UserAuthPubKey {
    public static void logon() {
        try {
            JSch jsch = new JSch();

            String user = "force";
            String host = "ec2-54-173-240-113.compute-1.amazonaws.com";
            int port = 22;
            String privateKey = ".ssh/id_rsa";

            jsch.addIdentity(privateKey);
            System.out.println("identity added ");

            Session session = jsch.getSession(user, host, port);
            System.out.println("session created.");

            session.connect();
            System.out.println("session connected.....");

            Channel channel = session.openChannel("sftp");
            channel.setInputStream(System.in);
            channel.setOutputStream(System.out);
            channel.connect();
            System.out.println("shell channel connected....");

            ChannelSftp c = (ChannelSftp) channel;

            String fileName = "brooklyn_team_25.pem";
            c.put(fileName, "./in/");
            c.exit();
            System.out.println("done");

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
