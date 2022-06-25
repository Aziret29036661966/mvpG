package com.example.dopmvp.domain.repo;

import androidx.lifecycle.LiveData;

import com.example.dopmvp.data.mail.entity.MailEntity;

import java.util.List;

public interface MailRepository {
    void createMail(String mail, String password);

    LiveData<List<MailEntity>> getAllList();
}
