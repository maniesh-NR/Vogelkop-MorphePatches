package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class mh5 {
    public static final wff a = new wff("provider");
    public static final wff b = new wff("provider");
    public static final wff c = new wff("compositionLocalMap");
    public static final wff d = new wff("providers");
    public static final wff e = new wff("reference");

    public static final void a(@NotNull String str) {
        throw new hg5(sko.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void b(@NotNull String str) {
        throw new hg5(sko.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
