package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.ViewStub;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class t02 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ t02(u02 u02Var, bqb bqbVar, byte b) {
        this.a = b;
        this.b = bqbVar;
    }

    public final Object invoke(Object obj) {
        oja ojaVar;
        Object wjaVar;
        tw7 rw7Var;
        tw7 rw7Var2;
        Object s32Var;
        byte b = this.a;
        j02 j02Var = j02.a;
        h02 h02Var = h02.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gka gkaVar = (gka) obj2;
                k02 k02Var = (k02) obj;
                if (k02Var instanceof i02) {
                    ojaVar = new oja(((i02) k02Var).a, (byte) 0);
                } else if (Intrinsics.a(k02Var, h02Var)) {
                    ojaVar = new oja(pja.NOTSIGNEDIN, (byte) 1);
                } else {
                    if (!Intrinsics.a(k02Var, j02Var)) {
                        h9o.p();
                        return null;
                    }
                    ojaVar = new oja(pja.UNKNOWN, (byte) 1);
                }
                gkaVar.n(new sw7(ojaVar));
                return Unit.a;
            case 1:
                gka gkaVar2 = (gka) obj2;
                k02 k02Var2 = (k02) obj;
                if (k02Var2 instanceof i02) {
                    wjaVar = new yja();
                } else if (Intrinsics.a(k02Var2, h02Var)) {
                    wjaVar = new wja(xja.NOTSIGNEDIN);
                } else {
                    if (!Intrinsics.a(k02Var2, j02Var)) {
                        h9o.p();
                        return null;
                    }
                    wjaVar = new wja(xja.UNKNOWN);
                }
                gkaVar2.n(new sw7(wjaVar));
                return Unit.a;
            case 2:
                gka gkaVar3 = (gka) obj2;
                tw7 tw7Var = (tw7) obj;
                if (tw7Var instanceof rw7) {
                    rw7Var = new rw7((Throwable) ((rw7) tw7Var).a);
                } else {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    try {
                        sfb sfbVar = (sfb) ((sw7) tw7Var).a;
                        rw7Var = new sw7(sfbVar != null ? new aka(sfbVar) : null);
                    } catch (Exception e) {
                        rw7Var = new rw7(e);
                    }
                }
                u02.I(rw7Var, gkaVar3);
                return Unit.a;
            case 3:
                fka fkaVar = (fka) obj2;
                tw7 tw7Var2 = (tw7) obj;
                if (tw7Var2 instanceof rw7) {
                    rw7Var2 = new rw7((Throwable) ((rw7) tw7Var2).a);
                } else {
                    if (!(tw7Var2 instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    try {
                        tfb tfbVar = (tfb) ((sw7) tw7Var2).a;
                        rw7Var2 = new sw7(tfbVar != null ? new bka(tfbVar) : null);
                    } catch (Exception e2) {
                        rw7Var2 = new rw7(e2);
                    }
                }
                u02.I(rw7Var2, fkaVar);
                return Unit.a;
            case 4:
                fka fkaVar2 = (fka) obj2;
                vke vkeVar = (vke) obj;
                if (vkeVar == null) {
                    fkaVar2.n(new sw7(null));
                } else {
                    String str = vkeVar.a;
                    ehc ehcVarB = a.b();
                    if (vkeVar.c) {
                        ehcVarB.add(zha.FALSE);
                    }
                    if (vkeVar.b) {
                        ehcVarB.add(zha.HARMFUL);
                    }
                    if (vkeVar.d) {
                        ehcVarB.add(zha.NOT_HELPFUL);
                    }
                    fkaVar2.n(new sw7(new yha(str, a.a(ehcVarB))));
                }
                return Unit.a;
            case 5:
                ((lx1) obj2).invoke((List) obj);
                return Unit.a;
            case 6:
                ((ig) obj2).run();
                return Unit.a;
            case 7:
                ws1 ws1Var = (ws1) obj2;
                orb orbVar = (orb) obj;
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    ws1Var.n(new rw7(new cqb(orbVarC.a.getInt("code"), orbVarC.e(Constants.Params.MESSAGE))));
                } else {
                    ws1Var.n(new sw7(Long.valueOf(orbVar.c("result").a.getLong("id"))));
                }
                return Unit.a;
            case 8:
                p62 p62Var = (p62) ((bi) obj2).b;
                orb orbVar2 = (orb) obj;
                if (orbVar2.a.has("error")) {
                    orb orbVarC2 = orbVar2.c("error");
                    orbVarC2.a.getInt("code");
                    orbVarC2.e(Constants.Params.MESSAGE);
                    p62Var.c.a.clear();
                    p62Var.b.m();
                } else {
                    p62Var.c.a.clear();
                    p62Var.b.m();
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                bi biVar = (bi) obj2;
                orb orbVar3 = (orb) obj;
                if (orbVar3.a.has("error")) {
                    orb orbVarC3 = orbVar3.c("error");
                    biVar.n(new rw7(new cqb(orbVarC3.a.getInt("code"), orbVarC3.e(Constants.Params.MESSAGE))));
                } else {
                    orb orbVarC4 = orbVar3.c("result");
                    JSONObject jSONObject = orbVarC4.a;
                    if (jSONObject.has("error")) {
                        orbVarC4.e("error");
                        s32Var = new r32();
                    } else {
                        s32Var = jSONObject.has("success") ? new s32(jSONObject.getBoolean("success")) : new u32();
                    }
                    biVar.n(new sw7(s32Var));
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                bi biVar2 = (bi) obj2;
                orb orbVar4 = (orb) obj;
                if (orbVar4.a.has("error")) {
                    orb orbVarC5 = orbVar4.c("error");
                    biVar2.n(new rw7(new cqb(orbVarC5.a.getInt("code"), orbVarC5.e(Constants.Params.MESSAGE))));
                } else {
                    biVar2.n(new sw7(Unit.a));
                }
                return Unit.a;
            case 11:
                ob2 ob2Var = ((ub2) obj2).d;
                kfo.Y(ob2Var.a, false, true, new q3(ob2Var, (s0o) obj, (byte) 26));
                return Unit.a;
            case 12:
                ((cg2) obj2).j = null;
                return Unit.a;
            case 13:
                z8b z8bVar = (z8b) obj2;
                pg pgVar = (pg) obj;
                if (!Intrinsics.a(pgVar, ng.a)) {
                    if (!Intrinsics.a(pgVar, og.a)) {
                        h9o.p();
                        return null;
                    }
                    z8bVar.F();
                }
                return Unit.a;
            case 14:
                oc2 oc2Var = (oc2) obj2;
                if (((pkj) obj) == pkj.a) {
                    oc2Var.invoke();
                }
                return Unit.a;
            case 15:
                ((l6g) obj2).run();
                return Unit.a;
            case 16:
                AutofillPasswordPickerActivity autofillPasswordPickerActivity = (AutofillPasswordPickerActivity) obj2;
                x5g.b((x5g) ((mi) ((xbf) autofillPasswordPickerActivity.l.a).b).r.get(), new tt2(((Integer) obj).intValue(), autofillPasswordPickerActivity, (byte) 0));
                return Unit.a;
            case 17:
                lu2 lu2Var = (lu2) obj2;
                if (((pkj) obj) == pkj.a) {
                    Intent intent = new Intent("android.settings.LOCK_SCREEN_SETTINGS");
                    if (qvf.b(65536, intent) == null) {
                        intent = new Intent("android.settings.SETTINGS");
                    }
                    intent.setFlags(268435456);
                    try {
                        lu2Var.requireContext().startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                l03 l03Var = (l03) obj;
                l03Var.a.c(new wx(obj2, (Object) l03Var, (byte) 14));
                return Unit.a;
            case 19:
                b33 b33Var = (b33) obj2;
                wa1 wa1Var = (wa1) obj;
                wa1Var.w(0, b33Var.a);
                wa1Var.w(1, b33Var.b);
                wa1Var.w(2, b33Var.c);
                wa1Var.w(3, b33Var.d);
                wa1Var.w(4, b33Var.e);
                wa1Var.w(5, b33Var.f);
                wa1Var.w(6, b33Var.g);
                wa1Var.w(7, b33Var.h);
                wa1Var.w(8, b33Var.i);
                wa1Var.w(9, b33Var.j);
                wa1Var.w(10, b33Var.k);
                wa1Var.w(11, b33Var.l);
                wa1Var.w(12, b33Var.m);
                wa1Var.x(13, Long.valueOf(b33Var.n));
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                or2 or2Var = ((y53) obj2).c;
                return zBooleanValue ? (ViewStub) ((ei) or2Var.e).d : (ViewStub) ((ei) or2Var.e).c;
            case 21:
                ((ta1) obj2).e.add((String) obj);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                ((LinkedHashSet) obj2).add((String) obj);
                return Unit.a;
            case 23:
                return new ci((fb3) obj2, (byte) 4);
            case SizeUtil.textSize2 /* 24 */:
                return new ci((ztl) obj2, (byte) 5);
            case 25:
                mi3 mi3Var = (mi3) obj2;
                wsk wskVarH = ((osk) obj).h("SELECT * FROM active_block_lists");
                try {
                    int iF = hyg.f(wskVarH, Constants.Params.NAME);
                    int iF2 = hyg.f(wskVarH, "kind");
                    int iF3 = hyg.f(wskVarH, "checksum");
                    int iF4 = hyg.f(wskVarH, "addedTimestampMillis");
                    int iF5 = hyg.f(wskVarH, "ttlMillis");
                    int iF6 = hyg.f(wskVarH, "version");
                    int iF7 = hyg.f(wskVarH, "active");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        String strL = wskVarH.l(iF);
                        String strL2 = wskVarH.l(iF2);
                        mi3Var.getClass();
                        arrayList.add(new dj3(strL, mi3.b(strL2), wskVarH.l(iF3), wskVarH.getLong(iF4), wskVarH.getLong(iF5), (int) wskVarH.getLong(iF6), ((int) wskVarH.getLong(iF7)) != 0));
                    }
                    return arrayList;
                } finally {
                    wskVarH.close();
                }
            case 26:
                ((oi3) obj2).r((Set) obj);
                return Unit.a;
            case 27:
                pi3 pi3Var = (pi3) obj2;
                Set set = (Set) obj;
                if (set != null) {
                    on7 on7Var = pn7.b;
                    pi3Var.b.getClass();
                    pi3Var.a(false, cs5.y0(System.currentTimeMillis(), un7.d), set);
                }
                return Unit.a;
            case 28:
                LinkedHashSet<File> linkedHashSet = ((m9d) obj2).d;
                if (!linkedHashSet.isEmpty()) {
                    for (File file : linkedHashSet) {
                        try {
                            p0i p0iVar = t0i.b;
                            file.delete();
                        } catch (Throwable unused2) {
                            p0i p0iVar2 = t0i.b;
                        }
                    }
                }
                return Unit.a;
            default:
                ((wx) obj2).run((t0i) obj);
                return Unit.a;
        }
    }
}
