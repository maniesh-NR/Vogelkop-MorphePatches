package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class a4o {
    public static final List c;
    public static final List d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        List listAsList = Arrays.asList(0, 600, 840);
        c = listAsList;
        ArrayList arrayListV = CollectionsKt.V(Arrays.asList(1200, 1600), listAsList);
        List listAsList2 = Arrays.asList(0, 480, 900);
        d = listAsList2;
        e = listAsList2;
        auj.f(listAsList, listAsList2);
        auj.f(arrayListV, listAsList2);
    }

    public a4o(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            bxl.d(fki.r("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        bxl.d(fki.r("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a4o.class != obj.getClass()) {
            return false;
        }
        a4o a4oVar = (a4o) obj;
        return this.a == a4oVar.a && this.b == a4oVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return fki.s(sb, this.b, ')');
    }
}
