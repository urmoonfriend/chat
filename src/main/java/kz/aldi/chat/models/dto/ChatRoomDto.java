package kz.aldi.chat.models.dto;

import kz.aldi.chat.models.entity.Message;
import kz.aldi.chat.models.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class ChatRoomDto {

    private String name;

    private List<Message> messages = new ArrayList<>();

    private List<User> users = new ArrayList<>();
}
