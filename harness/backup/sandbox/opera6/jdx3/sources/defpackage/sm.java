package defpackage;

import java.util.Arrays;
import java.util.List;

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
public final class sm {
    public static final sm c;
    public static final sm d;
    public static final sm e;
    public static final sm f;
    public static final sm g;
    public static final sm h;
    public static final /* synthetic */ sm[] i;
    public final List a;
    public final zyk b = z4c.b(new qm(this, (byte) 0));

    static {
        fuo fuoVar = fuo.d;
        sm smVar = new sm(0, "NATIVE", Arrays.asList(fuo.e, fuoVar));
        c = smVar;
        fuo fuoVar2 = fuo.c;
        sm smVar2 = new sm(1, "BANNER", Arrays.asList(fuoVar2, fuoVar));
        d = smVar2;
        sm smVar3 = new sm(2, "INTERSTITIAL", Arrays.asList(fuoVar2, fuoVar));
        e = smVar3;
        sm smVar4 = new sm(3, "REWARDED", Arrays.asList(fuoVar2, fuoVar));
        f = smVar4;
        sm smVar5 = new sm(4, "REWARDED_INTERSTITIAL", Arrays.asList(fuoVar2, fuoVar));
        g = smVar5;
        sm smVar6 = new sm(5, "APP_OPEN", Arrays.asList(fuoVar2, fuoVar));
        h = smVar6;
        i = new sm[]{smVar, smVar2, smVar3, smVar4, smVar5, smVar6};
    }

    public sm(int i2, String str, List list) {
        this.a = list;
    }

    public static sm valueOf(String str) {
        return (sm) Enum.valueOf(sm.class, str);
    }

    public static sm[] values() {
        return (sm[]) i.clone();
    }

    public final boolean d() {
        int i2 = pm.a[ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }
}
