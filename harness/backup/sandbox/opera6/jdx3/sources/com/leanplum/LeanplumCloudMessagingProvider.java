package com.leanplum;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import com.leanplum.utils.SharedPreferencesUtil;

/* loaded from: classes.dex */
abstract class LeanplumCloudMessagingProvider implements IPushProvider {
    @Override // com.leanplum.IPushProvider
    public String getRegistrationId() {
        Context context = Leanplum.getContext();
        if (context == null) {
            return null;
        }
        return SharedPreferencesUtil.getString(context, Constants.Defaults.LEANPLUM_PUSH, getSharedPrefsPropertyName());
    }

    public abstract String getSharedPrefsPropertyName();

    @Override // com.leanplum.IPushProvider
    public void setRegistrationId(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.d("Registration ID for %s is undefined.", getType());
            return;
        }
        Log.i("Registering for %s push notifications with ID %s", getType(), str);
        if (str.equals(getRegistrationId())) {
            return;
        }
        storeRegistrationId(str);
        Log.d("Sending registration ID to backend.", new Object[0]);
        Leanplum.setRegistrationId(getType(), str);
    }

    public void storeRegistrationId(@NonNull String str) {
        Context context = Leanplum.getContext();
        if (context == null) {
            return;
        }
        Log.d("Saving the registration ID %s in the shared preferences.", str);
        SharedPreferencesUtil.setString(context, Constants.Defaults.LEANPLUM_PUSH, getSharedPrefsPropertyName(), str);
    }
}
