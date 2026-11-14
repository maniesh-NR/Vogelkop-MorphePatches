package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import defpackage.opo;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class da3 implements opo {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.opo
    public final void a(HashMap map) {
    }

    @Override // defpackage.opo
    public final synchronized void a(HashMap map, Context context, View view) {
        map.put("vst", new ArrayList(this.a));
        this.a.clear();
    }

    @Override // defpackage.opo
    public final void b(HashMap map) {
    }
}
