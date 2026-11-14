package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class i4g implements mya {
    public final int a;
    public final WeakReference b;
    public final int c;
    public final String d;

    public i4g(w4g w4gVar, w3g w3gVar, int i, h4g h4gVar) {
        this.a = i;
        this.b = new WeakReference(h4gVar);
        this.c = w3gVar.a;
        this.d = w3gVar.b.a;
        GURL gurl = w3gVar.e;
        if (gurl != null) {
            oya.b(gurl.a, i, i, 0, 0, this);
            return;
        }
        ifd ifdVarF = w4gVar.a.f(w4g.a(w3gVar), new s2e(1, this, i4g.class, "maybeIcon", "maybeIcon(Lcom/opera/android/siteicons/MaybeSiteIcon;)V", 0, (byte) 26));
        if (ifdVarF == null) {
            h4gVar.s();
        } else {
            a(h4gVar, ifdVarF);
        }
    }

    public final void a(h4g h4gVar, ifd ifdVar) {
        if (Intrinsics.a(ifdVar, nnj.a)) {
            h4gVar.s();
        } else {
            if (!(ifdVar instanceof tnj)) {
                h9o.p();
                return;
            }
            String absolutePath = ((tnj) ifdVar).a.getAbsolutePath();
            int i = this.a;
            oya.b(absolutePath, i, i, 0, 0, this);
        }
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        h4g h4gVar = (h4g) this.b.get();
        if (h4gVar == null || !h4gVar.P(this.c, this.d)) {
            return;
        }
        h4gVar.w(bitmap);
    }

    @Override // defpackage.mya
    public final void u(int i) {
        h4g h4gVar = (h4g) this.b.get();
        if (h4gVar == null || !h4gVar.P(this.c, this.d)) {
            return;
        }
        h4gVar.s();
    }
}
