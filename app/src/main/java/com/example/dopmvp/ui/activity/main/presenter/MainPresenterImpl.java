package com.example.dopmvp.ui.activity.main.presenter;

import com.example.dopmvp.domain.repo.MailRepository;

import javax.inject.Inject;

public class MainPresenterImpl implements Contract.MainPresenter {

    private Contract.ViewPresenter viewState;

    private final MailRepository mailRepository;

    @Inject
    public MainPresenterImpl(MailRepository mailRepository) {
        this.mailRepository = mailRepository;
    }

    @Override
    public void onAttach(Contract.ViewPresenter viewPresenter) {
        viewState = viewPresenter;
    }

    @Override
    public void onCreate(String mail, String password) {
        mailRepository.createMail(mail, password);
        viewState.onProgress();
    }
}
