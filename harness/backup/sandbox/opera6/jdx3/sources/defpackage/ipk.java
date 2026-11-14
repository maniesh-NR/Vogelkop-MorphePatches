package defpackage;

import J.N;
import android.content.Context;
import com.leanplum.internal.Clock;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.favorites.e;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class ipk extends lim implements w25 {
    public final xbf a;
    public final js6 b;
    public final i32 c;
    public final kd7 d;
    public final lld e;
    public final wok f;
    public final t1 g;
    public final eq6 h;
    public final nr8 i;
    public final cpk j;
    public final xbf k;
    public boolean l;
    public final vk m;
    public final rle n;
    public boolean o;
    public final vi5 p;
    public final r8f q;
    public final f35 r;
    public final qie s;

    public ipk(Context context, umi umiVar, wok wokVar, x5f x5fVar, nr8 nr8Var, glh glhVar, String str, tcc tccVar, f35 f35Var, e00 e00Var, du3 du3Var, t1 t1Var, kw0 kw0Var) {
        this.f = wokVar;
        this.g = t1Var;
        vuh vuhVar = new vuh(x5fVar, (byte) 3);
        eq6 eq6Var = new eq6();
        rr8 rr8Var = new rr8(umiVar, new k32(eq6Var, context, (byte) 6), vuhVar);
        eq6Var.a = rr8Var;
        rr8Var.h();
        this.h = eq6Var;
        this.i = nr8Var;
        cpk cpkVar = new cpk(new epk(this, (byte) 0), new zzh(nr8Var, (byte) 15));
        this.j = cpkVar;
        qii qiiVar = new qii();
        tw2 tw2Var = new tw2((Object) glhVar, (byte) 20);
        vk vkVar = new vk((byte) 2);
        this.m = vkVar;
        byte b = 26;
        vi5 vi5Var = new vi5(new kw3(this, b), tw2Var, str);
        this.p = vi5Var;
        this.q = new r8f(glhVar);
        new kw3(this, b);
        byte b2 = 27;
        new kw3(this, b2);
        txi txiVar = new txi(eq6Var, b2);
        u7k u7kVar = new u7k();
        u7kVar.a = txiVar;
        k32 k32Var = new k32(this, context, (byte) 8);
        this.k = new xbf(context, umiVar, e00Var, k32Var, kw0Var, new jjg(this, (byte) 7));
        byte b3 = 28;
        w6j w6jVar = new w6j(new qfb(new kw3(this, b), new kw3(this, b2), qiiVar), new dcl(new kw3(this, b), new kw3(this, b2), qiiVar), vi5Var, new d7h(new txi(u7kVar, b3), new jjg(nr8Var, (byte) 8), (byte) 5), vkVar);
        i32 i32Var = new i32(umiVar, k32Var, (byte) 10);
        i32Var.h();
        lld lldVar = new lld((Object) i32Var, (byte) 15);
        this.e = lldVar;
        eyi eyiVar = new eyi(i32Var, lldVar, new epk(this, (byte) 2));
        kd7 kd7Var = new kd7(umiVar, k32Var, du3Var, new kw3(this, b3));
        this.d = kd7Var;
        kd7Var.h();
        byte b4 = 3;
        xbf xbfVar = new xbf(w6jVar, eyiVar, new epk(this, b4), new epk(this, b4), new epk(this, (byte) 4), new gpk(this, (byte) 0), new epk(this, (byte) 1));
        this.a = xbfVar;
        this.s = new qie(context, (h42) xbfVar.c);
        this.b = new js6(cpkVar, glhVar, new qlk(this, (byte) 5), new txi(kd7Var, (byte) 26));
        i32 i32Var2 = new i32(umiVar, k32Var, (byte) 11);
        this.c = i32Var2;
        i32Var2.h();
        tccVar.a(this);
        this.r = f35Var;
        f35Var.a.b(this);
        this.n = sle.a(new fpk(this, (byte) 0));
        R(true);
    }

    public static Date S() {
        return new Date(new Date().getTime() - 1209600000);
    }

    @Override // defpackage.w25
    public final void P() {
        this.b.a();
    }

    public final boolean R(boolean z) {
        long j;
        long j2;
        long j3;
        boolean zD = sle.d();
        if (this.o == zD && !z) {
            return false;
        }
        this.o = zD;
        ((eyi) this.a.g).b = zD;
        if (zD) {
            j2 = Clock.DAY_MILLIS;
            j = 604800000;
            j3 = 0;
        } else {
            j = Long.MAX_VALUE;
            j2 = Long.MIN_VALUE;
            j3 = Long.MAX_VALUE;
        }
        vi5 vi5Var = this.p;
        vi5Var.a = j2;
        vi5Var.b = j;
        vi5Var.c = j3;
        return true;
    }

    public final boolean T(String str) {
        boolean zEndsWith;
        String strA = f8a.d.a(str);
        int i = 0;
        while (true) {
            y0b y0bVar = tok.a;
            if (i >= y0bVar.b) {
                rgh rghVar = ((vok) this.f.i()).e;
                String strI = wqm.i(str);
                if (strI != null) {
                    int iMDOEBfJ5 = -1;
                    do {
                        int i2 = iMDOEBfJ5 + 1;
                        yv4 yv4Var = (yv4) ((txi) rghVar.a).b;
                        long jM3b1Oxa6 = yv4Var.b;
                        String strH = null;
                        if (jM3b1Oxa6 == 0) {
                            jM3b1Oxa6 = N.M3b1Oxa6((String[]) yv4Var.c);
                            yv4Var.b = jM3b1Oxa6;
                            yv4Var.c = null;
                        }
                        iMDOEBfJ5 = N.MDOEBfJ5(jM3b1Oxa6, strI, i2);
                        if (iMDOEBfJ5 >= 0) {
                            String str2 = ((String[]) rghVar.b)[iMDOEBfJ5];
                            String[] strArr = wqm.a;
                            try {
                                strH = new URI(str).getPath();
                            } catch (URISyntaxException unused) {
                            }
                            if (strH == null) {
                                zEndsWith = false;
                            } else if (str2.equals("*")) {
                                zEndsWith = true;
                            } else {
                                if (strH.startsWith("/")) {
                                    strH = strH.substring(1);
                                }
                                if (strH.endsWith("/")) {
                                    strH = p3p.h(1, 0, strH);
                                }
                                zEndsWith = str2.startsWith("*") ? strH.endsWith(str2.substring(1)) : str2.endsWith("*") ? strH.startsWith(str2.substring(0, str2.length() - 1)) : strH.equals(str2);
                            }
                        }
                    } while (!zEndsWith);
                }
                return false;
            }
            int iD = y0bVar.d(i);
            i32 i32Var = this.c;
            i32Var.getClass();
            hpk hpkVar = new hpk(strA, iD);
            i32Var.i();
            nxd nxdVar = (nxd) ((HashMap) i32Var.l).get(hpkVar);
            if (nxdVar == null) {
                nxd nxdVar2 = new nxd(strA, iD, 0L, 0L, 0L, false);
                ((HashMap) i32Var.l).put(hpkVar, nxdVar2);
                nxdVar = nxdVar2;
            }
            if (nxdVar.f) {
                break;
            }
            i++;
        }
        return true;
    }

    public final boolean U(String str) {
        rr8 rr8Var = (rr8) this.h.a;
        rr8Var.i();
        String strB = aik.b((String) rr8Var.l.get(str), str);
        cpk cpkVar = this.j;
        nr8 nr8Var = cpkVar.a.b.i;
        nr8Var.getClass();
        if (nr8.g(new ge5(nr8Var, strB, (byte) 19), ((e) nr8Var).f) != null) {
            return true;
        }
        if (str.equals(strB)) {
            return false;
        }
        nr8 nr8Var2 = cpkVar.a.b.i;
        nr8Var2.getClass();
        return nr8.g(new ge5(nr8Var2, str, (byte) 19), ((e) nr8Var2).f) != null;
    }

    public final boolean V(String str) {
        kd7 kd7Var = this.d;
        if (!kd7Var.m) {
            return false;
        }
        int i = 4;
        if (kd7Var.k != null) {
            HashMap map = kd7Var.l;
            String[] strArr = wqm.a;
            hd7 hd7Var = (hd7) map.get(aik.s(aik.f(str), wqm.e));
            if (hd7Var != null) {
                i = hd7Var.b;
            }
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(java.util.HashSet r23, java.util.HashSet r24, defpackage.ook r25) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipk.X(java.util.HashSet, java.util.HashSet, ook):void");
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        js6 js6Var = this.b;
        cpk cpkVar = (cpk) js6Var.c;
        cpkVar.c.c((opk) js6Var.i);
        glh glhVar = (glh) js6Var.d;
        glhVar.b.c((ppk) js6Var.g);
        cpk cpkVar2 = this.j;
        cpkVar2.f = true;
        tq8 tq8Var = cpkVar2.e;
        if (tq8Var != null) {
            tq8Var.H(cpkVar2);
            ArrayList arrayList = cpkVar2.e.e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hq8 hq8Var = (hq8) obj;
                if (hq8Var.j()) {
                    ((tq8) hq8Var).H(cpkVar2);
                }
            }
        }
        NetworkChangeNotifier.removeConnectionTypeObserver(this.n.a);
        r8f r8fVar = this.q;
        r8fVar.a.b.c(r8fVar);
        this.r.a.c(this);
        kd7 kd7Var = this.d;
        ld7 ld7Var = kd7Var.k;
        if (ld7Var != null) {
            ((i7f) ld7Var.c).c(kd7Var);
        }
        x79 x79Var = (x79) this.k.c;
        x79 x79Var2 = (x79) x79Var.e;
        if (x79Var2 != null) {
            v2g v2gVar = (v2g) x79Var2.c;
            if (v2gVar != null) {
                SimpleUrlLoader simpleUrlLoader = v2gVar.a;
                long j = simpleUrlLoader.a;
                if (j != 0) {
                    N.Mnq_7cIN(j);
                    simpleUrlLoader.a = 0L;
                }
                x79Var2.c = null;
            }
            x79Var2.d = null;
            x79Var2.e = null;
            x79Var.e = null;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        js6 js6Var = this.b;
        js6Var.a = true;
        vml.d((opk) js6Var.h, 1800000L);
        js6Var.a();
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        js6 js6Var = this.b;
        js6Var.a = false;
        vml.a((opk) js6Var.h);
    }
}
