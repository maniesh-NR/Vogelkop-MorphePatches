package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ds {
    public static final zpa b;
    public static final ds c;
    public static final ds d;
    public static final ds e;
    public static final ds f;
    public static final ds g;
    public static final /* synthetic */ ds[] h;
    public static final /* synthetic */ h58 i;
    public final a26 a;

    static {
        ds dsVar = new ds("GRID", 0, g4a.p);
        c = dsVar;
        g4a g4aVar = g4a.o;
        ds dsVar2 = new ds("LIST", 1, g4aVar);
        d = dsVar2;
        ds dsVar3 = new ds("MANUAL_ADD", 2, g4aVar);
        e = dsVar3;
        ds dsVar4 = new ds("HEADER", 3, g4aVar);
        f = dsVar4;
        ds dsVar5 = new ds("EMPTY", 4, g4aVar);
        g = dsVar5;
        ds[] dsVarArr = {dsVar, dsVar2, dsVar3, dsVar4, dsVar5};
        h = dsVarArr;
        i = new h58(dsVarArr);
        b = new zpa((byte) 15);
    }

    public ds(String str, int i2, a26 a26Var) {
        this.a = a26Var;
    }

    public static ds valueOf(String str) {
        return (ds) Enum.valueOf(ds.class, str);
    }

    public static ds[] values() {
        return (ds[]) h.clone();
    }
}
