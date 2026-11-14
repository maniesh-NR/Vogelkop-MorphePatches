package defpackage;

import android.os.Bundle;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class adb implements cdb {
    public final /* synthetic */ byte a = 0;
    public final BrowserActivity b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public adb(BrowserActivity browserActivity, Bundle bundle) {
        tc2 iqcVar;
        this.b = browserActivity;
        tc2 tc2Var = hqc.b;
        tc2 mqcVar = null;
        if (bundle != null) {
            long j = bundle.getLong("livescore_id", -1L);
            Long lValueOf = j == -1 ? null : Long.valueOf(j);
            String string = bundle.getString("livescore_destination");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1936965173:
                        if (string.equals("basketball_match") && lValueOf != null) {
                            iqcVar = new iqc(lValueOf.longValue());
                            mqcVar = iqcVar;
                            break;
                        }
                        break;
                    case -1253350797:
                        if (string.equals("football_match") && lValueOf != null) {
                            iqcVar = new kqc(lValueOf.longValue(), bundle.getBoolean("livescore_play_audio"));
                            mqcVar = iqcVar;
                            break;
                        }
                        break;
                    case -1095396929:
                        if (string.equals("competition") && lValueOf != null) {
                            iqcVar = new jqc(lValueOf.longValue(), bundle.getString("livescore_phase_name"));
                            mqcVar = iqcVar;
                            break;
                        }
                        break;
                    case -871502865:
                        if (string.equals("football_team") && lValueOf != null) {
                            iqcVar = new lqc(lValueOf.longValue());
                            mqcVar = iqcVar;
                            break;
                        }
                        break;
                    case 3016401:
                        if (string.equals("base")) {
                            mqcVar = tc2Var;
                            break;
                        }
                        break;
                    case 1034655564:
                        if (string.equals("onboarding_follow_teams")) {
                            mqcVar = new mqc(lValueOf);
                            break;
                        }
                        break;
                }
            }
        }
        this.d = mqcVar != null ? mqcVar : tc2Var;
        this.c = bundle != null ? Boolean.parseBoolean(bundle.getString("enable_carousel")) : false;
    }

    public adb(BrowserActivity browserActivity, nej nejVar, boolean z) {
        this.b = browserActivity;
        this.d = nejVar;
        this.c = z;
    }

    @Override // defpackage.cdb
    public final void execute() {
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.c;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                if (((wnh) xnh.t(ndcVar).i()).b(1024)) {
                    String[] strArr = OperaApplication.K;
                    OperaApplication operaApplication = (OperaApplication) ndcVar.getApplication();
                    if (z) {
                        operaApplication.v().a.V(1, "live_scores_enabled");
                    }
                    ((rnc) ((snc) operaApplication.r.W.get()).l.getValue()).a(ndcVar).D(ndcVar, (tc2) obj, null);
                    break;
                }
                break;
            default:
                gom gomVarA = mom.a(ndcVar);
                int iOrdinal = gomVarA.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        h9o.p();
                        break;
                    } else if (!z && gomVarA.b != kom.b) {
                        nej nejVar = (nej) obj;
                        og5 og5Var = new og5(new ue5(502459723, new b57(this, gomVarA, (byte) 13), true), (byte) 0);
                        nejVar.getClass();
                        nejVar.b(og5Var, ijm.b);
                        break;
                    } else {
                        mom.b(ndcVar, gomVarA);
                        break;
                    }
                }
                break;
        }
    }
}
