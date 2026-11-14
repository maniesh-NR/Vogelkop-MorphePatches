package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class cbk {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public final void a(hq8 hq8Var, qpm qpmVar, Runnable runnable, boolean z) {
        String strG = hq8Var.g();
        String strI = hq8Var.i(p6l.a);
        lgf lgfVar = (lgf) this.e;
        bul bulVar = (bul) ((cul) lgfVar.i).c.get(hq8Var.c());
        qbe.v((Context) lgfVar.c, lgfVar.a, strI, strG, new yt3(this, hq8Var, bulVar == null ? 0 : bulVar.b.get(), z, qpmVar, runnable));
    }

    public final void b() {
        ppm ppmVar = (ppm) ((lgf) this.e).d;
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.b - 1;
        this.b = i;
        if (i > 0) {
            return;
        }
        arrayList.removeIf(new nn((byte) 14));
        if (arrayList.isEmpty()) {
            ppmVar.a(null);
        } else {
            Collections.sort(arrayList, new omj((byte) 16));
            ppmVar.a((yl2) arrayList.get(0));
        }
    }
}
