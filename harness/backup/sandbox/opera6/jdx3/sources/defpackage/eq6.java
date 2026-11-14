package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class eq6 implements ssf, wn8, kc9, kkm, km3, iv5, qo3, xan {
    public Object a;

    public eq6(byte b) {
        switch (b) {
            case 7:
                this.a = new xq0(new y55());
                break;
            case 16:
                this.a = null;
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public /* synthetic */ eq6(Object obj) {
        this.a = obj;
    }

    public eq6(CookieManager cookieManager) {
        this.a = new vmb(cookieManager);
    }

    public static t5c M(eq6 eq6Var, int i) {
        u6c u6cVar = (u6c) eq6Var.a;
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            m6c m6cVar = (m6c) u6cVar.f.getValue();
            bwg.A(ttjVarT, ttjVarX, function1E);
            return u6cVar.q.a(i, m6cVar.j, u6cVar.d, new gbb(i, m6cVar));
        } catch (Throwable th) {
            bwg.A(ttjVarT, ttjVarX, function1E);
            throw th;
        }
    }

    public final void A(zc7 zc7Var) {
        R(zc7Var);
    }

    public final void B(f75 f75Var) {
        R(f75Var);
    }

    public final void C(kvj kvjVar) {
        R(kvjVar);
    }

    public final void D(iva ivaVar) {
        R(ivaVar);
    }

    @Override // defpackage.kc9
    public final InputStream E() {
        byte[] bArr = (byte[]) this.a;
        if (bArr == null) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    public final void F(k66 k66Var) {
        R(k66Var);
    }

    public final void G(nj3 nj3Var) {
        R(nj3Var);
    }

    @Override // defpackage.ssf
    public final void H(ByteArrayOutputStream byteArrayOutputStream, rsf rsfVar) throws IOException {
        u56 u56Var = ((ae7) rsfVar).b;
        int i = xq0.d;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(2);
            xq0.d4(dataOutputStream, u56Var);
        } finally {
            dataOutputStream.close();
        }
    }

    public final iak I() {
        xx7 xx7VarA = xx7.a();
        if (xx7VarA.c() == 1) {
            return new u0b(true);
        }
        t0g t0gVarK = hyg.k(Boolean.FALSE);
        xx7VarA.l(new kr6(t0gVarK, this, (byte) 0));
        return t0gVarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.util.Map r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ov6
            if (r0 == 0) goto L13
            r0 = r7
            ov6 r0 = (defpackage.ov6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ov6 r0 = new ov6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r7)
            u11 r7 = new u11
            r2 = 11
            r7.<init>(r5, r6, r3, r2)
            r0.v = r4
            java.lang.Object r5 = zch.A(r7, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq6.J(java.util.Map, nt5):java.lang.Object");
    }

    public final void K() {
        bpd bpdVar = (bpd) this.a;
        ArrayList arrayList = (ArrayList) bpdVar.c;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((em8) arrayList.get(i)).a.get() == this) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ((qim) bpdVar.b).a();
                    return;
                }
                return;
            }
        }
    }

    public final void L(rnd rndVar, bnd bndVar, ArrayList arrayList) {
        ez9 ez9Var = (ez9) this.a;
        if (rndVar != ez9Var.z || bndVar == null) {
            if (rndVar == ez9Var.e) {
                if (bndVar != null) {
                    ez9Var.q(ez9Var.d, bndVar);
                }
                ynd yndVarA = ez9Var.d.a();
                if (yndVarA != null) {
                    yndVarA.p(arrayList);
                    return;
                }
                return;
            }
            return;
        }
        bod bodVar = ez9Var.y.a;
        String strD = bndVar.d();
        cod yndVar = new ynd(bodVar, strD, ez9Var.b(bodVar, strD));
        yndVar.i(bndVar);
        if (ez9Var.d != yndVar) {
            ez9Var.k(ez9Var, yndVar, ez9Var.z, 3, ez9Var.A, true, ez9Var.y, arrayList);
            ez9Var.y = null;
            ez9Var.z = null;
            ez9Var.A = 0;
        }
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

    public final void P() {
        ewa ewaVar = (ewa) this.a;
        synchronized (ewaVar.t) {
            Integer num = (Integer) ewaVar.t.getAndSet(null);
            if (num == null) {
                return;
            }
            if (num.intValue() != ewaVar.K()) {
                ewaVar.N();
            }
        }
    }

    public final void Q(ks3 ks3Var) throws Throwable {
        hvj hvjVar;
        BufferedInputStream bufferedInputStream = null;
        try {
            hvjVar = new hvj(ks3Var);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream((File) this.a));
                try {
                    String strF = fsp.F(bufferedInputStream2);
                    if (strF == null) {
                        throw new f13("Bad MIME boundary");
                    }
                    hvjVar.b = strF;
                    hvjVar.c = "--" + hvjVar.b + "\r\n";
                    hvjVar.h(new URL("https://crashstats-collector.opera.com/collector/submit"));
                    hvjVar.l();
                    xvg.n(bufferedInputStream2, hvjVar.e);
                    hvjVar.l();
                    xvg.l(bufferedInputStream2);
                    hvjVar.close();
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    xvg.l(bufferedInputStream);
                    if (hvjVar != null) {
                        hvjVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            hvjVar = null;
        }
    }

    public final void R(k73 k73Var) {
        k73 k73Var2 = (k73) k73Var.c;
        while (k73Var2 != null) {
            k73 k73Var3 = (k73) k73Var2.f;
            k73Var2.a(this);
            k73Var2 = k73Var3;
        }
    }

    @Override // defpackage.km3
    public final void a(int i) {
        h2b h2bVar = (h2b) this.a;
        nl3.b.getClass();
        ulp.C(i);
        h2bVar.f("");
    }

    @Override // defpackage.ssf
    public final rsf b() {
        return new ae7(this, y55.w());
    }

    public final void c(nel nelVar) {
        R(nelVar);
    }

    public final void d(bsf bsfVar) {
        R(bsfVar);
    }

    @Override // defpackage.km3
    public final void e(long j) {
        z80 z80Var;
        h2b h2bVar = (h2b) this.a;
        orm ormVar = h2bVar.c;
        boolean z = j > 0;
        if (z) {
            ((x5f) ormVar).S(16);
            z80Var = z80.g;
        } else {
            z80Var = z80.h;
        }
        ((x5f) ormVar).X(z80Var);
        x5f x5fVar = (x5f) h2bVar.d;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.N(zpaVar).r(5, 1, z);
        x5fVar.U0(x56VarF);
        ((x5f) ormVar).I(w2b.c, c3b.FROM_FILE, v2b.BOOKMARKS, z ? eb0.b : eb0.d);
        ac8.b(new k3b(1, j, null, 12));
    }

    public final Object f() {
        ami amiVar = (ami) this.a;
        return new r38((wy9) amiVar.b, (wy9) amiVar.c, (wy9) amiVar.d, (wy9) amiVar.e, (f38) amiVar.f, (f38) amiVar.g, (ua7) amiVar.h);
    }

    public final void g(k9a k9aVar) {
        R(k9aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(mma r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            ks3 r0 = (defpackage.ks3) r0
            java.lang.Object r1 = r0.f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r12.c
            k73 r3 = (defpackage.k73) r3
            if (r3 != 0) goto L8f
            java.lang.String r3 = r12.g
            r4 = 6
            r5 = 0
            int r4 = kotlin.text.StringsKt.L(r3, r2, r5, r5, r4)
            r6 = -1
            if (r4 <= r6) goto L47
            int r2 = r2.length()
            int r2 = r2 + r4
            int r7 = r3.length()
            r8 = r5
        L27:
            if (r2 >= r7) goto L3f
            char r9 = r3.charAt(r2)
            r10 = 34
            if (r9 == r10) goto L3a
            r10 = 62
            if (r9 != r10) goto L3c
            if (r8 != 0) goto L3c
            int r2 = r2 + 1
            goto L40
        L3a:
            r8 = r8 ^ 1
        L3c:
            int r2 = r2 + 1
            goto L27
        L3f:
            r2 = r6
        L40:
            if (r2 <= r6) goto L47
            kotlin.ranges.IntRange r2 = djh.j(r4, r2)
            goto L4e
        L47:
            bcb r2 = kotlin.ranges.IntRange.e
            r2.getClass()
            kotlin.ranges.IntRange r2 = kotlin.ranges.IntRange.f
        L4e:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L8f
            java.lang.String r3 = r12.g
            int r4 = r2.a
            java.lang.String r3 = r3.substring(r5, r4)
            java.lang.CharSequence r3 = kotlin.text.StringsKt.l0(r3)
            java.lang.String r3 = r3.toString()
            int r3 = r3.length()
            if (r3 != 0) goto L8f
            java.lang.String r11 = r12.g
            int r3 = r2.b
            int r3 = r3 + 1
            r4 = 4
            int r11 = kotlin.text.StringsKt.L(r11, r1, r3, r5, r4)
            if (r11 <= r6) goto L84
            int r1 = r1.length()
            int r1 = r1 + r11
            kotlin.ranges.IntRange r11 = djh.j(r11, r1)
            r0.y(r12, r2, r11)
            return
        L84:
            bcb r11 = kotlin.ranges.IntRange.e
            r11.getClass()
            kotlin.ranges.IntRange r11 = kotlin.ranges.IntRange.f
            r0.y(r12, r2, r11)
            return
        L8f:
            r11.R(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq6.h(mma):void");
    }

    public final void i(hra hraVar, List list) {
        ((vmb) this.a).i(hraVar, list);
    }

    public final void j(tik tikVar) {
        R(tikVar);
    }

    public final void k(bll bllVar) {
        R(bllVar);
    }

    public final void l(xy8 xy8Var) {
        R(xy8Var);
    }

    @Override // defpackage.kc9
    public final long length() {
        if (((byte[]) this.a) == null) {
            return 0L;
        }
        return r2.length;
    }

    @Override // defpackage.qo3
    public final lak m() {
        return (rlh) this.a;
    }

    public final void n(qz7 qz7Var) {
        R(qz7Var);
    }

    public final void o(kal kalVar) {
        R(kalVar);
    }

    public final void p(l7a l7aVar) {
        R(l7aVar);
    }

    public final void q(szf szfVar) {
        R(szfVar);
    }

    public final void r(mfc mfcVar) {
        R(mfcVar);
    }

    public final void s(phc phcVar) {
        R(phcVar);
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) {
        ztn ztnVar = ((dda) this.a).A;
        if (ztnVar == null) {
            ztnVar = null;
        }
        ztnVar.getClass();
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            ztnVar.f.remove(((guh) it.next()).a);
        }
        ztnVar.M();
    }

    public final void u(xfc xfcVar) {
        R(xfcVar);
    }

    @Override // defpackage.ssf
    public final rsf v(ByteArrayInputStream byteArrayInputStream) throws IOException {
        u56 u56VarW = y55.w();
        xq0 xq0Var = (xq0) this.a;
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            xq0Var.K2(dataInputStream);
            xq0Var.Y0(dataInputStream, u56VarW, dataInputStream.readShort());
            dataInputStream.close();
            return new ae7(this, u56VarW);
        } catch (Throwable th) {
            dataInputStream.close();
            throw th;
        }
    }

    public final List w(hra hraVar) {
        return ((vmb) this.a).w(hraVar);
    }

    public final void x(h14 h14Var) {
        R(h14Var);
    }

    public final void y(yma ymaVar) {
        R(ymaVar);
    }

    public final void z(u5b u5bVar) {
        R(u5bVar);
    }
}
