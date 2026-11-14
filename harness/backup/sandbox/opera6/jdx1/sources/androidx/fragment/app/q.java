package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import defpackage.di;
import defpackage.gm9;
import defpackage.hdf;
import defpackage.kcf;
import defpackage.lcf;
import defpackage.ltd;
import defpackage.mud;
import defpackage.ncf;
import defpackage.pki;
import defpackage.ql9;
import defpackage.qp5;
import defpackage.rki;
import defpackage.tcc;
import defpackage.v7n;
import defpackage.vcf;
import defpackage.w7n;
import defpackage.wcf;
import defpackage.zh;

/* loaded from: classes.dex */
public final class q extends ql9 implements ncf, hdf, vcf, wcf, w7n, lcf, di, rki, gm9, ltd {
    public final /* synthetic */ r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(rVar);
        this.e = rVar;
    }

    @Override // defpackage.gm9
    public final void a(Fragment fragment) {
        this.e.onAttachFragment(fragment);
    }

    @Override // defpackage.ltd
    public final void addMenuProvider(mud mudVar) {
        this.e.addMenuProvider(mudVar);
    }

    @Override // defpackage.ncf
    public final void addOnConfigurationChangedListener(qp5 qp5Var) {
        this.e.addOnConfigurationChangedListener(qp5Var);
    }

    @Override // defpackage.vcf
    public final void addOnMultiWindowModeChangedListener(qp5 qp5Var) {
        this.e.addOnMultiWindowModeChangedListener(qp5Var);
    }

    @Override // defpackage.wcf
    public final void addOnPictureInPictureModeChangedListener(qp5 qp5Var) {
        this.e.addOnPictureInPictureModeChangedListener(qp5Var);
    }

    @Override // defpackage.hdf
    public final void addOnTrimMemoryListener(qp5 qp5Var) {
        this.e.addOnTrimMemoryListener(qp5Var);
    }

    @Override // defpackage.hl9
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.hl9
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.di
    public final zh getActivityResultRegistry() {
        return this.e.getActivityResultRegistry();
    }

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        return this.e.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.lcf
    public final kcf getOnBackPressedDispatcher() {
        return this.e.getOnBackPressedDispatcher();
    }

    @Override // defpackage.rki
    public final pki getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // defpackage.w7n
    public final v7n getViewModelStore() {
        return this.e.getViewModelStore();
    }

    @Override // defpackage.ltd
    public final void removeMenuProvider(mud mudVar) {
        this.e.removeMenuProvider(mudVar);
    }

    @Override // defpackage.ncf
    public final void removeOnConfigurationChangedListener(qp5 qp5Var) {
        this.e.removeOnConfigurationChangedListener(qp5Var);
    }

    @Override // defpackage.vcf
    public final void removeOnMultiWindowModeChangedListener(qp5 qp5Var) {
        this.e.removeOnMultiWindowModeChangedListener(qp5Var);
    }

    @Override // defpackage.wcf
    public final void removeOnPictureInPictureModeChangedListener(qp5 qp5Var) {
        this.e.removeOnPictureInPictureModeChangedListener(qp5Var);
    }

    @Override // defpackage.hdf
    public final void removeOnTrimMemoryListener(qp5 qp5Var) {
        this.e.removeOnTrimMemoryListener(qp5Var);
    }
}
