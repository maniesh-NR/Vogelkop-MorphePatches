package defpackage;

import ads_mobile_sdk.pd;
import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class n9k implements qz5, kud, d0g, zzg {
    public boolean a;
    public Object b;

    public n9k(d0g d0gVar) {
        this.b = d0gVar;
        this.a = d0gVar.b();
    }

    public /* synthetic */ n9k(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ n9k(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n9k(u6m u6mVar, int i) {
        this.b = u6mVar;
        this.a = i;
    }

    public n9k(ujp ujpVar, boolean z) {
        this(ujpVar);
        this.a = z;
    }

    public final Set a() {
        return j7h.e((d0g) this.b).a();
    }

    public final boolean b() {
        return this.a;
    }

    public final List c(String str) {
        List listC = ((d0g) this.b).c(l75.e(str, false));
        if (listC == null) {
            return null;
        }
        List list = listC;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l75.d(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    public final void clear() {
        ((d0g) this.b).clear();
    }

    public final void d() {
    }

    public final void e(String str, Iterable iterable) {
        d0g d0gVar = (d0g) this.b;
        String strE = l75.e(str, false);
        ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(l75.e((String) it.next(), true));
        }
        d0gVar.e(strE, arrayList);
    }

    @Override // defpackage.kud
    public final void f(itd itdVar, boolean z) {
        ne neVar;
        usl uslVar = (usl) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        qe qeVar = uslVar.a.a.a;
        if (qeVar != null && (neVar = qeVar.t) != null) {
            neVar.j();
            le leVar = neVar.p;
            if (leVar != null && leVar.b()) {
                leVar.j.dismiss();
            }
        }
        uslVar.b.onPanelClosed(pd.i1, itdVar);
        this.a = false;
    }

    public final void g(is3 is3Var) {
    }

    public final void h(HashMap map) {
        if (this.a) {
            return;
        }
        hvj hvjVar = new hvj((ks3) this.b);
        try {
            hvjVar.h(new URL("https://crashstats-collector.opera.com/collector/submit"));
            hvjVar.m(map);
            hvjVar.l();
        } catch (IOException unused) {
        } catch (Throwable th) {
            xvg.l(hvjVar);
            throw th;
        }
        xvg.l(hvjVar);
    }

    public final void i(String str, String str2) {
        ((d0g) this.b).i(l75.e(str, false), l75.e(str2, true));
    }

    public final boolean isEmpty() {
        return ((d0g) this.b).isEmpty();
    }

    public final boolean j() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(int r7, java.lang.CharSequence r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L45
            if (r7 < 0) goto L45
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L45
            java.lang.Object r1 = r6.b
            ujp r1 = (defpackage.ujp) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.j()
            return r6
        L17:
            r1 = 2
            r2 = r0
            r3 = r1
        L1a:
            r4 = 1
            if (r2 >= r7) goto L3a
            if (r3 != r1) goto L3a
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            n9k r5 = kgl.a
            if (r3 == 0) goto L36
            if (r3 == r4) goto L34
            if (r3 == r1) goto L34
            switch(r3) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r3 = r1
            goto L37
        L34:
            r3 = r0
            goto L37
        L36:
            r3 = r4
        L37:
            int r2 = r2 + 1
            goto L1a
        L3a:
            if (r3 == 0) goto L44
            if (r3 == r4) goto L43
            boolean r6 = r6.j()
            return r6
        L43:
            return r0
        L44:
            return r4
        L45:
            hai.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9k.k(int, java.lang.CharSequence):boolean");
    }

    public final zqg l() {
        grg grgVar;
        List list;
        ami amiVar = (ami) this.b;
        String str = (String) amiVar.d;
        spg spgVar = (spg) amiVar.g;
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append(spgVar.C);
            sb.append("\n\n");
        }
        Boolean bool = (Boolean) amiVar.e;
        if (bool != null) {
            sb.append(sko.l("• ", spgVar.D, ": ", bool.booleanValue() ? spgVar.B : spgVar.q, "\n"));
        }
        if (((Long) amiVar.b) != null) {
            String strA = spgVar.a(r12.longValue());
            sb.append("• " + spgVar.k + ": " + strA);
            sb.append("\n");
        }
        Boolean bool2 = (Boolean) amiVar.f;
        if (bool2 != null) {
            String str2 = bool2.booleanValue() ? spgVar.B : spgVar.q;
            sb.append("• " + spgVar.E + ": " + str2);
            sb.append("\n");
        }
        String str3 = Intrinsics.a((Boolean) amiVar.c, Boolean.TRUE) ? spgVar.B : spgVar.q;
        sb.append("• " + spgVar.r + ": " + str3);
        String str4 = spgVar.v;
        String string = sb.toString();
        ConsentDisclosureObject consentDisclosureObject = (ConsentDisclosureObject) amiVar.h;
        xqg xqgVar = null;
        String strV = str != null ? w7d.v(str) : null;
        if ((consentDisclosureObject == null || (list = consentDisclosureObject.a) == null || !(!list.isEmpty())) && (strV == null || StringsKt.N(strV))) {
            grgVar = null;
        } else {
            grgVar = new grg(spgVar.w, strV, consentDisclosureObject == null ? null : new g77(consentDisclosureObject, spgVar, n08.a).v());
        }
        String strV2 = str != null ? w7d.v(str) : null;
        if (strV2 != null && !StringsKt.N(strV2)) {
            xqgVar = new xqg(spgVar.J, strV2);
        }
        return new zqg(str4, new hrg(string, grgVar, xqgVar));
    }

    public final void m(zzkr zzkrVar) {
        if (this.a) {
            zzc.zzo("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((r5m) this.b).a(new in2((Integer) null, zzkrVar, myg.a, (ko2) null));
        } catch (Throwable unused) {
            zzc.zzo("BillingLogger", "logging failed.");
        }
    }

    public final Set names() {
        Set setNames = ((d0g) this.b).names();
        ArrayList arrayList = new ArrayList(k95.o(setNames, 10));
        Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(l75.d(0, 0, 15, (String) it.next()));
        }
        return CollectionsKt.n0(arrayList);
    }

    @Override // defpackage.kud
    public final boolean p(itd itdVar) {
        ((usl) this.b).b.onMenuOpened(pd.i1, itdVar);
        return true;
    }

    public final Object zza() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.b, this.a);
    }
}
