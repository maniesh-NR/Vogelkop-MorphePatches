package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.ah3;
import ads_mobile_sdk.j0;
import ads_mobile_sdk.l0;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.xu0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fsg;
import defpackage.na2;
import defpackage.o5p;
import defpackage.xd5;
import defpackage.xgp;
import defpackage.zhl;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/common/AdActivity;", "Lxd5;", "<init>", "()V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class AdActivity extends xd5 {
    public o5p a;

    @Override // defpackage.xd5, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.onConfigurationChanged();
        }
    }

    @Override // defpackage.xd5, defpackage.wd5, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o5p o5pVar;
        Bundle bundle2;
        super.onCreate(bundle);
        xgp.a.getClass();
        if (ru0.b.a == null) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        mt5 mt5Var = null;
        Integer numValueOf = (extras == null || (bundle2 = extras.getBundle("ad_activity_delegate_bundle")) == null) ? null : Integer.valueOf(bundle2.getInt("ad_activity_delegate"));
        if (numValueOf == null) {
            ((ah3) ((sb0) ru0.a()).F.get()).a("AdActivityMissingDelegateKey", (Throwable) new Exception("AdActivityMissingDelegateKey"));
            xu0.a("Could not retrieve AdActivityDelegate key", (Exception) null);
            finish();
            return;
        }
        j0 j0Var = (j0) ((l0) ((sb0) ru0.a()).Q.get()).d.remove(numValueOf);
        if (j0Var != null) {
            j0Var.b.k((CancellationException) null);
            o5pVar = j0Var.a;
        } else {
            o5pVar = null;
        }
        if (o5pVar == null) {
            ((ah3) ((sb0) ru0.a()).F.get()).a("AdActivityMissingDelegate", (Throwable) new Exception("AdActivityMissingDelegate"));
            xu0.a("No AdActivityDelegate associated with key", (Exception) null);
            finish();
            return;
        }
        this.a = o5pVar;
        requestWindowFeature(1);
        try {
            getWindow().getDecorView();
            o5pVar.a(this);
        } catch (Exception e) {
            xgp.a.getClass();
            ((ah3) ((sb0) ru0.a()).F.get()).a("AdActivityDecorViewWorkaround", (Throwable) e);
            xu0.a("Failed to get DecorView", e);
            na2.B((nx5) ((sb0) ru0.a()).u.get(), h.a, null, new fsg(new zhl((byte) 11, mt5Var, (Object) o5pVar), mt5Var, (byte) 3), 2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.onDestroy();
        }
        this.a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.c();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.a();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.onStop();
        }
        super.onStop();
    }

    @Override // defpackage.xd5, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.b();
        }
    }

    @Override // defpackage.xd5, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.e();
        }
    }

    @Override // defpackage.xd5, android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.e();
        }
    }

    @Override // defpackage.xd5, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        o5p o5pVar = this.a;
        if (o5pVar != null) {
            o5pVar.e();
        }
    }
}
