package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.opera.android.import_data.ImportChromeDataActivity;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.mojo.system.ResultAnd;

/* loaded from: classes.dex */
public final class xm5 implements pnn, osc, hm6, n5o, uu5, lkm, gdb, gy1, g38, o7h, sic, azc, jr9, qo3, m1j, km3 {
    public Object a;

    public xm5(byte b) {
        switch (b) {
            case 26:
                this.a = new g1g(10);
                break;
            default:
                this.a = Handler.createAsync(Looper.getMainLooper());
                break;
        }
    }

    public xm5(eq9 eq9Var, a64 a64Var) {
        this.a = a26.o0(qbe.t(ic4.l(f03.g(new fg6((byte) 19, (mt5) null, eq9Var)), -1)), a64Var, aej.b, Boolean.valueOf(eq9Var.c()));
    }

    public /* synthetic */ xm5(Object obj) {
        this.a = obj;
    }

    public final void A(ra4 ra4Var) {
        if (ra4Var.b) {
            return;
        }
        pyl pylVar = (pyl) this.a;
        synchronized (((ArrayList) pylVar.e)) {
            ((ArrayList) pylVar.e).remove(ra4Var);
        }
    }

    public final void B() {
        vea veaVar = (vea) this.a;
        int i = veaVar.r - 1;
        veaVar.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (sfa sfaVar : veaVar.t) {
            sfaVar.j();
            i2 += sfaVar.I.a;
        }
        eyl[] eylVarArr = new eyl[i2];
        int i3 = 0;
        for (sfa sfaVar2 : veaVar.t) {
            sfaVar2.j();
            int i4 = sfaVar2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                sfaVar2.j();
                eylVarArr[i3] = sfaVar2.I.a(i5);
                i5++;
                i3++;
            }
        }
        veaVar.s = new fyl(eylVarArr);
        veaVar.q.p(veaVar);
    }

    public final lxd C(lp6 lp6Var, lua luaVar, int i) {
        g1g g1gVar = (g1g) this.a;
        int i2 = 0;
        lxd lxdVarY = null;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = g1gVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    lp6Var.peekFully(g1gVar.a, i5 - i6, i6, false);
                    g1gVar.N(i4);
                    g1gVar.M(i5);
                    if (g1gVar.a() < 3) {
                        s49.o("position=", g1gVar.b, g1gVar.c, ", limit=");
                        return null;
                    }
                    int iD = g1gVar.D();
                    int i7 = g1gVar.b - 3;
                    g1gVar.b = i7;
                    if (iD == 4801587) {
                        g1gVar.O(6);
                        int iZ = g1gVar.z();
                        int i8 = iZ + 10;
                        if (lxdVarY == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(g1gVar.a, i7, bArr2, 0, 10);
                            lp6Var.peekFully(bArr2, 10, iZ, false);
                            lxdVarY = new nua(luaVar).y(i8, bArr2);
                        } else {
                            lp6Var.a(iZ, false);
                        }
                        i2 += i8;
                    } else {
                        if (phj.S(g1gVar.i()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            g1gVar.c(20);
                        }
                        i3++;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        lp6Var.f = 0;
        lp6Var.a(i2, false);
        return lxdVarY;
    }

    public final void D(egd egdVar, MediaMetadata mediaMetadata) {
        wjh wjhVar = (wjh) this.a;
        ArrayList arrayList = (ArrayList) wjhVar.e;
        String string = mediaMetadata.getString("android.media.metadata.TITLE");
        if (TextUtils.isEmpty(string)) {
            string = egdVar.a();
        }
        ujd ujdVar = new ujd();
        ujdVar.a = string;
        ujdVar.f = mediaMetadata.getString("android.media.metadata.ARTIST");
        Bundle bundleL = sfe.L(egdVar.c());
        long j = mediaMetadata.getLong("android.media.metadata.DURATION");
        if (j > 0) {
            bundleL.putLong("android.media.metadata.DURATION", j);
        }
        if (mediaMetadata.containsKey("com.opera.android.media.FILE_LENGTH")) {
            bundleL.putLong("com.opera.android.media.FILE_LENGTH", mediaMetadata.getLong("com.opera.android.media.FILE_LENGTH"));
        }
        if (mediaMetadata.containsKey("com.opera.android.media.FILE_TYPE")) {
            bundleL.putString("com.opera.android.media.FILE_TYPE", mediaMetadata.getString("com.opera.android.media.FILE_TYPE"));
        }
        ujdVar.H = bundleL;
        arrayList.add(new mkg(new vjd(ujdVar), egdVar, mediaMetadata.getBitmap("android.media.metadata.ART"), (String) null));
        wjhVar.k();
    }

    @Override // defpackage.sic
    public final void I(int i, int i2, Object obj) {
        s9i s9iVar = (s9i) this.a;
        ((ns8) s9iVar.e).notifyItemRangeChanged(((tq8) s9iVar.b).e.size() + i, i2);
    }

    @Override // defpackage.lkm
    public final void R(ArrayList arrayList) {
        jg7 jg7Var = ((wg7) this.a).K;
        jg7Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            boolean zRemove = jg7Var.k.remove(re7Var);
            zg7 zg7Var = jg7Var.d;
            if (zRemove) {
                ah7 ah7Var = zg7Var.m;
                ah7Var.a.c(re7Var, ((wg7) ah7Var.b.b).M0());
            } else {
                ((zsi) zg7Var).k.remove(re7Var);
            }
        }
    }

    @Override // defpackage.sic
    public final void S(int i, int i2) {
        s9i s9iVar = (s9i) this.a;
        ns8 ns8Var = (ns8) s9iVar.e;
        tq8 tq8Var = (tq8) s9iVar.b;
        ns8Var.notifyItemMoved(tq8Var.e.size() + i, tq8Var.e.size() + i2);
    }

    public final void a(int i) {
        ImportChromeDataActivity importChromeDataActivity = (ImportChromeDataActivity) this.a;
        j2b j2bVar = j2b.d;
        int i2 = ImportChromeDataActivity.d0;
        importChromeDataActivity.S0(j2bVar, i);
    }

    @Override // defpackage.jr9
    /* renamed from: apply */
    public final Object mo17apply(Object obj) {
        return (zh) this.a;
    }

    public final void b(int i) {
        ResultAnd resultAndH;
        ym5 ym5Var = (ym5) this.a;
        if (i != 0) {
            k8e k8eVar = new k8e(i);
            ym5Var.close();
            em5 em5Var = ym5Var.e;
            if (em5Var != null) {
                em5Var.h(k8eVar);
                return;
            }
            return;
        }
        do {
            try {
                resultAndH = ym5.h(ym5Var.b, ym5Var.d);
            } catch (k8e e) {
                ym5Var.close();
                em5 em5Var2 = ym5Var.e;
                if (em5Var2 != null) {
                    em5Var2.h(e);
                    return;
                }
                return;
            }
        } while (((Boolean) resultAndH.b).booleanValue());
        int i2 = resultAndH.a;
        if (i2 != 17) {
            k8e k8eVar2 = new k8e(i2);
            ym5Var.close();
            em5 em5Var3 = ym5Var.e;
            if (em5Var3 != null) {
                em5Var3.h(k8eVar2);
            }
        }
    }

    public final void c(jy1 jy1Var) {
        joh.g((ysj) ((hd) this.a).d, new rxh(2132017512), 2500, new rxh(2132017278), jy1Var);
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        ((fb6) this.a).w((w1g) rscVar, j, j2);
    }

    public final void e(long j) {
        ImportChromeDataActivity importChromeDataActivity = (ImportChromeDataActivity) this.a;
        jm3 jm3Var = importChromeDataActivity.b0;
        jm3Var.a = true;
        jm3Var.b = j;
        importChromeDataActivity.L0(v2b.b, j);
        importChromeDataActivity.T0(j2b.d);
    }

    @Override // defpackage.sic
    public final void f(int i, int i2) {
        s9i s9iVar = (s9i) this.a;
        ((ns8) s9iVar.e).notifyItemRangeRemoved(((tq8) s9iVar.b).e.size() + i, i2);
    }

    @Override // defpackage.n5o
    public final Object g(Object obj) {
        ((su) this.a).run((f3j) obj);
        return null;
    }

    public final Object get() {
        String packageName = ((Context) ((qh) this.a).a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        t3p.q("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public final void h(boolean z, boolean z2) {
        uy8 uy8Var = (uy8) this.a;
        uy8Var.i = false;
        qy8 qy8Var = uy8Var.p;
        if (z) {
            qy8Var.b();
            return;
        }
        if (z2) {
            qy8Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            qy8Var.e = jCurrentTimeMillis;
            qy8Var.f = jCurrentTimeMillis + 30000;
            qy8Var.c(false);
            return;
        }
        qy8Var.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        qy8Var.e = jCurrentTimeMillis2;
        qy8Var.f = jCurrentTimeMillis2 + 300000;
        qy8Var.c(false);
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        w1g w1gVar = (w1g) rscVar;
        fb6 fb6Var = (fb6) this.a;
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        fb6Var.m.getClass();
        fb6Var.q.y(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        wa6 wa6Var = (wa6) w1gVar.f;
        wa6 wa6Var2 = fb6Var.G;
        int size = wa6Var2 == null ? 0 : wa6Var2.m.size();
        long j4 = wa6Var.a(0).b;
        int i = 0;
        while (i < size && fb6Var.G.a(i).b < j4) {
            i++;
        }
        if (wa6Var.d) {
            if (size - i > wa6Var.m.size()) {
                w7d.K("Loaded out of sync manifest");
            } else {
                long j5 = fb6Var.M;
                if (j5 == -9223372036854775807L || wa6Var.h * 1000 > j5) {
                    fb6Var.L = 0;
                } else {
                    w7d.K("Loaded stale dynamic manifest: " + wa6Var.h + ", " + fb6Var.M);
                }
            }
            int i2 = fb6Var.L;
            fb6Var.L = i2 + 1;
            if (i2 < fb6Var.m.k(w1gVar.c)) {
                fb6Var.D.postDelayed(fb6Var.v, Math.min((fb6Var.L - 1) * 1000, 5000));
                return;
            } else {
                fb6Var.C = new g65();
                return;
            }
        }
        fb6Var.G = wa6Var;
        fb6Var.H &= wa6Var.d;
        fb6Var.I = j - j2;
        fb6Var.J = j;
        fb6Var.N += i;
        synchronized (fb6Var.t) {
            if (w1gVar.b.a.equals(fb6Var.E)) {
                Uri uriR0 = fb6Var.G.k;
                if (uriR0 == null) {
                    uriR0 = oup.r0(w1gVar.d.c);
                }
                fb6Var.E = uriR0;
            }
        }
        wa6 wa6Var3 = fb6Var.G;
        if (!wa6Var3.d || fb6Var.K != -9223372036854775807L) {
            fb6Var.y(true);
            return;
        }
        qsh qshVar = wa6Var3.i;
        if (qshVar == null) {
            fb6Var.v();
            return;
        }
        String str = (String) qshVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                fb6Var.K = tym.Q((String) qshVar.c) - fb6Var.J;
                fb6Var.y(true);
                return;
            } catch (s1g e) {
                fb6Var.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            fb6Var.z(qshVar, new db6());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            fb6Var.z(qshVar, new ix5((byte) 1));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            fb6Var.v();
        } else {
            fb6Var.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        vea veaVar = (vea) this.a;
        veaVar.q.j(veaVar);
    }

    public final void k() {
        ((mm6) this.a).g(new jm6(km6.c, (String) null));
    }

    public final Object l(nyb nybVar, mt5 mt5Var) throws Throwable {
        s9m s9mVar = (s9m) this.a;
        if (nybVar instanceof lyb) {
            if (s9mVar.d) {
                return null;
            }
            throw ((lyb) nybVar).a;
        }
        if (nybVar instanceof myb) {
            return ((myb) nybVar).a.T().a(s9mVar.c, mt5Var);
        }
        h9o.p();
        return null;
    }

    public final lak m() {
        return (rlh) this.a;
    }

    public final void n(hjm hjmVar) {
        mm6 mm6Var = (mm6) this.a;
        ac0 ac0Var = ac0.b;
        if (hjmVar == hjm.b) {
            mm6Var.c(vb0.d, ac0Var, (String) null);
        } else {
            mm6Var.c(vb0.c, ac0Var, (String) null);
        }
    }

    public final void o(int i) {
        joh.h((ysj) ((hd) this.a).d, new rxh(i));
    }

    public final void q(IntentSender intentSender, int i) {
        ((xd5) this.a).startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
    }

    @Override // defpackage.osc
    public final void r(rsc rscVar, long j, long j2, int i) {
        bsc bscVar;
        w1g w1gVar = (w1g) rscVar;
        fb6 fb6Var = (fb6) this.a;
        if (i == 0) {
            long j3 = w1gVar.a;
            bscVar = new bsc(w1gVar.b, j);
        } else {
            long j4 = w1gVar.a;
            nd6 nd6Var = w1gVar.b;
            vbk vbkVar = w1gVar.d;
            bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        }
        fb6Var.q.B(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Object s(String str) {
        return ((u38) this.a).d(str, null);
    }

    @Override // defpackage.sic
    public final void t(int i, int i2) {
        s9i s9iVar = (s9i) this.a;
        ((ns8) s9iVar.e).notifyItemInserted(((tq8) s9iVar.b).e.size() + i);
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        w1g w1gVar = (w1g) rscVar;
        fb6 fb6Var = (fb6) this.a;
        long j3 = w1gVar.a;
        nd6 nd6Var = w1gVar.b;
        vbk vbkVar = w1gVar.d;
        bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
        byte b = w1gVar.c;
        fb6Var.m.getClass();
        if ((iOException instanceof s1g) || (iOException instanceof FileNotFoundException) || (iOException instanceof ioa) || (iOException instanceof vsc)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof id6) && ((id6) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        psc pscVar = jMin == -9223372036854775807L ? qb7.g : new psc(0, jMin);
        fb6Var.q.A(bscVar, b, iOException, !pscVar.a());
        return pscVar;
    }

    public final void v(Dialog dialog) {
        final int i;
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        q9n.i(window.getDecorView());
        u8n.e(dialog);
        ((qwe) ((gi) this.a).get()).a(dialog);
        if (dialog instanceof tq3) {
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                p8f.w(window2);
            }
            oup.o0((tq3) dialog);
            i = 1;
        } else {
            o0g.N0(dialog);
            i = 6;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: b06
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return c37.r().l(i, keyEvent);
            }
        });
        View decorView = window.getDecorView();
        ho4 ho4Var = new ho4(this, i);
        WeakHashMap weakHashMap = r5n.a;
        m5n.a(decorView, ho4Var);
    }

    public final void w(byte b) {
        ((Parcel) this.a).writeByte(b);
    }

    public final void x(float f) {
        ((Parcel) this.a).writeFloat(f);
    }

    public final void y(long j) {
        long jB = rkl.b(j);
        byte b = 0;
        if (!skl.a(jB, 0L)) {
            if (skl.a(jB, 4294967296L)) {
                b = 1;
            } else if (skl.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        w(b);
        if (skl.a(rkl.b(j), 0L)) {
            return;
        }
        x(rkl.c(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(nt5 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            i88 r0 = (i88) r0
            boolean r1 = r7 instanceof fq6
            if (r1 == 0) goto L17
            r1 = r7
            fq6 r1 = (fq6) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.v = r2
            goto L1c
        L17:
            fq6 r1 = new fq6
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r6 = r1.t
            px5 r7 = px5.a
            int r2 = r1.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.ybh.y(r6)
            return r6
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L35:
            defpackage.ybh.y(r6)
            goto L4c
        L39:
            defpackage.ybh.y(r6)
            r1.v = r5
            jg8 r6 = r0.c
            g88 r2 = new g88
            r5 = 0
            r2.<init>(r0, r3, r5)
            java.lang.Object r6 = defpackage.na2.Z(r6, r2, r1)
            if (r6 == r7) goto L62
        L4c:
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 == 0) goto L56
            r3 = r6
        L56:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L64
            r1.v = r4
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r7) goto L63
        L62:
            return r7
        L63:
            return r6
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm5.z(nt5):java.lang.Object");
    }
}
