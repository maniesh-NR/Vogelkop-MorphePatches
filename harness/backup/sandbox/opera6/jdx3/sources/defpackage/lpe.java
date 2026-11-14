package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lpe {
    public final ls4 A;
    public final ks3 B;
    public final jdj a;
    public final cq5 b;
    public final cq5 c;
    public final jdj d;
    public final jdj e;
    public final jdj f;
    public final jdj g;
    public final jdj h;
    public final jdj i;
    public final jdj j;
    public final cq5 k;
    public final jdj l;
    public final jdj m;
    public final jdj n;
    public final plh o;
    public final plh p;
    public final plh q;
    public final plh r;
    public final plh s;
    public final plh t;
    public final plh u;
    public final plh v;
    public final plh w;
    public final plh x;
    public final jdj y;
    public final Map z;

    public lpe(Context context, wjh wjhVar, mpe mpeVar, j4c j4cVar, br6 br6Var, jv1 jv1Var) {
        r16 r16Var = ngh.a;
        a64 a64VarB = sgb.b(zch.a());
        jdj jdjVarQ = qii.q();
        this.a = jdjVarQ;
        this.b = new cq5(new c8f("suggestedLanguage", wjhVar, a64VarB, (byte) 2), new zbe((byte) 4));
        this.c = new cq5(new c8f("ofa_features_2", wjhVar, a64VarB, (byte) 0), new zbe((byte) 5));
        jdj jdjVarQ2 = qii.q();
        this.d = jdjVarQ2;
        jdj jdjVarQ3 = qii.q();
        this.e = jdjVarQ3;
        jdj jdjVarQ4 = qii.q();
        this.f = jdjVarQ4;
        jdj jdjVarQ5 = qii.q();
        this.g = jdjVarQ5;
        jdj jdjVarQ6 = qii.q();
        this.h = jdjVarQ6;
        jdj jdjVarQ7 = qii.q();
        this.i = jdjVarQ7;
        jdj jdjVarQ8 = qii.q();
        this.j = jdjVarQ8;
        byte b = 6;
        this.k = new cq5(new c8f("onboarding_settings", wjhVar, a64VarB, (byte) 1), new zbe(b));
        jdj jdjVarQ9 = qii.q();
        this.l = jdjVarQ9;
        jdj jdjVarQ10 = qii.q();
        this.m = jdjVarQ10;
        jdj jdjVarC = ipe.c(1, 0, (h04) null, 6);
        this.n = jdjVarC;
        this.o = a26.i(jdjVarQ);
        this.p = a26.i(jdjVarQ2);
        this.q = a26.i(jdjVarQ3);
        this.r = a26.i(jdjVarQ4);
        this.s = a26.i(jdjVarQ5);
        this.t = a26.i(jdjVarQ6);
        this.u = a26.i(jdjVarQ7);
        this.v = a26.i(jdjVarQ8);
        this.w = a26.i(jdjVarQ9);
        this.x = a26.i(jdjVarQ10);
        this.y = jdjVarC;
        this.z = rbd.c(new Pair[]{new Pair(cs4.b, new s2e(1, this, lpe.class, "updateDomainData", "updateDomainData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12)), new Pair(cs4.c, new s2e(1, this, lpe.class, "updateSuggestedLanguages", "updateSuggestedLanguages(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 13)), new Pair(cs4.d, new s2e(1, this, lpe.class, "updateOfaFeatures2", "updateOfaFeatures2(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 14)), new Pair(cs4.f, new s2e(1, this, lpe.class, "updateDomainVisits", "updateDomainVisits(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 15)), new Pair(cs4.g, new s2e(1, this, lpe.class, "updateProductSuggestionSettings", "updateProductSuggestionSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 16)), new Pair(cs4.h, new s2e(1, this, lpe.class, "updateWeatherSettings", "updateWeatherSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 17)), new Pair(cs4.i, new s2e(1, this, lpe.class, "updateGoogleSettings", "updateGoogleSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 18)), new Pair(cs4.j, new s2e(1, this, lpe.class, "updateSecuritySettings", "updateSecuritySettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 19)), new Pair(cs4.k, new s2e(1, this, lpe.class, "updateLivescoreSettings", "updateLivescoreSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 20)), new Pair(cs4.l, new s2e(1, this, lpe.class, "updateOnboardingSettings", "updateOnboardingSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 8)), new Pair(cs4.m, new s2e(1, this, lpe.class, "updateEsimSettings", "updateEsimSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 9)), new Pair(cs4.n, new s2e(1, this, lpe.class, "updateSearchEngines", "updateSearchEngines(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 10)), new Pair(cs4.o, new s2e(1, this, lpe.class, "updateFeatureSuggestions", "updateFeatureSuggestions(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 11))});
        ls4 ls4Var = new ls4(context, wjhVar, new isd((Object) this, (byte) 4), jv1Var);
        this.A = ls4Var;
        ks3 ks3Var = new ks3();
        ks3Var.a = wjhVar;
        ks3Var.b = j4cVar;
        ks3Var.c = mpeVar;
        ks3Var.d = ls4Var;
        ks3Var.e = br6Var;
        ks3Var.f = z4c.b(new al7(ks3Var, b));
        ks3Var.g = sgb.b((d7a) wjhVar.b);
        ks3Var.h = new ArrayList();
        this.B = ks3Var;
        ((d3k) ls4Var.d.b).start();
    }

    public final void a(Function1 function1) {
        ks3 ks3Var = this.B;
        ((ArrayList) ks3Var.h).add(function1);
        d3k d3kVar = (d3k) ks3Var.i;
        if (d3kVar == null || !d3kVar.isActive()) {
            ks3Var.i = na2.B((a64) ks3Var.g, (CoroutineContext) null, (rx5) null, new hz1((byte) 13, (mt5) null, ks3Var), 3);
        }
    }

    public final Object b(nt5 nt5Var) {
        ysf ysfVar;
        Object objEmit;
        ls4 ls4Var = this.A;
        synchronized (ls4Var.f) {
            hs4 hs4Var = ls4Var.g;
            if (hs4Var != null) {
                Set<Map.Entry> setEntrySet = hs4Var.a.entrySet();
                int iA = qbd.a(k95.o(setEntrySet, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(((cs4) entry.getKey()).a, pik.D(6, ((fs4) entry.getValue()).a));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((String) entry2.getValue()).length() > 0) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ysfVar = new ysf(linkedHashMap2, hs4Var.b);
            } else {
                ysfVar = null;
            }
        }
        return (ysfVar == null || (objEmit = this.n.emit(ysfVar, nt5Var)) != px5.a) ? Unit.a : objEmit;
    }
}
