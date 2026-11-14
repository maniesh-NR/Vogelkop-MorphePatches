package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e4g implements g4g {
    public static final e4g a = new e4g();
    public static final List b = Arrays.asList(163, '$', '&', '(', ')', '*', '+', '[', ']', '@', '#', '^', '-', '_', '!', '?');

    @Override // defpackage.g4g
    public final String a(int i) {
        List list = b;
        return String.valueOf(((Character) list.get(i % list.size())).charValue());
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e4g);
    }

    public final int hashCode() {
        return 137959933;
    }

    public final String toString() {
        return "";
    }
}
