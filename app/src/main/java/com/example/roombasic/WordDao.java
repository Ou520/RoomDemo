package com.example.roombasic;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao   // Database access object
public interface WordDao {

    //插入数据
    @Insert
    void insertWords(Word... words);

    //修改数据
    @Update
    void updateWords(Word... words);

    //删除数据
    @Delete
    void deleteWords(Word... words);

    //删除所以数据
    @Query("DELETE FROM WORD")
    void deleteAllWords();

    //查询所以数据
    @Query("SELECT * FROM WORD ORDER BY ID DESC")
    //List<Word> getAllWords();
    LiveData<List<Word>>getAllWordsLive();

}
