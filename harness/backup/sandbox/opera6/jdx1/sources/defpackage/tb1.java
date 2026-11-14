package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class tb1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ tb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(String str) {
        Unit q0iVar;
        switch (this.a) {
            case 0:
                try {
                    ((Context) this.b).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return;
                } catch (ActivityNotFoundException e) {
                    throw new IllegalArgumentException(sko.k("Can't open ", str, "."), e);
                }
            default:
                try {
                    p0i p0iVar = t0i.b;
                    ((tb1) this.b).a(str);
                    q0iVar = Unit.a;
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                Throwable thD = t0i.d(q0iVar);
                if (thD != null) {
                    gzc gzcVar = hzc.c;
                    gzcVar.getClass();
                    eaj eajVar = eaj.e;
                    if (gzcVar.a.a.compareTo(eajVar) <= 0) {
                        gzcVar.b(eajVar, "", "Failed to open uri", thD);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
