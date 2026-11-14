package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.CookieManager;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class o71 implements l99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o71(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        Object objG;
        q1a q1aVar;
        ArrayList arrayList;
        int iOrdinal;
        l15 l15Var;
        int i;
        long jLongValue;
        LinkedHashMap linkedHashMap;
        Collection<k15> collectionValues;
        l15 l15Var2;
        int i2 = 1;
        de8 de8Var = null;
        switch (this.a) {
            case 0:
                z8b z8bVar = (z8b) this.b;
                if (Build.VERSION.SDK_INT >= 34) {
                    t8.d0(z8bVar.D(), (View) z8bVar.a);
                }
                return Unit.a;
            case 1:
                ag4 ag4Var = (ag4) obj;
                oa4 oa4Var = (oa4) this.b;
                nak nakVar = oa4Var.f;
                if (ag4Var instanceof wf4) {
                    nakVar.getClass();
                    nakVar.k((Object) null, ag4Var);
                    Unit unit = Unit.a;
                    px5 px5Var = px5.a;
                    return unit;
                }
                if (ag4Var instanceof yf4) {
                    nakVar.getClass();
                    nakVar.k((Object) null, ag4Var);
                    Unit unit2 = Unit.a;
                    px5 px5Var2 = px5.a;
                    return unit2;
                }
                if (!(ag4Var instanceof xf4)) {
                    return Unit.a;
                }
                jdj jdjVar = oa4Var.h;
                Unit unit3 = Unit.a;
                Object objEmit = jdjVar.emit(unit3, mt5Var);
                return objEmit != px5.a ? unit3 : objEmit;
            case 2:
                hn4 hn4Var = (hn4) obj;
                mm4 mm4Var = (mm4) this.b;
                om4 om4Var = (om4) mm4Var.v.getValue();
                l01 l01Var = om4Var != null ? om4Var.a : null;
                if (hn4Var instanceof cn4) {
                    de8Var = de8.h;
                } else if (!Intrinsics.a(hn4Var, dn4.a)) {
                    if (Intrinsics.a(hn4Var, en4.a)) {
                        de8Var = de8.c;
                    } else if (!Intrinsics.a(hn4Var, fn4.a)) {
                        if (!Intrinsics.a(hn4Var, gn4.a)) {
                            h9o.p();
                            return null;
                        }
                        de8Var = de8.b;
                    }
                }
                if (de8Var != null) {
                    mm4Var.e(de8Var, l01Var);
                }
                return Unit.a;
            case 3:
                ie6 ie6Var = (ie6) this.b;
                return ((ie6Var.h.b() instanceof w39) || (objG = ie6Var.g(true, mt5Var)) != px5.a) ? Unit.a : objG;
            case 4:
                Object objC = ((z1h) this.b).e.c(mt5Var, obj);
                return objC != px5.a ? Unit.a : objC;
            case 5:
                hkc hkcVar = (hkc) this.b;
                Object objZ = na2.Z(hkcVar.b, new qmb(hkcVar, obj, (mt5) null, (byte) 5), mt5Var);
                px5 px5Var3 = px5.a;
                if (objZ != px5Var3) {
                    objZ = Unit.a;
                }
                return objZ != px5Var3 ? Unit.a : objZ;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    ((y3i) ((j4c) ((z8b) this.b).b).get()).n(j1a.a);
                }
                return Unit.a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                v1a v1aVar = (v1a) this.b;
                if (iIntValue > 0 && v1aVar.g == null) {
                    v1aVar.a(new s1a(v1aVar, (byte) 0));
                    v1aVar.b();
                } else if (iIntValue == 0 && (q1aVar = v1aVar.g) != null) {
                    CookieManager cookieManager = v1aVar.d;
                    if (cookieManager != null) {
                        kv5 kv5Var = new kv5(new GURL("https://www.google.com/"));
                        HashMap map = cookieManager.a;
                        CookieManager.ChangeListenerValue changeListenerValue = (CookieManager.ChangeListenerValue) map.get(kv5Var);
                        if (changeListenerValue != null) {
                            h7f h7fVar = changeListenerValue.a;
                            h7fVar.c(q1aVar);
                            if (h7fVar.isEmpty()) {
                                map.remove(kv5Var);
                                N.MbxnEonO(changeListenerValue.b);
                            }
                        }
                    }
                    v1aVar.g = null;
                    d3k d3kVar = v1aVar.h;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    v1aVar.h = null;
                }
                return Unit.a;
            case 8:
                if (((Integer) obj) != null) {
                    ((Function1) this.b).invoke(new Integer(r1.intValue() - 1));
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((q53) this.b).run();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((aae) this.b).c.i(((Number) obj).floatValue());
                return Unit.a;
            case 11:
                ysf ysfVar = (ysf) obj;
                x5f x5fVar = (x5f) this.b;
                List listK0 = CollectionsKt.k0(ysfVar.b);
                LinkedHashMap linkedHashMap2 = ysfVar.a;
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                new jkc(listK0, linkedHashMap2, (byte) 19).invoke((wc0) new ck0(zpaVar, x56VarF).w.getValue());
                x5fVar.U0(x56VarF);
                return Unit.a;
            case 12:
                if (((ndb) obj) instanceof qj7) {
                    ((afe) this.b).setValue((Object) null);
                }
                return Unit.a;
            case 13:
                ych ychVar = (ych) this.b;
                i06 i06Var = ych.i;
                Object objA = ychVar.a((xri) obj, mt5Var);
                return objA != px5.a ? Unit.a : objA;
            case 14:
                List<b2h> list = (List) obj;
                r2i r2iVar = (r2i) this.b;
                ru9 ru9Var = r2iVar.c;
                kze kzeVar = r2iVar.h;
                r2iVar.a(list);
                if (r2iVar.b.g() == m18.b) {
                    ArrayList arrayList2 = new ArrayList();
                    for (b2h b2hVar : list) {
                        if (w1h.m(ru9Var.a, "rewards.claimed_app_icons").contains(b2hVar.a) || (iOrdinal = b2hVar.d.ordinal()) == 0) {
                            l15Var = l15.a;
                        } else {
                            if (iOrdinal != i2) {
                                h9o.p();
                                return null;
                            }
                            l15Var = l15.b;
                        }
                        String str = b2hVar.a;
                        Long lA = b2hVar.c.a();
                        if (lA != null) {
                            i = i2;
                            jLongValue = lA.longValue();
                        } else {
                            i = i2;
                            jLongValue = 0;
                        }
                        arrayList2.add(new k15(str, jLongValue, l15Var));
                        i2 = i;
                    }
                    HashSet hashSetM = w1h.m(ru9Var.a, "rewards.claimed_app_icons");
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSetM.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new k15((String) it.next(), 0L, l15.a));
                    }
                    ArrayList arrayListV = CollectionsKt.V(arrayList3, arrayList2);
                    HashSet hashSet = new HashSet();
                    arrayList = new ArrayList();
                    int size = arrayListV.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayListV.get(i3);
                        i3++;
                        if (hashSet.add(((k15) obj2).a)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = l08.a;
                }
                kzeVar.r(arrayList);
                r2iVar.a(list);
                return Unit.a;
            case 15:
                List<b2h> list2 = (List) obj;
                x4i x4iVar = (x4i) this.b;
                ode odeVar = x4iVar.h;
                if (x4iVar.b.g() == m18.b) {
                    linkedHashMap = new LinkedHashMap();
                    for (b2h b2hVar2 : list2) {
                        String str2 = b2hVar2.a;
                        Long lA2 = b2hVar2.c.a();
                        long jLongValue2 = lA2 != null ? lA2.longValue() : 0L;
                        int iOrdinal2 = b2hVar2.d.ordinal();
                        if (iOrdinal2 == 0) {
                            l15Var2 = l15.a;
                        } else {
                            if (iOrdinal2 != 1) {
                                h9o.p();
                                return null;
                            }
                            l15Var2 = l15.b;
                        }
                        linkedHashMap.put(vq8.m(str2), new k15(str2, jLongValue2, l15Var2));
                    }
                } else {
                    linkedHashMap = n08.a;
                }
                xf8.E0(odeVar, linkedHashMap);
                ru9 ru9Var2 = x4iVar.c;
                HashSet hashSetM2 = w1h.m(ru9Var2.a, "rewards.claimed_wallpapers");
                Map map2 = (Map) odeVar.g();
                if (map2 != null && (collectionValues = map2.values()) != null) {
                    for (k15 k15Var : collectionValues) {
                        if (k15Var.c == l15.a) {
                            hashSetM2.add(k15Var.a);
                        }
                    }
                }
                nv6 nv6VarB = ru9Var2.b();
                ((SharedPreferences.Editor) nv6VarB.a).putStringSet("rewards.claimed_wallpapers", hashSetM2);
                nv6VarB.w();
                return Unit.a;
            case 16:
                ((s4f) this.b).invoke();
                return Unit.a;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SettingsManager settingsManager = (SettingsManager) this.b;
                y9j y9jVar = settingsManager.a;
                Bundle bundle = settingsManager.c;
                y9j y9jVar2 = settingsManager.a;
                if (y9jVar.contains("dns_over_https_enabled") || y9jVar2.contains("dns_over_https_mode")) {
                    return Unit.a;
                }
                if (zBooleanValue) {
                    settingsManager.R(1, "dns_over_https_enabled");
                    settingsManager.R(1, "dns_over_https_mode");
                } else {
                    y9jVar2.n(bundle.getInt("dns_over_https_enabled", 0), "dns_over_https_enabled");
                    y9jVar2.n(bundle.getInt("dns_over_https_mode", 0), "dns_over_https_mode");
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                pf4 pf4Var = (kf4) obj;
                man manVar = (man) this.b;
                synchronized (manVar.e) {
                    if (pf4Var instanceof pf4) {
                        han hanVar = new han(pf4Var.a);
                        manVar.g = hanVar;
                        manVar.b(new pf4(hanVar));
                    } else {
                        manVar.b(pf4Var);
                    }
                }
                return Unit.a;
            case 19:
                h6o h6oVar = (h6o) this.b;
                h6oVar.g = obj;
                h6oVar.A();
                return Unit.a;
            default:
                ((w6o) this.b).f();
                return Unit.a;
        }
    }
}
