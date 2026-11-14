package defpackage;

import android.net.Uri;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class g8c implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ g8c(byte b) {
        this.a = b;
    }

    public /* synthetic */ g8c(vrc vrcVar) {
        this.a = (byte) 23;
    }

    public final Object invoke(Object obj) throws Exception {
        wsk wskVarH;
        int i;
        Object next;
        Object next2;
        o7f o7fVar;
        Object next3;
        Object next4;
        Object next5;
        switch (this.a) {
            case 0:
                t41 t41Var = (t41) obj;
                return m8c.a.j(t41Var.a(0), t41Var.a(1), t41Var.a(2), t41Var.a(3));
            case 1:
                t41 t41Var2 = (t41) obj;
                return o8c.a.m(t41Var2.a(0), t41Var2.a(1), t41Var2.a(2), t41Var2.b(3), t41Var2.b(4));
            case 2:
                Function1 function1 = (Function1) obj;
                function1.invoke("leaderboard");
                function1.invoke("leaderboard_requirements");
                function1.invoke("leaderboard_tiers");
                return Unit.a;
            case 3:
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                wskVarH = ((osk) obj).h("SELECT * from football_events ORDER BY `startTimestamp` ASC");
                try {
                    int iF = hyg.f(wskVarH, "oscoreId");
                    int iF2 = hyg.f(wskVarH, "source");
                    int iF3 = hyg.f(wskVarH, "homeTeamName");
                    int iF4 = hyg.f(wskVarH, "homeTeamLogoUrl");
                    int iF5 = hyg.f(wskVarH, "homeTeamScore");
                    int iF6 = hyg.f(wskVarH, "homeTeamScorePenalties");
                    int iF7 = hyg.f(wskVarH, "awayTeamName");
                    int iF8 = hyg.f(wskVarH, "awayTeamLogoUrl");
                    int iF9 = hyg.f(wskVarH, "awayTeamScore");
                    int iF10 = hyg.f(wskVarH, "awayTeamScorePenalties");
                    int iF11 = hyg.f(wskVarH, "eventStatus");
                    int iF12 = hyg.f(wskVarH, "statusDescription");
                    int iF13 = hyg.f(wskVarH, "finishType");
                    int iF14 = hyg.f(wskVarH, "startTimestamp");
                    int iF15 = hyg.f(wskVarH, "timeCurrent");
                    int iF16 = hyg.f(wskVarH, "timeFirstHalf");
                    int iF17 = hyg.f(wskVarH, "timeFirstHalfExtended");
                    int iF18 = hyg.f(wskVarH, "timeSecondHalf");
                    int iF19 = hyg.f(wskVarH, "timeSecondHalfExtended");
                    int iF20 = hyg.f(wskVarH, "timeFirstHalfExtra");
                    int iF21 = hyg.f(wskVarH, "timeFirstHalfExtraExtended");
                    int iF22 = hyg.f(wskVarH, "timeSecondHalfExtra");
                    int iF23 = hyg.f(wskVarH, "timeSecondHalfExtraExtended");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        long j = wskVarH.getLong(iF);
                        int i2 = iF13;
                        int i3 = iF14;
                        int i4 = (int) wskVarH.getLong(iF2);
                        oi9.b.getClass();
                        Iterator it = oi9.h.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                i = iF;
                                if (((oi9) next).a != i4) {
                                    iF = i;
                                }
                            } else {
                                i = iF;
                                next = null;
                            }
                        }
                        oi9 oi9Var = (oi9) next;
                        if (oi9Var == null) {
                            throw new IllegalArgumentException("Unknown event source: " + i4);
                        }
                        String strL = wskVarH.l(iF3);
                        String strL2 = wskVarH.l(iF4);
                        int i5 = (int) wskVarH.getLong(iF5);
                        int i6 = (int) wskVarH.getLong(iF6);
                        String strL3 = wskVarH.l(iF7);
                        String strL4 = wskVarH.l(iF8);
                        int i7 = iF2;
                        int i8 = iF3;
                        int i9 = (int) wskVarH.getLong(iF9);
                        int i10 = (int) wskVarH.getLong(iF10);
                        String strL5 = wskVarH.l(iF11);
                        String strL6 = wskVarH.isNull(iF12) ? null : wskVarH.l(iF12);
                        String strL7 = wskVarH.isNull(i2) ? null : wskVarH.l(i2);
                        long j2 = wskVarH.getLong(i3);
                        int i11 = iF15;
                        Long lValueOf = wskVarH.isNull(i11) ? null : Long.valueOf(wskVarH.getLong(i11));
                        iF15 = i11;
                        int i12 = iF16;
                        Long lValueOf2 = wskVarH.isNull(i12) ? null : Long.valueOf(wskVarH.getLong(i12));
                        iF16 = i12;
                        int i13 = iF17;
                        Long lValueOf3 = wskVarH.isNull(i13) ? null : Long.valueOf(wskVarH.getLong(i13));
                        iF17 = i13;
                        int i14 = iF18;
                        Long lValueOf4 = wskVarH.isNull(i14) ? null : Long.valueOf(wskVarH.getLong(i14));
                        iF18 = i14;
                        int i15 = iF19;
                        Long lValueOf5 = wskVarH.isNull(i15) ? null : Long.valueOf(wskVarH.getLong(i15));
                        iF19 = i15;
                        int i16 = iF20;
                        Long lValueOf6 = wskVarH.isNull(i16) ? null : Long.valueOf(wskVarH.getLong(i16));
                        iF20 = i16;
                        int i17 = iF21;
                        Long lValueOf7 = wskVarH.isNull(i17) ? null : Long.valueOf(wskVarH.getLong(i17));
                        iF21 = i17;
                        int i18 = iF22;
                        Long lValueOf8 = wskVarH.isNull(i18) ? null : Long.valueOf(wskVarH.getLong(i18));
                        iF22 = i18;
                        int i19 = iF23;
                        arrayList.add(new ruc(j, oi9Var, strL, strL2, i5, i6, strL3, strL4, i9, i10, strL5, strL6, strL7, j2, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, wskVarH.isNull(i19) ? null : Long.valueOf(wskVarH.getLong(i19))));
                        iF23 = i19;
                        iF13 = i2;
                        iF2 = i7;
                        iF14 = i3;
                        iF = i;
                        iF3 = i8;
                    }
                    return arrayList;
                } finally {
                }
            case 13:
                wskVarH = ((osk) obj).h("SELECT * FROM notifications");
                try {
                    int iF24 = hyg.f(wskVarH, "oscoreId");
                    int iF25 = hyg.f(wskVarH, "sport");
                    int iF26 = hyg.f(wskVarH, "ttlEndTimestamp");
                    int iF27 = hyg.f(wskVarH, "subscribed");
                    ArrayList arrayList2 = new ArrayList();
                    while (wskVarH.n()) {
                        long j3 = wskVarH.getLong(iF24);
                        int i20 = (int) wskVarH.getLong(iF25);
                        apc.b.getClass();
                        Iterator it2 = apc.f.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((apc) next2).a == i20) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        apc apcVar = (apc) next2;
                        if (apcVar == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i20);
                        }
                        arrayList2.add(new r0f(j3, apcVar, wskVarH.getLong(iF26), ((int) wskVarH.getLong(iF27)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 14:
                try {
                    ((osk) obj).h("DELETE FROM event_odds").n();
                    return Unit.a;
                } finally {
                }
            case 15:
                try {
                    ((osk) obj).h("DELETE FROM football_audio_commentary").n();
                    return Unit.a;
                } finally {
                }
            case 16:
                wskVarH = ((osk) obj).h("SELECT * FROM odds_provider_config LIMIT 1");
                try {
                    int iF28 = hyg.f(wskVarH, "id");
                    int iF29 = hyg.f(wskVarH, Constants.Params.NAME);
                    int iF30 = hyg.f(wskVarH, "normalIcon");
                    int iF31 = hyg.f(wskVarH, "lightIcon");
                    int iF32 = hyg.f(wskVarH, "smallIcon");
                    int iF33 = hyg.f(wskVarH, "logoClickUrl");
                    if (wskVarH.n()) {
                        o7fVar = new o7f(wskVarH.l(iF28), wskVarH.isNull(iF29) ? null : wskVarH.l(iF29), wskVarH.isNull(iF30) ? null : wskVarH.l(iF30), wskVarH.isNull(iF31) ? null : wskVarH.l(iF31), wskVarH.isNull(iF32) ? null : wskVarH.l(iF32), wskVarH.isNull(iF33) ? null : wskVarH.l(iF33));
                    } else {
                        o7fVar = null;
                    }
                    return o7fVar;
                } finally {
                }
            case 17:
                try {
                    ((osk) obj).h("DELETE FROM odds_provider_config").n();
                    return Unit.a;
                } finally {
                }
            case SizeUtil.textSize0_1 /* 18 */:
                wskVarH = ((osk) obj).h("SELECT * FROM followed_matches");
                try {
                    int iF34 = hyg.f(wskVarH, "oscoreId");
                    int iF35 = hyg.f(wskVarH, "sport");
                    ArrayList arrayList3 = new ArrayList();
                    while (wskVarH.n()) {
                        long j4 = wskVarH.getLong(iF34);
                        int i21 = (int) wskVarH.getLong(iF35);
                        apc.b.getClass();
                        Iterator it3 = apc.f.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next3 = it3.next();
                                if (((apc) next3).a == i21) {
                                }
                            } else {
                                next3 = null;
                            }
                        }
                        apc apcVar2 = (apc) next3;
                        if (apcVar2 == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i21);
                        }
                        arrayList3.add(new fh9(j4, apcVar2));
                    }
                    return arrayList3;
                } finally {
                }
            case 19:
                wskVarH = ((osk) obj).h("SELECT * FROM followed_teams");
                try {
                    int iF36 = hyg.f(wskVarH, "oscoreId");
                    int iF37 = hyg.f(wskVarH, "sport");
                    ArrayList arrayList4 = new ArrayList();
                    while (wskVarH.n()) {
                        long j5 = wskVarH.getLong(iF36);
                        int i22 = (int) wskVarH.getLong(iF37);
                        apc.b.getClass();
                        Iterator it4 = apc.f.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next4 = it4.next();
                                if (((apc) next4).a == i22) {
                                }
                            } else {
                                next4 = null;
                            }
                        }
                        apc apcVar3 = (apc) next4;
                        if (apcVar3 == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i22);
                        }
                        arrayList4.add(new gh9(j5, apcVar3));
                    }
                    return arrayList4;
                } finally {
                }
            case SizeUtil.textSize0 /* 20 */:
                wskVarH = ((osk) obj).h("SELECT * FROM followed_tournaments");
                try {
                    int iF38 = hyg.f(wskVarH, "oscoreId");
                    int iF39 = hyg.f(wskVarH, "sport");
                    ArrayList arrayList5 = new ArrayList();
                    while (wskVarH.n()) {
                        long j6 = wskVarH.getLong(iF38);
                        int i23 = (int) wskVarH.getLong(iF39);
                        apc.b.getClass();
                        Iterator it5 = apc.f.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next5 = it5.next();
                                if (((apc) next5).a == i23) {
                                }
                            } else {
                                next5 = null;
                            }
                        }
                        apc apcVar4 = (apc) next5;
                        if (apcVar4 == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i23);
                        }
                        arrayList5.add(new hh9(j6, apcVar4));
                    }
                    return arrayList5;
                } finally {
                }
            case 21:
                return Long.valueOf(((zmc) obj).a().e.a);
            case SizeUtil.textSize1 /* 22 */:
                return Long.valueOf(((zmc) obj).a().a);
            case 23:
                List listY = StringsKt.Y((String) obj, new String[]{"#"}, 0, 6);
                Uri.Builder builderEncodedPath = Uri.parse("opera-livescore://ui/").buildUpon().encodedPath((String) CollectionsKt.K(listY));
                if (listY.size() > 1) {
                    builderEncodedPath.encodedFragment((String) listY.get(1));
                }
                return builderEncodedPath.build();
            case SizeUtil.textSize2 /* 24 */:
                return Boolean.valueOf(((SettingsManager) obj).i("ga_usage_statistics"));
            case 25:
                return Boolean.valueOf(((SettingsManager) obj).i("live_scores_accessed_onboarding"));
            case 26:
                f03.i((mh6) obj, 't');
                return Unit.a;
            case 27:
                f03.i((mh6) obj, 'T');
                return Unit.a;
            case 28:
                return Unit.a;
            default:
                nh6 nh6Var = (nh6) obj;
                f03.i(nh6Var, ':');
                nh6.i(nh6Var);
                f03.Q(nh6Var, new uvc((byte) 0));
                return Unit.a;
        }
    }
}
