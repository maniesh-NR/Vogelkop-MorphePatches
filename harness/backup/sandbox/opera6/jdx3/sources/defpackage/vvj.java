package defpackage;

import java.text.Collator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class vvj {
    public static final vvj c;
    public static final vvj d;
    public static final vvj e;
    public static final vvj f;
    public static final /* synthetic */ vvj[] g;
    public final byte a;
    public final qw4 b;

    static {
        final byte b = 0;
        vvj vvjVar = new vvj("NAME", 0, 0, new qw4() { // from class: uvj
            @Override // defpackage.qw4, java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                byte b2 = b;
                vvj vvjVar2 = vvj.c;
                switch (b2) {
                    case 0:
                        return Collator.getInstance().compare(((re7) obj).f(), ((re7) obj2).f());
                    case 1:
                        re7 re7Var = (re7) obj;
                        re7 re7Var2 = (re7) obj2;
                        int iP = cs5.p(re7Var2.j, re7Var.j);
                        return iP == 0 ? vvjVar2.b.compare(re7Var, re7Var2) : iP;
                    case 2:
                        re7 re7Var3 = (re7) obj;
                        re7 re7Var4 = (re7) obj2;
                        int iP2 = re7Var3.k() ? cs5.p(re7Var4.t.n(), re7Var3.t.n()) : cs5.p(re7Var4.o, re7Var3.o);
                        return iP2 == 0 ? vvjVar2.b.compare(re7Var3, re7Var4) : iP2;
                    default:
                        re7 re7Var5 = (re7) obj;
                        re7 re7Var6 = (re7) obj2;
                        int iCompare = Collator.getInstance().compare(re7Var5.m, re7Var6.m);
                        return iCompare == 0 ? vvjVar2.b.compare(re7Var5, re7Var6) : iCompare;
                }
            }
        });
        c = vvjVar;
        final byte b2 = 1;
        vvj vvjVar2 = new vvj("SIZE", 1, 1, new qw4() { // from class: uvj
            @Override // defpackage.qw4, java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                byte b22 = b2;
                vvj vvjVar22 = vvj.c;
                switch (b22) {
                    case 0:
                        return Collator.getInstance().compare(((re7) obj).f(), ((re7) obj2).f());
                    case 1:
                        re7 re7Var = (re7) obj;
                        re7 re7Var2 = (re7) obj2;
                        int iP = cs5.p(re7Var2.j, re7Var.j);
                        return iP == 0 ? vvjVar22.b.compare(re7Var, re7Var2) : iP;
                    case 2:
                        re7 re7Var3 = (re7) obj;
                        re7 re7Var4 = (re7) obj2;
                        int iP2 = re7Var3.k() ? cs5.p(re7Var4.t.n(), re7Var3.t.n()) : cs5.p(re7Var4.o, re7Var3.o);
                        return iP2 == 0 ? vvjVar22.b.compare(re7Var3, re7Var4) : iP2;
                    default:
                        re7 re7Var5 = (re7) obj;
                        re7 re7Var6 = (re7) obj2;
                        int iCompare = Collator.getInstance().compare(re7Var5.m, re7Var6.m);
                        return iCompare == 0 ? vvjVar22.b.compare(re7Var5, re7Var6) : iCompare;
                }
            }
        });
        d = vvjVar2;
        final byte b3 = 2;
        vvj vvjVar3 = new vvj("MOST_RECENT", 2, 2, new qw4() { // from class: uvj
            @Override // defpackage.qw4, java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                byte b22 = b3;
                vvj vvjVar22 = vvj.c;
                switch (b22) {
                    case 0:
                        return Collator.getInstance().compare(((re7) obj).f(), ((re7) obj2).f());
                    case 1:
                        re7 re7Var = (re7) obj;
                        re7 re7Var2 = (re7) obj2;
                        int iP = cs5.p(re7Var2.j, re7Var.j);
                        return iP == 0 ? vvjVar22.b.compare(re7Var, re7Var2) : iP;
                    case 2:
                        re7 re7Var3 = (re7) obj;
                        re7 re7Var4 = (re7) obj2;
                        int iP2 = re7Var3.k() ? cs5.p(re7Var4.t.n(), re7Var3.t.n()) : cs5.p(re7Var4.o, re7Var3.o);
                        return iP2 == 0 ? vvjVar22.b.compare(re7Var3, re7Var4) : iP2;
                    default:
                        re7 re7Var5 = (re7) obj;
                        re7 re7Var6 = (re7) obj2;
                        int iCompare = Collator.getInstance().compare(re7Var5.m, re7Var6.m);
                        return iCompare == 0 ? vvjVar22.b.compare(re7Var5, re7Var6) : iCompare;
                }
            }
        });
        e = vvjVar3;
        final byte b4 = 3;
        vvj vvjVar4 = new vvj("TYPE", 3, 3, new qw4() { // from class: uvj
            @Override // defpackage.qw4, java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                byte b22 = b4;
                vvj vvjVar22 = vvj.c;
                switch (b22) {
                    case 0:
                        return Collator.getInstance().compare(((re7) obj).f(), ((re7) obj2).f());
                    case 1:
                        re7 re7Var = (re7) obj;
                        re7 re7Var2 = (re7) obj2;
                        int iP = cs5.p(re7Var2.j, re7Var.j);
                        return iP == 0 ? vvjVar22.b.compare(re7Var, re7Var2) : iP;
                    case 2:
                        re7 re7Var3 = (re7) obj;
                        re7 re7Var4 = (re7) obj2;
                        int iP2 = re7Var3.k() ? cs5.p(re7Var4.t.n(), re7Var3.t.n()) : cs5.p(re7Var4.o, re7Var3.o);
                        return iP2 == 0 ? vvjVar22.b.compare(re7Var3, re7Var4) : iP2;
                    default:
                        re7 re7Var5 = (re7) obj;
                        re7 re7Var6 = (re7) obj2;
                        int iCompare = Collator.getInstance().compare(re7Var5.m, re7Var6.m);
                        return iCompare == 0 ? vvjVar22.b.compare(re7Var5, re7Var6) : iCompare;
                }
            }
        });
        f = vvjVar4;
        g = new vvj[]{vvjVar, vvjVar2, vvjVar3, vvjVar4};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vvj(String str, int i, int i2, qw4 qw4Var) {
        this.a = i2;
        this.b = qw4Var;
    }

    public static vvj valueOf(String str) {
        return (vvj) Enum.valueOf(vvj.class, str);
    }

    public static vvj[] values() {
        return (vvj[]) g.clone();
    }
}
