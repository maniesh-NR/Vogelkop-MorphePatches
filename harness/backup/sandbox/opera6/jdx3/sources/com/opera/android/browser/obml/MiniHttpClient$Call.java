package com.opera.android.browser.obml;

import J.N;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import defpackage.cda;
import defpackage.hzd;
import defpackage.pp6;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class MiniHttpClient$Call {
    public long a;
    public pp6 b;
    public final /* synthetic */ hzd c;

    public MiniHttpClient$Call(hzd hzdVar, g77 g77Var, pp6 pp6Var) {
        HashMap map = (HashMap) g77Var.b;
        this.c = hzdVar;
        this.b = pp6Var;
        try {
            long jMDswzPDG = N.MDswzPDG(this);
            this.a = jMDswzPDG;
            if (jMDswzPDG == 0) {
                throw new OutOfMemoryError();
            }
            if (!map.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : map.entrySet()) {
                    sb.append(String.format(Locale.US, "%s: %s\n", entry.getKey(), entry.getValue()));
                }
                if (!N.MPmHh3_b(this.a, sb.toString())) {
                    throw new OutOfMemoryError();
                }
            }
            String str = (String) g77Var.c;
            if (str != null && !N.MIfPGjX4(this.a, str)) {
                throw new OutOfMemoryError();
            }
            if (!N.MnYtdHus(this.a, ((URI) g77Var.a).toString(), false)) {
                throw new IOException("Failed to start request.");
            }
            hzdVar.a.add(this);
        } catch (Throwable th) {
            a();
            throw th;
        }
    }

    public final void a() {
        this.b = null;
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M_RORtJH(j);
        this.a = 0L;
        hzd hzdVar = hzd.b;
        this.c.a.remove(this);
    }

    public final void onCallBack(boolean z, @Nullable byte[] bArr) {
        new Handler(Looper.getMainLooper()).post(new cda(this, z, bArr));
    }
}
