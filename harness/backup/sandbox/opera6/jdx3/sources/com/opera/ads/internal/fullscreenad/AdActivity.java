package com.opera.ads.internal.fullscreenad;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import defpackage.aap;
import defpackage.cko;
import defpackage.dpo;
import defpackage.h1a;
import defpackage.ito;
import defpackage.j2p;
import defpackage.lzo;
import defpackage.sm;
import defpackage.yi;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/ads/internal/fullscreenad/AdActivity;", "Landroid/app/Activity;", "<init>", "()V", "sdk_okhttp4Release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0})
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final /* synthetic */ int e = 0;
    public cko a;
    public wi b;
    public sm c;
    public long d;

    public final void a() {
        boolean z = this.d > 0 && SystemClock.elapsedRealtime() >= this.d;
        cko ckoVar = this.a;
        if (ckoVar == null || ckoVar.b || z) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211 A[PHI: r0 r2 r7
      0x0211: PHI (r0v20 cm) = (r0v17 cm), (r0v22 cm) binds: [B:82:0x020f, B:64:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r2v9 vm) = (r2v5 vm), (r2v12 vm) binds: [B:82:0x020f, B:64:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r7v4 android.app.Activity) = (r7v2 android.app.Activity), (r7v1 android.app.Activity) binds: [B:82:0x020f, B:64:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0221  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.ads.internal.fullscreenad.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            wi wiVar = this.b;
            if (wiVar != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(wiVar);
            }
            this.b = null;
        }
        cko ckoVar = this.a;
        if (ckoVar != null) {
            dpo dpoVar = ckoVar.e;
            if (dpoVar != null) {
                uio uioVar = dpoVar.a;
                if (uioVar != null) {
                    uioVar.c();
                }
                dpoVar.a = null;
                dpoVar.b = null;
                dpoVar.c = null;
            }
            ckoVar.e = null;
            lzo lzoVar = ckoVar.d;
            if (lzoVar != null) {
                lzoVar.a();
            }
            ckoVar.d = null;
            if (!ckoVar.r && !ckoVar.n) {
                ckoVar.g();
            }
        }
        this.a = null;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        cko ckoVar = this.a;
        if (ckoVar != null) {
            lzo lzoVar = ckoVar.d;
            if (lzoVar != null) {
                lzoVar.b();
            }
            ckoVar.q = false;
            if (!ckoVar.a.isFinishing()) {
                ckoVar.k++;
            }
            if (ckoVar.l >= 0) {
                if (!ckoVar.n) {
                    ckoVar.m = (SystemClock.elapsedRealtime() - ckoVar.l) + ckoVar.m;
                }
                ckoVar.l = -1L;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        ng2 ng2Var;
        byte b;
        super.onResume();
        cko ckoVar = this.a;
        if (ckoVar != null) {
            lzo lzoVar = ckoVar.d;
            if (lzoVar != null && ((b = (ng2Var = lzoVar.e).b) == 2 || b == 4)) {
                j2p j2pVar = lzoVar.a.o;
                if (j2pVar != null) {
                    Objects.toString(j2pVar);
                    ito[] itoVarArr = ito.a;
                    j2pVar.onResume();
                }
                ng2Var.b = (byte) 3;
            }
            ckoVar.q = true;
            ckoVar.d(false);
            if (!ckoVar.o || ckoVar.l >= 0) {
                return;
            }
            ckoVar.l = SystemClock.elapsedRealtime();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        int i;
        lzo lzoVar;
        super.onStart();
        cko ckoVar = this.a;
        if (ckoVar != null && (lzoVar = ckoVar.d) != null) {
            lzoVar.d();
        }
        if (this.d <= 0) {
            sm smVar = this.c;
            int i2 = smVar == null ? -1 : yi.a[smVar.ordinal()];
            if (i2 == 1) {
                i = aap.f().s;
            } else {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                if (i2 != 4) {
                    sm smVar2 = this.c;
                    if (smVar2 != null) {
                        smVar2.d();
                        return;
                    }
                    return;
                }
                i = aap.f().t;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            on7 on7Var = pn7.b;
            this.d = pn7.f(cs5.x0(i, un7.e)) + jElapsedRealtime;
        }
    }
}
