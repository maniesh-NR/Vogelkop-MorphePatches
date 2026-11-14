package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b3c {
    public static final s16 a;
    public static final b3c b;
    public static final r16 c;
    public static final b3c d;
    public static final b3c e;
    public static final b3c f;
    public static final b3c g;
    public static final /* synthetic */ b3c[] h;
    public static final /* synthetic */ h58 i;

    static {
        b3c b3cVar = new b3c("CAROUSEL", 0);
        d = b3cVar;
        b3c b3cVar2 = new b3c("GRID", 1);
        e = b3cVar2;
        b3c b3cVar3 = new b3c("LIST", 2);
        f = b3cVar3;
        b3c b3cVar4 = new b3c("TAB_BAR", 3);
        g = b3cVar4;
        b3c[] b3cVarArr = {b3cVar, b3cVar2, b3cVar3, b3cVar4};
        h = b3cVarArr;
        i = new h58(b3cVarArr);
        a = new s16();
        b = b3cVar;
        c = new r16();
    }

    public static b3c valueOf(String str) {
        return (b3c) Enum.valueOf(b3c.class, str);
    }

    public static b3c[] values() {
        return (b3c[]) h.clone();
    }
}
