package com.example.dopmvp.data.mail.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.dopmvp.data.mail.entity.MailEntity;

import java.util.List;

@Dao
public interface MailDao {
    @Insert
    void createMail(MailEntity mailEntity);

    @Query("SELECT * FROM mail_entity")
    LiveData<List<MailEntity>> getAllList();
}
