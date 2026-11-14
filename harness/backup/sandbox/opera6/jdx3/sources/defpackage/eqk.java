package defpackage;

import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class eqk extends gqk {
    public final Suggestion c;
    public final rxh d;
    public final z4k e;

    public eqk(Suggestion suggestion, rxh rxhVar, z4k z4kVar, xpk xpkVar) {
        super(19, xpkVar);
        this.c = suggestion;
        this.d = rxhVar;
        this.e = z4kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !eqk.class.equals(obj.getClass())) {
            return false;
        }
        return this.c.equals(((eqk) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
