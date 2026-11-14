package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nnl extends xjh {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = tym.a;
        d = "1";
        e = "2";
    }

    public nnl() {
        this.b = false;
        this.c = false;
    }

    public nnl(boolean z) {
        this.b = true;
        this.c = z;
    }

    @Override // defpackage.xjh
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.xjh
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(xjh.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nnl)) {
            return false;
        }
        nnl nnlVar = (nnl) obj;
        return this.c == nnlVar.c && this.b == nnlVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }
}
