package test.bwie.com.myedit.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.List;

import test.bwie.com.myedit.R;
import test.bwie.com.myedit.model.bean.Bean;
import test.bwie.com.myedit.presenter.MainPresenter;
import test.bwie.com.myedit.view.iview.ViewMain;

public class MainActivity extends AppCompatActivity  implements ViewMain{

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mainPresenter.get();
    }

    @Override
    public void okGetSuccess(final Bean bean) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                List<Bean.ApkBean> apk = bean.apk;
                Toast.makeText(MainActivity.this,apk.get(0).name,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void okGetFail(String e) {
            Toast.makeText(this,e,Toast.LENGTH_LONG).show();
    }

    @Override
    public Context context() {
        return this;
    }
}
