package com.example.laba_1

class cat: animal(), Ivoice {
    override fun say(textMessage: String, loudness: Float):String {
       return if(loudness<1)textMessage.lowercase()else textMessage.uppercase()
    }

    override fun loudVoice(phrase: String):String {
       return say(phrase, 1F)
    }

    override fun quietVoice(phrase: String):String {
       return say(phrase, 0.25F)
    }
}