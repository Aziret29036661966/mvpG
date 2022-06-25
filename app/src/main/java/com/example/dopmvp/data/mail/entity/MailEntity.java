package com.example.dopmvp.data.mail.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.dopmvp.data.common.utils.DataUtils;

@Entity(tableName = DataUtils.TABLE_NAME)
public class MailEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String mail;
    private String password;

    public MailEntity(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
