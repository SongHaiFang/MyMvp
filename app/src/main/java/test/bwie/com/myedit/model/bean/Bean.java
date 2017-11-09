package test.bwie.com.myedit.model.bean;

import java.util.List;

/**
 * data:2017/11/4 0004.
 * Created by ：宋海防  song on
 */

public class Bean {



    public int dataSize;
    public List<ApkBean> apk;

    public static class ApkBean {

        public String id;
        public String name;
        public String iconUrl;
        public String downloadUrl;
        public String packageName;
        public String versionName;
        public String versionCode;
        public String apkSize;
        public String downloadTimes;
        public String categoryName;
        public String from;
        public int markid;
    }
}
