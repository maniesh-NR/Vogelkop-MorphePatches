package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gn2 implements j28 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public gn2(List list, List list2, int i, int i2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            t3p.q("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            t3p.q("Null videoProfiles");
            throw null;
        }
    }

    public static gn2 e(List list, List list2, int i, int i2) {
        return new gn2(Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), i, i2);
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
        if (obj instanceof gn2) {
            gn2 gn2Var = (gn2) obj;
            if (this.a == gn2Var.a && this.b == gn2Var.b && this.c.equals(gn2Var.c) && this.d.equals(gn2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + "}";
    }
}
