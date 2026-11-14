package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y3h {
    public static final y3h a;
    public static final y3h b;
    public static final /* synthetic */ y3h[] c;

    static {
        y3h y3hVar = new y3h("SUCCESS", 0);
        a = y3hVar;
        y3h y3hVar2 = new y3h("FAILURE", 1);
        b = y3hVar2;
        c = new y3h[]{y3hVar, y3hVar2};
    }

    public static y3h valueOf(String str) {
        return (y3h) Enum.valueOf(y3h.class, str);
    }

    public static y3h[] values() {
        return (y3h[]) c.clone();
    }
}
