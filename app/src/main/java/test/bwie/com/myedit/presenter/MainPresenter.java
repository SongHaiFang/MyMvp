package test.bwie.com.myedit.presenter;

import android.app.Activity;
import android.widget.Toast;

import test.bwie.com.myedit.model.bean.Bean;
import test.bwie.com.myedit.model.DataModel;
import test.bwie.com.myedit.view.iview.ViewMain;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

public class MainPresenter extends BasePresenter<ViewMain> {
    private DataModel dataModel;

    public MainPresenter(ViewMain iview) {
        super(iview);
    }

    @Override
    protected void initModel() {
        dataModel = new DataModel();
    }

    public void get(){
        dataModel.get(new DataModel.DataCallBack<Bean>() {
            @Override
            public void onGetSucced(Bean bean) {
                ((Activity)context()).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context(),"OK",Toast.LENGTH_SHORT).show();
                    }
                });
                Iview.okGetSuccess(bean);
            }

            @Override
            public void onGetFailed(String e) {
                Iview.okGetFail(e);
            }
        });

    }
}
