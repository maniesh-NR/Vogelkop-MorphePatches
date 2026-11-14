package defpackage;

import J.N;
import android.app.RemoteAction;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.ViewPropertyAnimator;
import android.view.textclassifier.TextClassification;
import com.leanplum.utils.SizeUtil;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.startup.WelcomeActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class nqi implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nqi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ nqi(sjl sjlVar, int i) {
        this.a = (byte) 15;
        this.b = sjlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        Collection collectionV;
        byte b = this.a;
        or4 or4Var = null;
        byte b2 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                String str = (String) obj;
                if (obj2 instanceof String) {
                    linkedHashMap.put(str, obj2);
                }
                return Unit.a;
            case 1:
                ((SharedPreferences.Editor) obj3).putString((String) obj, (String) obj2);
                return Unit.a;
            case 2:
                isi isiVar = (isi) obj3;
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                zpa zpaVar = hh5.a;
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    msi msiVar = (msi) dyg.h(isiVar.o0().e, vt9Var2).getValue();
                    boolean zH = vt9Var2.h(isiVar);
                    Object objK = vt9Var2.K();
                    if (zH || objK == zpaVar) {
                        e6g e6gVar = new e6g(0, isiVar, isi.class, "close", "close()V", 0, (byte) 20);
                        vt9Var2.g0(e6gVar);
                        objK = e6gVar;
                    }
                    Function0 function0 = (mtb) objK;
                    qsi qsiVarO0 = isiVar.o0();
                    boolean zH2 = vt9Var2.h(qsiVarO0);
                    Object objK2 = vt9Var2.K();
                    if (zH2 || objK2 == zpaVar) {
                        e6g e6gVar2 = new e6g(0, qsiVarO0, qsi.class, "onSearchClick", "onSearchClick()V", 0, (byte) 21);
                        vt9Var2.g0(e6gVar2);
                        objK2 = e6gVar2;
                    }
                    Function0 function02 = (mtb) objK2;
                    qsi qsiVarO02 = isiVar.o0();
                    boolean zH3 = vt9Var2.h(qsiVarO02);
                    Object objK3 = vt9Var2.K();
                    if (zH3 || objK3 == zpaVar) {
                        e6g e6gVar3 = new e6g(0, qsiVarO02, qsi.class, "onDefaultSearchEngineClicked", "onDefaultSearchEngineClicked()V", 0, (byte) 22);
                        vt9Var2.g0(e6gVar3);
                        objK3 = e6gVar3;
                    }
                    Function0 function03 = (mtb) objK3;
                    qsi qsiVarO03 = isiVar.o0();
                    boolean zH4 = vt9Var2.h(qsiVarO03);
                    Object objK4 = vt9Var2.K();
                    if (zH4 || objK4 == zpaVar) {
                        ldh ldhVar = new ldh(1, qsiVarO03, qsi.class, "onGoogleAIModeSwitchChanged", "onGoogleAIModeSwitchChanged(Z)V", 0, (byte) 22);
                        vt9Var2.g0(ldhVar);
                        objK4 = ldhVar;
                    }
                    Function1 function1 = (mtb) objK4;
                    qsi qsiVarO04 = isiVar.o0();
                    boolean zH5 = vt9Var2.h(qsiVarO04);
                    Object objK5 = vt9Var2.K();
                    if (zH5 || objK5 == zpaVar) {
                        objK5 = new e6g(0, qsiVarO04, qsi.class, "onAiSearchClicked", "onAiSearchClicked()V", 0, (byte) 23);
                        vt9Var2.g0(objK5);
                    }
                    Function0 function04 = (mtb) objK5;
                    qsi qsiVarO05 = isiVar.o0();
                    boolean zH6 = vt9Var2.h(qsiVarO05);
                    Object objK6 = vt9Var2.K();
                    if (zH6 || objK6 == zpaVar) {
                        objK6 = new e6g(0, qsiVarO05, qsi.class, "onSearchWidgetClicked", "onSearchWidgetClicked()V", 0, (byte) 24);
                        vt9Var2.g0(objK6);
                    }
                    Function0 function05 = (mtb) objK6;
                    qsi qsiVarO06 = isiVar.o0();
                    boolean zH7 = vt9Var2.h(qsiVarO06);
                    Object objK7 = vt9Var2.K();
                    if (zH7 || objK7 == zpaVar) {
                        objK7 = new ldh(1, qsiVarO06, qsi.class, "onRecommendationsSwitchChanged", "onRecommendationsSwitchChanged(Z)V", 0, (byte) 23);
                        vt9Var2.g0(objK7);
                    }
                    Function1 function12 = (mtb) objK7;
                    qsi qsiVarO07 = isiVar.o0();
                    boolean zH8 = vt9Var2.h(qsiVarO07);
                    Object objK8 = vt9Var2.K();
                    if (zH8 || objK8 == zpaVar) {
                        objK8 = new ldh(1, qsiVarO07, qsi.class, "onSuggestAiPromptsSwitchChanged", "onSuggestAiPromptsSwitchChanged(Z)V", 0, (byte) 24);
                        vt9Var2.g0(objK8);
                    }
                    Function1 function13 = (mtb) objK8;
                    qsi qsiVarO08 = isiVar.o0();
                    boolean zH9 = vt9Var2.h(qsiVarO08);
                    Object objK9 = vt9Var2.K();
                    if (zH9 || objK9 == zpaVar) {
                        objK9 = new ldh(1, qsiVarO08, qsi.class, "onSuggestedSpeedDialsSwitchChanged", "onSuggestedSpeedDialsSwitchChanged(Z)V", 0, (byte) 25);
                        vt9Var2.g0(objK9);
                    }
                    Function1 function14 = (mtb) objK9;
                    qsi qsiVarO09 = isiVar.o0();
                    boolean zH10 = vt9Var2.h(qsiVarO09);
                    Object objK10 = vt9Var2.K();
                    if (zH10 || objK10 == zpaVar) {
                        objK10 = new ldh(1, qsiVarO09, qsi.class, "onTrendingSearchesSwitchChanged", "onTrendingSearchesSwitchChanged(Z)V", 0, (byte) 13);
                        vt9Var2.g0(objK10);
                    }
                    Function1 function15 = (mtb) objK10;
                    qsi qsiVarO010 = isiVar.o0();
                    boolean zH11 = vt9Var2.h(qsiVarO010);
                    Object objK11 = vt9Var2.K();
                    if (zH11 || objK11 == zpaVar) {
                        objK11 = new ldh(1, qsiVarO010, qsi.class, "onProductSuggestionsSwitchChanged", "onProductSuggestionsSwitchChanged(Z)V", 0, (byte) 14);
                        vt9Var2.g0(objK11);
                    }
                    Function1 function16 = (mtb) objK11;
                    qsi qsiVarO011 = isiVar.o0();
                    boolean zH12 = vt9Var2.h(qsiVarO011);
                    Object objK12 = vt9Var2.K();
                    if (zH12 || objK12 == zpaVar) {
                        objK12 = new ldh(1, qsiVarO011, qsi.class, "onFrequentlyVisitedSitesSwitchChanged", "onFrequentlyVisitedSitesSwitchChanged(Z)V", 0, (byte) 15);
                        vt9Var2.g0(objK12);
                    }
                    Function1 function17 = (mtb) objK12;
                    qsi qsiVarO012 = isiVar.o0();
                    boolean zH13 = vt9Var2.h(qsiVarO012);
                    Object objK13 = vt9Var2.K();
                    if (zH13 || objK13 == zpaVar) {
                        objK13 = new ldh(1, qsiVarO012, qsi.class, "onRecentSearchesSwitchChanged", "onRecentSearchesSwitchChanged(Z)V", 0, (byte) 16);
                        vt9Var2.g0(objK13);
                    }
                    Function1 function18 = (mtb) objK13;
                    qsi qsiVarO013 = isiVar.o0();
                    boolean zH14 = vt9Var2.h(qsiVarO013);
                    Object objK14 = vt9Var2.K();
                    if (zH14 || objK14 == zpaVar) {
                        objK14 = new ldh(1, qsiVarO013, qsi.class, "onRecentAiActivitySwitchChanged", "onRecentAiActivitySwitchChanged(Z)V", 0, (byte) 17);
                        vt9Var2.g0(objK14);
                    }
                    Function1 function19 = (mtb) objK14;
                    qsi qsiVarO014 = isiVar.o0();
                    boolean zH15 = vt9Var2.h(qsiVarO014);
                    Object objK15 = vt9Var2.K();
                    if (zH15 || objK15 == zpaVar) {
                        objK15 = new ldh(1, qsiVarO014, qsi.class, "onClipboardSwitchChanged", "onClipboardSwitchChanged(Z)V", 0, (byte) 18);
                        vt9Var2.g0(objK15);
                    }
                    Function1 function110 = (mtb) objK15;
                    qsi qsiVarO015 = isiVar.o0();
                    boolean zH16 = vt9Var2.h(qsiVarO015);
                    Object objK16 = vt9Var2.K();
                    if (zH16 || objK16 == zpaVar) {
                        objK16 = new ldh(1, qsiVarO015, qsi.class, "onHistoryOpenTabsSwitchChanged", "onHistoryOpenTabsSwitchChanged(Z)V", 0, (byte) 19);
                        vt9Var2.g0(objK16);
                    }
                    Function1 function111 = (mtb) objK16;
                    qsi qsiVarO016 = isiVar.o0();
                    boolean zH17 = vt9Var2.h(qsiVarO016);
                    Object objK17 = vt9Var2.K();
                    if (zH17 || objK17 == zpaVar) {
                        objK17 = new ldh(1, qsiVarO016, qsi.class, "onBookmarksSpeedDialsSwitchChanged", "onBookmarksSpeedDialsSwitchChanged(Z)V", 0, (byte) 20);
                        vt9Var2.g0(objK17);
                    }
                    Function1 function112 = (mtb) objK17;
                    qsi qsiVarO017 = isiVar.o0();
                    boolean zH18 = vt9Var2.h(qsiVarO017);
                    Object objK18 = vt9Var2.K();
                    if (zH18 || objK18 == zpaVar) {
                        objK18 = new ldh(1, qsiVarO017, qsi.class, "onAutocompleteSwitchChanged", "onAutocompleteSwitchChanged(Z)V", 0, (byte) 21);
                        vt9Var2.g0(objK18);
                    }
                    r9h.e(msiVar, function0, function02, function03, function1, function04, function05, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, function112, (mtb) objK18, (c8e) null, vt9Var2, 8);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 3:
                ((lmg) obj).a();
                ((oqh) obj3).a = ((y8f) obj2).a;
                return Unit.a;
            case 4:
                a21 a21Var = (a21) obj3;
                ArrayList arrayList = new ArrayList();
                for (omh omhVar : (List) obj2) {
                    ami amiVar = (ami) a21Var.f;
                    int i = omhVar.a;
                    l6j l6jVar = (l6j) CollectionsKt.M(((SparseIntArray) amiVar.f).get(i), (ArrayList) amiVar.e);
                    if (l6jVar == null || l6jVar.a != i || !l6jVar.g || !amiVar.i(i)) {
                        l6jVar = null;
                    }
                    if (l6jVar != null) {
                        arrayList.add(l6jVar);
                    }
                }
                return arrayList;
            case 5:
                gcj gcjVar = (gcj) obj3;
                Bitmap.CompressFormat compressFormat = gcj.y;
                gcjVar.g0();
                ysj ysjVar = gcjVar.v;
                cf7 cf7Var = new cf7(gcjVar, (String) obj2, (Uri) obj);
                ysjVar.getClass();
                ysjVar.b(cf7Var, ijm.b);
                return Unit.a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (e9f e9fVar : ((qjj) obj3).b) {
                    e9fVar.a.q(obj, Boolean.valueOf(zBooleanValue != Intrinsics.a(e9fVar.a.a.get(obj), Boolean.TRUE)));
                }
                return Unit.a;
            case 7:
                emj emjVar = (emj) obj3;
                Set set = (Set) obj;
                synchronized (emjVar.b) {
                    tee teeVar = emjVar.e;
                    if (teeVar != null) {
                        Object[] objArr = teeVar.b;
                        long[] jArr = teeVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            if ((255 & j) >= 128 || !set.contains(objArr[(i2 << 3) + i4])) {
                                                j >>= 8;
                                                i4++;
                                            } else {
                                                or4Var = emjVar.g;
                                            }
                                        } else if (i3 == 8) {
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                    } else if (CollectionsKt.E(set, emjVar.c)) {
                        or4Var = emjVar.g;
                    }
                }
                if (or4Var != null) {
                    or4Var.b(Unit.a);
                }
                return Unit.a;
            case 8:
                tuj tujVar = (tuj) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = (AtomicReference) tujVar.e;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionV = collection;
                    } else if (obj4 instanceof Set) {
                        collectionV = Arrays.asList(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            mh5.b("Unexpected notification");
                            t3p.v();
                            return null;
                        }
                        collectionV = CollectionsKt.V(Collections.singletonList(collection), (Collection) obj4);
                    }
                    while (!atomicReference.compareAndSet(obj4, collectionV)) {
                        if (atomicReference.get() != obj4) {
                            break;
                        }
                    }
                    if (tujVar.d()) {
                        ((Function1) tujVar.d).invoke(new dnj(tujVar, b2));
                    }
                    return Unit.a;
                    break;
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                t1k t1kVar = (t1k) obj3;
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vt9Var4.W(-1726664822);
                    String strQ = t1kVar.a;
                    if (strQ.length() == 0) {
                        strQ = uyg.q((shk) dhk.o.getValue(), vt9Var4);
                    }
                    vt9Var4.p(false);
                    ijl.b(strQ, (c8e) null, 0L, 0L, (ki9) null, 0L, (bgl) null, (pel) null, 0L, 0, false, 0, 0, (ikl) null, vt9Var4, 0, 0, 262142);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((eik) obj3).e((String) obj, (List) obj2);
                return Unit.a;
            case 11:
                mrk mrkVar = (mrk) obj3;
                N.MBRDh_KB(mrkVar.J.a, ((kqk) obj).ordinal(), ((Boolean) obj2).booleanValue());
                mrkVar.g();
                return Unit.a;
            case 12:
                jo3 jo3Var = ((r9l) obj3).g;
                long j2 = ((pn7) obj).a;
                long j3 = ((pn7) obj2).a;
                ViewPropertyAnimator viewPropertyAnimatorAlpha = jo3Var.a.animate().alpha(1.0f);
                long jF = pn7.f(j2) - pn7.f(jo3.b);
                if (jF < 0) {
                    jF = 0;
                }
                viewPropertyAnimatorAlpha.setStartDelay(jF).setDuration(pn7.f(j3)).withEndAction(new fv2(jo3Var, (byte) 17)).start();
                return Unit.a;
            case 13:
                ((Integer) obj2).intValue();
                vt9 vt9Var5 = (ih5) obj;
                vt9Var5.W(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                vt9Var5.p(false);
                return strValueOf;
            case 14:
                ((Integer) obj2).intValue();
                vt9 vt9Var6 = (ih5) obj;
                vt9Var6.W(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                vt9Var6.p(false);
                return string;
            case 15:
                ((Integer) obj2).getClass();
                ((sjl) obj3).a((ih5) obj, aoh.m(1));
                return Unit.a;
            case 16:
                ((tgm) obj3).i.e((String) obj, (List) obj2);
                return Unit.a;
            case 17:
                aaf aafVar = (aaf) obj3;
                String str2 = (String) obj;
                List list = (List) obj2;
                if (!"Content-Length".equals(str2) && !"Content-Type".equals(str2)) {
                    if (jzm.a.contains(str2)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            aafVar.invoke(str2, (String) it.next());
                        }
                    } else {
                        aafVar.invoke(str2, CollectionsKt.P(list, "Cookie".equals(str2) ? "; " : ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
                    }
                    return Unit.a;
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                Runnable runnable = (Runnable) obj;
                pn7 pn7Var = (pn7) obj2;
                p8f p8fVar = ((mqn) obj3).I;
                if (p8fVar != null) {
                    ((zll) p8fVar.b).postOnAnimationDelayed(runnable, pn7.f(pn7Var.a));
                }
                return Unit.a;
            case 19:
                myn mynVar = (myn) obj3;
                vt9 vt9Var7 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var8 = vt9Var7;
                if (vt9Var8.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str3 = (String) mynVar.d.getValue();
                    if (str3 == null) {
                        str3 = "";
                    }
                    ijl.b(str3, (c8e) null, 0L, 0L, (ki9) null, 0L, (bgl) null, (pel) null, 0L, 2, false, 1, 0, (ikl) null, vt9Var8, 0, 24960, 241662);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                int i5 = WelcomeActivity.w;
                FullscreenWebActivity.z0((WelcomeActivity) obj3, (String) obj, new qxh(""));
                return Boolean.TRUE;
            case 21:
                Context context = (Context) obj;
                Long l = (Long) obj2;
                l.getClass();
                k7o k7oVar = (k7o) ((xol) obj3).c;
                if (k7oVar != null) {
                    k7oVar.h.invoke(context, l);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                return new ybb(((sd3) obj3).a(0, (int) (((gcb) obj).a & 4294967295L)) & 4294967295L);
            default:
                return new ybb(((td3) obj3).a(0L, ((gcb) obj).a, (d2c) obj2));
        }
    }
}
