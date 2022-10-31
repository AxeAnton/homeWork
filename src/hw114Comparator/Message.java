package hw114Comparator;

import java.util.*;

import static hw114Comparator.MessageTask.*;

enum MessagePriority {
    LOW, MEDIUM, HIGH, URGENT;

    public static MessagePriority getPriority(int ord) {
        for (MessagePriority mp : values()) {
            if (ord == mp.ordinal()) {
                return mp;
            }
        }
        throw new AssertionError("Wrong ordinal: " + ord);
    }
}


public class Message {
    private int code;
    private MessagePriority priority;

    public Message(int code, MessagePriority priority) {
        this.code = code;
        this.priority = priority;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (code != message.code) return false;
        return priority == message.priority;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\n" + "Message{" +
                "code=" + code +
                ", priority=" + priority +
                '}';
    }

    public static void main(String[] args) {
        List<Message> messages = MessageGenerator.generate(10);
        System.out.println(messages);
        //countEachPriority(messages);
        //countEachCode3(messages);
        //uniqueMessageCount1(messages);
        //uniqueMessageCount2(messages);
        // uniqueMessagesInOriginalOrder(messages);
        removeEach(messages, MessagePriority.LOW);
        //removeOther(messages, MessagePriority.LOW);

    }
}

class MessageGenerator { // ГЕНЕРАТОР ОБЪЕКТОВ
    public static List<Message> generate(int num) { // количество сообщений
        if (num <= 0) {
            return Collections.emptyList();
        }

        Random random = new Random();
        List<Message> messages = new ArrayList<>(num);

//        values() - вернет массив констант
        int typesCount = MessagePriority.values().length;

        // extInt - ограничивает верхний придел РАНДОМА
        for (int i = 0; i < num; i++) {
            messages.add(new Message
                    (random.nextInt(10), MessagePriority.getPriority(random.nextInt(typesCount))));
        }

        return messages;
    }
}