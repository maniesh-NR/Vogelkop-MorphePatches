package com.opera.android.favorites;

import defpackage.ghf;
import defpackage.hq8;
import defpackage.p6l;
import defpackage.tqi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PushedSpeedDialFavorite extends hq8 {
    public final tqi e;
    public final ghf f;

    public PushedSpeedDialFavorite(tqi tqiVar, ghf ghfVar) {
        this.e = tqiVar;
        this.f = ghfVar;
    }

    @Override // defpackage.hq8
    public final String c() {
        return String.valueOf(this.e.a);
    }

    @Override // defpackage.hq8
    public final long e() {
        return this.e.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return PushedSpeedDialFavorite.class.equals(obj != null ? obj.getClass() : null) && Intrinsics.a(this.e, ((PushedSpeedDialFavorite) obj).e);
    }

    @Override // defpackage.hq8
    public final String g() {
        return this.e.g;
    }

    @Override // defpackage.hq8
    public final String h() {
        return this.e.d;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // defpackage.hq8
    public final String i(p6l p6lVar) {
        return this.f.L(this.e.e, p6lVar);
    }

    @Override // defpackage.hq8
    public final void q(String str) {
    }
}
