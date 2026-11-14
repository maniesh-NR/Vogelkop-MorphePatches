package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.opera.android.Lazy;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class vz5 {
    public int a;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;

    public vz5(View view, Rect rect, y1n y1nVar) {
        this.d = new int[]{-1, -1};
        this.h = new Rect();
        this.i = new Rect();
        this.a = -1;
        this.b = -1;
        this.e = view;
        this.f = rect;
        this.g = y1nVar;
    }

    public vz5(cz4 cz4Var, umi umiVar, d7h d7hVar) {
        i5m i5mVar = new i5m(this, -1, "", "", (oji) this.e, 2, 0L);
        this.d = i5mVar;
        this.e = new oji(this);
        this.f = new kze(i5mVar);
        this.b = -1;
        ChromiumContent chromiumContent = cz4Var.a;
        GURL gurl = ChromiumContent.V;
        this.g = new eme(chromiumContent);
        this.h = umiVar;
        this.i = d7hVar;
    }

    public vz5(lrd lrdVar, grd grdVar, String str, String str2, int i, boolean z, int i2, cod codVar) {
        String str3 = grdVar.a;
        String strB = lrdVar.b();
        StringBuilder sbN = z1m.n("route:", str, "/", str3, "/");
        sbN.append(strB);
        this.e = sbN.toString();
        this.d = lrdVar;
        this.h = grdVar;
        this.f = str;
        this.g = str2;
        this.a = i;
        this.c = z;
        this.b = i2;
        this.i = codVar;
    }

    public vz5(z05 z05Var, qre qreVar, s9i s9iVar, x5f x5fVar) {
        this.b = -1;
        this.e = z05Var;
        this.f = qreVar;
        this.d = s9iVar;
        this.g = x5fVar;
    }

    public final void a() {
        this.a = 0;
        this.h = null;
        this.c = false;
    }

    public final void b() {
        if (!this.c || this.b == -1) {
            return;
        }
        j5m j5mVar = (j5m) ((kze) this.f).g();
        int i = j5mVar.a;
        if (i != this.b) {
            this.b = -1;
            return;
        }
        this.b = -1;
        eme emeVar = (eme) this.g;
        String str = j5mVar.b;
        String str2 = j5mVar.c;
        ChromiumContent chromiumContent = (ChromiumContent) emeVar.a;
        if (chromiumContent.n != 0) {
            Context context = t8.a;
            c3j c3jVarD = ((d3j) e3j.t(context).i()).d(12, true);
            String strB = "437df5be521b02c593ba73aaeeb4dc79361918c4e6dcbd2a5b58aa88a1b4f20b";
            String strB2 = "translation.opera-api.com";
            if (c3jVarD != null) {
                strB2 = aik.b((String) c3jVarD.d, "translation.opera-api.com");
                strB = aik.b((String) c3jVarD.b, "437df5be521b02c593ba73aaeeb4dc79361918c4e6dcbd2a5b58aa88a1b4f20b");
            }
            String str3 = strB;
            Lazy lazyH = i0l.h(context);
            N.MubyJW6F(chromiumContent.n, i, chromiumContent.l, str, str2, new Uri.Builder().scheme("https").authority(strB2).path("api/translate").build().toString(), str3, (String) lazyH.get());
        }
    }

    public final void c(EnumSet enumSet) {
        boolean z;
        qre qreVar = (qre) this.f;
        yqe yqeVar = qreVar.b;
        if (((j92) this.i) == null || ((ash) this.h) != null) {
            return;
        }
        Object obj = this.e;
        if (yqeVar != null && yqeVar.a() && ((z05) obj).i == null) {
            return;
        }
        Iterator it = ((j92) this.i).b().iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            cdg cdgVar = (cdg) it.next();
            if (cdgVar.a.b) {
                z = true;
                break;
            } else if (cdgVar.b.b) {
                z3 = true;
            } else if (cdgVar.c.b) {
                z2 = true;
            }
        }
        if (z2 && this.b == -1) {
            z = true;
        }
        int i = 3;
        if (z) {
            if (this.a <= 0) {
                i = 1;
            }
        } else if (!z2) {
            i = z3 ? 2 : 0;
        }
        if (i != 0) {
            if (i == 1) {
                this.b = -1;
            }
            s9i s9iVar = (s9i) this.d;
            z05 z05Var = (z05) obj;
            int i2 = this.b;
            boolean z4 = enumSet != null && enumSet.contains(vc9.a);
            if (((uy8) s9iVar.e) == null) {
                h9o.e();
                return;
            }
            n82 ashVar = (yqeVar == null || !yqeVar.a.startsWith("clip_")) ? new ash((Context) s9iVar.b, (vr9) s9iVar.d, qreVar, i2, z05Var, (uy8) s9iVar.e, z4) : new fab((Context) s9iVar.b, (vr9) s9iVar.d, qreVar, i2, z05Var, (uy8) s9iVar.e, z4);
            this.h = ashVar;
            ashVar.U(new bp(this, i));
        }
    }

    public final void d(boolean z) {
        Rect rect = (Rect) this.f;
        int[] iArr = (int[]) this.d;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.a;
        int i4 = this.b;
        View view = (View) this.e;
        view.getLocationInWindow(iArr);
        iArr[0] = Math.max(iArr[0], 0);
        iArr[1] = Math.max(iArr[1], 0);
        this.a = view.getWidth();
        int height = view.getHeight();
        this.b = height;
        if (!z && iArr[0] == i && iArr[1] == i2 && this.a == i3 && height == i4) {
            return;
        }
        int i5 = iArr[0];
        rect.left = i5;
        rect.top = iArr[1];
        rect.right = view.getWidth() + i5;
        int height2 = view.getHeight() + rect.top;
        rect.bottom = height2;
        int i6 = rect.left;
        Rect rect2 = (Rect) this.h;
        int i7 = i6 + rect2.left;
        rect.left = i7;
        int i8 = rect.top + rect2.top;
        rect.top = i8;
        int i9 = rect.right - rect2.right;
        rect.right = i9;
        int i10 = height2 - rect2.bottom;
        rect.bottom = i10;
        Rect rect3 = (Rect) this.i;
        rect.left = i7 - rect3.left;
        rect.top = i8 - rect3.top;
        rect.right = i9 + rect3.right;
        rect.bottom = i10 + rect3.bottom;
        if (!this.c) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i11 = rect.left;
            WeakHashMap weakHashMap = r5n.a;
            rect.left = i11 + (z2 ? view.getPaddingEnd() : view.getPaddingStart());
            rect.right -= z2 ? view.getPaddingStart() : view.getPaddingEnd();
            rect.top = view.getPaddingTop() + rect.top;
            rect.bottom -= view.getPaddingBottom();
        }
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        rect.right = Math.min(rect.right, view.getRootView().getWidth());
        rect.bottom = Math.min(rect.bottom, view.getRootView().getHeight());
        ((y1n) this.g).run();
    }
}
