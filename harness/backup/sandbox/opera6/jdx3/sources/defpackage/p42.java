package defpackage;

import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.webaiassistant.WebAiAssistantLayoutSwitcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class p42 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t42 b;

    public /* synthetic */ p42(t42 t42Var, byte b) {
        this.a = b;
        this.b = t42Var;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3, java.lang.Object] */
    public final Object invoke(Object obj) {
        nrn nrnVar;
        byte b = this.a;
        t42 t42Var = this.b;
        switch (b) {
            case 0:
                tsn tsnVar = (tsn) obj;
                ei eiVar = t42Var.w;
                mrn mrnVar = t42Var.l;
                WebAiAssistantLayoutSwitcher webAiAssistantLayoutSwitcher = (WebAiAssistantLayoutSwitcher) eiVar.g;
                nsn nsnVar = tsnVar.c;
                lsn lsnVar = tsnVar.b;
                int iOrdinal = nsnVar.ordinal();
                if (iOrdinal == 0) {
                    nrnVar = nrn.c;
                } else if (iOrdinal == 1 || iOrdinal == 2) {
                    nrnVar = nrn.a;
                } else if (iOrdinal == 3) {
                    nrnVar = nrn.b;
                } else if (iOrdinal == 4) {
                    nrnVar = nrn.c;
                } else {
                    if (iOrdinal != 5) {
                        h9o.p();
                        return null;
                    }
                    nrnVar = nrn.d;
                }
                webAiAssistantLayoutSwitcher.d(nrnVar);
                mrnVar.h(lsnVar);
                mrnVar.h(lsnVar);
                return Unit.a;
            case 1:
                ye yeVar = (ye) obj;
                String[] strArr = OperaApplication.K;
                ?? r1 = t42Var.v;
                OperaApplication operaApplication = (OperaApplication) r1.getApplication();
                r1.getClass();
                return new ue(r1, yeVar, new yw3(r1), new wth((BrowserActivity) r1), operaApplication.I(), operaApplication.L().c, new rbe((byte) 22), te.Bo);
            default:
                t42Var.v.startActivity((Intent) obj);
                return Unit.a;
        }
    }
}
