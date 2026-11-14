package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c8l implements w6f {
    public final Context a;
    public final umi b;
    public final deg c;
    public final mcj d;
    public final mcj e;
    public final qie f = new qie((byte) 19);
    public final i7f g = new i7f();
    public final ArrayList h = new ArrayList();

    public c8l(Context context, umi umiVar, deg degVar, n7l n7lVar, v4b v4bVar) {
        this.a = context;
        this.b = umiVar;
        this.c = degVar;
        this.d = new mcj(new g7l(), n7lVar);
        this.e = new mcj(new ivg(v4bVar), new jvg(umiVar));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.g.b((w7l) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.g.c((w7l) obj);
    }

    public final Size a(float f, Bitmap bitmap) {
        Rect rectI = r9n.i(this.a);
        int iMax = Math.max(rectI.width(), rectI.height());
        int iMax2 = Math.max(bitmap.getWidth(), bitmap.getHeight());
        int iB = zed.b(iMax * f);
        int iMin = Math.min(72, iMax2);
        if (iB < iMin) {
            iB = iMin;
        }
        return new Size((bitmap.getWidth() * iB) / iMax2, (bitmap.getHeight() * iB) / iMax2);
    }

    public final void b(b2l b2lVar, w7l w7lVar) {
        boolean z = true;
        rv3 rv3Var = new rv3(w7lVar, this, (byte) 1);
        d7l d7lVar = (d7l) b2lVar;
        boolean z2 = d7lVar.m0().b;
        knf knfVar = (knf) d7lVar.e.d;
        int iOrdinal = (knfVar == null ? q8l.c : knfVar.D()).a.ordinal();
        if (iOrdinal == 0) {
            z = false;
        } else if (iOrdinal != 1) {
            h9o.p();
            return;
        }
        d7lVar.C(z2, z, new s2g((Object) this, (Object) d7lVar, (Object) rv3Var, (byte) 11));
    }

    public final mcj c(p6l p6lVar) {
        int iOrdinal = p6lVar.ordinal();
        if (iOrdinal == 0) {
            return this.d;
        }
        if (iOrdinal == 1) {
            return this.e;
        }
        h9o.p();
        return null;
    }
}
