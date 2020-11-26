package com.example.talk

data class ChatRoomModel(
    var profilePicPath : String = "",
    var chatRoomName : String = "",
    var lastChat : String = "",
    var lastChatTime : Long? = -1,
    var uid : String = "",
    var chatid : String = "",
    var user : String = ""
)