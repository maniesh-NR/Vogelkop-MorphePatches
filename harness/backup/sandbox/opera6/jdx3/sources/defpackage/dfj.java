package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@h2j
/* loaded from: classes.dex */
public final class dfj {

    @NotNull
    public static final cfj Companion;
    public static final l4c a;
    public static final dfj b;
    public static final dfj c;
    public static final dfj d;
    public static final dfj e;
    public static final dfj f;
    public static final dfj g;
    public static final /* synthetic */ dfj[] h;

    static {
        dfj dfjVar = new dfj("IN_PROGRESS", 0);
        b = dfjVar;
        dfj dfjVar2 = new dfj("FINISHED", 1);
        c = dfjVar2;
        dfj dfjVar3 = new dfj("ERROR_PROCESSING", 2);
        d = dfjVar3;
        dfj dfjVar4 = new dfj("ERROR_TOO_LONG", 3);
        e = dfjVar4;
        dfj dfjVar5 = new dfj("ERROR_NOT_SUPPORTED", 4);
        f = dfjVar5;
        dfj dfjVar6 = new dfj("ERROR_MIME_DOES_NOT_MATCH", 5);
        g = dfjVar6;
        h = new dfj[]{dfjVar, dfjVar2, dfjVar3, dfjVar4, dfjVar5, dfjVar6};
        Companion = new cfj();
        a = z4c.a(f7c.b, new gzh((byte) 24));
    }

    public static dfj valueOf(String str) {
        return (dfj) Enum.valueOf(dfj.class, str);
    }

    public static dfj[] values() {
        return (dfj[]) h.clone();
    }
}
