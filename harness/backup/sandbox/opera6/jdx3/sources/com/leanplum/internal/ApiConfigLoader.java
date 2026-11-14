package com.leanplum.internal;

import android.content.Context;
import android.text.TextUtils;
import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public class ApiConfigLoader {
    private static final String ENV_DEV = "development";
    private static final String ENV_PROD = "production";
    private static final String STRING_APPID = "leanplum_app_id";
    private static final String STRING_DEV_KEY = "leanplum_dev_key";
    private static final String STRING_ENV = "leanplum_environment";
    private static final String STRING_PROD_KEY = "leanplum_prod_key";
    private Context context;

    @FunctionalInterface
    public interface KeyListener {
        void onKeysLoaded(String str, String str2);
    }

    public ApiConfigLoader(Context context) {
        this.context = context;
    }

    private String getStringResource(String str) {
        try {
            return this.context.getString(this.context.getResources().getIdentifier(str, Constants.Kinds.STRING, this.context.getPackageName()));
        } catch (Throwable th) {
            Log.e("Cannot load string for key = %s. Message = %s", str, th.getMessage());
            return null;
        }
    }

    public void loadFromResources(KeyListener keyListener, KeyListener keyListener2) {
        String stringResource = getStringResource(STRING_APPID);
        String stringResource2 = getStringResource(STRING_PROD_KEY);
        String stringResource3 = getStringResource(STRING_DEV_KEY);
        String stringResource4 = getStringResource(STRING_ENV);
        if (TextUtils.isEmpty(stringResource)) {
            return;
        }
        boolean zEquals = ENV_DEV.equals(stringResource4);
        boolean zIsEmpty = TextUtils.isEmpty(stringResource2);
        boolean zIsEmpty2 = TextUtils.isEmpty(stringResource3);
        if (zEquals) {
            if (zIsEmpty2) {
                return;
            }
            keyListener2.onKeysLoaded(stringResource, stringResource3);
            Log.i("Using appId and accessKey from Android resources for development environment.", new Object[0]);
            return;
        }
        if (zIsEmpty) {
            return;
        }
        keyListener.onKeysLoaded(stringResource, stringResource2);
        Log.i("Using appId and accessKey from Android resources for production environment.", new Object[0]);
    }
}
