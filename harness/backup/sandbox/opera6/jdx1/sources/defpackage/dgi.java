package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class dgi extends egi {
    public final Path e;
    public final /* synthetic */ igi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgi(igi igiVar, Path path, float f) {
        super(igiVar, f, 0.0f);
        this.f = igiVar;
        this.e = path;
    }

    @Override // defpackage.egi
    public final void n(String str) {
        String str2;
        igi igiVar = this.f;
        if (igiVar.K0()) {
            ggi ggiVar = (ggi) igiVar.d;
            boolean z = ggiVar.b;
            Path path = this.e;
            if (z) {
                str2 = str;
                ((Canvas) igiVar.b).drawTextOnPath(str2, path, this.b, this.c, ggiVar.d);
            } else {
                str2 = str;
            }
            ggi ggiVar2 = (ggi) igiVar.d;
            if (ggiVar2.c) {
                ((Canvas) igiVar.b).drawTextOnPath(str2, path, this.b, this.c, ggiVar2.e);
            }
        } else {
            str2 = str;
        }
        this.b = ((ggi) igiVar.d).d.measureText(str2) + this.b;
    }
}
