package com.example.dopmvp.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.dopmvp.data.mail.dao.MailDao;
import com.example.dopmvp.data.mail.entity.MailEntity;

@Database(entities = {MailEntity.class},
        version = 0)
abstract public class DataBaseLocal extends RoomDatabase {
    public abstract MailDao mailDao();
}
