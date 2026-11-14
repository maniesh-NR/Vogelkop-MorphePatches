package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class q7l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8l b;
    public final /* synthetic */ x7l c;
    public final /* synthetic */ rg d;

    public /* synthetic */ q7l(c8l c8lVar, x7l x7lVar, rg rgVar, byte b) {
        this.a = b;
        this.b = c8lVar;
        this.c = x7lVar;
        this.d = rgVar;
    }

    public final Object invoke(Object obj) throws cam {
        Unit q0iVar;
        Unit q0iVar2;
        byte b = this.a;
        rg rgVar = this.d;
        x7l x7lVar = this.c;
        c8l c8lVar = this.b;
        switch (b) {
            case 0:
                m7l m7lVar = x7lVar.c;
                mcj mcjVar = x7lVar.a;
                byte b2 = 1;
                try {
                    p0i p0iVar = t0i.b;
                    yni yniVar = x7lVar.b;
                    l7l l7lVar = m7lVar.b;
                    Bitmap bitmap = yniVar.a;
                    l7l l7lVar2 = m7lVar.c;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, l7lVar.b, l7lVar.c, true);
                    ((f7l) mcjVar.a).i(l7lVar.a, bitmapCreateScaledBitmap);
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, l7lVar2.b, l7lVar2.c, true);
                    ((f7l) mcjVar.a).i(l7lVar2.a, bitmapCreateScaledBitmap2);
                    bitmapCreateScaledBitmap2.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    q0iVar = Unit.a;
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                if (!(q0iVar instanceof q0i)) {
                    ((o7l) mcjVar.b).g(m7lVar, new q7l(c8lVar, x7lVar, rgVar, b2));
                    return Unit.a;
                }
                try {
                    ((f7l) mcjVar.a).remove(m7lVar.b.a);
                    ((f7l) mcjVar.a).remove(m7lVar.c.a);
                    q0iVar2 = Unit.a;
                } catch (Throwable th2) {
                    p0i p0iVar3 = t0i.b;
                    q0iVar2 = new q0i(th2);
                }
                if (t0i.d(q0iVar2) == null) {
                }
                return fac.C(c8lVar.b, new uef(c8lVar, x7lVar, rgVar, (byte) 6));
            default:
                m7l m7lVar2 = (m7l) obj;
                c8lVar.h.remove(x7lVar);
                rgVar.invoke(m7lVar2 != null ? new a8l(m7lVar2) : z7l.a);
                return Unit.a;
        }
    }
}
