package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s1h {
    public final int a;
    public final xwh f;
    public final String g;
    public final o94 i;
    public int j = -1;
    public final int d = 0;
    public final int c = 0;
    public final Rect b = null;
    public final Matrix e = null;
    public final ArrayList h = new ArrayList();

    public s1h(zh4 zh4Var, bp2 bp2Var, xwh xwhVar, o94 o94Var, int i) {
        this.a = i;
        this.f = xwhVar;
        this.g = String.valueOf(zh4Var.hashCode());
        List<fk4> list = zh4Var.a;
        Objects.requireNonNull(list);
        for (fk4 fk4Var : list) {
            ArrayList arrayList = this.h;
            fk4Var.getClass();
            arrayList.add(0);
        }
        this.i = o94Var;
    }

    public final void a(int i) {
        if (this.j != i) {
            this.j = i;
            xug.i();
            if (this.f.f) {
                return;
            }
            new koj((bp2) null, i);
            throw null;
        }
    }
}
