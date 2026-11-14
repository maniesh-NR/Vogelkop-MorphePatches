package defpackage;

import android.content.SharedPreferences;
import com.leanplum.callbacks.StartCallback;

/* loaded from: classes.dex */
public final class l9c extends StartCallback {
    public final /* synthetic */ m9c a;

    public l9c(m9c m9cVar) {
        this.a = m9cVar;
    }

    @Override // com.leanplum.callbacks.StartCallback
    public final void onResponse(boolean z) {
        if (z) {
            am2.x(((SharedPreferences) this.a.b.get()).edit(), "last_launch");
        }
    }
}
