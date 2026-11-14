package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h8g {
    public static final h8g a;
    public static final h8g b;
    public static final h8g c;
    public static final h8g d;
    public static final h8g e;
    public static final h8g f;
    public static final h8g g;
    public static final /* synthetic */ h8g[] h;

    static {
        h8g h8gVar = new h8g("Invalid", 0);
        a = h8gVar;
        h8g h8gVar2 = new h8g("Cancelled", 1);
        b = h8gVar2;
        h8g h8gVar3 = new h8g("InitialPending", 2);
        c = h8gVar3;
        h8g h8gVar4 = new h8g("RecomposePending", 3);
        d = h8gVar4;
        h8g h8gVar5 = new h8g("Recomposing", 4);
        e = h8gVar5;
        h8g h8gVar6 = new h8g("ApplyPending", 5);
        f = h8gVar6;
        h8g h8gVar7 = new h8g("Applied", 6);
        g = h8gVar7;
        h = new h8g[]{h8gVar, h8gVar2, h8gVar3, h8gVar4, h8gVar5, h8gVar6, h8gVar7};
    }

    public static h8g valueOf(String str) {
        return (h8g) Enum.valueOf(h8g.class, str);
    }

    public static h8g[] values() {
        return (h8g[]) h.clone();
    }
}
