package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zb {
    public final String a;
    public ArrayList b;
    public long c;
    public long d;

    public zb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zb) {
            return this.a.equals(((zb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
