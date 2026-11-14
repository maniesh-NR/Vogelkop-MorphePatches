package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rmm extends e43 {
    @Override // defpackage.e43, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            try {
                intent.hasExtra("ignored");
            } catch (Exception e) {
                HashSet hashSet = mdb.a;
                ks3.D(e);
                intent.replaceExtras((Bundle) null);
            }
        }
    }
}
