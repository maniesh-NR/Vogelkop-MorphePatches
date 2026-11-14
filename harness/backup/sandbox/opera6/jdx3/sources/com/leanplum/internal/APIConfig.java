package com.leanplum.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.leanplum.Leanplum;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.Map;

/* loaded from: classes.dex */
public class APIConfig {
    private static final APIConfig INSTANCE = new APIConfig();
    private String accessKey;
    private String appId;
    private String deviceId;
    private String token;
    private String userId;

    public static APIConfig getInstance() {
        return INSTANCE;
    }

    public String accessKey() {
        return this.accessKey;
    }

    public String appId() {
        return this.appId;
    }

    public boolean attachApiKeys(Map<String, Object> map) {
        String str = this.appId;
        if (str == null || this.accessKey == null) {
            Log.e("API keys are not set. Please use Leanplum.setAppIdForDevelopmentMode or Leanplum.setAppIdForProductionMode.", new Object[0]);
            return false;
        }
        map.put(Constants.Params.APP_ID, str);
        map.put(Constants.Params.CLIENT_KEY, this.accessKey);
        map.put(Constants.Params.CLIENT, Constants.CLIENT);
        return true;
    }

    public String deviceId() {
        return this.deviceId;
    }

    public void loadToken() {
        String string = Leanplum.getContext().getSharedPreferences(Constants.Defaults.LEANPLUM, 0).getString(Constants.Defaults.TOKEN_KEY, null);
        if (string == null) {
            return;
        }
        setToken(string);
    }

    public void loadToken(String str) {
        this.token = str;
    }

    public void saveToken() {
        SharedPreferences.Editor editorEdit = Leanplum.getContext().getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.putString(Constants.Defaults.TOKEN_KEY, getInstance().token());
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    public void setAppId(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.appId = str.trim();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.accessKey = str2.trim();
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String token() {
        return this.token;
    }

    public String userId() {
        return this.userId;
    }
}
