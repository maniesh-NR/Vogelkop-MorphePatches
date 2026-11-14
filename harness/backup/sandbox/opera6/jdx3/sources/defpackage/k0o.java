package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k0o {
    public static final k0o d = new k0o(j0o.a, false, new q0n((byte) 12), 2);
    public final j0o a;
    public final boolean b;
    public final Function1 c;

    public k0o(j0o j0oVar, boolean z, Function1 function1) {
        this.a = j0oVar;
        this.b = z;
        this.c = function1;
    }

    public /* synthetic */ k0o(j0o j0oVar, boolean z, Function1 function1, int i) {
        this((i & 1) != 0 ? j0o.b : j0oVar, (i & 2) != 0 ? false : z, function1);
    }
}
