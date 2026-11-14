package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uz3 {
    public static final uz3 d;
    public static final uz3 e;
    public static final uz3 f;
    public static final uz3 g;
    public static final uz3 h;
    public static final /* synthetic */ uz3[] i;
    public static final /* synthetic */ h58 j;
    public final rxh a;
    public final rxh b;
    public final pxh c;

    static {
        uz3 uz3Var = new uz3("TAB_LAYOUT", 0, new rxh(2132021813), new rxh(2132021812), null, 124);
        d = uz3Var;
        uz3 uz3Var2 = new uz3("MOVE_TABS", 1, new rxh(2132021815), new rxh(2132021814), null, 124);
        e = uz3Var2;
        uz3 uz3Var3 = new uz3("SEARCH_TABS", 2, new rxh(2132021823), new rxh(2132021822), null, 124);
        f = uz3Var3;
        uz3 uz3Var4 = new uz3("REOPEN_CLOSED_TABS", 3, new rxh(2132021821), new rxh(2132021820), null, 124);
        g = uz3Var4;
        uz3 uz3Var5 = new uz3("PRIVATE_MODE", 4, new rxh(2132021819), new rxh(2132021817), new rxh(2132021818), 120);
        h = uz3Var5;
        uz3[] uz3VarArr = {uz3Var, uz3Var2, uz3Var3, uz3Var4, uz3Var5};
        i = uz3VarArr;
        j = new h58(uz3VarArr);
    }

    public uz3(String str, int i2, rxh rxhVar, rxh rxhVar2, rxh rxhVar3, int i3) {
        rxhVar3 = (i3 & 4) != 0 ? rxhVar2 : rxhVar3;
        this.a = rxhVar;
        this.b = rxhVar2;
        this.c = rxhVar3;
    }

    public static uz3 valueOf(String str) {
        return (uz3) Enum.valueOf(uz3.class, str);
    }

    public static uz3[] values() {
        return (uz3[]) i.clone();
    }
}
