package defpackage;

import android.content.res.Configuration;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class mcg implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ocg b;

    public /* synthetic */ mcg(ocg ocgVar, byte b) {
        this.a = b;
        this.b = ocgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        final ocg ocgVar = this.b;
        final byte b2 = 2;
        boolean z = false;
        final byte b3 = 1;
        switch (b) {
            case 0:
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rof.a(gyg.P(1916725752, new mcg(ocgVar, b3), vt9Var2), vt9Var2, 6);
                } else {
                    vt9Var2.Q();
                }
                break;
            default:
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    eef eefVar = ocgVar.f0().p;
                    afe afeVarC0 = p37.c0(ocgVar.f0().n, l08.a, vt9Var4);
                    boolean z2 = ((Configuration) vt9Var4.j(j41.a)).orientation == 1;
                    Pair pair = ocgVar.a;
                    List list = ocgVar.f0().m;
                    boolean zH = vt9Var4.h(ocgVar);
                    Object objK = vt9Var4.K();
                    zpa zpaVar = hh5.a;
                    Object obj3 = objK;
                    if (zH || objK == zpaVar) {
                        final boolean z3 = z ? 1 : 0;
                        Function1 function1 = new Function1() { // from class: ncg
                            public final Object invoke(Object obj4) {
                                byte b4 = z3;
                                gl0 gl0Var = gl0.f;
                                kl0 kl0Var = kl0.m;
                                ocg ocgVar2 = ocgVar;
                                switch (b4) {
                                    case 0:
                                        eef eefVar2 = (eef) obj4;
                                        zcg zcgVarF0 = ocgVar2.f0();
                                        zcgVarF0.j.add(eefVar2.a.getId());
                                        zcgVarF0.e.U(eefVar2.b, true);
                                        break;
                                    case 1:
                                        eef eefVar3 = (eef) obj4;
                                        zcg zcgVarF02 = ocgVar2.f0();
                                        qln qlnVar = zcgVarF02.f;
                                        mdf mdfVar = zcgVarF02.c;
                                        eef eefVar4 = zcgVarF02.p;
                                        if (eefVar4 == null || Intrinsics.a(eefVar3, eefVar4)) {
                                            String id = eefVar3.a.getId();
                                            x5f x5fVar = mdfVar.b;
                                            if (x5fVar.h) {
                                                zpa zpaVar2 = x5fVar.d;
                                                x56 x56VarF = zpa.F();
                                                x56VarF.F(zpaVar2).D(75, id);
                                                x5fVar.U0(x56VarF);
                                            }
                                            qlnVar.p(16, eefVar3.a.getId());
                                        } else {
                                            if (!zcgVarF02.l) {
                                                zcgVarF02.l = true;
                                                mdfVar.a(kl0Var, gl0Var);
                                            }
                                            qlnVar.p(15, eefVar3.a.getId());
                                        }
                                        zcgVarF02.p = eefVar3;
                                        zcgVarF02.e.U(eefVar3.b, true);
                                        break;
                                    default:
                                        rdf rdfVar = (rdf) obj4;
                                        zcg zcgVarF03 = ocgVar2.f0();
                                        if (!zcgVarF03.l) {
                                            zcgVarF03.l = true;
                                            zcgVarF03.c.a(kl0Var, gl0Var);
                                        }
                                        zcgVarF03.k.add(rdfVar.a);
                                        ijd ijdVar = zcgVarF03.h;
                                        qdf qdfVar = rdfVar.a;
                                        boolean z4 = !rdfVar.b;
                                        SettingsManager settingsManager = (SettingsManager) ijdVar.g;
                                        int iOrdinal = qdfVar.ordinal();
                                        if (iOrdinal == 0) {
                                            ijdVar.a = z4;
                                        } else if (iOrdinal == 1) {
                                            settingsManager.V(z4 ? 1 : 0, "enable_google_ai_mode");
                                            settingsManager.V(z4 ? 1 : 0, "ai_assistant_menu_shortcut");
                                        } else if (iOrdinal == 2) {
                                            settingsManager.V(z4 ? 1 : 0, "live_scores_enabled");
                                        } else if (iOrdinal == 3) {
                                            ijdVar.b = z4;
                                        } else if (iOrdinal != 4) {
                                            h9o.p();
                                            break;
                                        } else {
                                            ijdVar.c = z4;
                                        }
                                        wnm wnmVar = (wnm) ijdVar.h;
                                        Iterable<rdf> iterable = (Iterable) wnmVar.g();
                                        ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
                                        for (rdf rdfVar2 : iterable) {
                                            qdf qdfVar2 = rdfVar2.a;
                                            if (qdfVar2 == qdfVar) {
                                                rdfVar2 = new rdf(qdfVar2, z4);
                                            }
                                            arrayList.add(rdfVar2);
                                        }
                                        wnmVar.r(arrayList);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function1);
                        obj3 = function1;
                    }
                    Function1 function12 = (Function1) obj3;
                    boolean zH2 = vt9Var4.h(ocgVar);
                    Object objK2 = vt9Var4.K();
                    Object obj4 = objK2;
                    if (zH2 || objK2 == zpaVar) {
                        Function1 function13 = new Function1() { // from class: ncg
                            public final Object invoke(Object obj42) {
                                byte b4 = b3;
                                gl0 gl0Var = gl0.f;
                                kl0 kl0Var = kl0.m;
                                ocg ocgVar2 = ocgVar;
                                switch (b4) {
                                    case 0:
                                        eef eefVar2 = (eef) obj42;
                                        zcg zcgVarF0 = ocgVar2.f0();
                                        zcgVarF0.j.add(eefVar2.a.getId());
                                        zcgVarF0.e.U(eefVar2.b, true);
                                        break;
                                    case 1:
                                        eef eefVar3 = (eef) obj42;
                                        zcg zcgVarF02 = ocgVar2.f0();
                                        qln qlnVar = zcgVarF02.f;
                                        mdf mdfVar = zcgVarF02.c;
                                        eef eefVar4 = zcgVarF02.p;
                                        if (eefVar4 == null || Intrinsics.a(eefVar3, eefVar4)) {
                                            String id = eefVar3.a.getId();
                                            x5f x5fVar = mdfVar.b;
                                            if (x5fVar.h) {
                                                zpa zpaVar2 = x5fVar.d;
                                                x56 x56VarF = zpa.F();
                                                x56VarF.F(zpaVar2).D(75, id);
                                                x5fVar.U0(x56VarF);
                                            }
                                            qlnVar.p(16, eefVar3.a.getId());
                                        } else {
                                            if (!zcgVarF02.l) {
                                                zcgVarF02.l = true;
                                                mdfVar.a(kl0Var, gl0Var);
                                            }
                                            qlnVar.p(15, eefVar3.a.getId());
                                        }
                                        zcgVarF02.p = eefVar3;
                                        zcgVarF02.e.U(eefVar3.b, true);
                                        break;
                                    default:
                                        rdf rdfVar = (rdf) obj42;
                                        zcg zcgVarF03 = ocgVar2.f0();
                                        if (!zcgVarF03.l) {
                                            zcgVarF03.l = true;
                                            zcgVarF03.c.a(kl0Var, gl0Var);
                                        }
                                        zcgVarF03.k.add(rdfVar.a);
                                        ijd ijdVar = zcgVarF03.h;
                                        qdf qdfVar = rdfVar.a;
                                        boolean z4 = !rdfVar.b;
                                        SettingsManager settingsManager = (SettingsManager) ijdVar.g;
                                        int iOrdinal = qdfVar.ordinal();
                                        if (iOrdinal == 0) {
                                            ijdVar.a = z4;
                                        } else if (iOrdinal == 1) {
                                            settingsManager.V(z4 ? 1 : 0, "enable_google_ai_mode");
                                            settingsManager.V(z4 ? 1 : 0, "ai_assistant_menu_shortcut");
                                        } else if (iOrdinal == 2) {
                                            settingsManager.V(z4 ? 1 : 0, "live_scores_enabled");
                                        } else if (iOrdinal == 3) {
                                            ijdVar.b = z4;
                                        } else if (iOrdinal != 4) {
                                            h9o.p();
                                            break;
                                        } else {
                                            ijdVar.c = z4;
                                        }
                                        wnm wnmVar = (wnm) ijdVar.h;
                                        Iterable<rdf> iterable = (Iterable) wnmVar.g();
                                        ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
                                        for (rdf rdfVar2 : iterable) {
                                            qdf qdfVar2 = rdfVar2.a;
                                            if (qdfVar2 == qdfVar) {
                                                rdfVar2 = new rdf(qdfVar2, z4);
                                            }
                                            arrayList.add(rdfVar2);
                                        }
                                        wnmVar.r(arrayList);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function13);
                        obj4 = function13;
                    }
                    Function1 function14 = (Function1) obj4;
                    agm agmVar = ocgVar.f0().o;
                    List list2 = (List) afeVarC0.getValue();
                    boolean zH3 = vt9Var4.h(ocgVar);
                    Object objK3 = vt9Var4.K();
                    Object obj5 = objK3;
                    if (zH3 || objK3 == zpaVar) {
                        Function1 function15 = new Function1() { // from class: ncg
                            public final Object invoke(Object obj42) {
                                byte b4 = b2;
                                gl0 gl0Var = gl0.f;
                                kl0 kl0Var = kl0.m;
                                ocg ocgVar2 = ocgVar;
                                switch (b4) {
                                    case 0:
                                        eef eefVar2 = (eef) obj42;
                                        zcg zcgVarF0 = ocgVar2.f0();
                                        zcgVarF0.j.add(eefVar2.a.getId());
                                        zcgVarF0.e.U(eefVar2.b, true);
                                        break;
                                    case 1:
                                        eef eefVar3 = (eef) obj42;
                                        zcg zcgVarF02 = ocgVar2.f0();
                                        qln qlnVar = zcgVarF02.f;
                                        mdf mdfVar = zcgVarF02.c;
                                        eef eefVar4 = zcgVarF02.p;
                                        if (eefVar4 == null || Intrinsics.a(eefVar3, eefVar4)) {
                                            String id = eefVar3.a.getId();
                                            x5f x5fVar = mdfVar.b;
                                            if (x5fVar.h) {
                                                zpa zpaVar2 = x5fVar.d;
                                                x56 x56VarF = zpa.F();
                                                x56VarF.F(zpaVar2).D(75, id);
                                                x5fVar.U0(x56VarF);
                                            }
                                            qlnVar.p(16, eefVar3.a.getId());
                                        } else {
                                            if (!zcgVarF02.l) {
                                                zcgVarF02.l = true;
                                                mdfVar.a(kl0Var, gl0Var);
                                            }
                                            qlnVar.p(15, eefVar3.a.getId());
                                        }
                                        zcgVarF02.p = eefVar3;
                                        zcgVarF02.e.U(eefVar3.b, true);
                                        break;
                                    default:
                                        rdf rdfVar = (rdf) obj42;
                                        zcg zcgVarF03 = ocgVar2.f0();
                                        if (!zcgVarF03.l) {
                                            zcgVarF03.l = true;
                                            zcgVarF03.c.a(kl0Var, gl0Var);
                                        }
                                        zcgVarF03.k.add(rdfVar.a);
                                        ijd ijdVar = zcgVarF03.h;
                                        qdf qdfVar = rdfVar.a;
                                        boolean z4 = !rdfVar.b;
                                        SettingsManager settingsManager = (SettingsManager) ijdVar.g;
                                        int iOrdinal = qdfVar.ordinal();
                                        if (iOrdinal == 0) {
                                            ijdVar.a = z4;
                                        } else if (iOrdinal == 1) {
                                            settingsManager.V(z4 ? 1 : 0, "enable_google_ai_mode");
                                            settingsManager.V(z4 ? 1 : 0, "ai_assistant_menu_shortcut");
                                        } else if (iOrdinal == 2) {
                                            settingsManager.V(z4 ? 1 : 0, "live_scores_enabled");
                                        } else if (iOrdinal == 3) {
                                            ijdVar.b = z4;
                                        } else if (iOrdinal != 4) {
                                            h9o.p();
                                            break;
                                        } else {
                                            ijdVar.c = z4;
                                        }
                                        wnm wnmVar = (wnm) ijdVar.h;
                                        Iterable<rdf> iterable = (Iterable) wnmVar.g();
                                        ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
                                        for (rdf rdfVar2 : iterable) {
                                            qdf qdfVar2 = rdfVar2.a;
                                            if (qdfVar2 == qdfVar) {
                                                rdfVar2 = new rdf(qdfVar2, z4);
                                            }
                                            arrayList.add(rdfVar2);
                                        }
                                        wnmVar.r(arrayList);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function15);
                        obj5 = function15;
                    }
                    Function1 function16 = (Function1) obj5;
                    boolean zH4 = vt9Var4.h(ocgVar);
                    Object objK4 = vt9Var4.K();
                    Object obj6 = objK4;
                    if (zH4 || objK4 == zpaVar) {
                        d8e d8eVar = new d8e(ocgVar, (byte) 13);
                        vt9Var4.g0(d8eVar);
                        obj6 = d8eVar;
                    }
                    p37.i(z2, pair, list, eefVar, function12, function14, agmVar, list2, function16, (Function0) obj6, vt9Var4, 4096);
                } else {
                    vt9Var4.Q();
                }
                break;
        }
        return Unit.a;
    }
}
