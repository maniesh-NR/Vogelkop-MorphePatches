package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a4j {
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        String str = tym.a;
        d = "0";
        e = "1";
        f = "2";
    }

    public a4j(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }

    public a4j(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        z4o.w(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    public static a4j a(Bundle bundle) {
        int i = bundle.getInt(d, 1000);
        String string = bundle.getString(e, "");
        Bundle bundle2 = bundle.getBundle(f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new a4j(string, i, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4j)) {
            return false;
        }
        a4j a4jVar = (a4j) obj;
        return this.a == a4jVar.a && Objects.equals(this.b, a4jVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
