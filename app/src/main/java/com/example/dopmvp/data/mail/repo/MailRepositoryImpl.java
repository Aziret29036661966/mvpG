package com.example.dopmvp.data.mail.repo;

import androidx.lifecycle.LiveData;

import com.example.dopmvp.data.mail.dao.MailDao;
import com.example.dopmvp.data.mail.entity.MailEntity;
import com.example.dopmvp.domain.repo.MailRepository;

import java.util.List;

import javax.inject.Inject;

public class MailRepositoryImpl implements MailRepository {

    private final MailDao mailDao;

    @Inject
    public MailRepositoryImpl(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public void createMail(String mail, String password) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mailDao.createMail(new MailEntity(mail, password));
    }

    @Override
    public LiveData<List<MailEntity>> getAllList() {
        return mailDao.getAllList();
    }
}
