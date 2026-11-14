package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.math.BigInteger;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class nrl implements o9n, nl5, cr, bag {
    public static final k2d c = new k2d(0, 18, 0);
    public static final k2d d = new k2d(19, 36, 0);
    public boolean a;
    public Object b;

    public nrl(byte b) {
        switch (b) {
            case 11:
                this.b = new SparseBooleanArray();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                this.a = false;
                this.b = new ArrayDeque();
                break;
            case 25:
                this.b = new Handler(Looper.getMainLooper(), new ha3((byte) 1));
                break;
            case 26:
                this.b = new vl9();
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public nrl(ToggleAnimationView toggleAnimationView, int i) {
        this.b = toggleAnimationView;
        toggleAnimationView.j(i);
        final byte b = 0;
        toggleAnimationView.u(new oll() { // from class: mrl
            @Override // defpackage.oll
            public final void a() {
                byte b2 = b;
                Object obj = this;
                switch (b2) {
                    case 0:
                        nrl nrlVar = (nrl) obj;
                        ToggleAnimationView toggleAnimationView2 = (ToggleAnimationView) nrlVar.b;
                        int i2 = nrlVar.a ? 18 : 36;
                        toggleAnimationView2.s(0, i2, i2, null);
                        break;
                    default:
                        ((ro9) obj).e();
                        break;
                }
            }
        });
    }

    public /* synthetic */ nrl(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ nrl(Object obj, byte b) {
        this.b = obj;
        this.a = true;
    }

    public /* synthetic */ nrl(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public nrl(oq4 oq4Var, ode odeVar, boolean z) {
        this.b = oq4Var;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(OperaListItem operaListItem, String str) {
        if (TextUtils.isEmpty(str)) {
            operaListItem.setVisibility(8);
        } else {
            operaListItem.setVisibility(0);
            operaListItem.C(new qxh(str));
        }
    }

    public static int r(taf tafVar, OmniButtonView omniButtonView) {
        if (tafVar == taf.O) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) omniButtonView.getLayoutParams();
        return marginLayoutParams.width + marginLayoutParams.rightMargin + marginLayoutParams.leftMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pq4 u(javax.security.auth.x500.X500Principal r4) {
        /*
            r0 = 0
            j8o r1 = new j8o     // Catch: java.lang.IllegalArgumentException -> L46
            java.lang.String r4 = r4.getName()     // Catch: java.lang.IllegalArgumentException -> L46
            r1.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L46
            q0 r4 = sx2.l     // Catch: java.lang.IllegalArgumentException -> L46
            bih[] r4 = r1.j(r4)     // Catch: java.lang.IllegalArgumentException -> L46
            int r2 = r4.length     // Catch: java.lang.IllegalArgumentException -> L46
            r3 = 0
            if (r2 <= 0) goto L28
            r4 = r4[r3]     // Catch: java.lang.IllegalArgumentException -> L46
            g1 r2 = r4.a     // Catch: java.lang.IllegalArgumentException -> L46
            x[] r2 = r2.a     // Catch: java.lang.IllegalArgumentException -> L46
            int r2 = r2.length     // Catch: java.lang.IllegalArgumentException -> L46
            if (r2 <= 0) goto L28
            lf2 r4 = r4.i()     // Catch: java.lang.IllegalArgumentException -> L46
            x r4 = r4.b     // Catch: java.lang.IllegalArgumentException -> L46
            java.lang.String r4 = defpackage.fsp.J(r4)     // Catch: java.lang.IllegalArgumentException -> L46
            goto L29
        L28:
            r4 = r0
        L29:
            q0 r2 = sx2.o     // Catch: java.lang.IllegalArgumentException -> L47
            bih[] r1 = r1.j(r2)     // Catch: java.lang.IllegalArgumentException -> L47
            int r2 = r1.length     // Catch: java.lang.IllegalArgumentException -> L47
            if (r2 <= 0) goto L47
            r1 = r1[r3]     // Catch: java.lang.IllegalArgumentException -> L47
            g1 r2 = r1.a     // Catch: java.lang.IllegalArgumentException -> L47
            x[] r2 = r2.a     // Catch: java.lang.IllegalArgumentException -> L47
            int r2 = r2.length     // Catch: java.lang.IllegalArgumentException -> L47
            if (r2 <= 0) goto L47
            lf2 r1 = r1.i()     // Catch: java.lang.IllegalArgumentException -> L47
            x r1 = r1.b     // Catch: java.lang.IllegalArgumentException -> L47
            java.lang.String r0 = defpackage.fsp.J(r1)     // Catch: java.lang.IllegalArgumentException -> L47
            goto L47
        L46:
            r4 = r0
        L47:
            pq4 r1 = new pq4
            r1.<init>()
            r1.a = r4
            r1.b = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrl.u(javax.security.auth.x500.X500Principal):pq4");
    }

    public final void A() {
        xm5 xm5Var = (xm5) this.b;
        if (xm5Var != null) {
            this.a = true;
            lxa lxaVar = (lxa) xm5Var.a;
            lxaVar.i.B(((Boolean) lxaVar.m.getValue()).booleanValue());
            this.a = false;
        }
    }

    public void B(byte b) {
        ((kgb) this.b).writeLong(b);
    }

    public final void C(char c2) {
        ((kgb) this.b).f(c2);
    }

    public void D(int i) {
        ((kgb) this.b).writeLong(i);
    }

    public void E(long j) {
        ((kgb) this.b).writeLong(j);
    }

    public final void F(String str) {
        ((kgb) this.b).j(str);
    }

    public void G(short s) {
        ((kgb) this.b).writeLong(s);
    }

    public void H(String str) {
        ((kgb) this.b).i(str);
    }

    public final BigInteger I(BigInteger bigInteger) {
        hih hihVar = (gih) this.b;
        if (hihVar instanceof hih) {
            hih hihVar2 = hihVar;
            BigInteger bigInteger2 = hihVar2.f;
            if (bigInteger2 != null || q5h.c("org.bouncycastle.rsa.no_lenstra_check")) {
                BigInteger bigInteger3 = hihVar2.g;
                hihVar2.k(bigInteger3);
                BigInteger bigInteger4 = hihVar2.h;
                hihVar2.k(bigInteger4);
                BigInteger bigInteger5 = hihVar2.i;
                hihVar2.k(bigInteger5);
                BigInteger bigInteger6 = hihVar2.j;
                hihVar2.k(bigInteger6);
                BigInteger bigInteger7 = hihVar2.k;
                hihVar2.k(bigInteger7);
                BigInteger bigIntegerModPow = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
                BigInteger bigIntegerModPow2 = bigInteger.remainder(bigInteger4).modPow(bigInteger6, bigInteger4);
                BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigInteger7).mod(bigInteger3).multiply(bigInteger4).add(bigIntegerModPow2);
                if (bigInteger2 == null || bigIntegerAdd.modPow(bigInteger2, ((gih) hihVar2).b).equals(bigInteger)) {
                    return bigIntegerAdd;
                }
                qp2.n("RSA engine faulty decryption/signing detected");
                return null;
            }
            gih gihVar = (gih) this.b;
            gihVar.k(gihVar.c);
        }
        gih gihVar2 = (gih) this.b;
        BigInteger bigInteger8 = gihVar2.c;
        gihVar2.k(bigInteger8);
        return bigInteger.modPow(bigInteger8, ((gih) this.b).b);
    }

    public final void J(Object obj, bbb bbbVar) {
        HashMap map = (HashMap) this.b;
        if (map.containsKey(obj)) {
            t14.c(rfp.o(obj, "Another instance is already associated with the key: "));
            return;
        }
        map.put(obj, bbbVar);
        if (this.a) {
            bbbVar.onDestroy();
        }
    }

    public final void K() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((vl9) this.b).run();
    }

    public final synchronized void L(kyh kyhVar, boolean z) {
        if (this.a || z) {
            ((Handler) this.b).obtainMessage(1, kyhVar).sendToTarget();
        } else {
            this.a = true;
            kyhVar.d();
            this.a = false;
        }
    }

    public void N() {
    }

    public void O() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View, com.opera.android.widget.UrlFieldEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(boolean r22) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrl.P(boolean):void");
    }

    public final void Q(kq4 kq4Var) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        int iIntValue;
        oq4 oq4Var = (oq4) this.b;
        SslCertificate sslCertificate = kq4Var.b;
        X509Certificate x509Certificate = kq4Var.a;
        SslCertificate.DName issuedTo = sslCertificate.getIssuedTo();
        boolean z = this.a;
        if (z) {
            pq4 pq4VarU = u(x509Certificate.getSubjectX500Principal());
            M(oq4Var.k, pq4VarU.a);
            M(oq4Var.l, pq4VarU.b);
        }
        M(oq4Var.j, issuedTo.getCName());
        M(oq4Var.m, issuedTo.getOName());
        M(oq4Var.n, issuedTo.getUName());
        M(oq4Var.o, a26.G(x509Certificate.getSerialNumber().toByteArray(), ':'));
        SslCertificate.DName issuedBy = sslCertificate.getIssuedBy();
        if (z) {
            pq4 pq4VarU2 = u(x509Certificate.getIssuerX500Principal());
            M(oq4Var.f, pq4VarU2.a);
            M(oq4Var.g, pq4VarU2.b);
        }
        M(oq4Var.e, issuedBy.getCName());
        M(oq4Var.h, issuedBy.getOName());
        M(oq4Var.i, issuedBy.getUName());
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        M(oq4Var.s, dateInstance.format(sslCertificate.getValidNotBeforeDate()));
        M(oq4Var.r, dateInstance.format(sslCertificate.getValidNotAfterDate()));
        M(oq4Var.d, a26.G(kq4Var.c, ' '));
        M(oq4Var.c, a26.G(kq4Var.d, ' '));
        ArrayList arrayList = new ArrayList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null && !subjectAlternativeNames.isEmpty()) {
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() == 2 && (list.get(0) instanceof Integer) && (list.get(1) instanceof String) && ((iIntValue = ((Integer) list.get(0)).intValue()) == 2 || iIntValue == 7)) {
                    arrayList.add(list.get(1).toString());
                }
            }
        }
        M(oq4Var.q, TextUtils.join("\n", arrayList));
        boolean zIsEmpty = arrayList.isEmpty();
        TextView textView = oq4Var.b;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void a(int i) {
        z4o.H(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    @Override // defpackage.nl5
    public final void b(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        ((nl5) this.b).b(i);
    }

    public final void c(w69 w69Var) {
        for (int i = 0; i < w69Var.a.size(); i++) {
            a(w69Var.b(i));
        }
    }

    public Runnable d(Runnable runnable) {
        if (this.a) {
            runnable.run();
            return null;
        }
        ((vl9) this.b).a(runnable);
        return runnable;
    }

    public final void e(int i, View view) {
        if (view.isLaidOut()) {
            view.animate().alpha(0.0f).translationY(-view.getHeight()).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 6, view, this));
        } else {
            view.setVisibility(8);
        }
    }

    public final void f(int i, View view) {
        view.animate().alpha(1.0f).translationY(0.0f).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 5, view, this));
    }

    public final void h(xba xbaVar) {
        Object obj;
        xm5 xm5Var = (xm5) this.b;
        if (xm5Var != null) {
            this.a = true;
            dya dyaVar = ((lxa) xm5Var.a).t;
            Parcelable parcelable = xbaVar.b;
            if (parcelable != null) {
                if (parcelable instanceof fya) {
                    int iOrdinal = xbaVar.a.ordinal();
                    if (iOrdinal == 0) {
                        dyaVar.b((fya) parcelable);
                    } else if (iOrdinal == 1) {
                        dyaVar.c((fya) parcelable);
                    } else if (iOrdinal != 2) {
                        h9o.p();
                        return;
                    }
                } else if (parcelable instanceof cya) {
                    cya cyaVar = (cya) parcelable;
                    ArrayList arrayList = dyaVar.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i);
                        i++;
                        if (Intrinsics.a((fya) obj, cyaVar.a)) {
                            break;
                        }
                    }
                    fya fyaVar = (fya) obj;
                    if (fyaVar != null) {
                        fyaVar.a(cyaVar);
                    }
                }
            }
            this.a = false;
        }
    }

    @Override // defpackage.cr
    public final void i(boolean z) {
    }

    public final w69 j() {
        z4o.H(!this.a);
        this.a = true;
        return new w69((SparseBooleanArray) this.b);
    }

    public final void k() {
        if (this.a) {
            return;
        }
        this.a = true;
        Iterator it = CollectionsKt.k0(((HashMap) this.b).values()).iterator();
        while (it.hasNext()) {
            ((bbb) it.next()).onDestroy();
        }
    }

    public final Bitmap l(Uri uri, int i, int i2) {
        if (uri == null) {
            return null;
        }
        g2f g2fVar = new g2f(uri);
        vml.c(new f2f(this, uri.toString(), i, i2, g2fVar));
        g2fVar.k.block(g2fVar.m);
        this.a = this.a || g2fVar.l == null;
        return g2fVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    @Override // defpackage.o9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g3o m(android.view.View r19, g3o r20, sv2 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r3.a
            int r5 = r3.b
            d3o r6 = r2.a
            r7 = 519(0x207, float:7.27E-43)
            r9b r7 = r6.i(r7)
            r8 = 32
            r9b r6 = r6.i(r8)
            java.lang.Object r8 = r0.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            boolean r9 = r8.p
            int r10 = r7.b
            int r11 = r7.c
            int r12 = r7.a
            r8.x = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L31
            r10 = r14
            goto L32
        L31:
            r10 = 0
        L32:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            if (r9 == 0) goto L49
            int r15 = r2.a()
            r8.w = r15
            int r3 = r3.c
            int r15 = r15 + r3
        L49:
            boolean r3 = r8.q
            if (r3 == 0) goto L54
            if (r10 == 0) goto L51
            r3 = r5
            goto L52
        L51:
            r3 = r4
        L52:
            int r16 = r3 + r12
        L54:
            r3 = r16
            boolean r13 = r8.r
            if (r13 == 0) goto L5f
            if (r10 != 0) goto L5d
            r4 = r5
        L5d:
            int r17 = r4 + r11
        L5f:
            r4 = r17
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            boolean r10 = r8.t
            if (r10 == 0) goto L73
            int r10 = r5.leftMargin
            if (r10 == r12) goto L73
            r5.leftMargin = r12
            r13 = r14
            goto L74
        L73:
            r13 = 0
        L74:
            boolean r10 = r8.u
            if (r10 == 0) goto L7f
            int r10 = r5.rightMargin
            if (r10 == r11) goto L7f
            r5.rightMargin = r11
            r13 = r14
        L7f:
            boolean r10 = r8.v
            if (r10 == 0) goto L8c
            int r10 = r5.topMargin
            int r7 = r7.b
            if (r10 == r7) goto L8c
            r5.topMargin = r7
            goto L8d
        L8c:
            r14 = r13
        L8d:
            if (r14 == 0) goto L92
            r1.setLayoutParams(r5)
        L92:
            int r5 = r1.getPaddingTop()
            r1.setPadding(r3, r5, r4, r15)
            boolean r0 = r0.a
            if (r0 == 0) goto La1
            int r1 = r6.d
            r8.n = r1
        La1:
            if (r9 != 0) goto La6
            if (r0 != 0) goto La6
            return r2
        La6:
            r8.T()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrl.m(android.view.View, g3o, sv2):g3o");
    }

    @Override // defpackage.cr
    public final void q(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        View view = ((i) ((bu8) this.b)).itemView;
        if (z) {
            q9n.J(view, WebView.class, new yt7((byte) 17));
        } else {
            q9n.J(view, WebView.class, new yt7((byte) 18));
        }
    }

    @Override // defpackage.bag
    public final void s() {
        olh.a((dx3) this.b, false, this.a);
    }

    @Override // defpackage.bag
    public final void t() {
        olh.a((dx3) this.b, true, this.a);
    }

    public final int v() {
        int iBitLength = (((gih) this.b).b.bitLength() + 7) / 8;
        return this.a ? iBitLength : iBitLength - 1;
    }

    public final BitmapShader w() {
        bcd bcdVar = (bcd) this.b;
        if (bcdVar == null) {
            return null;
        }
        BitmapShader bitmapShader = bcdVar.f;
        if (bitmapShader != null) {
            return bitmapShader;
        }
        int i = bcdVar.d;
        Bitmap bitmapU = z5i.u(i, i, Bitmap.Config.ALPHA_8);
        if (bitmapU != null) {
            Canvas canvas = new Canvas(bitmapU);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(bcdVar.c, paint);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader2 = new BitmapShader(bitmapU, tileMode, tileMode);
        bcdVar.f = bitmapShader2;
        return bitmapShader2;
    }

    public void x() {
        this.a = true;
    }

    public void y() {
        this.a = false;
    }

    public void z() {
        this.a = false;
    }
}
