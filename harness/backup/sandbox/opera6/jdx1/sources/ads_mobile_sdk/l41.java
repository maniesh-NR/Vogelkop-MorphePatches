package ads_mobile_sdk;

import android.util.Base64;
import defpackage.aep;
import defpackage.bmp;
import defpackage.dso;
import defpackage.flp;
import defpackage.idp;
import defpackage.ilp;
import defpackage.kcp;
import defpackage.kgp;
import defpackage.mfh;
import defpackage.olp;
import defpackage.prb;
import defpackage.v0k;
import defpackage.vso;
import defpackage.wpb;
import defpackage.y7h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class l41 {
    public static final l41 a = new l41();

    public static d9 a(wpb wpbVar) {
        try {
            dso dsoVarQ = d9.q();
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "AdUnitPatterns: " + wpbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            Collections.unmodifiableList(((d9) dsoVarQ.b).adUnitPatterns_);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = wpbVar.a;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    j95.n();
                    throw null;
                }
                arrayList.add(c(((pqb) obj).h()));
                i = i3;
            }
            dsoVarQ.b$1();
            d9 d9Var = (d9) dsoVarQ.b;
            flp flpVar = d9Var.adUnitPatterns_;
            if (!((j) flpVar).a) {
                d9Var.adUnitPatterns_ = y7h.c(flpVar);
            }
            iu0.a(arrayList, d9Var.adUnitPatterns_);
            return (d9) dsoVarQ.a();
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static pp a(prb prbVar, String str, String str2) {
        try {
            if (!kotlin.text.c.m(bw2.a(prbVar, "platform", ""), str2, true)) {
                return null;
            }
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "Adapter settings from permission set: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            idp idpVarS = pp.s();
            idpVarS.b$1();
            ((pp) idpVarS.b).b(str);
            String lowerCase = bw2.a(prbVar, "platform", "").toLowerCase(Locale.ROOT);
            idpVarS.b$1();
            ((pp) idpVarS.b).c(lowerCase);
            idpVarS.c(bw2.a(prbVar, "collect_secure_signals", false));
            idpVarS.b(bw2.a(prbVar, "collect_secure_signals_on_full_app", false));
            idpVarS.e();
            pqb pqbVarU = prbVar.u("data");
            prb prbVarH = pqbVarU != null ? pqbVarU.h() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (prbVarH != null) {
                egc it = prbVarH.a.entrySet().iterator();
                while (it.hasNext()) {
                    ggc ggcVarA = it.a();
                    linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
                }
            }
            idpVarS.b$1();
            ((pp) idpVarS.b).p().putAll(linkedHashMap);
            return (pp) idpVarS.a();
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static yz a(prb prbVar, prb prbVar2) {
        try {
            olp olpVarW = yz.w();
            String strF = new m5a().f(prbVar2);
            olpVarW.b$1();
            ((yz) olpVarW.b).c(strF);
            String strN = prbVar.u("consent_state").n();
            olpVarW.b$1();
            ((yz) olpVarW.b).b(strN);
            qx qxVarA = qx.a(n63.b.a(prbVar.u("allowlist").n()));
            olpVarW.b$1();
            ((yz) olpVarW.b).a(qxVarA);
            return (yz) olpVarW.a();
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static Pair a(prb prbVar) {
        try {
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "AppSettings MediationConfig: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            String strN = prbVar.u("format").n();
            Locale locale = Locale.ROOT;
            String lowerCase = strN.toLowerCase(locale);
            String lowerCase2 = prbVar.u("ad_unit_id").n().toLowerCase(locale);
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                prb prbVarW = prbVar.w("mediation_config");
                wpb wpbVarV = prbVarW != null ? prbVarW.v("ad_networks") : null;
                ArrayList arrayList = new ArrayList();
                if (wpbVarV != null) {
                    ArrayList arrayList2 = wpbVarV.a;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        int i3 = i + 1;
                        if (i < 0) {
                            j95.n();
                            throw null;
                        }
                        yn1 yn1VarG = g(((pqb) obj).h());
                        if (yn1VarG != null) {
                            arrayList.add(yn1VarG);
                        }
                        i = i3;
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str = lowerCase2 + "," + lowerCase;
                    vso vsoVarQ = dp1.q();
                    Collections.unmodifiableList(((dp1) vsoVarQ.b).adNetworkInfo_);
                    vsoVarQ.b$1();
                    dp1 dp1Var = (dp1) vsoVarQ.b;
                    flp flpVar = dp1Var.adNetworkInfo_;
                    if (!((j) flpVar).a) {
                        dp1Var.adNetworkInfo_ = y7h.c(flpVar);
                    }
                    iu0.a(arrayList, dp1Var.adNetworkInfo_);
                    return new Pair(str, (dp1) vsoVarQ.a());
                }
            }
            return null;
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static Pair a(prb prbVar, String str) {
        try {
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "Adapter settings: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            String strA = bw2.a(prbVar, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            pqb pqbVarU = prbVar.u("permission_set");
            wpb wpbVarG = pqbVarU != null ? pqbVarU.g() : null;
            ArrayList arrayList = new ArrayList();
            if (wpbVarG != null) {
                ArrayList arrayList2 = wpbVarG.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        j95.n();
                        throw null;
                    }
                    pp ppVarA = a(((pqb) obj).h(), strA, str);
                    Pair pair = ppVarA != null ? new Pair(strA, ppVarA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i = i3;
                }
            }
            return (Pair) CollectionsKt.firstOrNull(arrayList);
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static Pair b(prb prbVar) {
        try {
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "AppSettings MediationConfig for request signals: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            String strA = bw2.a(prbVar, "format", "");
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            String lowerCase2 = bw2.a(prbVar, "ad_unit_id", "").toLowerCase(locale);
            pqb pqbVarU = prbVar.u("request_signals");
            if (lowerCase.length() == 0 || lowerCase2.length() == 0 || pqbVarU == null) {
                return null;
            }
            return new Pair(lowerCase2 + "," + lowerCase, pqbVarU.toString());
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static z8 c(prb prbVar) {
        bmp bmpVarR = z8.r();
        if (xu0.a("GoogleMobileAds", 2)) {
            vr3 vr3Var = xu0.a;
            vr3Var.getClass();
            u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "AdUnitPatterns: " + prbVar);
            while (true) {
                u0k u0kVar = u0kVarF;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
        }
        Collections.unmodifiableList(((z8) bmpVarR.b).includingRegexes_);
        wpb wpbVarV = prbVar.v("including");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (wpbVarV != null) {
            ArrayList arrayList2 = wpbVarV.a;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    j95.n();
                    throw null;
                }
                String strN = ((pqb) obj).n();
                if (strN != null) {
                    arrayList.add(strN);
                }
                i2 = i4;
            }
        }
        bmpVarR.b$1();
        z8 z8Var = (z8) bmpVarR.b;
        flp flpVar = z8Var.includingRegexes_;
        if (!((j) flpVar).a) {
            z8Var.includingRegexes_ = y7h.c(flpVar);
        }
        iu0.a(arrayList, z8Var.includingRegexes_);
        Collections.unmodifiableList(((z8) bmpVarR.b).excludingRegexes_);
        wpb wpbVarV2 = prbVar.v("excluding");
        ArrayList arrayList3 = new ArrayList();
        if (wpbVarV2 != null) {
            ArrayList arrayList4 = wpbVarV2.a;
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                int i6 = i + 1;
                if (i < 0) {
                    j95.n();
                    throw null;
                }
                String strN2 = ((pqb) obj2).n();
                if (strN2 != null) {
                    arrayList3.add(strN2);
                }
                i = i6;
            }
        }
        bmpVarR.b$1();
        z8 z8Var2 = (z8) bmpVarR.b;
        flp flpVar2 = z8Var2.excludingRegexes_;
        if (!((j) flpVar2).a) {
            z8Var2.excludingRegexes_ = y7h.c(flpVar2);
        }
        iu0.a(arrayList3, z8Var2.excludingRegexes_);
        String lowerCase = bw2.a(prbVar, "effective_ad_unit_id", "").toLowerCase(Locale.ROOT);
        bmpVarR.b$1();
        ((z8) bmpVarR.b).b(lowerCase);
        return (z8) bmpVarR.a();
    }

    public static t70 d(prb prbVar) {
        try {
            kgp kgpVarS = t70.s();
            pqb pqbVarU = prbVar.u("client_pat");
            hgc hgcVar = prbVar.a;
            hb2 hb2VarA = hb2.a(Base64.decode(pqbVarU.n(), 0));
            kgpVarS.b$1();
            ((t70) kgpVarS.b).a(hb2VarA);
            mg2 mg2VarA = mg2.a(Base64.decode(prbVar.u("client_pre").n(), 0));
            kgpVarS.b$1();
            ((t70) kgpVarS.b).a(mg2VarA);
            Collections.unmodifiableMap(Collections.unmodifiableMap(((t70) kgpVarS.b).concatenatedSignalsMap_));
            hgc hgcVar2 = ((prb) new m5a().b(prb.class, prbVar.u("arr_params").n())).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(hgcVar2.d));
            egc it = hgcVar2.entrySet().iterator();
            while (it.hasNext()) {
                ggc ggcVarA = it.a();
                linkedHashMap.put(ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).i().n());
            }
            kgpVarS.b$1();
            t70 t70Var = (t70) kgpVarS.b;
            gn1 gn1Var = t70Var.concatenatedSignalsMap_;
            if (!gn1Var.a) {
                t70Var.concatenatedSignalsMap_ = gn1Var.b();
            }
            t70Var.concatenatedSignalsMap_.putAll(linkedHashMap);
            return (t70) kgpVarS.a();
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static oa e(prb prbVar) {
        try {
            kcp kcpVarQ = oa.q();
            Collections.unmodifiableList(((oa) kcpVarQ.b).initializationData_);
            pqb pqbVarU = prbVar.u("data");
            wpb wpbVarG = pqbVarU != null ? pqbVarU.g() : null;
            ArrayList arrayList = new ArrayList();
            if (wpbVarG != null) {
                ArrayList arrayList2 = wpbVarG.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        j95.n();
                        throw null;
                    }
                    arrayList.add(f(((pqb) obj).h()));
                    i = i3;
                }
            }
            kcpVarQ.b$1();
            oa oaVar = (oa) kcpVarQ.b;
            flp flpVar = oaVar.initializationData_;
            if (!((j) flpVar).a) {
                oaVar.initializationData_ = y7h.c(flpVar);
            }
            iu0.a(arrayList, oaVar.initializationData_);
            return (oa) kcpVarQ.a();
        } catch (Exception e) {
            ArrayList arrayList3 = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
            return null;
        }
    }

    public static qa f(prb prbVar) {
        aep aepVarQ = qa.q();
        pqb pqbVarU = prbVar.u("format");
        String strN = pqbVarU != null ? pqbVarU.n() : null;
        if (strN == null) {
            strN = "";
        }
        aepVarQ.b$1();
        ((qa) aepVarQ.b).b(strN);
        pqb pqbVarU2 = prbVar.u("data");
        if (pqbVarU2 != null) {
            prb prbVarH = pqbVarU2.h();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            egc it = prbVarH.a.entrySet().iterator();
            while (it.hasNext()) {
                ggc ggcVarA = it.a();
                linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((qa) aepVarQ.b).extras_));
                Objects.requireNonNull(str);
                Objects.requireNonNull(str2);
                aepVarQ.b$1();
                qa qaVar = (qa) aepVarQ.b;
                gn1 gn1Var = qaVar.extras_;
                if (!gn1Var.a) {
                    qaVar.extras_ = gn1Var.b();
                }
                qaVar.extras_.put(str, str2);
            }
        }
        return (qa) aepVarQ.a();
    }

    public static yn1 g(prb prbVar) {
        try {
            ilp ilpVarR = yn1.r();
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "AppSettings MediationAdNetworkInfo: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            prb prbVarW = prbVar.w("data");
            Collections.unmodifiableMap(Collections.unmodifiableMap(((yn1) ilpVarR.b).data_));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (prbVarW != null) {
                egc it = prbVarW.a.entrySet().iterator();
                while (it.hasNext()) {
                    ggc ggcVarA = it.a();
                    linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
                }
            }
            ilpVarR.b$1();
            yn1 yn1Var = (yn1) ilpVarR.b;
            gn1 gn1Var = yn1Var.data_;
            if (!gn1Var.a) {
                yn1Var.data_ = gn1Var.b();
            }
            yn1Var.data_.putAll(linkedHashMap);
            Collections.unmodifiableList(((yn1) ilpVarR.b).adapters_);
            wpb wpbVarV = prbVar.v("rtb_adapters");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (wpbVarV != null) {
                ArrayList arrayList2 = wpbVarV.a;
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        j95.n();
                        throw null;
                    }
                    List list = a2.D0;
                    String strD = mfh.d(prbVarW == null ? new prb() : prbVarW, ((pqb) obj).n());
                    if (strD != null) {
                        arrayList.add(strD);
                    }
                    i2 = i4;
                }
            }
            ilpVarR.b$1();
            yn1 yn1Var2 = (yn1) ilpVarR.b;
            flp flpVar = yn1Var2.adapters_;
            if (!((j) flpVar).a) {
                yn1Var2.adapters_ = y7h.c(flpVar);
            }
            iu0.a(arrayList, yn1Var2.adapters_);
            Collections.unmodifiableList(((yn1) ilpVarR.b).waterfallAdapters_);
            wpb wpbVarV2 = prbVar.v("adapters");
            ArrayList arrayList3 = new ArrayList();
            if (wpbVarV2 != null) {
                ArrayList arrayList4 = wpbVarV2.a;
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList4.get(i5);
                    i5++;
                    int i6 = i + 1;
                    if (i < 0) {
                        j95.n();
                        throw null;
                    }
                    List list2 = a2.D0;
                    String strD2 = mfh.d(prbVarW == null ? new prb() : prbVarW, ((pqb) obj2).n());
                    if (strD2 != null) {
                        arrayList3.add(strD2);
                    }
                    i = i6;
                }
            }
            ilpVarR.b$1();
            yn1 yn1Var3 = (yn1) ilpVarR.b;
            flp flpVar2 = yn1Var3.waterfallAdapters_;
            if (!((j) flpVar2).a) {
                yn1Var3.waterfallAdapters_ = y7h.c(flpVar2);
            }
            iu0.a(arrayList3, yn1Var3.waterfallAdapters_);
            return (yn1) ilpVarR.a();
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }

    public static Pair h(prb prbVar) {
        try {
            if (xu0.a("GoogleMobileAds", 2)) {
                vr3 vr3Var = xu0.a;
                vr3Var.getClass();
                u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, "Signal adapters: " + prbVar);
                while (true) {
                    u0k u0kVar = u0kVarF;
                    if (!u0kVar.hasNext()) {
                        break;
                    }
                    Thread.currentThread().getName();
                }
            }
            String strA = bw2.a(prbVar, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            idp idpVarS = pp.s();
            idpVarS.b$1();
            ((pp) idpVarS.b).b(strA);
            idpVarS.c(bw2.a(prbVar, "collect_signals", false));
            idpVarS.b(true);
            idpVarS.e();
            pqb pqbVarU = prbVar.u("data");
            prb prbVarH = pqbVarU != null ? pqbVarU.h() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (prbVarH != null) {
                egc it = prbVarH.a.entrySet().iterator();
                while (it.hasNext()) {
                    ggc ggcVarA = it.a();
                    linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
                }
            }
            idpVarS.b$1();
            ((pp) idpVarS.b).p().putAll(linkedHashMap);
            return new Pair(strA, (pp) idpVarS.a());
        } catch (Exception e) {
            xh3.a(e);
            return null;
        }
    }
}
