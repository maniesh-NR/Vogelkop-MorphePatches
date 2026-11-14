package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class njd {
    public static final njd d = new njd(new ua7((byte) 23, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = tym.a;
        e = "0";
        f = "1";
        g = "2";
    }

    public njd(ua7 ua7Var) {
        this.a = (Uri) ua7Var.b;
        this.b = (String) ua7Var.c;
        this.c = (Bundle) ua7Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njd)) {
            return false;
        }
        njd njdVar = (njd) obj;
        if (Objects.equals(this.a, njdVar.a) && Objects.equals(this.b, njdVar.b)) {
            if ((this.c == null) == (njdVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
