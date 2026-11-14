package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ksn implements lsn {
    public final boolean a;
    public final boolean b;
    public final rxh c = new rxh(2132017497);
    public final l08 d;

    public ksn(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        msn msnVar = msn.a;
        this.d = l08.a;
    }

    @Override // defpackage.lsn
    public final boolean a() {
        return true;
    }

    @Override // defpackage.lsn
    public final msn b() {
        return msn.c;
    }

    @Override // defpackage.lsn
    public final boolean c() {
        return false;
    }

    @Override // defpackage.lsn
    public final boolean d() {
        return false;
    }

    @Override // defpackage.lsn
    public final pxh e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn)) {
            return false;
        }
        ksn ksnVar = (ksn) obj;
        return this.a == ksnVar.a && this.b == ksnVar.b;
    }

    @Override // defpackage.lsn
    public final Boolean f() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.lsn
    public final List g() {
        return this.d;
    }

    @Override // defpackage.lsn
    public final pxh getText() {
        return null;
    }

    @Override // defpackage.lsn
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.lsn
    public final boolean isEnabled() {
        return false;
    }

    @Override // defpackage.lsn
    public final boolean isVisible() {
        return false;
    }

    public final String toString() {
        return "";
    }
}
