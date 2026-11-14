package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import com.opera.android.BrowserActivity;
import java.io.File;

/* loaded from: classes.dex */
public final class gii extends nji {
    public final Context a;
    public final umi b;
    public final rf7 c;
    public final qji d;
    public final PageRange[] e;
    public final BrowserActivity f;
    public final r9g g;
    public final Uri h;
    public final Uri i;
    public final String j;
    public final x5f k;
    public ParcelFileDescriptor l;
    public zzh m;
    public boolean n;

    public gii(Context context, umi umiVar, rf7 rf7Var, qji qjiVar, PageRange[] pageRangeArr, BrowserActivity browserActivity, r9g r9gVar, Uri uri, String str, zzh zzhVar, x5f x5fVar) {
        this.a = context;
        this.b = umiVar;
        this.c = rf7Var;
        this.d = qjiVar;
        this.e = pageRangeArr;
        this.f = browserActivity;
        this.g = r9gVar;
        this.m = zzhVar;
        this.h = qjiVar.a;
        this.i = uri;
        this.j = str;
        this.k = x5fVar;
        nml nmlVarE = umiVar.e(new fii(this, (byte) 0));
        nmlVarE.b(umiVar.f(new fii(this, (byte) 1)));
        nmlVarE.a(null);
    }

    @Override // defpackage.nji
    public final void c(int i) {
        if (i == 0) {
            e();
            return;
        }
        qji qjiVar = this.d;
        if (i != 1) {
            if (i == 2) {
                if (this.n) {
                    qjiVar.e(this);
                    this.n = false;
                }
                qjiVar.h(this.l, this.e, new i4d(this, (byte) 22));
                return;
            }
            if (i != 3) {
                return;
            }
        }
        if (this.n) {
            return;
        }
        this.n = true;
        qjiVar.c.b(this);
    }

    public final void e() {
        xvg.l(this.l);
        f().c();
        this.g.f(new glj(2132018657, 2500));
        boolean z = this.n;
        qji qjiVar = this.d;
        if (z) {
            qjiVar.e(this);
            this.n = false;
        }
        qjiVar.b();
        zzh zzhVar = this.m;
        if (zzhVar == null) {
            return;
        }
        this.m = null;
        zzhVar.run(Boolean.FALSE);
    }

    public final dd7 f() {
        Uri uri = this.i;
        return uri.getScheme().equals("file") ? new bkh(new File(uri.getPath())) : dd7.e(this.a, uri);
    }
}
