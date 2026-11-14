package com.leanplum;

import android.content.Context;
import android.text.TextUtils;
import com.leanplum.internal.APIConfig;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import com.leanplum.internal.OperationQueue;
import com.leanplum.internal.Util;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class PushProviders {
    private static String FCM_PROVIDER_CLASS = "com.leanplum.LeanplumFcmProvider";
    private static String MIPUSH_PROVIDER_CLASS = "com.leanplum.LeanplumMiPushProvider";
    private final Map<PushProviderType, IPushProvider> providers = new ConcurrentHashMap();
    private boolean initialized = false;

    public PushProviders() {
        init();
    }

    private static IPushProvider createFcm() {
        if (!Util.hasPlayServices()) {
            Log.i("No valid Google Play Services APK found. FCM will not initialize.", new Object[0]);
            return null;
        }
        try {
            return (IPushProvider) Class.forName(FCM_PROVIDER_CLASS).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            Log.i("FCM module not found. For Firebase messaging include dependency \"com.leanplum:leanplum-fcm\".", new Object[0]);
            return null;
        }
    }

    private static IPushProvider createMiPush() {
        try {
            Class<?> cls = Class.forName(MIPUSH_PROVIDER_CLASS);
            if (Util.isXiaomiDevice()) {
                return (IPushProvider) cls.getConstructor(null).newInstance(null);
            }
            Log.d("Will not initialize MiPush provider for non-Xiaomi device.", new Object[0]);
            return null;
        } catch (Throwable unused) {
            Log.i("MiPush module not found. For Mi Push messaging include dependency \"com.leanplum:leanplum-mipush\".", new Object[0]);
            return null;
        }
    }

    public static boolean hasAppIDChanged(String str) {
        Context context;
        if (TextUtils.isEmpty(str) || (context = Leanplum.getContext()) == null) {
            return false;
        }
        String string = SharedPreferencesUtil.getString(context, Constants.Defaults.LEANPLUM_PUSH, Constants.Defaults.APP_ID);
        if (!str.equals(string)) {
            Log.d("Saving the application id in the shared preferences.", new Object[0]);
            SharedPreferencesUtil.setString(context, Constants.Defaults.LEANPLUM_PUSH, Constants.Defaults.APP_ID, str);
            if (!"".equals(string)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void init() {
        if (this.initialized) {
            return;
        }
        if (Leanplum.getContext() == null) {
            return;
        }
        IPushProvider iPushProviderCreateFcm = createFcm();
        if (iPushProviderCreateFcm != null) {
            this.providers.put(PushProviderType.FCM, iPushProviderCreateFcm);
        }
        IPushProvider iPushProviderCreateMiPush = createMiPush();
        if (iPushProviderCreateMiPush != null) {
            this.providers.put(PushProviderType.MIPUSH, iPushProviderCreateMiPush);
        }
        this.initialized = true;
    }

    public void setRegistrationId(PushProviderType pushProviderType, String str) {
        synchronized (this.providers) {
            IPushProvider iPushProvider = this.providers.get(pushProviderType);
            if (iPushProvider != null) {
                iPushProvider.setRegistrationId(str);
            }
        }
    }

    public void updateRegistrationIdsAndBackend() {
        boolean zHasAppIDChanged = hasAppIDChanged(APIConfig.getInstance().appId());
        synchronized (this.providers) {
            for (final IPushProvider iPushProvider : this.providers.values()) {
                if (zHasAppIDChanged) {
                    iPushProvider.unregister();
                }
                OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.PushProviders.1
                    @Override // java.lang.Runnable
                    public void run() {
                        iPushProvider.updateRegistrationId();
                    }
                });
            }
        }
    }
}
