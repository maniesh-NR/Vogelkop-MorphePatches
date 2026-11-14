package ads_mobile_sdk;

import defpackage.cs5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class i83 {
    public static final i83 b;
    public static final i83 c;
    public static final i83 d;
    public static final i83 e;
    public static final /* synthetic */ i83[] f;
    public final long a;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        i83 i83Var = new i83(0, cs5.x0(30, un7Var), "FAST");
        b = i83Var;
        i83 i83Var2 = new i83(1, cs5.x0(100, un7Var), "MEDIUM");
        c = i83Var2;
        i83 i83Var3 = new i83(2, cs5.x0(300, un7Var), "SLOW");
        d = i83Var3;
        i83 i83Var4 = new i83(3, cs5.x0(1000, un7Var), "SUPER_SLOW");
        e = i83Var4;
        f = new i83[]{i83Var, i83Var2, i83Var3, i83Var4};
    }

    public i83(int i, long j, String str) {
        this.a = j;
    }

    public static i83[] values() {
        return (i83[]) f.clone();
    }
}
