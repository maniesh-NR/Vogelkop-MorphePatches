package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.opera.android.OperaApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class ef7 extends iji {
    public final jv0 A;
    public final wjh B;
    public ag C;
    public kc0 D;
    public mc0 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final re7 w;
    public final boolean x;
    public re7 y;
    public final rf7 z;

    public ef7(mej mejVar, dx3 dx3Var, re7 re7Var, boolean z, rf7 rf7Var, jv0 jv0Var, wjh wjhVar) {
        super(mejVar, dx3Var);
        this.D = kc0.d;
        this.w = re7Var;
        this.x = z;
        this.z = rf7Var;
        this.A = jv0Var;
        this.B = wjhVar;
    }

    @Override // defpackage.iji
    public final void A() {
        this.D = kc0.e;
    }

    @Override // defpackage.iji
    public final void B() {
        this.G = true;
    }

    @Override // defpackage.iji
    public final void C() {
        this.H = true;
    }

    @Override // defpackage.iji
    public final void D() {
        this.F = true;
    }

    @Override // defpackage.iji
    public final void E() {
        this.E = mc0.b;
    }

    @Override // defpackage.iji
    public final void F() {
        this.E = mc0.c;
    }

    @Override // defpackage.iji
    public final void G() {
        this.I = true;
    }

    @Override // defpackage.iji
    public final void H() {
        a0(2, kc0.h);
    }

    @Override // defpackage.iji
    public final void I() {
        a0(1, kc0.f);
    }

    @Override // defpackage.iji
    public final boolean K() {
        if (!this.A.v()) {
            return false;
        }
        re7 re7Var = this.w;
        long j = re7Var.j;
        Set set = u92.e;
        return vtp.a0(j > 0 ? Long.valueOf(j) : null, re7Var.m, rf7.g(re7Var));
    }

    @Override // defpackage.iji
    public final boolean L(kg7 kg7Var) {
        if (kg7Var == kg7.l || kg7Var == kg7.k) {
            re7 re7Var = this.w;
            if (re7Var.j <= 104857600) {
                return rf7.n(this.b.getContext(), re7Var, false);
            }
        }
        return false;
    }

    @Override // defpackage.iji
    public final boolean M() {
        return !this.x && rf7.g(this.w).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // defpackage.iji, defpackage.dej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.content.Context r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            android.view.View r6 = super.a(r6)
            java.lang.String[] r0 = com.opera.android.OperaApplication.K
            dx3 r0 = r5.c
            android.app.Application r0 = r0.getApplication()
            com.opera.android.OperaApplication r0 = (com.opera.android.OperaApplication) r0
            ydn r0 = r0.R()
            vdn r1 = r0.d
            boolean r1 = r1.a
            r2 = 0
            re7 r3 = r5.w
            if (r1 == 0) goto L48
            gfn r1 = r0.c
            boolean r1 = r1.isEnabled()
            if (r1 != 0) goto L48
            xf7 r1 = r3.a
            boolean r1 = r1.a()
            vdn r4 = r0.d
            boolean r4 = r4.a()
            if (r4 == 0) goto L33
            if (r1 == 0) goto L3b
        L33:
            vdn r4 = r0.d
            boolean r4 = r4.a
            if (r4 == 0) goto L48
            if (r1 == 0) goto L48
        L3b:
            com.opera.android.downloads.DownloadItem r1 = r3.t
            java.lang.String r1 = r1.getUrl()
            boolean r0 = r0.t(r1)
            r0 = r0 ^ 1
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 == 0) goto L55
            r0 = 2131363217(0x7f0a0591, float:1.8346237E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r2)
        L55:
            df7 r0 = new df7
            r0.<init>(r3)
            wjh r1 = r5.B
            r5.r(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef7.a(android.content.Context):android.view.View");
    }

    public final void a0(int i, kc0 kc0Var) {
        re7 re7Var = this.w;
        File fileH = re7Var.h();
        if (!fileH.exists() || !fileH.canWrite()) {
            R(new glj(2132018630, 2500));
            return;
        }
        if (this.z.f(re7Var, fileH.getPath()) < re7Var.j) {
            R(new glj(2132020041, 2500));
            return;
        }
        re7Var.y(i);
        re7Var.b();
        this.D = kc0Var;
        b();
    }

    @Override // defpackage.iji, defpackage.dej
    public final void c(hjm hjmVar) {
        Context context = this.b.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.N(this.D, this.E, this.F, this.I, this.H, this.G, this.w.c());
        super.c(hjmVar);
    }

    @Override // defpackage.iji
    public final void g() {
        re7 re7Var = this.w;
        if (re7Var.n) {
            return;
        }
        this.z.s(re7Var);
    }

    @Override // defpackage.iji
    public final void h(Uri uri, String str) {
        re7 re7Var = this.w;
        if (!uri.equals(re7Var.d)) {
            re7Var.d = uri;
            re7Var.e = null;
        }
        re7Var.x(str);
        re7Var.b();
    }

    @Override // defpackage.iji
    public final void j(wii wiiVar) {
        this.z.c(this.y, wiiVar);
    }

    @Override // defpackage.iji
    public final void k(fji fjiVar, vwh vwhVar) {
        this.z.c(((df7) fjiVar).a, null);
    }

    @Override // defpackage.iji
    public final long n(String str) {
        return this.z.f(this.w, str);
    }

    @Override // defpackage.iji
    public final fji o(Uri uri, String str) {
        re7 re7Var;
        Uri uriG;
        boolean zEquals;
        rf7 rf7Var = this.z;
        rf7Var.getClass();
        boolean zG = s29.g(uri);
        ArrayList arrayList = rf7Var.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                re7Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            re7Var = (re7) obj;
            re7 re7Var2 = this.w;
            if (re7Var != re7Var2 && re7Var.q() && TextUtils.equals(re7Var.t.getUrl(), re7Var2.t.getUrl()) && TextUtils.equals(re7Var.f(), str) && re7Var.a() && (uriG = re7Var.g()) != null && (zEquals = "file".equals(uriG.getScheme())) == zG) {
                if (zEquals) {
                    if (uri.equals(Uri.fromFile(new File(uriG.getPath()).getParentFile()))) {
                        break;
                    }
                } else if (uriG.equals(DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getDocumentId(uriG)))) {
                    break;
                }
            }
        }
        this.y = re7Var;
        if (re7Var == null) {
            return null;
        }
        return new df7(re7Var);
    }

    @Override // defpackage.iji
    public final fji q(Uri uri) {
        re7 re7Var = this.w;
        rf7 rf7Var = this.z;
        int iIndexOf = rf7Var.c.indexOf(re7Var);
        re7 re7VarE = iIndexOf < 0 ? null : rf7Var.e(uri, iIndexOf + 1);
        if (re7VarE == null) {
            return null;
        }
        return new df7(re7VarE);
    }

    @Override // defpackage.iji
    public final void s(gg7 gg7Var) {
        Context context = this.b.getContext();
        String[] strArr = OperaApplication.K;
        cqp.n0(this.c, ((OperaApplication) context.getApplicationContext()).L().c, new iu2(gg7Var, (byte) 27));
    }

    @Override // defpackage.iji
    public final void u() {
        this.z.u(this.C);
        this.C = null;
    }

    @Override // defpackage.iji
    public final void v(wjh wjhVar) {
        ag agVar = new ag(wjhVar, (byte) 1);
        this.C = agVar;
        this.z.b(agVar);
    }

    @Override // defpackage.iji
    public final void w(Context context, wii wiiVar) {
        this.z.p(this.y, context, wiiVar, false);
    }

    @Override // defpackage.iji
    public final void y() {
        zhj zhjVarA = zhj.a(new gld(), 4099);
        mej mejVar = this.b;
        zhjVarA.c(mejVar.getContext());
        re7 re7Var = this.w;
        egd egdVar = new egd(Uri.parse(re7Var.t.getUrl()), re7Var.m, re7Var.a.a() ? re7Var.b : Integer.MIN_VALUE);
        Context context = mejVar.getContext();
        String[] strArr = OperaApplication.K;
        tjg tjgVarX = ((OperaApplication) context.getApplicationContext()).x();
        tjgVarX.e(new egd[]{egdVar}, new kjg(tjgVarX, (byte) 2));
        this.D = kc0.g;
        b();
    }

    @Override // defpackage.iji
    public final void z() {
        this.D = kc0.c;
    }
}
