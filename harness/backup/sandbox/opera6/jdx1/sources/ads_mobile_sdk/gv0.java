package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class gv0 extends av0 {
    public final String c;

    public gv0(String str) {
        super(ae1.e);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gv0) && this.c.equals(((gv0) obj).c);
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sko.k("RedirectLimitError(message=", this.c, ")");
    }
}
