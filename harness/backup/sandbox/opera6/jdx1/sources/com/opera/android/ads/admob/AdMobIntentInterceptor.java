package com.opera.android.ads.admob;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.opera.android.OperaApplication;
import defpackage.hda;
import defpackage.rm5;

/* loaded from: classes.dex */
public class AdMobIntentInterceptor extends AdActivity {
    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        String[] strArr = OperaApplication.K;
        if (rm5.z(this, intent, new hda(null, this, (byte) 18))) {
            finish();
            return;
        }
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            intent.putExtra("com.android.browser.application_id", getPackageName());
        }
        super.startActivity(intent, bundle);
    }
}
