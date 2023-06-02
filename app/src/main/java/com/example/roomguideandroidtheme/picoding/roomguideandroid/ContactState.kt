package com.example.roomguideandroidtheme.picoding.roomguideandroid

data class ContactState(
    val contact: List<Contact> = emptyList(),
    val firstName: String ="",
    val lastName: String ="",
    val phoneNumber: String ="",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME





)
