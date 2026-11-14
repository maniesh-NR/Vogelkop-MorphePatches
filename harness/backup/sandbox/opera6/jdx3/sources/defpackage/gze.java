package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class gze extends n82 {
    public final String k;

    public gze(Context context, ywh ywhVar, qre qreVar, qtm qtmVar, uy8 uy8Var, String str) {
        super(context, ywhVar, qreVar, qtmVar, uy8Var, false, false);
        this.k = str;
    }

    @Override // defpackage.n82
    public List T(d5o d5oVar, String str) {
        ArrayList arrayListR = this.g.R(d5oVar, this.k, System.currentTimeMillis() / 1000);
        uy8 uy8Var = this.f;
        uy8Var.b(arrayListR);
        Map map = (Map) d5oVar.b;
        if (map != null && !map.isEmpty()) {
            uy8Var.m = map;
        } else {
            if (uy8Var.m.isEmpty()) {
                return arrayListR;
            }
            uy8Var.m = Collections.EMPTY_MAP;
        }
        uy8Var.n();
        return arrayListR;
    }
}
