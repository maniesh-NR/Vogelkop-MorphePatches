package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gp2 implements j28 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final fn2 e;
    public final hn2 f;

    public gp2(int i, int i2, List list, List list2, fn2 fn2Var, hn2 hn2Var) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            t3p.q("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 == null) {
            t3p.q("Null videoProfiles");
            throw null;
        }
        this.d = list2;
        this.e = fn2Var;
        if (hn2Var != null) {
            this.f = hn2Var;
        } else {
            t3p.q("Null defaultVideoProfile");
            throw null;
        }
    }

    @Override // defpackage.j28
    public final int a() {
        return this.a;
    }

    @Override // defpackage.j28
    public final List b() {
        return this.d;
    }

    @Override // defpackage.j28
    public final int c() {
        return this.b;
    }

    @Override // defpackage.j28
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gp2) {
            gp2 gp2Var = (gp2) obj;
            if (this.a == gp2Var.a && this.b == gp2Var.b && this.c.equals(gp2Var.c) && this.d.equals(gp2Var.d)) {
                fn2 fn2Var = gp2Var.e;
                fn2 fn2Var2 = this.e;
                if (fn2Var2 != null ? fn2Var2.equals(fn2Var) : fn2Var == null) {
                    if (this.f.equals(gp2Var.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        fn2 fn2Var = this.e;
        return ((iHashCode ^ (fn2Var == null ? 0 : fn2Var.hashCode())) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
