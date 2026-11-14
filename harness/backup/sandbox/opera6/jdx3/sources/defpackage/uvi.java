package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class uvi extends lim {
    public final bt b;
    public final can a = new can();
    public final LinkedHashMap c = new LinkedHashMap();
    public final z22 d = new z22(this, 15);
    public final za3 e = new za3(this, (byte) 3);
    public final svi f = new svi(this, 0);

    public uvi(bt btVar) {
        this.b = btVar;
    }

    public final void R(gt gtVar, LinearLayout linearLayout, int i) {
        this.c.put(linearLayout, new Pair(gtVar, Integer.valueOf(djh.c(i, 0, 100))));
        this.a.c(linearLayout, this.f);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.b(true);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        while (true) {
            LinkedHashMap linkedHashMap = this.c;
            boolean zIsEmpty = linkedHashMap.isEmpty();
            can canVar = this.a;
            if (zIsEmpty) {
                canVar.b(false);
                return;
            } else {
                View view = (View) CollectionsKt.J(linkedHashMap.keySet());
                linkedHashMap.remove(view);
                canVar.a(view);
            }
        }
    }
}
