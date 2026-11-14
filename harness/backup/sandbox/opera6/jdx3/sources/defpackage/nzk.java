package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class nzk implements w6f {
    public boolean a;
    public final h7f b;

    public nzk(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        boolean z = false;
        if (resources != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32) {
            z = true;
        }
        this.a = z;
        this.b = new h7f();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.b.b((mzk) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.b.c((mzk) obj);
    }

    public final void a(Configuration configuration) {
        boolean z = (configuration.uiMode & 48) == 32;
        if (this.a != z) {
            this.a = z;
            g7f g7fVar = new g7f(this.b);
            while (g7fVar.hasNext()) {
                ((mzk) g7fVar.next()).k(this.a);
            }
        }
    }
}
