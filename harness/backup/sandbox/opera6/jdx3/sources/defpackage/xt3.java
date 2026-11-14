package defpackage;

import J.N;
import android.content.Context;
import android.widget.Toast;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import java.util.Objects;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public final /* synthetic */ class xt3 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ xt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, com.opera.android.BrowserActivity, dx3] */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        ?? r4 = this.b;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj;
                int i = BrowserActivity.E1;
                vp5 vp5Var = r4.P().e;
                if (vp5Var != null) {
                    n9k n9kVar = new n9k(runnable);
                    vp5Var.f.a.k.add(new qlk(n9kVar, (byte) 10));
                    vr9 vr9Var = new vr9((byte) 20, n9kVar, vp5Var, false);
                    ckf ckfVar = vp5Var.f.a;
                    if (ckfVar.l.isEmpty()) {
                        N.MTRhfnYH(((ContentViewRenderView) ckfVar).a, true);
                    }
                    ckfVar.l.add(vr9Var);
                    break;
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                xf8.F0(r4.m1, num);
                break;
            case 2:
                int i2 = BrowserActivity.E1;
                Toast.makeText((Context) r4, (String) obj, 1).show();
                break;
            default:
                String str = (String) obj;
                k6l k6lVar = r4.V;
                if (k6lVar == null) {
                    k6lVar = null;
                }
                b2l b2lVar = k6lVar.o;
                if (b2lVar != null) {
                    lsc lscVarF = wqm.f(str, null, lqm.d);
                    Objects.requireNonNull(lscVarF);
                    ((d7l) b2lVar).Z(lscVarF);
                    break;
                }
                break;
        }
    }
}
