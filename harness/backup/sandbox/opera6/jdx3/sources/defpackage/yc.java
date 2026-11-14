package defpackage;

import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class yc implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ed
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dd ddVar = (dd) obj;
                for (Map.Entry entry : ddVar.l.entrySet()) {
                    MenuItem menuItem = (MenuItem) entry.getKey();
                    cd cdVar = (cd) entry.getValue();
                    jf jfVarE = ddVar.j.e(cdVar.a);
                    if (jfVarE == null) {
                        jfVarE = fd.e;
                    }
                    if (!Intrinsics.a(jfVarE, cdVar.b)) {
                        cdVar.b = jfVarE;
                        ddVar.q(menuItem, cdVar);
                    }
                }
                break;
            case 1:
                hd hdVar = (hd) obj;
                if (!hdVar.b) {
                    hdVar.b = true;
                    vml.c((c4) hdVar.g);
                    break;
                }
                break;
            case 2:
                qb7 qb7Var = (qb7) obj;
                qb7Var.A((ImageView) qb7Var.a, pc.y);
                qb7Var.A((ImageView) qb7Var.b, pc.v);
                break;
            case 3:
                ((u85) obj).g();
                break;
            case 4:
                ((k8k) obj).A();
                break;
            default:
                j8k j8kVar = (j8k) obj;
                j8kVar.e0();
                or2 or2Var = j8kVar.d;
                j8kVar.c0((FrameLayout) or2Var.e, (StylingTextView) or2Var.f, pc.A);
                break;
        }
    }
}
