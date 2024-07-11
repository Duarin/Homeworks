package com.gmail.bilvania2906.homeworks.homework12;

public class ClassesAndInterfacePractice {

    public interface Printer {
        void print(Message message);

        public static class Message {
            private String text;
            private String sender;

            public Message(String text, String sender) {
                this.text = text;
                this.sender = sender;
            }

            public String getText() {
                return text;
            }

            public String getSender() {
                return sender;
            }

            public void setText(String text) {
                this.text = text;
            }

            public void setSender(String sender) {
                this.sender = sender;
            }
        }
    }

    public static class PrinterImpl implements Printer {
        @Override
        public void print(Message message) {
            if (message.getText() == null && message.getSender() == null) {
                new Object() {
                    void handle() {
                        System.out.println("Anonymous user sent an empty message");
                    }
                }.handle();
            } else if (message.getSender() == null || message.getSender().isEmpty()) {
                System.out.println("Anonymous user sent a message: " + message.getText());
            } else {
                System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
            }
        }

        public static void main(String[] args) {
            Printer printer = new PrinterImpl();

            Printer.Message msg1 = new Printer.Message("JAVA IS COOL", "John");
            printer.print(msg1);

            Printer.Message msg2 = new Printer.Message("JAVA IS COOL", "");
            printer.print(msg2);

            Printer.Message msg3 = new Printer.Message("JAVA IS COOL", null);
            printer.print(msg3);

            Printer.Message msg4 = new Printer.Message(null, null);
            printer.print(msg4);
        }
    }

}