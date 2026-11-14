package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public class ny0 implements h8f {
    public final /* synthetic */ byte a;

    public /* synthetic */ ny0(byte b) {
        this.a = b;
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws NumberFormatException {
        Object next;
        switch (this.a) {
            case 0:
                if (g8fVar == g8f.a) {
                    String str = (String) map.get("q");
                    String str2 = (String) map.get("s");
                    if (str != null && str2 != null) {
                        String[] strArr = OperaApplication.K;
                        Iterator it = Collections.unmodifiableList(((OperaApplication) context.getApplicationContext()).I().a).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((eri) next) instanceof l42) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        eri eriVar = (eri) next;
                        if (eriVar instanceof l42) {
                            l42 l42Var = (l42) eriVar;
                            zg zgVarO = zg.o(1, l42Var.d, l42Var.r(str, str2));
                            if (zgVarO != null) {
                                ac8.b(new ay3(ay3.a(cti.a(zgVarO, eriVar, cti.a, p6l.a), lqm.r, true)));
                                break;
                            }
                        }
                    } else {
                        Intent intentB = mdb.b(context);
                        intentB.setAction("android.intent.action.MAIN");
                        intentB.addCategory("android.intent.category.LAUNCHER");
                        intentB.setAction("ACTION_SHOW_OMNIBAR_WITH_ASK_AI");
                        context.startActivity(intentB);
                        break;
                    }
                }
                break;
            case 1:
                if (g8fVar == g8f.a) {
                    zi4.u(context, new h22((l1b) map));
                    break;
                }
                break;
            default:
                s88 s88VarD = d((l1b) map);
                if (g8fVar == g8f.a) {
                    Bundle bundleM = ic4.m(new Pair[]{new Pair("ESIM_ATTRIBUTION_RESOLVED", Boolean.TRUE), new Pair("ESIM_SOURCE", (String) map.get("source")), new Pair("ESIM_CAMPAIGN", (String) map.get("campaign"))});
                    if (s88VarD != null) {
                        bundleM.putParcelable("esim_destination", s88VarD);
                    }
                    Intent intentB2 = mdb.b(context);
                    intentB2.setAction("android.intent.action.MAIN");
                    intentB2.addCategory("android.intent.category.LAUNCHER");
                    intentB2.putExtras(bundleM);
                    intentB2.putExtra("DESTINATION_VIEW_ID", 45);
                    intentB2.setAction("ACTION_DESTINATION_VIEW");
                    context.startActivity(intentB2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h8f
    public Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        mt5 mt5Var2 = null;
        switch (this.a) {
            case 0:
                if (l1bVar.containsKey("q") && l1bVar.containsKey("s")) {
                    cv6 cv6Var = bb7.a;
                    return na2.Z(s6d.a.e, new wr(context, mt5Var2, (byte) 1), mt5Var);
                }
                cv6 cv6Var2 = bb7.a;
                return na2.Z(s6d.a.e, new wr(context, mt5Var2, (byte) 2), mt5Var);
            case 1:
                cv6 cv6Var3 = bb7.a;
                return na2.Z(s6d.a.e, new wr(context, mt5Var2, (byte) 3), mt5Var);
            default:
                String[] strArr = OperaApplication.K;
                return cs5.E(((dp6) ((OperaApplication) context.getApplicationContext()).v.get()).b().t(), mt5Var);
        }
    }

    public s88 d(l1b l1bVar) {
        return null;
    }
}
