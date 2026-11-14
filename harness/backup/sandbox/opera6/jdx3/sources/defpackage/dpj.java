package defpackage;

import ads_mobile_sdk.e7;
import ads_mobile_sdk.g40;
import ads_mobile_sdk.rs3;
import ads_mobile_sdk.st3;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnFailureListener;
import com.leanplum.internal.ResourceQualifiers;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class dpj implements w7e, lmn, m1p, q8p, djp, ec8, ee5, OnFailureListener {
    public static dpj b;
    public static dpj c;
    public static final /* synthetic */ dpj d = new dpj(17);
    public final /* synthetic */ byte a;

    public /* synthetic */ dpj(byte b2) {
        this.a = b2;
    }

    public static st3 h(long j) {
        return st3.a(new rs3(j));
    }

    public static void i(long j, e7 e7Var, boolean z) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = ((((((~j2) & j3) | j4) + ((j2 & j5) | jArr[4])) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        int iA = u0h.a(1027101999, 1121861623, 2097482120, 23637094) ^ 75118620;
        long j7 = z ? (j << 1) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j8 = j7 & j6;
            j7 >>>= 7;
            boolean z2 = j7 != 0 || i < 0;
            int i2 = (int) j8;
            if (z2) {
                i2 = ((i2 | ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) << iA) >> iA;
            }
            ((ByteArrayOutputStream) e7Var.a).write((byte) i2);
            if (!z2) {
                return;
            } else {
                i++;
            }
        }
    }

    public static fpj k(Context context) {
        Rect rectI = r9n.i(context);
        Size size = new Size(rectI.width(), rectI.height());
        fpj.a.getClass();
        gpj gpjVarS = ddh.s(size.getHeight(), context);
        gpj gpjVar = gpj.a;
        if (gpjVarS.d()) {
            return fpj.b;
        }
        int iOrdinal = ddh.t(size.getWidth(), context).ordinal();
        if (iOrdinal == 0) {
            return fpj.c;
        }
        if (iOrdinal == 1) {
            return fpj.d;
        }
        if (iOrdinal == 2) {
            return fpj.e;
        }
        if (iOrdinal == 3) {
            return fpj.f;
        }
        h9o.p();
        return null;
    }

    @Override // defpackage.djp
    public final Object a(int i) {
        g40 g40Var = g40.b;
        g40 g40Var2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : g40.g : g40.f : g40.e : g40.d : g40.c : g40Var;
        return g40Var2 == null ? g40Var : g40Var2;
    }

    @Override // defpackage.lmn
    public final void b() {
    }

    @Override // defpackage.lmn
    public final void c() {
    }

    @Override // defpackage.lmn
    public final void d(qjn qjnVar) {
    }

    @Override // defpackage.lmn
    public final void e(aln alnVar) {
    }

    @Override // defpackage.lmn
    public final void f() {
    }

    @Override // defpackage.m1p
    public final void g(WebView webView) {
    }

    public final c0l j(Context context) {
        c0l c0lVar;
        synchronized (this) {
            c0lVar = c0l.f;
            if (c0lVar == null) {
                c0lVar = new c0l(vml.d, new ydj(context, (byte) 1));
                c0l.f = c0lVar;
            }
        }
        return c0lVar;
    }

    public final void onFailure(Exception exc) {
    }

    public final Object r(x79 x79Var) {
        return new mg8(x79Var.k(m3e.class));
    }

    public final v7e w(d5o d5oVar) {
        switch (this.a) {
            case 2:
                return new nhk(d5oVar.r(Uri.class, ParcelFileDescriptor.class), (byte) 0);
            default:
                return new nhk(d5oVar.r(xy9.class, InputStream.class), (byte) 1);
        }
    }
}
