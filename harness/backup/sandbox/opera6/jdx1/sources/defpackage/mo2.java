package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class mo2 {
    public static final mo2 e;
    public static final mo2 f;
    public static final mo2 g;
    public static final mo2 h;
    public static final mo2 i;
    public static final mo2 j;
    public static final mo2 k;
    public static final HashSet l;
    public static final List m;
    public final int a;
    public final int b;
    public final String c;
    public final List d;

    static {
        mo2 mo2Var = new mo2(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        e = mo2Var;
        mo2 mo2Var2 = new mo2(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f = mo2Var2;
        mo2 mo2Var3 = new mo2(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        g = mo2Var3;
        mo2 mo2Var4 = new mo2(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        h = mo2Var4;
        List list = Collections.EMPTY_LIST;
        mo2 mo2Var5 = new mo2(0, 2000, "LOWEST", list);
        i = mo2Var5;
        mo2 mo2Var6 = new mo2(1, 2001, "HIGHEST", list);
        j = mo2Var6;
        k = new mo2(-1, -1, "NONE", list);
        l = new HashSet(Arrays.asList(mo2Var5, mo2Var6, mo2Var, mo2Var2, mo2Var3, mo2Var4));
        m = Arrays.asList(mo2Var4, mo2Var3, mo2Var2, mo2Var);
    }

    public mo2(int i2, int i3, String str, List list) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        if (list != null) {
            this.d = list;
        } else {
            t3p.q("Null typicalSizes");
            throw null;
        }
    }

    public final int a(int i2) {
        if (i2 == 1) {
            return this.a;
        }
        if (i2 == 2) {
            return this.b;
        }
        qp2.g(sko.i(i2, "Unknown quality source: "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return this.a == mo2Var.a && this.b == mo2Var.b && this.c.equals(mo2Var.c) && this.d.equals(mo2Var.d);
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.a + ", highSpeedValue=" + this.b + ", name=" + this.c + ", typicalSizes=" + this.d + "}";
    }
}
