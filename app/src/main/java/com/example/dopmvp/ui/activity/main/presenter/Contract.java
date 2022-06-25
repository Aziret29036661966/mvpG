package com.example.dopmvp.ui.activity.main.presenter;

public class Contract {
    public interface ViewPresenter {
        void onSuccess();

        void onError(String msg);

        void onProgress();

        void closeProgress();
    }

    public interface MainPresenter {
        void onAttach(ViewPresenter viewPresenter);

        void onCreate(String mail, String password);
    }
}
