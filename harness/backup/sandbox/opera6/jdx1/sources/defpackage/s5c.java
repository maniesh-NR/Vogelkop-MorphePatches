package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s5c {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ u5c c;

    public s5c(u5c u5cVar, int i) {
        this.c = u5cVar;
        this.a = i;
    }

    public final void a(int i) {
        u5c u5cVar = this.c;
        tn tnVar = u5cVar.c;
        if (tnVar == null) {
            return;
        }
        this.b.add(new usg(tnVar, i, u5cVar.b, null));
    }
}
