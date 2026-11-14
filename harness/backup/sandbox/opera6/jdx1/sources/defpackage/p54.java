package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class p54 implements kyh {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    public p54(Bitmap bitmap) {
        this.b = bitmap;
    }

    public p54(Object obj) {
        qyn.l(obj, "Argument must not be null");
        this.b = obj;
    }

    public p54(byte[] bArr) {
        qyn.l(bArr, "Argument must not be null");
        this.b = bArr;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override // defpackage.kyh
    public final int b() {
        switch (this.a) {
            case 0:
                return ((byte[]) this.b).length;
            case 1:
                return 1;
            default:
                return rm5.x((Bitmap) this.b);
        }
    }

    @Override // defpackage.kyh
    public final void d() {
        byte b = this.a;
    }

    @Override // defpackage.kyh
    public final Class e() {
        switch (this.a) {
            case 0:
                return byte[].class;
            case 1:
                return this.b.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.kyh
    public final Object get() {
        switch (this.a) {
            case 0:
                return (byte[]) this.b;
            case 1:
                return this.b;
            default:
                return (Bitmap) this.b;
        }
    }
}
