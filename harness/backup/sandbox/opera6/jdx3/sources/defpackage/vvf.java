package defpackage;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.PushedContentHandler;
import com.opera.android.favorites.PushedSpeedDialFavorite;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.stream.Collectors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class vvf implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vvf(ifg ifgVar, wkj wkjVar) {
        this.a = (byte) 20;
        this.c = ifgVar;
        this.b = wkjVar;
    }

    public /* synthetic */ vvf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        Uri uriFromFile;
        Long lG;
        byte b = 23;
        byte b2 = 20;
        byte b3 = 5;
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        switch (this.a) {
            case 0:
                wvf wvfVar = (wvf) this.b;
                ifg ifgVar = (ifg) this.c;
                p1d p1dVar = (p1d) obj;
                boolean z2 = wvfVar.s;
                float f = wvfVar.o;
                if (z2) {
                    p1d.h(p1dVar, ifgVar, p1dVar.M(f), p1dVar.M(wvfVar.p));
                } else {
                    p1d.f(p1dVar, ifgVar, p1dVar.M(f), p1dVar.M(wvfVar.p));
                }
                return Unit.a;
            case 1:
                Function2 function2 = (Function2) this.b;
                p8f p8fVar = (p8f) this.c;
                Integer numValueOf = Integer.valueOf(((usg) obj).a);
                dc1 dc1Var = (jxf) p8fVar.c;
                function2.invoke(numValueOf, Integer.valueOf(((jxf) (dc1Var != null ? dc1Var : null)).b));
                return Unit.a;
            case 2:
                afe afeVar = (afe) this.b;
                p1d p1dVar2 = (p1d) obj;
                l51 l51Var = new l51((ArrayList) this.c, b3);
                p1dVar2.a = true;
                l51Var.invoke(p1dVar2);
                p1dVar2.a = false;
                afeVar.getValue();
                return Unit.a;
            case 3:
                n5g n5gVar = (n5g) this.b;
                i iVar = (i) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    flb flbVar = n5gVar.c;
                    if (flbVar.v != null && flbVar.k(iVar, true) != 0) {
                        flbVar.a.remove(iVar.itemView);
                        float translationX = iVar.itemView.getTranslationX();
                        float translationY = iVar.itemView.getTranslationY();
                        ykb ykbVar = new ykb(flbVar, iVar, translationX, translationY, translationX, translationY);
                        ValueAnimator valueAnimator = ykbVar.g;
                        blb blbVar = flbVar.q;
                        RecyclerView recyclerView = flbVar.v;
                        blbVar.getClass();
                        e eVar = recyclerView.M;
                        valueAnimator.setDuration(eVar == null ? 250L : eVar.d);
                        ykbVar.a(0.0f);
                        flbVar.t.add(ykbVar);
                        ykbVar.s = true;
                        iVar.itemView.setHasTransientState(true);
                        valueAnimator.start();
                        flbVar.v.invalidate();
                    }
                }
                return Unit.a;
            case 4:
                s9i s9iVar = (s9i) this.b;
                smg smgVar = (smg) this.c;
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                dc1 dc1Var2 = smgVar.b;
                if (actionMasked == 0) {
                    s9iVar.c = ((Boolean) (dc1Var2 != null ? dc1Var2 : null).invoke(motionEvent)).booleanValue() ? qmg.b : qmg.c;
                } else {
                    (dc1Var2 != null ? dc1Var2 : null).invoke(motionEvent);
                }
                return Unit.a;
            case 5:
                PushedContentHandler pushedContentHandler = (PushedContentHandler) this.b;
                gh2 gh2Var = (gh2) this.c;
                Boolean bool = (Boolean) obj;
                pushedContentHandler.j.K0(4, bool.booleanValue());
                if (bool.booleanValue()) {
                    x5f x5fVar = pushedContentHandler.k;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).c().b.p(32, 1, jCurrentTimeMillis);
                    x5fVar.U0(x56VarF);
                }
                gh2Var.run();
                return Unit.a;
            case 6:
                lqh lqhVar = (lqh) this.b;
                mdh mdhVar = (mdh) this.c;
                List list = (List) obj;
                if (lqhVar.a && !list.isEmpty()) {
                    w6j w6jVar = mdhVar.i;
                    if (w6jVar != null) {
                        w6jVar.b();
                    }
                    int iIntValue = ((Number) mdhVar.g.get()).intValue();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new w2g(((PushedSpeedDialFavorite) it.next()).e, (byte) 1));
                    }
                    h1b h1bVarS = h1b.s(arrayList);
                    on7 on7Var = pn7.b;
                    mdhVar.i = new w6j(iIntValue, h1bVarS, pn7.f(cs5.x0(5, un7.e)), new vk2(b2));
                }
                lqhVar.a = false;
                return Unit.a;
            case 7:
                fp1 fp1Var = (BrowserActivity) this.b;
                nhj nhjVar = (nhj) this.c;
                if (!m5h.A(fp1Var, "qrWidgetShortcut")) {
                    return Unit.a;
                }
                try {
                    phj.C0(fp1Var, Collections.singletonList(nhjVar));
                } catch (IllegalArgumentException | IllegalStateException unused) {
                }
                return Unit.a;
            case 8:
                iak iakVar = (iak) this.b;
                iak iakVar2 = (iak) this.c;
                mk7 mk7Var = (mk7) obj;
                float fO0 = mk7Var.o0(2.0f);
                float f2 = fO0 / 2.0f;
                mk7.I(mk7Var, ((u95) iakVar.getValue()).a, mk7Var.o0(sih.c / 2.0f) - f2, 0L, new qik(0, 0, fO0, 0.0f, 30), 108);
                if (gh7.a(((gh7) iakVar2.getValue()).a, 0.0f) > 0) {
                    mk7.I(mk7Var, ((u95) iakVar.getValue()).a, mk7Var.o0(((gh7) iakVar2.getValue()).a) - f2, 0L, a39.a, 108);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((pmh) this.b).b.Q((osk) obj, (omh) this.c);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fi5 fi5Var = (fi5) this.b;
                tee teeVar = (tee) this.c;
                fi5Var.z(obj);
                if (teeVar != null) {
                    teeVar.a(obj);
                }
                return Unit.a;
            case 11:
                hoh hohVar = (hoh) this.b;
                Throwable th = (Throwable) this.c;
                Throwable th2 = (Throwable) obj;
                synchronized (hohVar.c) {
                    if (th != null) {
                        if (th2 != null) {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                wf8.a(th, th2);
                            }
                        }
                    }
                    th = null;
                    hohVar.e = th;
                    nak nakVar = hohVar.u;
                    eoh eohVar = eoh.a;
                    nakVar.getClass();
                    nakVar.k((Object) null, eohVar);
                }
                return Unit.a;
            case 12:
                RecyclerView recyclerView2 = (RecyclerView) this.b;
                yc3 yc3Var = (yc3) this.c;
                pg pgVar = (pg) obj;
                if (Intrinsics.a(pgVar, ng.a)) {
                    recyclerView2.o(yc3Var);
                } else {
                    if (!Intrinsics.a(pgVar, og.a)) {
                        h9o.p();
                        return null;
                    }
                    recyclerView2.t0(yc3Var);
                }
                return Unit.a;
            case 13:
                ((jqh) this.b).b.Q((osk) obj, (gqh) this.c);
                return null;
            case 14:
                l5b l5bVar = (l5b) this.b;
                qln qlnVar = (qln) this.c;
                Map map = (Map) obj;
                if (!l5bVar.b && !map.isEmpty()) {
                    ami amiVar = qlnVar.f;
                    if (!((vq8) amiVar.e).i()) {
                        return Unit.a;
                    }
                    if (!((Set) ((List) ((kze) ((vq8) amiVar.e).j).g()).stream().map(new mn((byte) 24)).collect(Collectors.toSet())).containsAll(map.keySet())) {
                        l5bVar.b = true;
                        amiVar.r(new pjg(l5bVar, b));
                    }
                    return Unit.a;
                }
                return Unit.a;
            case 15:
                ((ffe) this.b).a.setValue(new yf8((tlm) this.c, (g2o) obj));
                return Unit.a;
            case 16:
                qpi qpiVar = (qpi) this.b;
                spi spiVar = (spi) this.c;
                yi7 yi7Var = (yi7) obj;
                float f3 = yi7Var.b ? -1.0f : 1.0f;
                long j = yi7Var.a;
                qpiVar.a(1, y8f.f(spiVar.d == fsf.b ? y8f.a(j, 1, 0.0f) : y8f.a(j, 2, 0.0f), f3));
                return Unit.a;
            case 17:
                Bitmap bitmap = (Bitmap) this.b;
                try {
                    fp1 fp1Var2 = ((gcj) this.c).r;
                    File fileE = n1h.e(fp1Var2, "share_qr_code", ".png");
                    if (fileE == null || !z5i.l0(bitmap, fileE, gcj.y, 100) || (lG = qyn.G((uriFromFile = Uri.fromFile(fileE)))) == null) {
                        return null;
                    }
                    return new fcj(fp1Var2.getString(2132020587), fileE, uriFromFile, lG.longValue());
                } catch (IOException unused2) {
                    return null;
                }
            case SizeUtil.textSize0_1 /* 18 */:
                ((Bitmap) this.b).recycle();
                ((Function1) this.c).invoke((fcj) obj);
                return Unit.a;
            case 19:
                Uri uri = (Uri) this.b;
                String str = (String) this.c;
                Intent intent = (Intent) obj;
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setDataAndType(uri, str);
                intent.setFlags(1);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                p1d.p((p1d) obj, (ifg) this.c, ((wkj) this.b).H, 4);
                return Unit.a;
            case 21:
                knj knjVar = (knj) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                onj onjVar = (onj) obj;
                if (onjVar instanceof pnj) {
                    pnj pnjVar = (pnj) onjVar;
                    if (pnjVar.b.equals(knjVar.b)) {
                        Function1 function1 = pnjVar.c;
                        if (function1 != null) {
                            arrayList2.add(function1);
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case SizeUtil.textSize1 /* 22 */:
                vnj vnjVar = (vnj) this.b;
                umi umiVar = vnjVar.a;
                pnj pnjVar2 = (pnj) this.c;
                jnj jnjVar = (jnj) obj;
                if (jnjVar != null) {
                    if (jnjVar instanceof inj) {
                        vnjVar.d.n(umiVar.e(new vdi(jnjVar, vnjVar, pnjVar2, (byte) 4)).c(new mgf((Object) vnjVar, (Object) pnjVar2, (byte) 29)), null);
                    } else if (jnjVar instanceof gnj) {
                        if (((gnj) jnjVar).a == 404) {
                            fac.C(umiVar, new s4f(vnjVar, pnjVar2, b));
                        } else {
                            fac.B(umiVar, vnj.i, new dnj(vnjVar, z ? (byte) 1 : (byte) 0));
                        }
                    } else if (jnjVar instanceof hnj) {
                        fac.B(umiVar, vnj.i, new dnj(vnjVar, z ? (byte) 1 : (byte) 0));
                    }
                    return Unit.a;
                }
                h9o.p();
                return null;
            case 23:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                vnj vnjVar2 = (vnj) this.c;
                Map.Entry entry = (Map.Entry) obj;
                long jLongValue = ((Number) entry.getKey()).longValue();
                if (!linkedHashMap.containsKey((String) entry.getValue())) {
                    dc1 dc1Var3 = vnjVar2.h;
                    (dc1Var3 != null ? dc1Var3 : null).delete("icons", "id=?", new String[]{String.valueOf(jLongValue)});
                    z = true;
                }
                return Boolean.valueOf(z);
            case SizeUtil.textSize2 /* 24 */:
                ((eoj) this.b).d = new iuh((v4b) this.c);
                return Unit.a;
            case 25:
                Set set = (Set) this.b;
                eoj eojVar = (eoj) this.c;
                File[] fileArr = (File[]) obj;
                if (fileArr != null) {
                    LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(set);
                    ArrayList arrayList3 = eojVar.e;
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        if (((ynj) obj2).a.b == p6l.a) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(k95.o(arrayList4, 10));
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj3 = arrayList4.get(i);
                        i++;
                        arrayList5.add(((ynj) obj3).a.a);
                    }
                    linkedHashSetM0.addAll(arrayList5);
                    a5l a5lVar = eojVar.b;
                    new rml(Unit.a, a5lVar.a).a(new d7k((Object) a5lVar, (Object) linkedHashSetM0, (byte) 12)).t(new n6k(new vvf(eojVar, fileArr, (byte) 26), b2)).m(a5lVar.g);
                }
                return Unit.a;
            case 26:
                eoj eojVar2 = (eoj) this.b;
                File[] fileArr2 = (File[]) this.c;
                umi umiVar2 = eojVar2.a;
                Unit unit = Unit.a;
                new rml(unit, umiVar2).a(new tmi((List) obj, fileArr2, eojVar2, b3)).l();
                return unit;
            case 27:
                tmi tmiVar = (tmi) this.b;
                File file = (File) this.c;
                Object obj4 = ((t0i) obj).a;
                Boolean bool2 = Boolean.FALSE;
                if (obj4 instanceof q0i) {
                    obj4 = bool2;
                }
                tmiVar.invoke(((Boolean) obj4).booleanValue() ? Uri.fromFile(file) : null);
                return Unit.a;
            case 28:
                qyj qyjVar = (qyj) this.b;
                bzj bzjVar = (bzj) obj;
                if (!Intrinsics.a(qyjVar.m, (uyj) this.c)) {
                    return Unit.a;
                }
                xf8.E0(qyjVar.j, bzjVar);
                if (!bzjVar.a()) {
                    qyjVar.m = null;
                }
                return Unit.a;
            default:
                uyj uyjVar = (uyj) this.b;
                lqh lqhVar2 = (lqh) this.c;
                uyjVar.c.n(new oml(uyjVar.a.e(new txi(uyjVar, (byte) 11))), new Pair((tyj) obj, Boolean.valueOf(lqhVar2.a)));
                lqhVar2.a = false;
                return Unit.a;
        }
    }
}
