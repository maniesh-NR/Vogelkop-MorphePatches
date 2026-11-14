package defpackage;

/* loaded from: classes.dex */
public final class w89 implements n89 {
    public final float a;
    public final z1k b;

    public /* synthetic */ w89(float f, float f2) {
        this(f, f2, 0.01f);
    }

    public w89(float f, float f2, float f3) {
        this.a = f3;
        z1k z1kVar = new z1k();
        z1kVar.a = 1.0f;
        z1kVar.b = 7.0710678118654755d;
        z1kVar.c = 1.0f;
        if (f < 0.0f) {
            dpg.a("Damping ratio must be non-negative");
        }
        z1kVar.c = f;
        double d = z1kVar.b;
        if (((float) (d * d)) <= 0.0f) {
            dpg.a("Spring stiffness constant must be positive.");
        }
        z1kVar.b = Math.sqrt(f2);
        this.b = z1kVar;
    }

    public final float b(float f, float f2, float f3, long j) {
        z1k z1kVar = this.b;
        z1kVar.a = f2;
        return Float.intBitsToFloat((int) (z1kVar.a(f, f3, j / 1000000) & 4294967295L));
    }

    public final float c(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w89.d(float, float, float):long");
    }

    public final float e(float f, float f2, float f3, long j) {
        z1k z1kVar = this.b;
        z1kVar.a = f2;
        return Float.intBitsToFloat((int) (z1kVar.a(f, f3, j / 1000000) >> 32));
    }
}
