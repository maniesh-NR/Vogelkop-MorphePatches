package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.NetworkTester$NonProxiedTest;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class cdn extends lim {
    public f6l d;
    public rle e;
    public final Context f;
    public final k6l g;
    public final eej h;
    public boolean i;
    public int j;
    public ddn o;
    public NetworkTester$NonProxiedTest q;
    public final h7f a = new h7f();
    public final gzg b = new gzg(this, 3);
    public final q6l c = new q6l(this, 5);
    public int k = 1;
    public int l = 1;
    public final tvk m = new tvk(this);
    public final ssi n = new ssi(this, 22);
    public final dcl p = new dcl(this);

    public cdn(Context context, k6l k6lVar, eej eejVar) {
        this.f = context;
        this.g = k6lVar;
        this.h = eejVar;
    }

    public final ydn R() {
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) this.f.getApplicationContext()).R();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            r12 = this;
            k6l r0 = r12.g
            b2l r0 = r0.o
            if (r0 == 0) goto Lbe
            boolean r1 = r12.i
            r2 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L70
            ydn r1 = r12.R()
            d7l r0 = (defpackage.d7l) r0
            e7l r6 = r0.j
            boolean r6 = r6.m()
            if (r6 == 0) goto L21
            int r1 = r1.q()
            goto L25
        L21:
            int r1 = r1.r()
        L25:
            e7l r0 = r0.j
            boolean r0 = r0.isLoading()
            r6 = 128(0x80, double:6.3E-322)
            r8 = 3
            r9 = 5
            android.content.Context r10 = r12.f
            if (r0 == 0) goto L4b
            r0 = 4
            if (r1 == r0) goto L38
            if (r1 != r8) goto L4b
        L38:
            ufn r0 = defpackage.ufn.t(r10)
            java.lang.Object r0 = r0.i()
            tfn r0 = (defpackage.tfn) r0
            long r0 = r0.a
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L62
            r8 = r5
            goto L71
        L4b:
            if (r1 == r4) goto L64
            int r0 = r12.j
            if (r0 == 0) goto L64
            ufn r0 = defpackage.ufn.t(r10)
            java.lang.Object r0 = r0.i()
            tfn r0 = (defpackage.tfn) r0
            long r10 = r0.a
            long r10 = r10 & r6
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L64
        L62:
            r8 = r9
            goto L71
        L64:
            if (r1 == r4) goto L70
            int r0 = r12.j
            r1 = -111(0xffffffffffffff91, float:NaN)
            if (r0 == r1) goto L71
            r1 = 502(0x1f6, float:7.03E-43)
            if (r0 == r1) goto L71
        L70:
            r8 = r4
        L71:
            int r0 = r12.l
            ssi r1 = r12.n
            if (r8 == r0) goto L7c
            defpackage.vml.a(r1)
            r12.l = r4
        L7c:
            ddn r0 = r12.o
            if (r0 == 0) goto L8d
            int r0 = r0.a()
            if (r0 == r8) goto L8d
            ddn r0 = r12.o
            if (r0 == 0) goto L8d
            r0.cancel()
        L8d:
            if (r8 == r4) goto La0
            int r0 = r12.l
            if (r0 != r4) goto La0
            ddn r0 = r12.o
            if (r0 != 0) goto La0
            r12.l = r8
            if (r8 != r5) goto L9d
            r2 = 8000(0x1f40, double:3.9525E-320)
        L9d:
            defpackage.vml.d(r1, r2)
        La0:
            int r0 = r12.k
            if (r8 == r0) goto Lbe
            r12.k = r8
            h7f r12 = r12.a
            g7f r12 = am2.h(r12, r12)
        Lac:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r12.next()
            xcn r0 = (defpackage.xcn) r0
            bdn r0 = r0.a
            r0.c()
            goto Lac
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdn.S():void");
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        R().F(this.b);
        this.d = this.g.a(this.c);
        this.i = sle.d();
        this.e = sle.a(new fpk(this, (byte) 1));
        S();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        NetworkChangeNotifier.removeConnectionTypeObserver(this.e.a);
        this.e = null;
        this.g.H(this.d);
        R().H(this.b);
    }
}
