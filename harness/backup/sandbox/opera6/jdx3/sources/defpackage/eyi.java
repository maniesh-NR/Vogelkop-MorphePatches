package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.d;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.suggestion.Suggestion;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class eyi implements cyi, zkj, iqk, rr9 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public /* synthetic */ eyi(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public eyi(RemoteAction remoteAction, RemoteAction remoteAction2) {
        this.a = (byte) 11;
        this.c = remoteAction;
        this.d = remoteAction2;
        this.b = false;
    }

    public eyi(Context context, wa waVar, View view, ArrayList arrayList, int[] iArr, boolean z, int i, double d, WebContents webContents) {
        this.a = (byte) 0;
        this.c = waVar;
        ga6 ga6Var = new ga6(context, view);
        this.d = ga6Var;
        u85 u85Var = (u85) ga6Var.b;
        eq1 eq1Var = ((i21) u85Var.h).h;
        byte b = 1;
        eq1Var.setFocusable(true);
        if (eq1Var.isShowing()) {
            eq1Var.update();
        }
        ((ListView) u85Var.j).setSelector(R.color.transparent);
        byte b2 = 3;
        ((ListView) u85Var.j).setOnItemClickListener(new lq1(this, (byte) 3));
        u85Var.b = iArr.length > 0 ? iArr[0] : -1;
        ListAdapter tm7Var = new tm7(context, arrayList, i, d);
        u85Var.i = tm7Var;
        ((ListView) u85Var.j).setAdapter(tm7Var);
        ((i21) u85Var.h).f();
        u85Var.a = z;
        ((i21) u85Var.h).l.b(new c21(this, b2));
        LongSparseArray longSparseArray = GestureListenerManagerImpl.n;
        webContents.X(GestureListenerManagerImpl.class, mkh.d).b(new tz4(this, b), 0);
    }

    public eyi(dil dilVar) {
        this.a = (byte) 7;
        this.d = dilVar;
        this.b = true;
    }

    public eyi(i32 i32Var, lld lldVar, epk epkVar) {
        this.a = (byte) 4;
        this.b = true;
        this.c = i32Var;
        this.d = epkVar;
    }

    public eyi(Object obj, nml nmlVar) {
        this.a = (byte) 8;
        this.c = obj;
        this.d = nmlVar;
    }

    public eyi(String str, String str2, boolean z) {
        this.a = (byte) 13;
        this.c = str;
        this.d = str2;
        this.b = z;
    }

    public eyi(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = (byte) 3;
        this.c = arrayList;
        Collections.sort(arrayList, new omj((byte) 3));
        this.d = arrayList2;
        Collections.sort(arrayList2, new omj((byte) 4));
        this.b = z;
    }

    public eyi(mrk mrkVar, byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.d = mrkVar;
                break;
            default:
                this.d = mrkVar;
                this.c = new qlk(this, (byte) 6);
                break;
        }
    }

    public eyi(y2n y2nVar, o94 o94Var, boolean z) {
        this.a = (byte) 10;
        this.d = y2nVar;
        this.c = o94Var;
        this.b = z;
    }

    public eyi(z9p z9pVar, r9p r9pVar) {
        this.a = (byte) 14;
        this.d = z9pVar;
        this.c = r9pVar;
    }

    public eyi(boolean z, SettingsManager settingsManager) {
        this.a = (byte) 12;
        this.b = z;
        this.c = settingsManager;
        this.d = new kze(z ? "ofa-private-mode" : "ofa-".concat(settingsManager.g().d));
    }

    public static eyi f(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        boolean z = true;
        if (str.startsWith("[*.]")) {
            return new eyi((String) null, str.substring(4), true);
        }
        if (str.indexOf("://") == -1) {
            return new eyi((String) null, str, true);
        }
        Uri uri = Uri.parse(str);
        if (str.endsWith("/")) {
            str = p3p.h(1, 0, str);
        }
        if (!"http".equals(uri.getScheme()) || (uri.getPort() != -1 && uri.getPort() != 80)) {
            z = false;
        }
        return new eyi(str, uri.getHost(), z);
    }

    public final void a(boolean z) {
        ga6 ga6Var = (ga6) this.d;
        if (!z) {
            this.b = true;
            ((i21) ((u85) ga6Var.b).h).a();
            return;
        }
        ((i21) ((u85) ga6Var.b).h).a();
        if (this.b) {
            return;
        }
        ((wa) this.c).c(null);
        this.b = true;
    }

    public final m9p b() {
        m9p m9pVar;
        synchronized (((z9p) this.d)) {
            if (((r9p) this.c).d != this) {
                throw new IllegalStateException();
            }
            m9pVar = new m9p(this, new FileOutputStream(((r9p) this.c).c(0)));
        }
        return m9pVar;
    }

    @Override // defpackage.zkj
    public final List c() {
        return this.b ? Arrays.asList(r7j.NEVER, r7j.BOTH) : f8j.a;
    }

    public final void d() {
        ((z9p) this.d).m(this, false);
    }

    public final void e() {
        boolean z = this.b;
        z9p z9pVar = (z9p) this.d;
        if (!z) {
            z9pVar.m(this, true);
        } else {
            z9pVar.m(this, false);
            z9pVar.D(((r9p) this.c).a);
        }
    }

    public final n26 g() {
        r05 r05Var = (r05) this.d;
        int i = r05Var.b;
        int i2 = r05Var.c;
        return i < i2 ? n26.b : i > i2 ? n26.a : n26.c;
    }

    public final List h(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        int i3 = i2;
        if (i > i3) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            fqj fqjVar = (fqj) obj;
            int i5 = fqjVar.a;
            if (i5 >= i) {
                if (i5 > i3 || (!z && i5 == i3)) {
                    break;
                }
                arrayList3.add(new lyf(Integer.valueOf(i5), fqjVar.b));
                i3++;
            }
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = (ArrayList) this.d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        do {
            int size2 = hashSet3.size() + i;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj2 = arrayList4.get(i6);
                i6++;
                gqj gqjVar = (gqj) obj2;
                if (gqjVar.a > hashSet3.size() + i3) {
                    break;
                }
                int i7 = gqjVar.a;
                while (true) {
                    if (i7 >= size2) {
                        hashSet2.add(new lyf(Integer.valueOf(i7), gqjVar.c));
                        hashSet3.add(Integer.valueOf(i7));
                    }
                    i7 += gqjVar.b;
                    int size4 = i7 - hashSet3.size();
                    if (size4 > i3 || (!z && size4 == i3)) {
                        break;
                    }
                }
            }
        } while (hashSet.addAll(hashSet2));
        ArrayList arrayList5 = new ArrayList(hashSet);
        Collections.sort(arrayList5, new omj((byte) 5));
        arrayList.addAll(arrayList5);
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList6 = new ArrayList(arrayList.size());
        lyf lyfVar = (lyf) arrayList.get(0);
        lyf lyfVar2 = new lyf((Integer) lyfVar.a, new ArrayList(Arrays.asList(lyfVar.b)));
        arrayList6.add(lyfVar2);
        for (lyf lyfVar3 : arrayList.subList(1, arrayList.size())) {
            if (((Integer) lyfVar.a).equals(lyfVar3.a)) {
                ((List) lyfVar2.b).add(lyfVar3.b);
            } else {
                lyfVar2 = new lyf((Integer) lyfVar3.a, new ArrayList(Arrays.asList(lyfVar3.b)));
                arrayList6.add(lyfVar2);
                lyfVar = lyfVar3;
            }
        }
        return arrayList6;
    }

    public final void i() {
        if (this.b) {
            ((dil) this.d).n((xjl) this.c);
        }
    }

    public final void j() {
        vx3 vx3VarA;
        mrk mrkVar = (mrk) this.d;
        ((FadingRecyclerView) mrkVar.y.e).M0((d) null, true);
        mrkVar.E.i();
        mrkVar.P = null;
        if (!this.b) {
            this.b = true;
            fbf fbfVar = mrkVar.c;
            iv7 iv7Var = mrkVar.h;
            gbf gbfVar = fbfVar.a;
            yz9 yz9Var = mrkVar.n;
            fbfVar.a.m(((Suggestion) this.c) == null);
            Suggestion suggestion = (Suggestion) this.c;
            if (suggestion != null) {
                int i = suggestion.a;
                String strB = suggestion.b();
                if ((i != 13 && i != 12) || !UrlMangler.e(strB)) {
                    lqm lqmVar = lqm.b;
                    lqm lqmVar2 = lqm.a;
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 17:
                        case 21:
                        case SizeUtil.textSize1 /* 22 */:
                        case 32:
                        case 33:
                            yz9Var.getClass();
                            vx3VarA = ay3.a(strB, lqmVar2, false);
                            vx3VarA.o = (byte) 1;
                            vx3VarA.m = true;
                            vx3VarA.n = false;
                            am2.v(vx3VarA);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 23:
                        case SizeUtil.textSize2 /* 24 */:
                            yz9Var.getClass();
                            vx3VarA = ay3.a(strB, lqmVar, true);
                            vx3VarA.o = (byte) 1;
                            vx3VarA.m = false;
                            vx3VarA.n = false;
                            am2.v(vx3VarA);
                            break;
                        case 8:
                        case 11:
                        case 19:
                        case 25:
                        case 27:
                        case 30:
                        case 31:
                            yz9Var.a.K(strB, 6, gbfVar.x, 1, false, (eri) iv7Var.f.g());
                            break;
                        case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                            if (strB.length() == 0) {
                                yz9Var.a.K(suggestion.b, 6, gbfVar.x, 1, false, (eri) iv7Var.f.g());
                                break;
                            } else {
                                yz9Var.getClass();
                                vx3VarA = ay3.a(strB, lqmVar, false);
                                vx3VarA.o = (byte) 1;
                                vx3VarA.m = true;
                                vx3VarA.n = false;
                                am2.v(vx3VarA);
                                break;
                            }
                        case 16:
                            Intent intent = new Intent("android.intent.action.VIEW", wqm.E(Uri.parse(strB), "label", "obs_app"));
                            intent.setPackage("com.booking");
                            intent.putExtra("com.opera.android.extra.DO_NOT_INTERCEPT", true);
                            try {
                                fp1 fp1Var = ((pt3) mrkVar.d.c).b;
                                int i2 = BrowserActivity.E1;
                                fp1Var.startActivity(intent);
                                vbf vbfVar = gbfVar.j;
                                if (!vbfVar.p()) {
                                    vbfVar.l();
                                    break;
                                }
                            } catch (ActivityNotFoundException unused) {
                                yz9Var.getClass();
                                vx3VarA = ay3.a(strB, lqmVar2, false);
                                vx3VarA.o = (byte) 1;
                                vx3VarA.m = true;
                                vx3VarA.n = false;
                                break;
                            }
                            break;
                        case SizeUtil.textSize0_1 /* 18 */:
                            yz9Var.a.K(strB, 6, gbfVar.x, 1, true, null);
                            break;
                        case 26:
                            yz9Var.getClass();
                            vx3VarA = ay3.a(strB, lqmVar, false);
                            vx3VarA.o = (byte) 1;
                            vx3VarA.m = false;
                            vx3VarA.n = false;
                            vx3VarA.q = true;
                            am2.v(vx3VarA);
                            break;
                        case 28:
                            mrkVar.U = true;
                            mrkVar.G.b(lbf.c, null);
                            yz9Var.a.K(strB, 5, false, 1, false, (eri) iv7Var.g.g());
                            break;
                        case 34:
                            ac8.a(new bgf(Uri.parse(strB), lqmVar2, 4));
                            vbf vbfVar2 = gbfVar.j;
                            if (!vbfVar2.p()) {
                                vbfVar2.l();
                                break;
                            }
                            break;
                    }
                } else {
                    yz9Var.a.K(strB, 6, gbfVar.x, 1, false, (eri) iv7Var.f.g());
                }
            }
        }
        SparseArray sparseArray = (SparseArray) mrkVar.C.u.a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.keyAt(i3);
            ((odb) sparseArray.valueAt(i3)).reset();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.String r28, java.util.List r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyi.k(java.lang.String, java.util.List, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // defpackage.iqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.pvb r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r2 = r2.d
            mrk r2 = (defpackage.mrk) r2
            r2.Q = r3
            fbf r0 = r2.c
            gbf r1 = r0.a
            bpd r1 = r1.t
            upm r1 = r1.y()
            r1.j(r3)
            if (r4 != 0) goto L16
            return
        L16:
            pvb r3 = r2.Q
            if (r3 == 0) goto L21
            android.view.View r3 = r3.getView()
            p37.h0(r3)
        L21:
            r3 = 1
            r2.T = r3
            pvb r3 = r2.Q
            if (r3 == 0) goto L47
            boolean r4 = r3.a()
            if (r4 != 0) goto L3f
            iv7 r4 = r2.h
            pde r4 = r4.k
            java.lang.Object r4 = r4.g()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3f
            r3 = 0
        L3f:
            if (r3 == 0) goto L47
            java.lang.String r3 = r3.c()
            if (r3 != 0) goto L4b
        L47:
            irk r3 = r2.I
            java.lang.String r3 = r3.b
        L4b:
            gbf r4 = r0.a
            r4.k(r3)
            r3 = 0
            r2.T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyi.l(pvb, boolean):void");
    }

    public final long m(mil milVar, long j, boolean z, hai haiVar) {
        dil dilVar = (dil) this.d;
        long jV = dilVar.v(milVar, j, z, false, haiVar, false, (k7a) null);
        if (!xjl.a(jV, (xjl) this.c)) {
            this.b = false;
        }
        dilVar.r(xjl.c(jV) ? b7a.c : b7a.b);
        return jV;
    }

    @Override // defpackage.zkj
    public final void o(lrf lrfVar) {
        ((cv1) this.d).invoke((r7j) lrfVar);
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        int i;
        o94 o94Var = (o94) this.c;
        y2n y2nVar = (y2n) this.d;
        if (o94Var != y2nVar.w || (i = y2nVar.y) == 3) {
            return;
        }
        int i2 = this.b ? 1 : 2;
        if (i2 != i) {
            y2nVar.y = i2;
            y2nVar.P().h(i2);
        }
    }

    @Override // defpackage.iqk
    public final void q(Suggestion suggestion, boolean z) {
        mrk mrkVar = (mrk) this.d;
        fbf fbfVar = mrkVar.c;
        zyk zykVar = mrkVar.N;
        qk0 qk0Var = qk0.Q;
        if (z) {
            oqk oqkVar = (oqk) zykVar.getValue();
            x5f x5fVar = oqkVar.a;
            zpa zpaVar = x5fVar.d;
            dbf dbfVar = oqkVar.c;
            oqkVar.d = cl0.i;
            if (oqk.b(suggestion) != null) {
                dbfVar.A(qk0.L);
            }
            int i = suggestion.a;
            if (i == 8) {
                dbfVar.A(qk0.E);
                if (x5fVar.h) {
                    x56 x56VarF = zpa.F();
                    x56VarF.G(zpaVar).d(2, 1);
                    x5fVar.U0(x56VarF);
                }
            } else if (i != 18) {
                if (i != 19) {
                    if (i != 27 && i != 28 && i != 30 && i != 31) {
                        switch (i) {
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                dbfVar.A(qk0.O);
                                if (x5fVar.h) {
                                    x56 x56VarF2 = zpa.F();
                                    x56VarF2.G(zpaVar).d(2, 1);
                                    x5fVar.U0(x56VarF2);
                                    break;
                                }
                                break;
                            case 11:
                                dbfVar.A(qk0.J);
                                if (x5fVar.h) {
                                    x5fVar.o(11);
                                    break;
                                }
                                break;
                            case 12:
                                dbfVar.A(qk0.G);
                                break;
                            case 13:
                                dbfVar.A(qk0.I);
                                break;
                            case 14:
                                dbfVar.A(qk0.H);
                                break;
                        }
                    } else {
                        dbfVar.A(qk0Var);
                    }
                } else if (x5fVar.h) {
                    x5fVar.o(17);
                }
            } else if (x5fVar.h) {
                x5fVar.o(16);
            }
        } else {
            oqk oqkVar2 = (oqk) zykVar.getValue();
            dbf dbfVar2 = oqkVar2.c;
            oqkVar2.a(suggestion, cl0.h);
            if (oqk.b(suggestion) != null) {
                dbfVar2.A(qk0.M);
            }
            int i2 = suggestion.a;
            if (i2 == 8) {
                dbfVar2.A(qk0.D);
            } else if (i2 == 11) {
                dbfVar2.A(qk0.K);
                x5f x5fVar2 = oqkVar2.a;
                if (x5fVar2.h) {
                    x5fVar2.o(12);
                }
            } else if (i2 == 27 || i2 == 28 || i2 == 30 || i2 == 31) {
                dbfVar2.A(qk0Var);
            }
        }
        if (suggestion.a == 23 && !z) {
            Object obj = suggestion.k;
            if (obj instanceof Integer) {
                int iIntValue = ((Number) obj).intValue();
                k6l k6lVar = fbfVar.a.h;
                b2l b2lVarR = k6lVar.r(iIntValue);
                if (b2lVarR != null && !((d7l) b2lVarR).m) {
                    k6lVar.C(b2lVarR, 3);
                }
            }
        }
        int i3 = suggestion.a;
        if (i3 == 14) {
            j55 j55Var = mrkVar.K;
            lcp.F(j55Var.e, suggestion.b(), false);
            j55Var.l = true;
            j55Var.j(j55Var.h(j55Var.p.a), true);
            return;
        }
        if (z) {
            mrkVar.U = true;
            this.c = suggestion;
            mrkVar.b();
        } else {
            mrkVar.R = true;
            mrkVar.S = Integer.valueOf(i3);
            fbfVar.a.k(suggestion.a());
            mrkVar.R = false;
        }
    }

    public final void show() {
        ((i21) ((u85) ((ga6) this.d).b).h).d();
    }

    @Override // defpackage.zkj
    public final lrf t() {
        return (r7j) this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + g() + ", info=\n\t" + ((r05) this.d) + ")";
            default:
                return super.toString();
        }
    }
}
