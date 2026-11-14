package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class x41 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ x41(long j) {
        this.a = (byte) 7;
        ix5 ix5Var = apc.b;
        this.b = j;
    }

    public /* synthetic */ x41(long j, byte b) {
        this.a = b;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [fvd] */
    public final Object invoke(Object obj) throws Exception {
        nh4 nh4Var;
        Object q0iVar;
        wsk wskVarH;
        fh9 fh9Var;
        Object next;
        ruc rucVar;
        int i;
        Object next2;
        String str;
        String strL;
        hf0 hf0Var;
        hf0 hf0Var2;
        hf0 hf0Var3;
        if0 if0Var;
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                g74 g74Var = (g74) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (g74Var.a.e() >> 32)) / 2.0f;
                return g74Var.a(new y41(fIntBitsToFloat, scd.u(g74Var, fIntBitsToFloat), new kh3(j, 5), (byte) 0));
            case 1:
                at3 at3Var = (at3) obj;
                Function1 function1 = at3Var.b;
                if (function1 != null && (nh4Var = at3Var.a) != null) {
                    try {
                        p0i p0iVar = t0i.b;
                        q0iVar = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        p0i p0iVar2 = t0i.b;
                        q0iVar = new q0i(th);
                    }
                    nh4Var.resumeWith(q0iVar);
                }
                return Unit.a;
            case 2:
                ((q0j) obj).b(hzi.a, new gzi(x6a.a, this.b, fzi.b, true));
                return Unit.a;
            case 3:
                return Boolean.valueOf(((od7) ((Map.Entry) obj).getValue()).a <= j);
            case 4:
                wskVarH = ((osk) obj).h("SELECT * FROM entry WHERE timeStamp < ?");
                try {
                    wskVarH.T0(1, j);
                    int iF = hyg.f(wskVarH, "pageUrl");
                    int iF2 = hyg.f(wskVarH, "imageUrl");
                    int iF3 = hyg.f(wskVarH, "timeStamp");
                    int iF4 = hyg.f(wskVarH, "flags");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList.add(new x4l(wskVarH.l(iF), (int) wskVarH.getLong(iF4), wskVarH.isNull(iF2) ? null : wskVarH.l(iF2), wskVarH.getLong(iF3)));
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                ((wa1) obj).x(0, Long.valueOf(j));
                return Unit.a;
            case 6:
                ((lee) obj).d(r9a.b, Long.valueOf(j));
                return null;
            case 7:
                ix5 ix5Var = apc.b;
                wskVarH = ((osk) obj).h("SELECT * FROM followed_matches where oscoreId = ? AND sport = ? LIMIT 1");
                try {
                    wskVarH.T0(1, j);
                    wskVarH.T0(2, 0L);
                    int iF5 = hyg.f(wskVarH, "oscoreId");
                    int iF6 = hyg.f(wskVarH, "sport");
                    if (wskVarH.n()) {
                        long j2 = wskVarH.getLong(iF5);
                        int i2 = (int) wskVarH.getLong(iF6);
                        apc.b.getClass();
                        Iterator it = apc.f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((apc) next).a == i2) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        apc apcVar = (apc) next;
                        if (apcVar == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i2);
                        }
                        fh9Var = new fh9(j2, apcVar);
                    } else {
                        fh9Var = null;
                    }
                    return fh9Var;
                } finally {
                }
            case 8:
                wskVarH = ((osk) obj).h("SELECT * from football_events  WHERE oscoreId = ? LIMIT 1");
                try {
                    wskVarH.T0(1, j);
                    int iF7 = hyg.f(wskVarH, "oscoreId");
                    int iF8 = hyg.f(wskVarH, "source");
                    int iF9 = hyg.f(wskVarH, "homeTeamName");
                    int iF10 = hyg.f(wskVarH, "homeTeamLogoUrl");
                    int iF11 = hyg.f(wskVarH, "homeTeamScore");
                    int iF12 = hyg.f(wskVarH, "homeTeamScorePenalties");
                    int iF13 = hyg.f(wskVarH, "awayTeamName");
                    int iF14 = hyg.f(wskVarH, "awayTeamLogoUrl");
                    int iF15 = hyg.f(wskVarH, "awayTeamScore");
                    int iF16 = hyg.f(wskVarH, "awayTeamScorePenalties");
                    int iF17 = hyg.f(wskVarH, "eventStatus");
                    int iF18 = hyg.f(wskVarH, "statusDescription");
                    int iF19 = hyg.f(wskVarH, "finishType");
                    int iF20 = hyg.f(wskVarH, "startTimestamp");
                    int iF21 = hyg.f(wskVarH, "timeCurrent");
                    int iF22 = hyg.f(wskVarH, "timeFirstHalf");
                    int iF23 = hyg.f(wskVarH, "timeFirstHalfExtended");
                    int iF24 = hyg.f(wskVarH, "timeSecondHalf");
                    int iF25 = hyg.f(wskVarH, "timeSecondHalfExtended");
                    int iF26 = hyg.f(wskVarH, "timeFirstHalfExtra");
                    int iF27 = hyg.f(wskVarH, "timeFirstHalfExtraExtended");
                    int iF28 = hyg.f(wskVarH, "timeSecondHalfExtra");
                    int iF29 = hyg.f(wskVarH, "timeSecondHalfExtraExtended");
                    if (wskVarH.n()) {
                        long j3 = wskVarH.getLong(iF7);
                        int i3 = iF20;
                        int i4 = (int) wskVarH.getLong(iF8);
                        oi9.b.getClass();
                        Iterator it2 = oi9.h.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                i = i3;
                                if (((oi9) next2).a != i4) {
                                    i3 = i;
                                }
                            } else {
                                i = i3;
                                next2 = null;
                            }
                        }
                        oi9 oi9Var = (oi9) next2;
                        if (oi9Var == null) {
                            throw new IllegalArgumentException("Unknown event source: " + i4);
                        }
                        rucVar = new ruc(j3, oi9Var, wskVarH.l(iF9), wskVarH.l(iF10), (int) wskVarH.getLong(iF11), (int) wskVarH.getLong(iF12), wskVarH.l(iF13), wskVarH.l(iF14), (int) wskVarH.getLong(iF15), (int) wskVarH.getLong(iF16), wskVarH.l(iF17), wskVarH.isNull(iF18) ? null : wskVarH.l(iF18), wskVarH.isNull(iF19) ? null : wskVarH.l(iF19), wskVarH.getLong(i), wskVarH.isNull(iF21) ? null : Long.valueOf(wskVarH.getLong(iF21)), wskVarH.isNull(iF22) ? null : Long.valueOf(wskVarH.getLong(iF22)), wskVarH.isNull(iF23) ? null : Long.valueOf(wskVarH.getLong(iF23)), wskVarH.isNull(iF24) ? null : Long.valueOf(wskVarH.getLong(iF24)), wskVarH.isNull(iF25) ? null : Long.valueOf(wskVarH.getLong(iF25)), wskVarH.isNull(iF26) ? null : Long.valueOf(wskVarH.getLong(iF26)), wskVarH.isNull(iF27) ? null : Long.valueOf(wskVarH.getLong(iF27)), wskVarH.isNull(iF28) ? null : Long.valueOf(wskVarH.getLong(iF28)), wskVarH.isNull(iF29) ? null : Long.valueOf(wskVarH.getLong(iF29)));
                    } else {
                        rucVar = null;
                    }
                    return rucVar;
                } finally {
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                wskVarH = ((osk) obj).h("DELETE FROM football_events WHERE oscoreId = ?");
                try {
                    wskVarH.T0(1, j);
                    wskVarH.n();
                    return Unit.a;
                } finally {
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                wskVarH = ((osk) obj).h("SELECT * FROM football_audio_commentary WHERE oscoreId = ? LIMIT 1");
                try {
                    wskVarH.T0(1, j);
                    return wskVarH.n() ? new quc(wskVarH.getLong(hyg.f(wskVarH, "oscoreId")), wskVarH.l(hyg.f(wskVarH, ImagesContract.URL))) : null;
                } finally {
                }
            case 11:
                wskVarH = ((osk) obj).h("SELECT * FROM event_odds where eventOscoreId = ?");
                try {
                    wskVarH.T0(1, j);
                    int iF30 = hyg.f(wskVarH, "oddsId");
                    int iF31 = hyg.f(wskVarH, "oddsProvider");
                    int iF32 = hyg.f(wskVarH, "oddsType");
                    int iF33 = hyg.f(wskVarH, "eventOscoreId");
                    int iF34 = hyg.f(wskVarH, Constants.Params.NAME);
                    int iF35 = hyg.f(wskVarH, Constants.Params.VALUE);
                    int iF36 = hyg.f(wskVarH, "delta");
                    int iF37 = hyg.f(wskVarH, "jumpUrl");
                    int iF38 = hyg.f(wskVarH, "order");
                    ArrayList arrayList2 = new ArrayList();
                    while (wskVarH.n()) {
                        String strL2 = wskVarH.l(iF30);
                        String strL3 = wskVarH.isNull(iF31) ? fvdVar : wskVarH.l(iF31);
                        String strL4 = wskVarH.isNull(iF32) ? fvdVar : wskVarH.l(iF32);
                        long j4 = wskVarH.getLong(iF33);
                        String strL5 = wskVarH.l(iF34);
                        double d = wskVarH.getDouble(iF35);
                        int i5 = (int) wskVarH.getLong(iF36);
                        if (wskVarH.isNull(iF37)) {
                            strL = fvdVar;
                            str = strL;
                        } else {
                            str = fvdVar;
                            strL = wskVarH.l(iF37);
                        }
                        int i6 = iF33;
                        arrayList2.add(new vc8(strL2, strL3, strL4, j4, strL5, d, i5, strL, (int) wskVarH.getLong(iF38)));
                        iF33 = i6;
                        fvdVar = str;
                    }
                    return arrayList2;
                } finally {
                }
            case 12:
                wskVarH = ((osk) obj).h("DELETE FROM messages WHERE id = ?");
                try {
                    wskVarH.T0(1, j);
                    wskVarH.n();
                    return null;
                } finally {
                }
            case 13:
                wskVarH = ((osk) obj).h("SELECT * FROM messages WHERE id = ?");
                try {
                    wskVarH.T0(1, j);
                    int iF39 = hyg.f(wskVarH, "id");
                    int iF40 = hyg.f(wskVarH, "received");
                    int iF41 = hyg.f(wskVarH, "created_by");
                    int iF42 = hyg.f(wskVarH, "encrypted_metadata");
                    int iF43 = hyg.f(wskVarH, "encrypted_content");
                    int iF44 = hyg.f(wskVarH, "content_url");
                    int iF45 = hyg.f(wskVarH, "iv_metadata");
                    int iF46 = hyg.f(wskVarH, "iv");
                    int iF47 = hyg.f(wskVarH, "local_content");
                    if (wskVarH.n()) {
                        fvdVar = new fvd(wskVarH.getLong(iF39), wskVarH.getLong(iF40), wskVarH.l(iF41), wskVarH.l(iF42), wskVarH.l(iF43), wskVarH.isNull(iF44) ? null : wskVarH.l(iF44), wskVarH.l(iF45), wskVarH.l(iF46), wskVarH.isNull(iF47) ? null : wskVarH.l(iF47));
                    }
                    return fvdVar;
                } finally {
                }
            case 14:
                long[] jArr = {j};
                q60 q60Var = ((r60) obj).a;
                List list = (List) q60Var.n(1);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    q60Var.q(1, 1, arrayList3);
                    hf0Var = new hf0(q60Var, 1, arrayList3);
                } else {
                    hf0Var = new hf0(q60Var, 1, list);
                }
                hf0Var.addAll(new a82(jArr, (byte) 1));
                return Unit.a;
            case 15:
                long[] jArr2 = {j};
                q60 q60Var2 = ((r60) obj).a;
                List list2 = (List) q60Var2.n(2);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    q60Var2.q(2, 1, arrayList4);
                    hf0Var2 = new hf0(q60Var2, 2, arrayList4);
                } else {
                    hf0Var2 = new hf0(q60Var2, 2, list2);
                }
                hf0Var2.addAll(new a82(jArr2, (byte) 1));
                return Unit.a;
            case 16:
                long[] jArr3 = {j};
                q60 q60Var3 = ((r60) obj).a;
                List list3 = (List) q60Var3.n(0);
                if (list3 == null || list3.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    q60Var3.q(0, 1, arrayList5);
                    hf0Var3 = new hf0(q60Var3, 0, arrayList5);
                } else {
                    hf0Var3 = new hf0(q60Var3, 0, list3);
                }
                hf0Var3.addAll(new a82(jArr3, (byte) 1));
                return Unit.a;
            case 17:
                mk7.z0((mk7) obj, this.b, 0L, 0.0f, 126);
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                String strValueOf = String.valueOf(j);
                t56 t56Var = ((yj0) obj).b;
                Map map = (Map) t56Var.n(20);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    t56Var.q(20, 1, map2);
                    if0Var = new if0(t56Var, 20, map2);
                } else {
                    if0Var = new if0(t56Var, 20, map);
                }
                if0Var.put(strValueOf, 1L);
                return Unit.a;
            case 19:
                ((wa1) obj).x(0, Long.valueOf(j));
                return Unit.a;
            default:
                wskVarH = ((osk) obj).h("DELETE FROM activity WHERE lastAccess < ?");
                try {
                    wskVarH.T0(1, j);
                    wskVarH.n();
                    wskVarH.close();
                    return Unit.a;
                } finally {
                }
        }
    }
}
