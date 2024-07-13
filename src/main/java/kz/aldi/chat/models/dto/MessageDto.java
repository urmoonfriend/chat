package kz.aldi.chat.models.dto;

import kz.aldi.chat.models.entity.ChatRoom;
import kz.aldi.chat.models.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MessageDto {
    private User sender;
    private ChatRoom chatRoom;
    private String messageContent;
}
