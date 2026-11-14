package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class svi implements y9n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ svi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        Pair pair;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uvi uviVar = (uvi) obj;
                LinkedHashMap linkedHashMap = uviVar.c;
                if (view.isShown() && (pair = (Pair) linkedHashMap.get(view)) != null) {
                    gt gtVar = (gt) pair.a;
                    if (i >= ((Number) pair.b).intValue()) {
                        linkedHashMap.remove(view);
                        uviVar.b.invoke(gtVar);
                        linkedHashMap.remove(view);
                        vml.c(new jri(uviVar, view, (byte) 2));
                        break;
                    }
                }
                break;
            default:
                cgn cgnVar = (cgn) obj;
                if (i > 0) {
                    cgnVar.F.n.d = true;
                    ConstraintLayout constraintLayout = cgnVar.P;
                    if (constraintLayout != null) {
                        wjj wjjVar = cgnVar.g;
                        if (wjjVar != null) {
                            ((can) wjjVar.d).a(constraintLayout);
                        }
                        cgnVar.P = null;
                        break;
                    }
                }
                break;
        }
    }
}
