package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class lx9 implements kyh, p7b {
    public final Drawable a;
    public final /* synthetic */ byte b;

    public lx9(Drawable drawable, byte b) {
        this.b = b;
        qyn.l(drawable, "Argument must not be null");
        this.a = drawable;
    }

    private final void c() {
    }

    @Override // defpackage.p7b
    public final void a() {
        byte b = this.b;
        Drawable drawable = this.a;
        switch (b) {
            case 0:
                ((rx9) ((kx9) drawable).a.b).l.prepareToDraw();
                break;
            default:
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof kx9) {
                        ((rx9) ((kx9) drawable).a.b).l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kyh
    public final int b() {
        byte b = this.b;
        Drawable drawable = this.a;
        switch (b) {
            case 0:
                rx9 rx9Var = (rx9) ((kx9) drawable).a.b;
                f3k f3kVar = rx9Var.a;
                return f3kVar.d.limit() + f3kVar.i.length + (f3kVar.j.length << 2) + rx9Var.n;
            default:
                return Math.max(1, (drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth()) << 2);
        }
    }

    @Override // defpackage.kyh
    public final void d() {
        switch (this.b) {
            case 0:
                kx9 kx9Var = (kx9) this.a;
                kx9Var.stop();
                kx9Var.d = true;
                rx9 rx9Var = (rx9) kx9Var.a.b;
                kwh kwhVar = rx9Var.d;
                rx9Var.c.clear();
                Bitmap bitmap = rx9Var.l;
                if (bitmap != null) {
                    rx9Var.e.b(bitmap);
                    rx9Var.l = null;
                }
                rx9Var.f = false;
                ox9 ox9Var = rx9Var.i;
                if (ox9Var != null) {
                    kwhVar.g(ox9Var);
                    rx9Var.i = null;
                }
                ox9 ox9Var2 = rx9Var.k;
                if (ox9Var2 != null) {
                    kwhVar.g(ox9Var2);
                    rx9Var.k = null;
                }
                ox9 ox9Var3 = rx9Var.m;
                if (ox9Var3 != null) {
                    kwhVar.g(ox9Var3);
                    rx9Var.m = null;
                }
                f3k f3kVar = rx9Var.a;
                i16 i16Var = f3kVar.c;
                f3kVar.l = null;
                byte[] bArr = f3kVar.i;
                if (bArr != null) {
                    ((jl6) i16Var.c).o(bArr);
                }
                int[] iArr = f3kVar.j;
                if (iArr != null) {
                    ((jl6) i16Var.c).o(iArr);
                }
                Bitmap bitmap2 = f3kVar.m;
                if (bitmap2 != null) {
                    ((zg3) i16Var.b).b(bitmap2);
                }
                f3kVar.m = null;
                f3kVar.d = null;
                f3kVar.s = null;
                byte[] bArr2 = f3kVar.e;
                if (bArr2 != null) {
                    ((jl6) i16Var.c).o(bArr2);
                }
                rx9Var.j = true;
                break;
        }
    }

    @Override // defpackage.kyh
    public final Class e() {
        switch (this.b) {
            case 0:
                return kx9.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.kyh
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
