package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k99 implements id {
    public final et3 a;
    public final fd b;
    public final zu3 c;
    public final zyk d;

    static {
        jf jfVar = fd.e;
    }

    public k99(BrowserActivity browserActivity, et3 et3Var, fd fdVar, zu3 zu3Var) {
        this.a = et3Var;
        this.b = fdVar;
        this.c = zu3Var;
        this.d = z4c.b(new gv8(this, browserActivity, (byte) 1));
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        if (i99.a[pcVar.ordinal()] != 1 || !((bf9) this.d.getValue()).t()) {
            return null;
        }
        final byte b = 0;
        Function2 function2 = new Function2(this) { // from class: h99
            public final /* synthetic */ k99 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v3, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                k99 k99Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        ?? r8 = k99Var.c.a;
                        int i = BrowserActivity.E1;
                        String[] strArr = OperaApplication.K;
                        new zhj(new wzg(new fge(r8, r8.x, ((OperaApplication) r8.getApplication()).L().c), fge.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])).c(r8);
                        break;
                    default:
                        new dd(k99Var.b).o(view);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        return new jf(function2, new Function2(this) { // from class: h99
            public final /* synthetic */ k99 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v3, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                k99 k99Var = this.b;
                View view = (View) obj;
                switch (b22) {
                    case 0:
                        ?? r8 = k99Var.c.a;
                        int i = BrowserActivity.E1;
                        String[] strArr = OperaApplication.K;
                        new zhj(new wzg(new fge(r8, r8.x, ((OperaApplication) r8.getApplication()).L().c), fge.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])).c(r8);
                        break;
                    default:
                        new dd(k99Var.b).o(view);
                        break;
                }
                return Unit.a;
            }
        }, false, false, 60);
    }
}
