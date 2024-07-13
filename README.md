# Simple Chat

## Описание проекта:

#### - Cервис имитирующий мессенджер. Сервис работает через REST API.

## Как взаимодействовать?
#### SWAGGER http://localhost:58087/swagger-ui/index.html

## Примеры запросов

### 1. **Создание пользователя**

**Request**

`POST /chat/users/create`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Request Body

```json
{
  "name": "Aidos",
  "login": "aidos@gmail.com",
  "password": "123456"
}
```
### Example using curl
```
curl --location 'localhost:58087/chat/users/create' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Aidos",
    "login": "aidos@gmail.com",
    "password": "123456"
}'
```
### Response Body

```json
{
  "id": 1,
  "name": "Aidos"
}
```


### 2. **Регистрация пользователя**

**Request**

`POST /chat/register`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Request Body

```json
{
  "login": "aidos@gmail.com",
  "password": "123456"
}
```
### Example using curl
```
curl --location 'localhost:58087/chat/register' \
--header 'Content-Type: application/json' \
--data '{
    "login": "aidos@gmail.com",
    "password": "123456"
}'
```
### Response Body

welcome

### 3. **Получение пользователя**

**Request**

`GET /chat/users/{userId}`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Request Body

### Example using curl
```
curl --location 'localhost:58087/chat/users/1'
```
### Response Body

```json
{
  "id": 1,
  "name": "Aidos"
}
```

### 4. **Создание чат рума**

**Request**

`POST /chat/chatRooms`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Request Body

```json
{
  "name": "chatroom name",
  "userIdList": [1, 2, 3]
}
```
### Example using curl
```
curl --location 'localhost:58087/chat/chatRooms' \
   --header 'Content-Type: application/json' \
   --data '{
   "name": "chatroom name",
   "userIdList": [1, 2, 3]
   }'
```
### Response Body

```json
{
    "id": 1,
    "name": "chatroom name"
}
```

### 5. **Получение чат румов**

**Request**

`GET /chat/chatRooms`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Example using curl
```
curl --location 'localhost:58087/chat/chatRooms'
```
### Response Body

```json
[
  {
    "id": 1,
    "name": "teamates"
  }
]
```

### 6. **Получение чат румов по userId**

**Request**

`GET /chat/chatRooms/{userId}`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Example using curl
```
curl --location 'localhost:58087/chat/chatRoom/2'
```
### Response Body

```json
[
  {
    "id": 1,
    "name": "teamates"
  }
]
```

### 7. **Отправка сообщения**

**Request**

`POST /chat/messages/send`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Request Body
* ### Отправка сообщения пользователю
```json
{
  "fromUserId": 1,
  "toUserId": 2,
  "text": "Hello"
}
```
### Example using curl
```
curl --location 'localhost:58087/chat/messages/send' \
--header 'Content-Type: application/json' \
--data '{
    "fromUserId": 1,
    "toUserId": 2,
    "text": "Hello"
}'
```

* ### Отправка сообщения в чатрум

```json
{
  "fromUserId": 1,
  "toChatId": 2,
  "text": "Hello chat"
}
```
### Example using curl
```
curl --location 'localhost:58087/chat/messages/send' \
--header 'Content-Type: application/json' \
--data '{
    "fromUserId": 1,
    "toChatId": 2,
    "text": "Hello chat"
}'
```
### Response Body

```json
[
  {
    "sender": {
      "id": 1,
      "name": "Aidos"
    },
    "messageContent": "Hello chat",
    "updatedAt": "2024-07-12T13:21:16.208001"
  },
  {
    "sender": {
      "id": 1,
      "name": "Aidos"
    },
    "messageContent": "Hello",
    "updatedAt": "2024-07-12T13:20:09.357597"
  }
]
```

### 9. **Получение сообщений чатрума**

**Request**

`GET /chat/messages/{chatRoomId}`

### Headers

- `Content-Type: application/json`
- `Authorization: Bearer <token>`

### Example using curl
```
curl --location 'localhost:58087/chat/messages/2'
```
### Response Body

```json
[
  {
    "sender": {
      "id": 1,
      "name": "Aidos"
    },
    "messageContent": "Hello chat",
    "updatedAt": "2024-07-12T13:21:16.208001"
  },
  {
    "sender": {
      "id": 1,
      "name": "Aidos"
    },
    "messageContent": "Salam",
    "updatedAt": "2024-07-12T13:20:09.357597"
  }
]
```


