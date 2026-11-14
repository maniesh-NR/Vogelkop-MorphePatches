package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Parcel;
import android.view.MotionEvent;
import android.widget.TextView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.chromium.ui.base.EventForwarder;

/* loaded from: classes.dex */
public final class qq6 implements g38, mya, kc9, kkm, w7e, km3, m94, zqb {
    public final /* synthetic */ byte a;
    public Object b;

    public qq6(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = new awj(fsp.e);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                break;
            case 15:
                this.b = new yp9(5, 1.0f, false, (byte) 0);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                this.b = new isd((byte) 2);
                break;
            case 27:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new s14((byte) 18);
                break;
        }
    }

    public qq6(Context context) {
        this.a = (byte) 6;
        this.b = ru9.c(context);
    }

    public qq6(TextView textView) {
        this.a = (byte) 23;
        this.b = textView;
        z61 z61Var = new z61();
        if (textView.isAttachedToWindow()) {
            z61Var.onViewAttachedToWindow(textView);
        }
        textView.addOnAttachStateChangeListener(z61Var);
    }

    public /* synthetic */ qq6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qq6(r9i r9iVar) {
        this.a = (byte) 24;
        this.b = b8h.d(xf8.u(new yc1(qbe.t(ma9.b((f99) ((zyk) r9iVar.e).getValue(), new zp6((byte) 2, null, r9iVar))), (byte) 15)));
    }

    @Override // defpackage.kc9
    public final InputStream E() {
        return new FileInputStream((File) this.b);
    }

    @Override // defpackage.kkm
    public final e5d N(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new guh(Long.valueOf(((Number) it.next()).longValue()), -1));
        }
        return new e5d(arrayList, l08.a, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    @Override // defpackage.km3
    public final void a(int i) {
        ((ImportChromeBookmarksActivity) this.b).E0(i);
    }

    public final Object attachCompleter(l94 l94Var) {
        ohc ohcVar = (ohc) this.b;
        jpo.n("The result can only set once!", ohcVar.f == null);
        ohcVar.f = l94Var;
        return "ListFuture[" + this + "]";
    }

    public final void b(m3c m3cVar) {
        if (!m3cVar.H()) {
            a8b.b("DepthSortedSet.add called on an unattached node");
        }
        ((awj) this.b).add(m3cVar);
    }

    public final void c(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public final void d(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [android.app.Activity, com.opera.android.import_data.ImportChromeBookmarksActivity, l2b] */
    @Override // defpackage.km3
    public final void e(long j) {
        ?? r7 = (ImportChromeBookmarksActivity) this.b;
        r7.B0();
        r7.setResult(-1);
        r7.finish();
        r7.L0(v2b.BOOKMARKS, j);
        ac8.b(new k3b(1, j, null, 12));
    }

    public final void f(long j) {
        long jB = rkl.b(j);
        byte b = 0;
        if (!skl.a(jB, 0L)) {
            if (skl.a(jB, 4294967296L)) {
                b = 1;
            } else if (skl.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (skl.a(rkl.b(j), 0L)) {
            return;
        }
        d(rkl.c(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.or6
            if (r0 == 0) goto L13
            r0 = r6
            or6 r0 = (defpackage.or6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            or6 r0 = new or6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.t
            ybh.y(r6)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L30:
            ybh.y(r6)
            java.lang.Object r4 = r4.b
            bpd r4 = (bpd) r4
            java.lang.Object r4 = r4.c
            f99 r4 = (f99) r4
            r0.t = r5
            r0.w = r3
            java.lang.Object r6 = cs5.E(r4, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.util.Set r6 = (java.util.Set) r6
            boolean r4 = r6.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq6.g(java.lang.String, nt5):java.lang.Object");
    }

    public final void h(Function1 function1, Function2 function2) {
        ((s14) this.b).r(new s2k(function1, function2));
    }

    public final void i(Exception exc) {
        w7d.r("Audio sink error", exc);
        pad padVar = ((kgd) this.b).E0;
        Handler handler = (Handler) padVar.b;
        if (handler != null) {
            handler.post(new fh2(padVar, exc, (byte) 8));
        }
    }

    public final boolean j(m3c m3cVar) {
        if (!m3cVar.H()) {
            a8b.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((awj) this.b).remove(m3cVar);
    }

    public final void k(MotionEvent motionEvent, boolean z) {
        zy9 zy9Var = (zy9) this.b;
        int iJ = exg.j(motionEvent.getActionMasked());
        if (iJ == 0 || iJ == 9 || iJ == 7) {
            l(-0.0f, -((ChromiumContent) zy9Var.a).B);
        } else if (z) {
            if (iJ == 1 || iJ == 3) {
                l(0.0f, 0.0f);
            }
        }
    }

    public final void l(float f, float f2) {
        EventForwarder eventForwarderD1;
        ChromiumContent chromiumContent = (ChromiumContent) ((zy9) this.b).a;
        if (chromiumContent.h() || (eventForwarderD1 = chromiumContent.e().d1()) == null) {
            return;
        }
        eventForwarderD1.i = f;
        eventForwarderD1.j = f2;
    }

    @Override // defpackage.kc9
    public final long length() {
        return ((File) this.b).length();
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        yr8 yr8Var = (yr8) this.b;
        gjf gjfVar = yr8Var.c;
        int i = yr8Var.d;
        xr8 xr8Var = yr8Var.b;
        yr8Var.g = new jl6(bitmap, gjfVar, i, xr8Var.i());
        xr8Var.h();
        xr8Var.invalidate();
    }

    public final Object s(String str) {
        u38 u38Var = (u38) this.b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return u38Var.d(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return u38Var.d(str, (Provider) null);
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        jy0 jy0Var = ((dda) this.b).C;
        if (jy0Var == null) {
            jy0Var = null;
        }
        jy0Var.getClass();
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            jy0Var.e.remove(((guh) it.next()).a);
        }
        jy0Var.M();
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                return ((awj) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mya
    public final void u(int i) {
        ((yr8) this.b).i(false);
    }

    public final v7e w(d5o d5oVar) {
        return new qoa((isd) this.b);
    }

    public final void z(orb orbVar) {
        ((ilm) this.b).run(orbVar.a.toString());
    }
}
