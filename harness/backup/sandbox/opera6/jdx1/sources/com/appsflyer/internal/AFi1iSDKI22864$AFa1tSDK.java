package com.appsflyer.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1iSDKI22864$AFa1tSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1fSDK AFAdRevenueData;
    private final long getMediationNetwork;

    public AFi1iSDKI22864$AFa1tSDK(AFi1fSDK aFi1fSDK, long j) {
        this.AFAdRevenueData = aFi1fSDK;
        this.getMediationNetwork = j;
    }

    public final void onComplete(@NotNull Task<IntegrityTokenResponse> task) throws Throwable {
        float f;
        Object objInvoke;
        String strA;
        if (task.isSuccessful()) {
            strA = ((IntegrityTokenResponse) task.getResult()).a();
            f = 0.0f;
            objInvoke = null;
        } else {
            try {
                Object[] objArr = {this.AFAdRevenueData, task.getException()};
                Map map = AFi1jSDK.e;
                Object method = map.get(1949440882);
                if (method != null) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    method = ((Class) AFi1jSDK.AFAdRevenueData(ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("AFAdRevenueData", (Class) AFi1jSDK.AFAdRevenueData(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - TextUtils.indexOf("", "", 0)), Exception.class);
                    map.put(1949440882, method);
                }
                objInvoke = ((Method) method).invoke(null, objArr);
                strA = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.AFAdRevenueData, Long.valueOf(this.getMediationNetwork), strA, objInvoke};
        Map map2 = AFi1jSDK.e;
        Object method2 = map2.get(-1326367481);
        if (method2 == null) {
            method2 = ((Class) AFi1jSDK.AFAdRevenueData(View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getTouchSlop() >> 8), 37 - View.MeasureSpec.getMode(0))).getMethod("getMonetizationNetwork", (Class) AFi1jSDK.AFAdRevenueData(ViewConfiguration.getTapTimeout() >> 16, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 37 - (ViewConfiguration.getLongPressTimeout() >> 16)), Long.TYPE, String.class, String.class);
            map2.put(-1326367481, method2);
        }
        ((Method) method2).invoke(null, objArr2);
        Object[] objArr3 = {this.AFAdRevenueData};
        Object method3 = map2.get(-2030000374);
        if (method3 == null) {
            method3 = ((Class) AFi1jSDK.AFAdRevenueData(0, (char) 0, 36 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("getRevenue", (Class) AFi1jSDK.AFAdRevenueData(TextUtils.getOffsetBefore("", 0), (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
            map2.put(-2030000374, method3);
        }
        ((CountDownLatch) ((Method) method3).invoke(null, objArr3)).countDown();
    }
}
