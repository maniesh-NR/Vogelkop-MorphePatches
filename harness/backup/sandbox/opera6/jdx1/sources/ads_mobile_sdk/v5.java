package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.cwh;
import defpackage.fjp;
import defpackage.fq;
import defpackage.ita;
import defpackage.kta;
import defpackage.o95;
import defpackage.oie;
import defpackage.she;
import defpackage.the;
import defpackage.ukh;
import defpackage.yvh;
import defpackage.zvh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class v5 {
    public final fjp a;
    public final cu2 b;

    public v5(fjp fjpVar, cu2 cu2Var) {
        this.a = fjpVar;
        this.b = cu2Var;
    }

    public static Object a(Object obj) {
        l08 l08VarSingletonList;
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Byte[] bArr2 = new Byte[bArr.length];
            int length = bArr.length;
            while (i < length) {
                bArr2[i] = Byte.valueOf(bArr[i]);
                i++;
            }
            Byte[] bArr3 = bArr2;
            if (bArr3.length > 1) {
                Arrays.sort(bArr3);
            }
            return CollectionsKt.k0(Arrays.asList(bArr2));
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Short[] shArr = new Short[sArr.length];
            int length2 = sArr.length;
            while (i < length2) {
                shArr[i] = Short.valueOf(sArr[i]);
                i++;
            }
            Short[] shArr2 = shArr;
            if (shArr2.length > 1) {
                Arrays.sort(shArr2);
            }
            return CollectionsKt.k0(Arrays.asList(shArr));
        }
        if (obj instanceof int[]) {
            Integer[] numArrL = defpackage.b82.l((int[]) obj);
            Integer[] numArr = numArrL;
            if (numArr.length > 1) {
                Arrays.sort(numArr);
            }
            return CollectionsKt.k0(Arrays.asList(numArrL));
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            Long[] lArr = new Long[jArr.length];
            int length3 = jArr.length;
            while (i < length3) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            Long[] lArr2 = lArr;
            if (lArr2.length > 1) {
                Arrays.sort(lArr2);
            }
            return CollectionsKt.k0(Arrays.asList(lArr));
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            Float[] fArr2 = new Float[fArr.length];
            int length4 = fArr.length;
            while (i < length4) {
                fArr2[i] = Float.valueOf(fArr[i]);
                i++;
            }
            Float[] fArr3 = fArr2;
            if (fArr3.length > 1) {
                Arrays.sort(fArr3);
            }
            return CollectionsKt.k0(Arrays.asList(fArr2));
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Double[] dArr2 = new Double[dArr.length];
            int length5 = dArr.length;
            while (i < length5) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            Double[] dArr3 = dArr2;
            if (dArr3.length > 1) {
                Arrays.sort(dArr3);
            }
            return CollectionsKt.k0(Arrays.asList(dArr2));
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            if (length6 == 0) {
                l08VarSingletonList = l08.a;
            } else if (length6 != 1) {
                l08VarSingletonList = new ArrayList(zArr.length);
                int length7 = zArr.length;
                while (i < length7) {
                    l08VarSingletonList.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                l08VarSingletonList = Collections.singletonList(Boolean.valueOf(zArr[0]));
            }
            return CollectionsKt.c0(new w8l((byte) 16), l08VarSingletonList);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Character[] chArr = new Character[cArr.length];
            int length8 = cArr.length;
            while (i < length8) {
                chArr[i] = Character.valueOf(cArr[i]);
                i++;
            }
            Character[] chArr2 = chArr;
            if (chArr2.length > 1) {
                Arrays.sort(chArr2);
            }
            return CollectionsKt.k0(Arrays.asList(chArr));
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            int length9 = objArr.length;
            while (i < length9) {
                arrayList.add(a(objArr[i]));
                i++;
            }
            return CollectionsKt.c0(new w8l((byte) 17), arrayList);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(k95.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(it.next()));
            }
            return CollectionsKt.c0(new w8l((byte) 18), arrayList2);
        }
        if (obj instanceof Set) {
            Iterable iterable2 = (Iterable) obj;
            ArrayList arrayList3 = new ArrayList(k95.o(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(a(it2.next()));
            }
            return CollectionsKt.c0(new w8l((byte) 19), arrayList3);
        }
        if (!(obj instanceof Map)) {
            return obj instanceof Enum ? ((Enum) obj).name() : obj;
        }
        List<Map.Entry> listC0 = CollectionsKt.c0(new w8l((byte) 20), ((Map) obj).entrySet());
        int iA = qbd.a(k95.o(listC0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
        for (Map.Entry entry : listC0) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static void a(defpackage.hp hpVar, LinkedHashMap linkedHashMap, p4j p4jVar) {
        String str = hpVar.i;
        u9d u9dVar = p4jVar.a;
        if (!u9dVar.containsKey("adUnitId") && !b(str)) {
            linkedHashMap.put("adUnitId", str);
        }
        LinkedHashSet linkedHashSet = hpVar.a;
        if (!u9dVar.containsKey("categoryExclusions") && !b(linkedHashSet)) {
            linkedHashMap.put("categoryExclusions", linkedHashSet);
        }
        String str2 = hpVar.b;
        if (!u9dVar.containsKey("contentUrl") && !b(str2)) {
            linkedHashMap.put("contentUrl", str2);
        }
        LinkedHashMap linkedHashMap2 = hpVar.c;
        if (!u9dVar.containsKey("customTargeting") && !b(linkedHashMap2)) {
            linkedHashMap.put("customTargeting", linkedHashMap2);
        }
        a("googleExtrasBundle", hpVar.d, linkedHashMap, p4jVar);
        HashSet hashSet = hpVar.e;
        if (!u9dVar.containsKey("keywords") && !b(hashSet)) {
            linkedHashMap.put("keywords", hashSet);
        }
        HashSet hashSet2 = hpVar.f;
        if (!u9dVar.containsKey("neighboringContentUrls") && !b(hashSet2)) {
            linkedHashMap.put("neighboringContentUrls", hashSet2);
        }
        if (!u9dVar.containsKey("adSourceExtrasBundles")) {
            for (Map.Entry entry : hpVar.g.entrySet()) {
                String str3 = (String) entry.getKey();
                a("adSourceExtrasBundles." + str3, (Bundle) entry.getValue(), linkedHashMap, p4jVar);
            }
        }
        String str4 = hpVar.h;
        if (!u9dVar.containsKey("publisherProvidedId") && !b(str4)) {
            linkedHashMap.put("publisherProvidedId", str4);
        }
        u9dVar.containsKey("requestAgent");
        if (!u9dVar.containsKey("placementId") && !b((Object) 0L)) {
            linkedHashMap.put("placementId", 0L);
        }
        Boolean bool = Boolean.FALSE;
        if (u9dVar.containsKey("skipUninitializedAdapters") || b(bool)) {
            return;
        }
        linkedHashMap.put("skipUninitializedAdapters", bool);
    }

    public static void a(String str, Bundle bundle, LinkedHashMap linkedHashMap, p4j p4jVar) {
        for (String str2 : bundle.keySet()) {
            if (!p4jVar.a.containsKey(str2)) {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    a(sko.k(str, ".", str2), (Bundle) obj, linkedHashMap, p4jVar);
                } else if (!b(obj)) {
                    linkedHashMap.put(str + "." + str2, obj);
                }
            }
        }
    }

    public static void a(kta ktaVar, LinkedHashMap linkedHashMap, p4j p4jVar) {
        ita itaVar = ktaVar.j;
        u9d u9dVar = p4jVar.a;
        if (!u9dVar.containsKey("iconAdPlacement") && !b(itaVar)) {
            linkedHashMap.put("iconAdPlacement", itaVar);
        }
        defpackage.zk zkVar = defpackage.zk.TOP_RIGHT;
        if (!u9dVar.containsKey("adChoicesPlacement") && !b(zkVar)) {
            linkedHashMap.put("adChoicesPlacement", zkVar);
        }
        if (!u9dVar.containsKey("correlator") && !b("")) {
            linkedHashMap.put("correlator", "");
        }
        Boolean bool = Boolean.FALSE;
        if (!u9dVar.containsKey("isImageLoadingDisabled") && !b(bool)) {
            linkedHashMap.put("isImageLoadingDisabled", bool);
        }
        Boolean bool2 = Boolean.TRUE;
        if (u9dVar.containsKey("adPersistenceEnabled") || b(bool2)) {
            return;
        }
        linkedHashMap.put("adPersistenceEnabled", bool2);
    }

    public static void a(oie oieVar, LinkedHashMap linkedHashMap, p4j p4jVar) {
        List list = oieVar.j;
        u9d u9dVar = p4jVar.a;
        if (!u9dVar.containsKey("nativeAdTypes") && !b(list)) {
            linkedHashMap.put("nativeAdTypes", list);
        }
        List list2 = oieVar.k;
        if (!u9dVar.containsKey("customFormatIds") && !b(list2)) {
            linkedHashMap.put("customFormatIds", list2);
        }
        Boolean boolValueOf = Boolean.valueOf(oieVar.l);
        if (!u9dVar.containsKey("isImageLoadingDisabled") && !b(boolValueOf)) {
            linkedHashMap.put("isImageLoadingDisabled", boolValueOf);
        }
        she sheVar = oieVar.m;
        if (!u9dVar.containsKey("mediaAspectRatio") && !b(sheVar)) {
            linkedHashMap.put("mediaAspectRatio", sheVar);
        }
        defpackage.zk zkVar = oieVar.n;
        if (!u9dVar.containsKey("adChoicesPlacement") && !b(zkVar)) {
            linkedHashMap.put("adChoicesPlacement", zkVar);
        }
        ukh ukhVar = oieVar.o;
        if (!u9dVar.containsKey("videoOptions") && !b(ukhVar)) {
            linkedHashMap.put("videoOptions", ukhVar);
        }
        the theVar = oieVar.p;
        if (!u9dVar.containsKey("customClickGestureDirection") && !b(theVar)) {
            linkedHashMap.put("customClickGestureDirection", theVar);
        }
        Boolean boolValueOf2 = Boolean.valueOf(oieVar.q);
        if (!u9dVar.containsKey("customClickGestureAllowTaps") && !b(boolValueOf2)) {
            linkedHashMap.put("customClickGestureAllowTaps", boolValueOf2);
        }
        Boolean boolValueOf3 = Boolean.valueOf(oieVar.r);
        if (!u9dVar.containsKey("customMuteThisAdRequested") && !b(boolValueOf3)) {
            linkedHashMap.put("customMuteThisAdRequested", boolValueOf3);
        }
        fq fqVar = oieVar.s;
        if (!u9dVar.containsKey("adSize") && !b(fqVar)) {
            linkedHashMap.put("adSize", fqVar);
        }
        List list3 = oieVar.t;
        if (!u9dVar.containsKey("adSizes") && !b(list3)) {
            linkedHashMap.put("adSizes", list3);
        }
        Boolean boolValueOf4 = Boolean.valueOf(oieVar.u);
        if (!u9dVar.containsKey("manualImpressionRequested") && !b(boolValueOf4)) {
            linkedHashMap.put("manualImpressionRequested", boolValueOf4);
        }
        Boolean boolValueOf5 = Boolean.valueOf(oieVar.v);
        if (u9dVar.containsKey("adPersistenceEnabled") || b(boolValueOf5)) {
            return;
        }
        linkedHashMap.put("adPersistenceEnabled", boolValueOf5);
    }

    public static void a(defpackage.w13 w13Var, LinkedHashMap linkedHashMap, p4j p4jVar) {
        fq fqVar = w13Var.j;
        u9d u9dVar = p4jVar.a;
        if (!u9dVar.containsKey("adSize") && !b(fqVar)) {
            linkedHashMap.put("adSize", fqVar);
        }
        List list = w13Var.k;
        if (!u9dVar.containsKey("adSizes") && !b(list)) {
            linkedHashMap.put("adSizes", list);
        }
        ukh ukhVar = w13Var.l;
        if (!u9dVar.containsKey("videoOptions") && !b(ukhVar)) {
            linkedHashMap.put("videoOptions", ukhVar);
        }
        Boolean boolValueOf = Boolean.valueOf(w13Var.m);
        if (u9dVar.containsKey("manualImpressionRequested") || b(boolValueOf)) {
            return;
        }
        linkedHashMap.put("manualImpressionRequested", boolValueOf);
    }

    public static boolean b(Object obj) {
        if (obj != null) {
            return obj instanceof String ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Bundle ? ((Bundle) obj).isEmpty() : obj instanceof Object[] ? ((Object[]) obj).length == 0 : obj instanceof int[] ? ((int[]) obj).length == 0 : obj instanceof long[] ? ((long[]) obj).length == 0 : obj instanceof byte[] ? ((byte[]) obj).length == 0 : obj instanceof short[] ? ((short[]) obj).length == 0 : obj instanceof float[] ? ((float[]) obj).length == 0 : obj instanceof double[] ? ((double[]) obj).length == 0 : obj instanceof boolean[] ? ((boolean[]) obj).length == 0 : (obj instanceof char[]) && ((char[]) obj).length == 0;
        }
        return true;
    }

    public final String a(defpackage.hp hpVar) {
        WeakHashMap weakHashMap = hh3.a;
        rg3 rg3VarA = hh3.a(fw0.CUI_NAME_PERSISTENT_CACHE_KEY_GENERATE, l08.a, true);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            p4j p4jVarB = b(hpVar);
            a(linkedHashMap, p4jVarB);
            a(hpVar, linkedHashMap, p4jVarB);
            if (hpVar instanceof oie) {
                a((oie) hpVar, linkedHashMap, p4jVarB);
            } else if (hpVar instanceof kta) {
                a((kta) hpVar, linkedHashMap, p4jVarB);
            } else if (hpVar instanceof defpackage.w13) {
                a((defpackage.w13) hpVar, linkedHashMap, p4jVarB);
            }
            List<Map.Entry> listC0 = CollectionsKt.c0(new w8l((byte) 21), linkedHashMap.entrySet());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : listC0) {
                o95.t(Arrays.asList(entry.getKey(), a(entry.getValue())), arrayList);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String strValueOf = String.valueOf(Objects.hash(Arrays.copyOf(array, array.length)));
            rg3VarA.close();
            return strValueOf;
        } catch (Throwable th) {
            try {
                rg3VarA.b(th);
                if (th instanceof iyo) {
                    throw th;
                }
                rg3VarA.a(th);
                if (th instanceof kql) {
                    throw new uw0((kql) th);
                }
                if (th instanceof CancellationException) {
                    throw new ou0(th);
                }
                if (th instanceof mv0) {
                    throw th;
                }
                throw new tu0(th);
            } finally {
            }
        }
    }

    public final void a(LinkedHashMap linkedHashMap, p4j p4jVar) {
        cwh cwhVarA = this.b.a();
        cwhVarA.getClass();
        awh awhVar = awh.a;
        u9d u9dVar = p4jVar.a;
        u9d u9dVar2 = p4jVar.a;
        if (!u9dVar.containsKey("tagForChildDirectedTreatment") && !b(awhVar)) {
            linkedHashMap.put("tagForChildDirectedTreatment", awhVar);
        }
        bwh bwhVar = bwh.a;
        if (!u9dVar2.containsKey("tagForUnderAgeOfConsent") && !b(bwhVar)) {
            linkedHashMap.put("tagForUnderAgeOfConsent", bwhVar);
        }
        yvh yvhVar = cwhVarA.a;
        if (!u9dVar2.containsKey("maxAdContentRating") && !b(yvhVar)) {
            linkedHashMap.put("maxAdContentRating", yvhVar);
        }
        ArrayList arrayList = cwhVarA.b;
        if (!u9dVar2.containsKey("testDeviceIds") && !b(arrayList)) {
            linkedHashMap.put("testDeviceIds", arrayList);
        }
        zvh zvhVar = cwhVarA.c;
        if (!u9dVar2.containsKey("publisherPrivacyPersonalizationState") && !b(zvhVar)) {
            linkedHashMap.put("publisherPrivacyPersonalizationState", zvhVar);
        }
        u9dVar2.containsKey("ageRestrictedTreatmentInternal");
    }

    public final p4j b(defpackage.hp hpVar) {
        p4j p4jVar = new p4j();
        fjp fjpVar = this.a;
        fjpVar.getClass();
        List listAsList = Arrays.asList("categoryExclusions", "contentUrl", "customTargeting", "googleExtrasBundle", "adSourceExtrasBundles");
        fo foVar = fo.a$15;
        p4jVar.addAll((List) fjpVar.a("gads:pc:ad_request:cache_key_param_denylist", listAsList, foVar));
        if (hpVar instanceof oie) {
            p4jVar.addAll((List) fjpVar.a("gads:pc:native_ad_request:cache_key_param_denylist", l08.a, foVar));
        } else if (hpVar instanceof kta) {
            p4jVar.addAll((List) fjpVar.a("gads:pc:icon_ad_request:cache_key_param_denylist", Collections.singletonList("correlator"), foVar));
        } else if (hpVar instanceof defpackage.w13) {
            p4jVar.addAll((List) fjpVar.a("gads:pc:banner_ad_request:cache_key_param_denylist", l08.a, foVar));
        }
        return z4j.a(p4jVar);
    }
}
