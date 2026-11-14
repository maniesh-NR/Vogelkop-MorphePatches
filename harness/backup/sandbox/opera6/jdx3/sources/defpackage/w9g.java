package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w9g {
    public final String a;
    public final lag b;

    public w9g(String str, lag lagVar) {
        this.a = str;
        this.b = lagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w9g.class == obj.getClass()) {
            w9g w9gVar = (w9g) obj;
            if (this.a.equals(w9gVar.a) && this.b == w9gVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
