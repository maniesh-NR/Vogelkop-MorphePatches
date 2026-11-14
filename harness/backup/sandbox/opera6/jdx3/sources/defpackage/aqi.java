package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class aqi extends yz {
    public long s;
    public final bp t;

    public aqi(String str, String str2, String str3, String str4, String str5, String str6, String str7, dl dlVar, String str8, yo yoVar, bp bpVar, i3j i3jVar, ap apVar) {
        this(str, str2, str3, str4, str5, str6, str7, dlVar, str8, yoVar, rm.h, bpVar, i3jVar, apVar);
    }

    public aqi(String str, String str2, String str3, String str4, String str5, String str6, String str7, dl dlVar, String str8, yo yoVar, rm rmVar, bp bpVar, i3j i3jVar, ap apVar) {
        super(str, str2, str3, str4, str5, str6, str7, dlVar, str8, yoVar, rmVar, i3jVar, apVar);
        this.t = bpVar;
        bpVar.b = this;
    }

    public aqi(yo yoVar, rm rmVar, String str, dl dlVar, bp bpVar, int i, i3j i3jVar, ap apVar) {
        this("", "", null, null, "", str + "," + i, str, dlVar, "", yoVar, rmVar, bpVar, i3jVar, apVar);
    }

    @Override // defpackage.yz
    public void c() {
        bp bpVar = this.t;
        if (bpVar != null) {
            bpVar.b = null;
        }
    }

    @Override // defpackage.yz
    public final boolean o() {
        bp bpVar = this.t;
        return bpVar != null && bpVar.a > 0;
    }

    @Override // defpackage.yz
    public final boolean q() {
        if (u()) {
            return true;
        }
        return SystemClock.elapsedRealtime() >= (this.m + this.s) - 300000;
    }

    @Override // defpackage.yz
    public final boolean s() {
        return this.t != null;
    }

    @Override // defpackage.yz
    public final boolean t() {
        return this.t != null;
    }

    public boolean u() {
        return false;
    }
}
