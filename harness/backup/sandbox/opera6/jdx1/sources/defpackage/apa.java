package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class apa {
    public static final apa b;
    public static final apa c;
    public static final apa d;
    public static final apa e;
    public static final apa f;
    public static final apa g;
    public static final apa h;
    public static final apa i;
    public static final apa j;
    public static final List k;
    public final String a;

    static {
        apa apaVar = new apa("GET");
        b = apaVar;
        apa apaVar2 = new apa("POST");
        c = apaVar2;
        apa apaVar3 = new apa("PUT");
        d = apaVar3;
        apa apaVar4 = new apa("PATCH");
        e = apaVar4;
        apa apaVar5 = new apa("DELETE");
        f = apaVar5;
        apa apaVar6 = new apa("HEAD");
        g = apaVar6;
        apa apaVar7 = new apa("OPTIONS");
        h = apaVar7;
        i = new apa("TRACE");
        j = new apa("QUERY");
        k = Arrays.asList(apaVar, apaVar2, apaVar3, apaVar4, apaVar5, apaVar6, apaVar7);
    }

    public apa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apa) && Intrinsics.a(this.a, ((apa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
