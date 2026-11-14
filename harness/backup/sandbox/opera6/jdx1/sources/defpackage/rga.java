package defpackage;

/* loaded from: classes.dex */
public final class rga implements paj {
    public static final rga b = new rga(0);
    public static final rga c = new rga(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ rga(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.paj
    public final w7d a(long j, d2c d2cVar, n27 n27Var) {
        switch (this.a) {
            case 0:
                float fM = n27Var.M(30.0f);
                return new mtf(new voh(0.0f, -fM, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fM));
            case 1:
                float fM2 = n27Var.M(30.0f);
                return new mtf(new voh(-fM2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fM2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new mtf(bwg.a(0L, j));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
