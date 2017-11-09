package test.bwie.com.myedit.presenter;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

import android.content.Context;

import test.bwie.com.myedit.app.App;
import test.bwie.com.myedit.view.iview.ViewMain;

public abstract class BasePresenter<T extends ViewMain>  {
    protected T Iview;

    public BasePresenter(T iview) {
        Iview = iview;
        initModel();
    }

    protected abstract void initModel();

    Context context(){
        if (Iview!=null && Iview.context()!=null){
            return Iview.context();
        }
        return App.context();
    }
}
