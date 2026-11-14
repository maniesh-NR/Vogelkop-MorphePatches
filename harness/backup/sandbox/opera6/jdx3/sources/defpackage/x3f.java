package defpackage;

import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class x3f extends SuggestionProviderBridge {
    public final /* synthetic */ byte d = 0;
    public final ddc e;
    public d3k f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public x3f(ddc ddcVar, hw3 hw3Var, yqk yqkVar, ghf ghfVar, boolean z) {
        super(6);
        this.e = ddcVar;
        this.g = hw3Var;
        this.h = yqkVar;
        this.i = ghfVar;
        if (z) {
            hw3Var.get();
        }
    }

    public x3f(pde pdeVar, kul kulVar, ddc ddcVar, grk grkVar, brk brkVar) {
        super(0);
        this.g = pdeVar;
        this.h = kulVar;
        this.e = ddcVar;
        this.i = grkVar;
        this.j = brkVar;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        switch (this.d) {
            case 0:
                d3k d3kVar = this.f;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                this.f = null;
                this.j = null;
                break;
            default:
                d3k d3kVar2 = this.f;
                if (d3kVar2 != null) {
                    d3kVar2.k((CancellationException) null);
                    this.f = null;
                    break;
                }
                break;
        }
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        byte b = this.d;
        ddc ddcVar = this.e;
        switch (b) {
            case 0:
                if (!z2 && str.length() <= 0) {
                    if (this.f == null) {
                        this.j = yv4Var;
                        this.f = na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new rf4((byte) 13, (mt5) null, this), 3);
                        break;
                    } else {
                        this.j = yv4Var;
                        break;
                    }
                } else {
                    yv4Var.d(l08.a);
                    break;
                }
                break;
            default:
                cancel();
                if (!((Boolean) ((brk) this.j).invoke()).booleanValue()) {
                    l42 l42Var = (l42) ((pde) this.g).g();
                    if (l42Var != null && (!((grk) this.i).b.I.a || str.length() <= 0)) {
                        this.f = na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new s71(yv4Var, this, l42Var, (mt5) null, (byte) 26), 3);
                        break;
                    } else {
                        yv4Var.d(l08.a);
                        break;
                    }
                } else {
                    yv4Var.d(l08.a);
                    break;
                }
                break;
        }
    }
}
