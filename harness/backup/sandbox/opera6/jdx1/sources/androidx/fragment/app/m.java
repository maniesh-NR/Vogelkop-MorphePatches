package androidx.fragment.app;

import defpackage.di;
import defpackage.jr9;

/* loaded from: classes.dex */
public final class m implements jr9 {
    public final /* synthetic */ Fragment a;

    public m(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.jr9
    /* renamed from: apply */
    public final Object mo17apply(Object obj) {
        Fragment fragment = this.a;
        Object obj2 = fragment.mHost;
        return obj2 instanceof di ? ((di) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
