package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@h2j
/* loaded from: classes.dex */
public final class hff {

    @NotNull
    public static final gff Companion;
    public static final l4c a;
    public static final hff b;
    public static final hff c;
    public static final hff d;
    public static final /* synthetic */ hff[] e;

    static {
        hff hffVar = new hff("NETWORK", 0);
        b = hffVar;
        hff hffVar2 = new hff("FALLBACK_CONFIG_MISMATCH", 1);
        c = hffVar2;
        hff hffVar3 = new hff("FALLBACK_NO_DATA", 2);
        d = hffVar3;
        e = new hff[]{hffVar, hffVar2, hffVar3};
        Companion = new gff();
        a = z4c.a(f7c.b, new vme((byte) 22));
    }

    public static hff valueOf(String str) {
        return (hff) Enum.valueOf(hff.class, str);
    }

    public static hff[] values() {
        return (hff[]) e.clone();
    }
}
