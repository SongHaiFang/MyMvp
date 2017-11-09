package test.bwie.com.myedit.model;

import android.support.annotation.NonNull;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import test.bwie.com.myedit.model.bean.Bean;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

public class DataModel {
    public DataModel() {
    }

    public void get(@NonNull final DataCallBack<Bean> dataCallBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url("http://huixinguiyu.cn/Assets/js/data.js").build();
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                            dataCallBack.onGetFailed(e.toString());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String string = response.body().string();
                        Bean bean1 = new Gson().fromJson(string, Bean.class);
                        dataCallBack.onGetSucced(bean1);
                    }
                });
            }
        }).start();

    }

    public interface DataCallBack<T> {
        void onGetSucced(T t);

        void onGetFailed(String e);
    }


}

