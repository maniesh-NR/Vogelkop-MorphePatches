package defpackage;

import android.content.Context;
import android.webkit.JavascriptInterface;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m2p {
    public final f2p a;
    public final Context b;

    public m2p(f2p f2pVar) {
        this.a = f2pVar;
        this.b = f2pVar.getContext().getApplicationContext();
    }

    public final boolean a() {
        Boolean q0iVar;
        Object objCall;
        try {
            p0i p0iVar = t0i.b;
            ce2 ce2Var = new ce2(this, (byte) 10);
            try {
                if (pfp.b()) {
                    objCall = ce2Var.call();
                } else {
                    FutureTask futureTask = new FutureTask(ce2Var);
                    pfp.a(futureTask);
                    objCall = futureTask.get(2000L, TimeUnit.MILLISECONDS);
                }
            } catch (Exception unused) {
                objCall = null;
            }
            q0iVar = Boolean.valueOf(aap.f().a((String) objCall));
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        Boolean bool = Boolean.FALSE;
        p0i p0iVar3 = t0i.b;
        if (q0iVar instanceof q0i) {
            q0iVar = bool;
        }
        return q0iVar.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @android.webkit.JavascriptInterface
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String cai(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2p.cai(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public final void destroy() {
        if (a()) {
            pfp.a(new l2p(this, (byte) 0));
        }
    }

    @JavascriptInterface
    public final void reportAdmReady() {
        ito[] itoVarArr = ito.a;
        pfp.a(new l2p(this, (byte) 1));
    }

    @JavascriptInterface
    public final void shouldPauseAutoRefresh(boolean z) {
        ito[] itoVarArr = ito.a;
        pfp.a(new s03((byte) 9, this, z));
    }
}
