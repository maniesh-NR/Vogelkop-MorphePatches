package androidx.fragment.app;

import android.os.Bundle;
import defpackage.kki;
import defpackage.tk9;

/* loaded from: classes.dex */
public final class j extends tk9 {
    public final /* synthetic */ Fragment a;

    public j(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.tk9
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a.b();
        kki.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
