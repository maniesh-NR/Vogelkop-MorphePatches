package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class qqc implements h8f {
    public final /* synthetic */ byte a;

    public /* synthetic */ qqc(byte b) {
        this.a = b;
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws eva {
        qqc qqcVar;
        l1b l1bVar = (l1b) map;
        tc2 tc2VarE = e(l1bVar);
        if (tc2VarE != null) {
            qqcVar = this;
            if (((Boolean) scd.g0(h.a, new mz9(qqcVar, context, l1bVar, (mt5) null, (byte) 10))).booleanValue()) {
                if (g8fVar != g8f.a) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tc2VarE.equals(hqc.b)) {
                    bundle.putString("livescore_destination", "base");
                } else if (tc2VarE instanceof kqc) {
                    bundle.putString("livescore_destination", "football_match");
                    kqc kqcVar = (kqc) tc2VarE;
                    bundle.putLong("livescore_id", kqcVar.b);
                    bundle.putBoolean("livescore_play_audio", kqcVar.c);
                } else if (tc2VarE instanceof iqc) {
                    bundle.putString("livescore_destination", "basketball_match");
                    bundle.putLong("livescore_id", ((iqc) tc2VarE).b);
                } else if (tc2VarE instanceof mqc) {
                    bundle.putString("livescore_destination", "onboarding_follow_teams");
                    Long l = ((mqc) tc2VarE).b;
                    if (l != null) {
                        bundle.putLong("livescore_id", l.longValue());
                    }
                } else if (tc2VarE instanceof jqc) {
                    bundle.putString("livescore_destination", "competition");
                    jqc jqcVar = (jqc) tc2VarE;
                    bundle.putLong("livescore_id", jqcVar.b);
                    bundle.putString("livescore_phase_name", jqcVar.c);
                } else if (!(tc2VarE instanceof lqc)) {
                    h9o.p();
                    return;
                } else {
                    bundle.putString("livescore_destination", "football_team");
                    bundle.putLong("livescore_id", ((lqc) tc2VarE).b);
                }
                String str = (String) map.get("enable_carousel");
                if (str != null) {
                    bundle.putString("enable_carousel", str);
                }
                Intent intentB = mdb.b(context);
                intentB.setAction("android.intent.action.MAIN");
                intentB.addCategory("android.intent.category.LAUNCHER");
                intentB.putExtras(bundle);
                intentB.putExtra("DESTINATION_VIEW_ID", 32);
                intentB.setAction("ACTION_DESTINATION_VIEW");
                context.startActivity(intentB);
                mt5 mt5Var = null;
                switch (qqcVar.a) {
                    case 1:
                        jqc jqcVar2 = (jqc) tc2VarE;
                        if (Boolean.parseBoolean((String) l1bVar.get("follow"))) {
                            String[] strArr = OperaApplication.K;
                            OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
                            na2.B((nx5) operaApplication.t.get(), (CoroutineContext) null, (rx5) null, new fb9(operaApplication, jqcVar2, mt5Var, (byte) 13), 3);
                            return;
                        }
                        return;
                    case 2:
                        lqc lqcVar = (lqc) tc2VarE;
                        if (Boolean.parseBoolean((String) l1bVar.get("follow"))) {
                            String[] strArr2 = OperaApplication.K;
                            OperaApplication operaApplication2 = (OperaApplication) context.getApplicationContext();
                            na2.B((nx5) operaApplication2.t.get(), (CoroutineContext) null, (rx5) null, new fb9(operaApplication2, lqcVar, mt5Var, (byte) 14), 3);
                            return;
                        }
                        return;
                    case 3:
                        kqc kqcVar2 = (kqc) tc2VarE;
                        if (qqcVar.f(l1bVar)) {
                            String[] strArr3 = OperaApplication.K;
                            OperaApplication operaApplication3 = (OperaApplication) context.getApplicationContext();
                            na2.B((nx5) operaApplication3.t.get(), (CoroutineContext) null, (rx5) null, new fb9(operaApplication3, kqcVar2, mt5Var, (byte) 15), 3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            qqcVar = this;
        }
        throw new eva(qqcVar.getClass().getSimpleName().concat(" not supported."));
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        tc2 tc2VarE;
        wnh wnhVar = (wnh) xnh.t(context).i();
        boolean zB = wnhVar.b(1024);
        boolean zB2 = wnhVar.b(134217728);
        if (zB && (tc2VarE = e(l1bVar)) != null) {
            return (!tc2VarE.a || zB2) ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public final void d(Context context, tc2 tc2Var, l1b l1bVar) {
    }

    public final tc2 e(l1b l1bVar) {
        switch (this.a) {
            case 0:
                return hqc.b;
            case 1:
                String str = (String) l1bVar.get("id");
                Long lK0 = str != null ? StringsKt.k0(str) : null;
                if (lK0 != null) {
                    return new jqc(lK0.longValue(), (String) l1bVar.get("phaseName"));
                }
                return null;
            case 2:
                String str2 = (String) l1bVar.get("id");
                Long lK02 = str2 != null ? StringsKt.k0(str2) : null;
                if (lK02 != null) {
                    return new lqc(lK02.longValue());
                }
                return null;
            default:
                String str3 = (String) l1bVar.get("id");
                Long lK03 = str3 != null ? StringsKt.k0(str3) : null;
                if (lK03 != null) {
                    return new kqc(lK03.longValue(), Boolean.parseBoolean((String) l1bVar.get("play_audio")));
                }
                return null;
        }
    }

    public boolean f(l1b l1bVar) {
        return Boolean.parseBoolean((String) l1bVar.get("follow"));
    }
}
