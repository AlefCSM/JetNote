package com.example.jetnote.data

import androidx.room.*
import com.example.jetnote.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDatabaseDao {

    @Query("SELECT * from notes_tb")
    fun getNotes(): Flow<List<Note>>

    @Query("select * from notes_tb where id = :id")
    suspend fun getNoteById(id:String):Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note:Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
     suspend fun update(note: Note)

    @Query("delete from notes_tb")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteNote(note: Note)
}
