package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class upi {
    public static final upi b;
    public final u1b a;

    static {
        lld lldVar = new lld((byte) 23);
        lldVar.b = u1b.p(2, new Object[]{1, 5});
        b = new upi(lldVar);
    }

    public upi(lld lldVar) {
        this.a = (u1b) lldVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof upi) && this.a.equals(((upi) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
