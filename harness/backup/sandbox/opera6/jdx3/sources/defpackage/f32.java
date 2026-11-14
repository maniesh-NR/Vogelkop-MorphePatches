package defpackage;

import androidx.fragment.app.i;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f32 implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ f32(byte b) {
        this.a = b;
    }

    public /* synthetic */ f32(Object obj, byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) throws Exception {
        mt5 mt5Var = null;
        int i = 3;
        byte b = 0;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                orb orbVar = (orb) obj;
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    orbVarC.a.getInt("code");
                    orbVarC.e(Constants.Params.MESSAGE);
                } else {
                    orb orbVarI = orbVar.i("result");
                    if (orbVarI != null) {
                        orb orbVarC2 = orbVarI.c("error");
                        long j = orbVarC2.a.getLong("code");
                        String strE = orbVarC2.e(Constants.Params.MESSAGE);
                        z17[] z17VarArrValues = z17.values();
                        int length = z17VarArrValues.length;
                        while (true) {
                            if (b >= length) {
                                z17 z17Var = z17.UNDEFINED;
                            } else {
                                z17 z17Var2 = z17VarArrValues[b];
                                if (z17Var2 == z17.UNDEFINED || j != z17Var2.a || !strE.equals(z17Var2.b)) {
                                    b++;
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            case 2:
                orb orbVar2 = (orb) obj;
                if (orbVar2.a.has("error")) {
                    orb orbVarC3 = orbVar2.c("error");
                    orbVarC3.a.getInt("code");
                    orbVarC3.e(Constants.Params.MESSAGE);
                } else {
                    orb orbVarI2 = orbVar2.i("result");
                    if (orbVarI2 != null) {
                        orb orbVarC4 = orbVarI2.c("error");
                        long j2 = orbVarC4.a.getLong("code");
                        String strE2 = orbVarC4.e(Constants.Params.MESSAGE);
                        okk[] okkVarArrValues = okk.values();
                        int length2 = okkVarArrValues.length;
                        while (true) {
                            if (i2 >= length2) {
                                okk okkVar = okk.UNDEFINED;
                            } else {
                                okk okkVar2 = okkVarArrValues[i2];
                                if (okkVar2 == okk.UNDEFINED || j2 != okkVar2.a || !strE2.equals(okkVar2.b)) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            case 3:
                return Boolean.valueOf(((SettingsManager) obj).i("ga_usage_statistics"));
            case 4:
                return Boolean.valueOf(((SettingsManager) obj).i("ga_usage_statistics"));
            case 5:
                return Integer.valueOf(((CharSequence) obj).length());
            case 6:
                aqb aqbVar = (aqb) obj;
                aqbVar.c = true;
                aqbVar.n = false;
                return Unit.a;
            case 7:
                n6j n6jVar = (n6j) obj;
                lc2[] lc2VarArr = lc2.a;
                n6j.c(n6jVar, 1, 2132017424, 2131364286, 0, null, 56);
                n6j.c(n6jVar, 4, 2132021059, 2131364264, 0, Collections.singletonList(2132017629), 24);
                n6j.c(n6jVar, 6, 2132019494, 2131364305, 0, null, 56);
                n6j.c(n6jVar, 7, 2132017392, 2131364257, 0, null, 56);
                n6j.c(n6jVar, 9, 2132021212, 2131364289, 0, null, 56);
                n6j.c(n6jVar, 11, 2132017621, 2131362063, 0, Collections.singletonList(2132017192), 24);
                return Unit.a;
            case 8:
                return (nd2) obj;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Class cls = (Class) obj;
                return new cjm(2131363371, ryl.class.isAssignableFrom(cls) ? false : i.class.isAssignableFrom(cls));
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                d13 d13Var = (d13) obj;
                d13Var.getClass();
                c26.y(d13Var);
                return Unit.a;
            case 11:
                ((d13) obj).V0();
                return Unit.a;
            case 12:
                ((Function1) obj).invoke("banners");
                return Unit.a;
            case 13:
                ((Function1) obj).invoke("banners");
                return Unit.a;
            case 14:
                e33 e33Var = e33.a;
                t41 t41Var = (t41) obj;
                return new b33(t41Var.b(0), t41Var.b(1), t41Var.b(2), t41Var.b(3), t41Var.b(4), t41Var.b(5), t41Var.b(6), t41Var.b(7), t41Var.b(8), t41Var.b(9), t41Var.b(10), t41Var.b(11), t41Var.b(12), t41Var.a(13).longValue());
            case 15:
                ((aqb) obj).b = false;
                return Unit.a;
            case 16:
                i8e i8eVar = (i8e) obj;
                q92 q92Var = new q92((byte) 2);
                rhk rhkVar = c37.d;
                qc3 qc3Var = new qc3(uqh.a(nx5.class), (rhk) null, q92Var, xwb.a, l08.a);
                tlj tljVarM = j7c.m(qc3Var, i8eVar);
                s15 s15VarA = uqh.a(nx5.class);
                qc3Var.a(s15VarA);
                i8eVar.b(j7c.p(new StringBuilder(jtb.a(s15VarA)), ':', "", ':', rhkVar), tljVarM);
                return Unit.a;
            case 17:
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                return jtb.a((itb) obj);
            case 19:
                wsk wskVarH = ((osk) obj).h("SELECT name, checksum FROM active_block_lists GROUP BY checksum");
                try {
                    int iF = hyg.f(wskVarH, "checksum");
                    int iF2 = hyg.f(wskVarH, Constants.Params.NAME);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (wskVarH.n()) {
                        String strL = wskVarH.l(iF);
                        if (wskVarH.isNull(iF2)) {
                            throw new IllegalStateException("The column(s) of the map value object of type '[@MapColumn(\"name\")] String' are NULL but the map's value type argument expect it to be NON-NULL");
                        }
                        String strL2 = wskVarH.l(iF2);
                        if (!linkedHashMap.containsKey(new c8a(strL))) {
                            linkedHashMap.put(new c8a(strL), strL2);
                        }
                    }
                    return linkedHashMap;
                } finally {
                }
            case SizeUtil.textSize0 /* 20 */:
                wsk wskVarH2 = ((osk) obj).h("SELECT * FROM active_block_lists");
                try {
                    int iF3 = hyg.f(wskVarH2, Constants.Params.NAME);
                    int iF4 = hyg.f(wskVarH2, "kind");
                    int iF5 = hyg.f(wskVarH2, "checksum");
                    int iF6 = hyg.f(wskVarH2, "addedTimestampMillis");
                    int iF7 = hyg.f(wskVarH2, "ttlMillis");
                    int iF8 = hyg.f(wskVarH2, "version");
                    int iF9 = hyg.f(wskVarH2, "active");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH2.n()) {
                        arrayList.add(new dj3(wskVarH2.l(iF3), mi3.b(wskVarH2.l(iF4)), wskVarH2.l(iF5), wskVarH2.getLong(iF6), wskVarH2.getLong(iF7), (int) wskVarH2.getLong(iF8), ((int) wskVarH2.getLong(iF9)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 21:
                f32 f32Var = new f32((byte) 22);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(f32Var.invoke(it.next()));
                }
                return linkedHashSet;
            case SizeUtil.textSize1 /* 22 */:
                dj3 dj3Var = (dj3) obj;
                return new yj3(dj3Var.g, new xj3(new wj3(dj3Var.b, dj3Var.c), dj3Var.a));
            case 23:
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                ui3 ui3Var = (ui3) obj;
                if (ui3Var != null) {
                    return ui3Var.a;
                }
                return null;
            case 25:
                return new t0i(new q0i((IOException) obj));
            case 26:
                k45 k45Var = (k45) obj;
                k45Var.a(n9a.b, new uk3(i, mt5Var, b));
                k45Var.a(qs7.b, new xf(2, null, (byte) 3));
                return Unit.a;
            case 27:
                ((o3c) obj).a();
                return Unit.a;
            case 28:
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
