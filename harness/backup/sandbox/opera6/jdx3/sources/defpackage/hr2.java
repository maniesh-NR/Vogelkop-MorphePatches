package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hr2 implements es2 {
    public final /* synthetic */ mr2 a;

    public hr2(mr2 mr2Var) {
        this.a = mr2Var;
    }

    @Override // defpackage.es2
    public final void a(String str) {
        mr2 mr2Var = this.a;
        fr2 fr2Var = mr2Var.y;
        if (fr2Var == null) {
            fr2Var = null;
        }
        ArrayList arrayList = fr2Var.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            gr2 gr2Var = (gr2) arrayList.get(i);
            if (Intrinsics.a(gr2Var.a, str)) {
                arrayList.remove(gr2Var);
                break;
            }
            i++;
        }
        fr2Var.notifyDataSetChanged();
        mr2Var.s.f(str);
    }

    @Override // defpackage.es2
    public final void b(String str) {
        this.a.x = str;
    }
}
