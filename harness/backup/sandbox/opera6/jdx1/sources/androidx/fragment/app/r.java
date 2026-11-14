package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.ddj;
import defpackage.dm9;
import defpackage.ml9;
import defpackage.occ;
import defpackage.oki;
import defpackage.pcf;
import defpackage.qcc;
import defpackage.qdc;
import defpackage.qp5;
import defpackage.sn9;
import defpackage.xd5;
import defpackage.zsc;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class r extends xd5 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final ml9 mFragments = new ml9(new q(this));
    final qdc mFragmentLifecycleRegistry = new qdc(this, true);
    boolean mStopped = true;

    public r() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new oki() { // from class: androidx.fragment.app.n
            @Override // defpackage.oki
            public final Bundle a() {
                r rVar = this.a;
                rVar.markFragmentsCreated();
                rVar.mFragmentLifecycleRegistry.e(occ.ON_STOP);
                return new Bundle();
            }
        });
        final byte b = 0;
        addOnConfigurationChangedListener(new qp5(this) { // from class: androidx.fragment.app.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b2 = b;
                r rVar = this.b;
                switch (b2) {
                    case 0:
                        rVar.mFragments.a();
                        break;
                    default:
                        rVar.mFragments.a();
                        break;
                }
            }
        });
        final byte b2 = 1;
        addOnNewIntentListener(new qp5(this) { // from class: androidx.fragment.app.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.qp5
            public final void accept(Object obj) {
                byte b22 = b2;
                r rVar = this.b;
                switch (b22) {
                    case 0:
                        rVar.mFragments.a();
                        break;
                    default:
                        rVar.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new pcf() { // from class: androidx.fragment.app.p
            @Override // defpackage.pcf
            public final void a(xd5 xd5Var) {
                q qVar = this.a.mFragments.a;
                qVar.d.b(qVar, qVar, null);
            }
        });
    }

    public static boolean r(w wVar) {
        qcc qccVar = qcc.c;
        boolean zR = false;
        for (Fragment fragment : wVar.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zR |= r(fragment.getChildFragmentManager());
                }
                sn9 sn9Var = fragment.mViewLifecycleOwner;
                if (sn9Var != null) {
                    sn9Var.b();
                    if (sn9Var.d.i.d(qcc.d)) {
                        fragment.mViewLifecycleOwner.d.g(qccVar);
                        zR = true;
                    }
                }
                if (fragment.mLifecycleRegistry.i.d(qcc.d)) {
                    fragment.mLifecycleRegistry.g(qccVar);
                    zR = true;
                }
            }
        }
        return zR;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                zsc.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.a.d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public w getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    @NonNull
    @Deprecated
    public zsc getSupportLoaderManager() {
        return zsc.a(this);
    }

    public void markFragmentsCreated() {
        w supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            qcc qccVar = qcc.a;
        } while (r(supportFragmentManager));
    }

    @Override // defpackage.xd5, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // defpackage.xd5, defpackage.wd5, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(occ.ON_CREATE);
        dm9 dm9Var = this.mFragments.a.d;
        dm9Var.J = false;
        dm9Var.K = false;
        dm9Var.Q.g = false;
        dm9Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.l();
        this.mFragmentLifecycleRegistry.e(occ.ON_DESTROY);
    }

    @Override // defpackage.xd5, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.u(5);
        this.mFragmentLifecycleRegistry.e(occ.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.xd5, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(occ.ON_RESUME);
        dm9 dm9Var = this.mFragments.a.d;
        dm9Var.J = false;
        dm9Var.K = false;
        dm9Var.Q.g = false;
        dm9Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            dm9 dm9Var = this.mFragments.a.d;
            dm9Var.J = false;
            dm9Var.K = false;
            dm9Var.Q.g = false;
            dm9Var.u(4);
        }
        this.mFragments.a.d.A(true);
        this.mFragmentLifecycleRegistry.e(occ.ON_START);
        dm9 dm9Var2 = this.mFragments.a.d;
        dm9Var2.J = false;
        dm9Var2.K = false;
        dm9Var2.Q.g = false;
        dm9Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        dm9 dm9Var = this.mFragments.a.d;
        dm9Var.K = true;
        dm9Var.Q.g = true;
        dm9Var.u(4);
        this.mFragmentLifecycleRegistry.e(occ.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable ddj ddjVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(@Nullable ddj ddjVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
