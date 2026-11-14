package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import defpackage.mip;
import defpackage.r3p;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class w12 implements r3p {
    public final Context a;
    public final String b;
    public final String c;
    public final yi d;
    public final Optional e;
    public final mip f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final v12 i;

    public w12(Context context, String str, String str2, yi yiVar, Optional optional, mip mipVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = yiVar;
        this.e = optional;
        this.f = mipVar;
        v12 v12Var = new v12();
        v12Var.a = false;
        v12Var.d = 0L;
        v12Var.f = null;
        this.i = v12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r17) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.w12.a(mt5):java.lang.Object");
    }

    @Override // defpackage.r3p
    public final Object b(nn3 nn3Var, mt5 mt5Var) {
        Object objA;
        boolean z = this.h.get() ? false : nn3Var.b;
        v12 v12Var = this.i;
        v12Var.a = z;
        this.f.getClass();
        v12Var.d = SystemClock.elapsedRealtime();
        v12Var.f = nn3Var;
        return (this.g.get() && (objA = a(mt5Var)) == px5.a) ? objA : Unit.a;
    }
}
