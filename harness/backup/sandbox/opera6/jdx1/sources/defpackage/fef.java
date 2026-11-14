package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class fef {
    public static final fef j;
    public static final fef k;
    public static final fef l;
    public static final fef m;
    public static final /* synthetic */ fef[] n;
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    static {
        long jB = fsp.b(144.0f, 200.0f);
        long jB2 = fsp.b(108.0f, 150.0f);
        pof.b.getClass();
        fef fefVar = new fef("SMALL", 0, 3.0f, 27.0f, 21.0f, jB, jB2, 16.0f, 40.0f, 20.0f, 20.0f);
        j = fefVar;
        fef fefVar2 = new fef("MEDIUM", 1, 3.0f, 32.0f, 24.0f, fsp.b(180.0f, 250.0f), fsp.b(135.0f, 188.0f), 20.0f, 48.0f, 24.0f, 24.0f);
        k = fefVar2;
        fef fefVar3 = new fef("LARGE_PORTRAIT", 2, 4.0f, 40.0f, 30.0f, fsp.b(252.0f, 350.0f), fsp.b(190.0f, 264.0f), 28.0f, 64.0f, 36.0f, 32.0f);
        l = fefVar3;
        fef fefVar4 = new fef("LARGE_LANDSCAPE", 3, 4.0f, 40.0f, 30.0f, fsp.b(350.0f, 252.0f), fsp.b(264.0f, 190.0f), 56.0f, 56.0f, 36.0f, 32.0f);
        m = fefVar4;
        n = new fef[]{fefVar, fefVar2, fefVar3, fefVar4};
    }

    public fef(String str, int i, float f, float f2, float f3, long j2, long j3, float f4, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j2;
        this.e = j3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
    }

    public static fef valueOf(String str) {
        return (fef) Enum.valueOf(fef.class, str);
    }

    public static fef[] values() {
        return (fef[]) n.clone();
    }
}
