package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class ah3 implements kyh, p7b {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public ah3(Resources resources, kyh kyhVar) {
        qyn.l(resources, "Argument must not be null");
        this.b = resources;
        qyn.l(kyhVar, "Argument must not be null");
        this.c = kyhVar;
    }

    public ah3(zg3 zg3Var, Bitmap bitmap) {
        qyn.l(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        this.c = zg3Var;
    }

    public static ah3 c(zg3 zg3Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new ah3(zg3Var, bitmap);
    }

    @Override // defpackage.p7b
    public final void a() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                kyh kyhVar = (kyh) this.c;
                if (kyhVar instanceof p7b) {
                    ((p7b) kyhVar).a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kyh
    public final int b() {
        switch (this.a) {
            case 0:
                return rm5.x((Bitmap) this.b);
            default:
                return ((kyh) this.c).b();
        }
    }

    @Override // defpackage.kyh
    public final void d() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((zg3) obj).b((Bitmap) this.b);
                break;
            default:
                ((kyh) obj).d();
                break;
        }
    }

    @Override // defpackage.kyh
    public final Class e() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.kyh
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((kyh) this.c).get());
        }
    }
}
