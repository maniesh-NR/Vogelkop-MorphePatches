package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uqe {
    public final g77 a;
    public final tm5 b;
    public final Context c;
    public final umi d;
    public final qag e;
    public final x5f f;
    public final s9i g;
    public final uy8 h;
    public final g93 i;
    public final stm j;
    public final qsh k;
    public final ip4 l;
    public final c15 m;
    public final ore n;

    @Nullable
    @WeakOwner
    private q8j o;
    public final wu5 p;
    public final HashMap q;
    public final Set r;
    public final ru8 s;
    public final bch t;
    public final LruCache u;
    public final ta7 v;
    public final yhe w;
    public final y0a x;
    public final ob y;

    public uqe(Context context, umi umiVar, tm5 tm5Var, p1c p1cVar, vx vxVar, jtg jtgVar, esk eskVar, y0a y0aVar, oue oueVar, x5f x5fVar, x5f x5fVar2) {
        lre lreVar = new lre(x5fVar);
        qag qagVar = new qag(umiVar, context, "NewsFeedCookies");
        this.e = qagVar;
        this.a = d(lreVar, new CookieManager(qagVar, null));
        this.b = tm5Var;
        this.c = context;
        this.d = umiVar;
        this.u = new LruCache(50);
        this.w = new yhe((Object) this, (byte) 1);
        this.y = new ob((Object) this, (byte) 11);
        xnh.t(context);
        this.f = x5fVar;
        s9i s9iVar = new s9i(context, this.a);
        this.g = s9iVar;
        ta7 ta7Var = new ta7(context, umiVar);
        this.v = ta7Var;
        ((lre) ((tff) this.a.b)).b = ta7Var;
        String[] strArr = OperaApplication.K;
        g93 g93Var = new g93(context, ((OperaApplication) context.getApplicationContext()).z(), ta7Var, this.b, s9iVar, p1cVar, vxVar, jtgVar, eskVar, oueVar);
        this.i = g93Var;
        stm stmVar = new stm(context, ta7Var, this.b, s9iVar, g93Var, x5fVar, x5fVar2);
        this.j = stmVar;
        uy8 uy8Var = new uy8(context, stmVar, s9iVar, ((OperaApplication) context.getApplicationContext()).J(), new y0f(x5fVar));
        this.h = uy8Var;
        s9iVar.e = uy8Var;
        ip4 ip4Var = new ip4(context, ta7Var, this.b, s9iVar, stmVar);
        this.l = ip4Var;
        c15 c15Var = new c15(ta7Var, this.b, s9iVar, ip4Var);
        this.m = c15Var;
        this.n = new ore(this.b, c15Var);
        this.s = new ru8(ta7Var, this.b, s9iVar, stmVar);
        this.p = new wu5();
        this.k = new qsh(stmVar, s9iVar);
        this.q = new HashMap();
        this.r = Collections.newSetFromMap(new WeakHashMap());
        this.t = new bch(stmVar, s9iVar, new pre());
        this.x = y0aVar;
        y0aVar.run(ta7Var.s().getString("user_id", null));
        ac8.c(new sqe(this));
    }

    public static g77 d(tff tffVar, CookieManager cookieManager) {
        s9f s9fVarB = ((t9f) xne.b.get()).b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s9fVarB.a(15L, timeUnit);
        s9fVarB.b(15L, timeUnit);
        if (cookieManager != null) {
            s9fVarB.k = new eq6(cookieManager);
        }
        t9f t9fVar = new t9f(s9fVarB);
        g77 g77Var = new g77();
        g77Var.c = Collections.newSetFromMap(new WeakHashMap());
        g77Var.a = t9fVar;
        g77Var.b = tffVar;
        return g77Var;
    }

    public final void c(nre nreVar, String str) {
        List<yqe> list = nreVar.d;
        List list2 = nreVar.e;
        for (yqe yqeVar : list) {
            if (yqeVar.a.equals(str)) {
                if (list2.contains(yqeVar)) {
                    return;
                }
                HashSet hashSet = new HashSet(list2);
                hashSet.add(yqeVar);
                this.l.g(list, hashSet);
                return;
            }
        }
    }

    public final msh e(String str, boolean z) {
        msh mshVarC;
        msh mshVar;
        for (msh mshVar2 : this.r) {
            if (((String) mshVar2.v.b).equals(str)) {
                return mshVar2;
            }
        }
        Iterator it = this.q.values().iterator();
        do {
            mshVarC = null;
            if (!it.hasNext()) {
                if (!z || (mshVar = (msh) this.u.get(str)) == null) {
                    return null;
                }
                return mshVar;
            }
            xqe xqeVar = (xqe) it.next();
            List list = xqeVar.g;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    oqe oqeVar = (oqe) it2.next();
                    if (oqeVar instanceof msh) {
                        msh mshVar3 = (msh) oqeVar;
                        if (((String) mshVar3.v.b).equals(str)) {
                            mshVarC = mshVar3;
                            break;
                        }
                    } else if (oqeVar instanceof ere) {
                        for (msh mshVar4 : ((ere) oqeVar).f) {
                            if (((String) mshVar4.v.b).equals(str)) {
                                mshVarC = mshVar4;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                mshVarC = xqe.c(xqeVar.d, str, xqeVar.e, (kqd) xqeVar.a.k);
            }
        } while (mshVarC == null);
        return mshVarC;
    }

    public final xqe f(qre qreVar) {
        HashMap map = this.q;
        xqe xqeVar = (xqe) map.get(qreVar);
        if (xqeVar != null) {
            return xqeVar;
        }
        ta7 ta7Var = this.v;
        Objects.requireNonNull(ta7Var);
        xqe xqeVar2 = new xqe(this.c, this.d, qreVar, new kqd((Object) ta7Var, (byte) 8));
        map.put(qreVar, xqeVar2);
        uy8 uy8Var = this.h;
        uy8Var.getClass();
        xqeVar2.c = uy8Var;
        xqeVar2.n(new vr9(uy8Var, xqeVar2));
        return xqeVar2;
    }

    public final void g(q8j q8jVar) {
        this.n.b(q8jVar);
    }

    public final c6j h() {
        return new c6j(this.n, false);
    }

    public final g82 i(msh mshVar, boolean z) {
        nre nreVar = (nre) h().b;
        String string = l45.r(mshVar.k.toString(), Integer.valueOf(mshVar.f.get()), ((lsh) mshVar.e.get()).a, mshVar.u, nreVar != null ? nreVar.a : null).toString();
        int i = mshVar.j;
        if (i == 3 && ((wnh) xnh.t(this.c).i()).a(4)) {
            i = 1;
        }
        int i2 = i;
        xlg xlgVar = mshVar.z;
        String str = xlgVar != null ? xlgVar.i : null;
        String str2 = (String) mshVar.v.b;
        String str3 = mshVar.b;
        String string2 = mshVar.l.toString();
        Uri uri = mshVar.n;
        return new g82(i2, str2, str3, string, string2, uri != null ? uri.toString() : null, str, z);
    }

    public final void j(msh mshVar, List list, boolean z, boolean z2) {
        k(mshVar, list, z2);
        uy8 uy8Var = this.h;
        uy8Var.getClass();
        int i = z ? 11 : 10;
        if (uy8Var.A.add((String) mshVar.v.b)) {
            boolean z3 = mshVar instanceof ure;
            String strG = o18.g(i);
            if (z3) {
                uy8Var.e(new fy8(mshVar, list, strG, (byte) 0));
            } else {
                uy8Var.c(new fy8(mshVar, list, strG, (byte) 0));
            }
            uy8Var.o.c(true);
        }
    }

    public final void k(msh mshVar, List list, boolean z) {
        lsh lshVar = (lsh) mshVar.e.get();
        lsh lshVar2 = lsh.IGNORE;
        if (lshVar != lshVar2) {
            mshVar.c(lshVar2);
            String str = "";
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    tx8 tx8Var = (tx8) it.next();
                    if ("domain".equals(tx8Var.a)) {
                        String str2 = tx8Var.b;
                        String[] strArr = aik.a;
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                }
            }
            if (!str.isEmpty()) {
                if (z) {
                    mshVar = null;
                }
                sfe.A0(this.r, new ww6(mshVar, str, (byte) 1));
                for (xqe xqeVar : this.q.values()) {
                    if (xqeVar.g == null) {
                        xqeVar.a.i();
                    }
                    List list2 = xqeVar.g;
                    list2.size();
                    ArrayList arrayList = new ArrayList();
                    xqe.d(str, arrayList, list2);
                    if (mshVar != null) {
                        arrayList.remove(mshVar);
                    }
                    if (list2.removeAll(arrayList)) {
                        xqeVar.o(list2);
                        xqeVar.l(arrayList);
                        list2.size();
                        xqeVar.k(true);
                    }
                }
                ta7 ta7Var = this.v;
                ta7Var.getClass();
                Set setO = w1h.o(ta7Var.s(), "blacklisted_news_domains", (Set) null);
                if (setO == null) {
                    setO = Collections.EMPTY_SET;
                }
                HashSet hashSet = new HashSet(setO);
                if (hashSet.add(str)) {
                    ta7Var.s().edit().putStringSet("blacklisted_news_domains", hashSet).apply();
                    return;
                }
                return;
            }
            if (z) {
                xqe xqeVarF = f(mshVar.d);
                if (xqeVarF.g == null) {
                    xqeVarF.a.i();
                }
                List list3 = xqeVarF.g;
                int iIndexOf = list3.indexOf(mshVar);
                if (iIndexOf != -1) {
                    list3.remove(iIndexOf);
                    xqeVarF.o(list3);
                    xqeVarF.l(Collections.singletonList(mshVar));
                    h7f h7fVar = xqeVarF.b;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        g7f g7fVar = new g7f(((a53) g7fVarH.next()).a.a);
                        while (g7fVar.hasNext()) {
                            ow8 ow8Var = ((rw8) g7fVar.next()).b;
                            ArrayList arrayList2 = ow8Var.a;
                            int size = arrayList2.size();
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    i = -1;
                                    break;
                                }
                                Object obj = arrayList2.get(i2);
                                i2++;
                                ja2 ja2Var = (ja2) obj;
                                if ((ja2Var instanceof j82) && ((j82) ja2Var).c.equals(mshVar)) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (i != -1) {
                                ow8Var.a.remove(i);
                                ow8Var.l.g();
                                ow8Var.l.h();
                                if (ow8Var.Y(false)) {
                                    ow8Var.notifyDataSetChanged();
                                } else {
                                    ow8Var.notifyItemRemoved(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void l(String str) {
        nre nreVar = (nre) h().b;
        if (nreVar != null) {
            this.o = null;
            c(nreVar, str);
        } else {
            wx8 wx8Var = new wx8(this, str);
            this.o = wx8Var;
            g(wx8Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f8, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        if (r13 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fc, code lost:
    
        r16 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0206, code lost:
    
        if (defpackage.sfh.d().ordinal() == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020a, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020b, code lost:
    
        r3 = defpackage.j7c.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r16 == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0213, code lost:
    
        r2 = z1m.n("/crop/", r2, "/c/", r3, "/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        switch(r16) {
            case 1: goto L117;
            case 2: goto L116;
            case 3: goto L115;
            case 4: goto L114;
            case 5: goto L113;
            case 6: goto L112;
            default: goto L111;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021f, code lost:
    
        r0 = "4xw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0222, code lost:
    
        r0 = "3xw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0225, code lost:
    
        r0 = "xxw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0228, code lost:
    
        r0 = "xw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022b, code lost:
    
        r0 = "w";
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022d, code lost:
    
        r2.append(r0);
        r2.append("/");
        r2.append(r1);
        r0 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r0 = z1m.n("/tn/", r2, "/", r3, "/");
        r0.append(r1);
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0248, code lost:
    
        r1 = new java.lang.StringBuilder("https://");
        r1.append(r27.getHost());
        r1.append("/assets/v1");
        r1.append(r0);
        r1.append(".webp");
        r0 = r27.getEncodedQuery();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0269, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026b, code lost:
    
        r1.append('?');
        r1.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0277, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        r0 = "s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a2, code lost:
    
        switch(r4) {
            case 1: goto L83;
            case 2: goto L82;
            case 3: goto L81;
            case 4: goto L80;
            case 5: goto L79;
            case 6: goto L78;
            case 7: goto L77;
            case 8: goto L76;
            default: goto L75;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        r2 = "4xl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a9, code lost:
    
        r2 = "3xl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
    
        r2 = "xxl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
    
        r2 = "xl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        r2 = "l";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b5, code lost:
    
        r2 = "m";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b8, code lost:
    
        r2 = "s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
    
        r2 = "xs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
    
        r10 = r10 / r14;
        r3 = vep.B(6);
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
    
        if (r12 >= r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        switch(r13) {
            case 1: goto L94;
            case 2: goto L93;
            case 3: goto L92;
            case 4: goto L91;
            case 5: goto L90;
            case 6: goto L89;
            default: goto L143;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cd, code lost:
    
        r14 = 3.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d0, code lost:
    
        r14 = 1.77d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d6, code lost:
    
        r14 = 1.66d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dc, code lost:
    
        r14 = 1.5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01df, code lost:
    
        r14 = 1.33d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e5, code lost:
    
        r14 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
    
        if (r14 < r10) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f3, code lost:
    
        if ((r14 - r10) <= 0.1d) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m(android.net.Uri r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqe.m(android.net.Uri, int, int):java.lang.String");
    }
}
