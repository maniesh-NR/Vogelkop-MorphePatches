package defpackage;

import android.content.SharedPreferences;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public class h42 extends ode {
    public final /* synthetic */ byte l;
    public final Object m;

    public h42() {
        this.l = (byte) 1;
        this.m = new jhi();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(Object obj) {
        super(obj);
        this.l = (byte) 1;
        this.m = new jhi();
    }

    public /* synthetic */ h42(Object obj, byte b) {
        this.l = b;
        this.m = obj;
    }

    public void l() {
        byte b = this.l;
        Object obj = this.m;
        switch (b) {
            case 0:
                k42 k42Var = (k42) obj;
                ru9 ru9VarC = ru9.c(k42Var.a.b);
                ehf ehfVarJ = null;
                String string = ru9VarC.a.getString("aria.sandbox.userinfo", null);
                if (string != null) {
                    try {
                        ehfVarJ = yi4.J(string);
                    } catch (JSONException unused) {
                        nv6 nv6VarB = ru9VarC.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putString("aria.sandbox.userinfo", null);
                        nv6VarB.w();
                    }
                }
                if (ehfVarJ == null) {
                    if (k42Var.e && !k42Var.f) {
                        k42Var.f = true;
                        ((OperaAccessTokenProvider) k42Var.c.getValue()).b(new j42(k42Var));
                        break;
                    }
                } else {
                    r(new t0i(ehfVarJ));
                    break;
                }
                break;
            case 1:
                fhi it = ((jhi) obj).iterator();
                while (true) {
                    fhi fhiVar = it;
                    if (!fhiVar.hasNext()) {
                        break;
                    } else {
                        ssd ssdVar = (ssd) ((Map.Entry) fhiVar.next()).getValue();
                        ssdVar.a.k(ssdVar);
                    }
                }
            default:
                ami amiVar = (ami) obj;
                if (((AtomicBoolean) amiVar.h).compareAndSet(true, false)) {
                    amiVar.q();
                    break;
                }
                break;
        }
    }

    public void m() {
        switch (this.l) {
            case 1:
                fhi it = ((jhi) this.m).iterator();
                while (true) {
                    fhi fhiVar = it;
                    if (!fhiVar.hasNext()) {
                        break;
                    } else {
                        ssd ssdVar = (ssd) ((Map.Entry) fhiVar.next()).getValue();
                        ssdVar.a.p(ssdVar);
                    }
                }
        }
    }

    public void s(ekc ekcVar, f7f f7fVar) {
        if (ekcVar == null) {
            t3p.q("source cannot be null");
            return;
        }
        ssd ssdVar = new ssd(ekcVar, f7fVar);
        ssd ssdVar2 = (ssd) ((jhi) this.m).b(ekcVar, ssdVar);
        if (ssdVar2 != null) {
            if (ssdVar2.b != f7fVar) {
                qp2.o("This source was already added with the different observer");
            }
        } else if (h()) {
            ekcVar.k(ssdVar);
        }
    }

    public final void t(ekc ekcVar) {
        ssd ssdVar = (ssd) ((jhi) this.m).c(ekcVar);
        if (ssdVar != null) {
            ssdVar.a.p(ssdVar);
        }
    }
}
