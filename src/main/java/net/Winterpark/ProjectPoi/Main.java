package net.Winterpark.ProjectPoi;

/**
 * Created by cobik99 on 04.02.2018.
 */

public class Main {
    public static void main(String[] args) {
        //Mail attachment download
        String host = "pop.gmail.com";
        String port = "995";
        String userName = "javidan.hajizada@gmail.com";
        String password = "war_java_gmail_99";

        String saveDirectory = "/Users/cobik99/Documents/Projects/ProjectPoi";

        EmailAttachmentReceiver receiver = new EmailAttachmentReceiver();
        receiver.setSaveDirectory(saveDirectory);
        receiver.downloadEmailAttachments(host, port, userName, password);

        //attachment parsing
        System.out.println(Parser.parse("testfile.xls"));




    }

}
