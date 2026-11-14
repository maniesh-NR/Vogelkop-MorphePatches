package defpackage;

/* loaded from: classes.dex */
public final class wr3 implements ur3 {
    public final g1g a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public wr3(yae yaeVar) {
        g1g g1gVar = yaeVar.c;
        this.a = g1gVar;
        g1gVar.N(12);
        this.c = g1gVar.E() & 255;
        this.b = g1gVar.E();
    }

    @Override // defpackage.ur3
    public final int a() {
        return -1;
    }

    @Override // defpackage.ur3
    public final int getSampleCount() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, short] */
    @Override // defpackage.ur3
    public final int readNextSampleSize() {
        g1g g1gVar = this.a;
        int i = this.c;
        if (i == 8) {
            return g1gVar.A();
        }
        if (i == 16) {
            return g1gVar.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        ?? A = g1gVar.A();
        this.e = A;
        return (A & 240) >> 4;
    }
}
