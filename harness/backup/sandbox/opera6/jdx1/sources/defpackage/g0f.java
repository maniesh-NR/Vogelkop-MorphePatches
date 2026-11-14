package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g0f extends Error {
    public g0f() {
        this(null, 1, null);
    }

    public g0f(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
