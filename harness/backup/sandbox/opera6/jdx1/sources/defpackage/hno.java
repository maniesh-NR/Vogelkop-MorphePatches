package defpackage;

import android.app.Application;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class hno implements xoo {
    public final /* synthetic */ byte a;
    public d3k b;
    public final /* synthetic */ Application c;

    public /* synthetic */ hno(Application application, byte b) {
        this.a = b;
        this.c = application;
    }

    public final void a() {
        byte b = this.a;
        Application application = this.c;
        switch (b) {
            case 0:
                d3k d3kVar = this.b;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                this.b = null;
                jno jnoVar = jno.a;
                if (cbp.c == null) {
                    if (cbp.d != null) {
                        gh2 gh2Var = new gh2((byte) 14, application, false);
                        cbp.c(gh2Var, gh2Var);
                        break;
                    }
                } else {
                    jno.a(application, false);
                    break;
                }
                break;
            default:
                d3k d3kVar2 = this.b;
                if (d3kVar2 != null) {
                    d3kVar2.k((CancellationException) null);
                }
                this.b = null;
                aap.e(application);
                String str = (String) aap.i.getAndSet(null);
                if (str != null) {
                    aap.c(application, str);
                    break;
                }
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                d3k d3kVar = this.b;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                this.b = na2.B(w2p.a, null, null, new rz1(2, (mt5) null, (byte) 6), 3);
                jno jnoVar = jno.a;
                jno.d(this.c, true);
                break;
            default:
                d3k d3kVar2 = this.b;
                if (d3kVar2 != null) {
                    d3kVar2.k((CancellationException) null);
                }
                this.b = na2.B(w2p.a, null, null, new rz1(2, (mt5) null, (byte) 7), 3);
                break;
        }
    }
}
