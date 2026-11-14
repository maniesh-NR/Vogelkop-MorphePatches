package defpackage;

import java.util.EnumSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class dro {
    public static final dro b;
    public static final dro c;
    public static final /* synthetic */ dro[] d;
    public final EnumSet a;

    /* JADX INFO: Fake field, exist only in values array */
    dro EF0;

    static {
        l06 l06Var = w06.d;
        dro droVar = new dro("BANNER", 0, EnumSet.of(l06Var));
        m06 m06Var = w06.e;
        w06 w06Var = w06.h;
        dro droVar2 = new dro("INTER_SCROLLER", 1, EnumSet.of((w06) l06Var, (w06) m06Var, w06Var));
        r06 r06Var = w06.r;
        s06 s06Var = w06.s;
        w06 w06Var2 = w06.b;
        dro droVar3 = new dro("INTERSTITIAL", 2, EnumSet.of((w06) m06Var, (w06) r06Var, (w06) s06Var, w06Var2, w06Var));
        b = droVar3;
        dro droVar4 = new dro("NATIVE", 3, EnumSet.of(w06Var2, w06.c, l06Var, w06.f, w06.g, w06Var, w06.i, w06.j, w06.k, w06.l, w06.m, w06.n, w06.q, w06.p, w06.o, r06Var, s06Var, w06.t, w06.u));
        c = droVar4;
        d = new dro[]{droVar, droVar2, droVar3, droVar4};
    }

    public dro(String str, int i, EnumSet enumSet) {
        this.a = enumSet;
    }

    public static dro valueOf(String str) {
        return (dro) Enum.valueOf(dro.class, str);
    }

    public static dro[] values() {
        return (dro[]) d.clone();
    }
}
