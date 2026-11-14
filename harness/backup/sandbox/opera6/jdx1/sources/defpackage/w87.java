package defpackage;

/* loaded from: classes.dex */
public final class w87 implements t87 {
    public final /* synthetic */ byte a;
    public final zhi b;
    public final int c;

    public /* synthetic */ w87(zhi zhiVar, int i, byte b) {
        this.a = b;
        this.b = zhiVar;
        this.c = i;
    }

    public final void a(byte b) {
        byte b2 = this.a;
        zhi zhiVar = this.b;
        switch (b2) {
            case 0:
                zhiVar.a(b);
                break;
            default:
                zhiVar.a(b);
                break;
        }
    }

    public final String c() {
        byte b = this.a;
        int i = this.c;
        zhi zhiVar = this.b;
        switch (b) {
            case 0:
                return zhiVar.c() + "/" + (i << 3);
            default:
                return zhiVar.c() + "/" + (i << 3);
        }
    }

    public final int d() {
        switch (this.a) {
        }
        return this.c;
    }

    public final int e(int i, byte[] bArr) {
        byte b = this.a;
        int i2 = this.c;
        zhi zhiVar = this.b;
        switch (b) {
            case 0:
                byte[] bArr2 = new byte[zhiVar.d()];
                zhiVar.e(0, bArr2);
                System.arraycopy(bArr2, 0, bArr, i, i2);
                break;
            default:
                byte[] bArr3 = new byte[zhiVar.d()];
                zhiVar.e(0, bArr3);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                break;
        }
        return i2;
    }

    public final void g(int i, int i2, byte[] bArr) {
        byte b = this.a;
        zhi zhiVar = this.b;
        switch (b) {
            case 0:
                zhiVar.g(i, i2, bArr);
                break;
            default:
                zhiVar.g(i, i2, bArr);
                break;
        }
    }

    public final void reset() {
        byte b = this.a;
        zhi zhiVar = this.b;
        switch (b) {
            case 0:
                zhiVar.reset();
                break;
            default:
                zhiVar.reset();
                break;
        }
    }
}
