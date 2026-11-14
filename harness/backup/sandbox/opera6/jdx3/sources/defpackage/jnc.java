package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@h2j
/* loaded from: classes.dex */
public final class jnc {

    @NotNull
    public static final inc Companion;
    public static final l4c a;
    public static final jnc b;
    public static final jnc c;
    public static final jnc d;
    public static final jnc e;
    public static final jnc f;
    public static final /* synthetic */ jnc[] g;

    static {
        jnc jncVar = new jnc("NOT_STARTED", 0);
        b = jncVar;
        jnc jncVar2 = new jnc("IN_PROGRESS", 1);
        c = jncVar2;
        jnc jncVar3 = new jnc("FINISHED", 2);
        d = jncVar3;
        jnc jncVar4 = new jnc("CANCELLED", 3);
        e = jncVar4;
        jnc jncVar5 = new jnc("DELAYED", 4);
        jnc jncVar6 = new jnc("INTERRUPTED", 5);
        f = jncVar6;
        g = new jnc[]{jncVar, jncVar2, jncVar3, jncVar4, jncVar5, jncVar6, new jnc("DELETED", 6)};
        Companion = new inc();
        a = z4c.a(f7c.b, new fza((byte) 18));
    }

    public static jnc valueOf(String str) {
        return (jnc) Enum.valueOf(jnc.class, str);
    }

    public static jnc[] values() {
        return (jnc[]) g.clone();
    }
}
