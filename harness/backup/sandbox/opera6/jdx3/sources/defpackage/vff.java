package defpackage;

import com.leanplum.internal.RequestBuilder;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class vff extends hy {
    public final String h;

    public vff(t9f t9fVar, String str, dg7 dg7Var, String str2) {
        super(t9fVar, str, dg7Var, (byte) 0);
        this.h = str2;
    }

    @Override // defpackage.hy, defpackage.g3k
    public final void e(fvh fvhVar) {
        esd esdVarX;
        fvhVar.d("accept", "application/json");
        Regex regex = esd.e;
        try {
            esdVarX = wyh.x("application/json; charset=UTF-8");
        } catch (IllegalArgumentException unused) {
            esdVarX = null;
        }
        fvhVar.e(RequestBuilder.POST, rvh.create(this.h, esdVarX));
    }
}
