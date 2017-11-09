package test.bwie.com.myedit.view.iview;

import test.bwie.com.myedit.model.bean.Bean;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

public interface ViewMain extends IView {
    void okGetSuccess(Bean bean);
    void okGetFail(String e);
}
