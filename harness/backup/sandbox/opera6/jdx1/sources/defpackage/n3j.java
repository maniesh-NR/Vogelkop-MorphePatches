package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n3j {
    public static final csh d = h1b.v(40010);
    public static final csh e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        c09.e(7, objArr);
        e = h1b.o(7, objArr);
        String str = tym.a;
        f = "0";
        g = "1";
        h = "2";
    }

    public n3j(int i) {
        z4o.v("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public n3j(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }

    public static n3j a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new n3j(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new n3j(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n3j)) {
            return false;
        }
        n3j n3jVar = (n3j) obj;
        return this.a == n3jVar.a && TextUtils.equals(this.b, n3jVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }
}
