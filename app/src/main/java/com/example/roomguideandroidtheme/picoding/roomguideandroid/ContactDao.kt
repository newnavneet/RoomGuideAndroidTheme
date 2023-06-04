package com.example.roomguideandroidtheme.picoding.roomguideandroid

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    fun upsertContact(contact: Contact)

    @Delete
    fun deleteContact (contact: Contact)


    @Query("SELECT * FROM contact ORDER BY firstName ASC ")
    fun getContactsOrderedByFirstName() : Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY lastName ASC ")
    fun getContactsOrderedByLastName() : Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC ")
    fun getContactsOrderedByNamePhoneNumber() : Flow<List<Contact>>




}