package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class i1h extends uz7 {
    final /* synthetic */ j1h this$0;

    public static final class a extends uz7 {
        final /* synthetic */ j1h this$0;

        public a(j1h j1hVar) {
            this.this$0 = j1hVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            j1h j1hVar = this.this$0;
            int i = j1hVar.b + 1;
            j1hVar.b = i;
            if (i == 1) {
                if (!j1hVar.c) {
                    j1hVar.e.removeCallbacks(j1hVar.g);
                } else {
                    j1hVar.f.e(occ.ON_RESUME);
                    j1hVar.c = false;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            j1h j1hVar = this.this$0;
            int i = j1hVar.a + 1;
            j1hVar.a = i;
            if (i == 1 && j1hVar.d) {
                j1hVar.f.e(occ.ON_START);
                j1hVar.d = false;
            }
        }
    }

    public i1h(j1h j1hVar) {
        this.this$0 = j1hVar;
    }

    @Override // defpackage.uz7, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.uz7, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j1h j1hVar = this.this$0;
        int i = j1hVar.b - 1;
        j1hVar.b = i;
        if (i == 0) {
            j1hVar.e.postDelayed(j1hVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override // defpackage.uz7, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j1h j1hVar = this.this$0;
        int i = j1hVar.a - 1;
        j1hVar.a = i;
        if (i == 0 && j1hVar.c) {
            j1hVar.f.e(occ.ON_STOP);
            j1hVar.d = true;
        }
    }
}
