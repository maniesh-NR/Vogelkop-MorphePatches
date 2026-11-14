package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class xd5 extends wd5 implements w7n, n7a, rki, lcf, yje, di, ncf, hdf, vcf, wcf, ltd {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final qd5 Companion = new qd5();
    private v7n _viewModelStore;

    @NotNull
    private final zh activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final l4c defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final l4c fullyDrawnReporter$delegate;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final l4c onBackPressedDispatcher$delegate;

    @NotNull
    private final l4c onBackPressedInput$delegate;

    @NotNull
    private final CopyOnWriteArrayList<qp5> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<qp5> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<qp5> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<qp5> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<qp5> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final td5 reportFullyDrawnExecutor;

    @NotNull
    private final qki savedStateRegistryController;

    @NotNull
    private final as5 contextAwareHelper = new as5();

    @NotNull
    private final ntd menuHostHelper = new ntd(new ld5(this, (byte) 0));

    public xd5() {
        final byte b = 0;
        ijd ijdVar = new ijd(this, new j3i(this, (byte) 8));
        this.savedStateRegistryController = new qki(ijdVar);
        this.reportFullyDrawnExecutor = new ud5(this);
        final byte b2 = 1;
        this.fullyDrawnReporter$delegate = z4c.b(new md5(this, (byte) 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new vd5(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = z4c.b(new md5(this, (byte) 2));
        if (getLifecycle() == null) {
            qp2.n("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().a(new idc(this) { // from class: od5
            public final /* synthetic */ xd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.idc
            public final void E(ndc ndcVar, occ occVar) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b;
                xd5 xd5Var = this.b;
                switch (b3) {
                    case 0:
                        if (occVar == occ.ON_STOP && (window = xd5Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xd5.l(xd5Var, occVar);
                        break;
                }
            }
        });
        getLifecycle().a(new idc(this) { // from class: od5
            public final /* synthetic */ xd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.idc
            public final void E(ndc ndcVar, occ occVar) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b2;
                xd5 xd5Var = this.b;
                switch (b3) {
                    case 0:
                        if (occVar == occ.ON_STOP && (window = xd5Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xd5.l(xd5Var, occVar);
                        break;
                }
            }
        });
        getLifecycle().a(new uoh(this, b2));
        ijdVar.b();
        kki.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new y51(this, b2));
        addOnContextAvailableListener(new pcf() { // from class: pd5
            @Override // defpackage.pcf
            public final void a(xd5 xd5Var) {
                xd5.n(this.a);
            }
        });
        this.defaultViewModelProviderFactory$delegate = z4c.b(new md5(this, (byte) 3));
        this.onBackPressedDispatcher$delegate = z4c.b(new md5(this, (byte) 4));
    }

    public static final void access$ensureViewModelStore(xd5 xd5Var) {
        if (xd5Var._viewModelStore == null) {
            sd5 sd5Var = (sd5) xd5Var.getLastNonConfigurationInstance();
            if (sd5Var != null) {
                xd5Var._viewModelStore = sd5Var.b;
            }
            if (xd5Var._viewModelStore == null) {
                xd5Var._viewModelStore = new v7n();
            }
        }
    }

    public static final void l(xd5 xd5Var, occ occVar) {
        if (occVar == occ.ON_DESTROY) {
            xd5Var.contextAwareHelper.b = null;
            if (!xd5Var.isChangingConfigurations()) {
                xd5Var.getViewModelStore().a();
            }
            ud5 ud5Var = (ud5) xd5Var.reportFullyDrawnExecutor;
            xd5 xd5Var2 = ud5Var.d;
            xd5Var2.getWindow().getDecorView().removeCallbacks(ud5Var);
            xd5Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ud5Var);
        }
    }

    public static final Bundle m(xd5 xd5Var) {
        Bundle bundle = new Bundle();
        zh zhVar = xd5Var.activityResultRegistry;
        zhVar.getClass();
        LinkedHashMap linkedHashMap = zhVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(zhVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(zhVar.g));
        return bundle;
    }

    public static final void n(xd5 xd5Var) {
        Bundle bundleA = xd5Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            zh zhVar = xd5Var.activityResultRegistry;
            LinkedHashMap linkedHashMap = zhVar.b;
            LinkedHashMap linkedHashMap2 = zhVar.a;
            Bundle bundle = zhVar.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                zhVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        y9m.r(linkedHashMap2).remove(num);
                    }
                }
                int iIntValue = integerArrayList.get(i).intValue();
                String str2 = stringArrayList.get(i);
                linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                zhVar.b.put(str2, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void o(kcf kcfVar, xd5 xd5Var, occ occVar) {
        if (occVar == occ.ON_CREATE) {
            kcfVar.e(xd5Var.getOnBackInvokedDispatcher());
        }
    }

    public static final mq9 p(xd5 xd5Var) {
        return new mq9(xd5Var.reportFullyDrawnExecutor, new md5(xd5Var, (byte) 0));
    }

    public static final void q(xd5 xd5Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((ud5) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ltd
    public void addMenuProvider(@NotNull mud mudVar) {
        ntd ntdVar = this.menuHostHelper;
        ntdVar.b.add(mudVar);
        ntdVar.a.run();
    }

    public void addMenuProvider(@NotNull mud mudVar, @NotNull ndc ndcVar) {
        this.menuHostHelper.a(mudVar, ndcVar);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull final mud mudVar, @NotNull ndc ndcVar, @NotNull final qcc qccVar) {
        final ntd ntdVar = this.menuHostHelper;
        ntdVar.getClass();
        tcc lifecycle = ndcVar.getLifecycle();
        HashMap map = ntdVar.c;
        mtd mtdVar = (mtd) map.remove(mudVar);
        if (mtdVar != null) {
            mtdVar.a.b(mtdVar.b);
            mtdVar.b = null;
        }
        final byte b = 1;
        map.put(mudVar, new mtd(lifecycle, new idc() { // from class: gdc
            @Override // defpackage.idc
            public final void E(ndc ndcVar2, occ occVar) {
                byte b2 = b;
                occ occVar2 = null;
                Object obj = mudVar;
                Serializable serializable = qccVar;
                Object obj2 = ntdVar;
                switch (b2) {
                    case 0:
                        vdc vdcVar = (vdc) obj2;
                        pqh pqhVar = (pqh) serializable;
                        Function1 function1 = (Function1) obj;
                        int i = hdc.a[occVar.ordinal()];
                        if (i == 1) {
                            pqhVar.a = function1.invoke(vdcVar);
                            break;
                        } else if (i == 2) {
                            qz2 qz2Var = (qz2) pqhVar.a;
                            if (qz2Var != null) {
                                qz2Var.a();
                            }
                            pqhVar.a = null;
                            break;
                        }
                        break;
                    default:
                        ntd ntdVar2 = (ntd) obj2;
                        qcc qccVar2 = (qcc) serializable;
                        mud mudVar2 = (mud) obj;
                        ntdVar2.getClass();
                        Runnable runnable = ntdVar2.a;
                        CopyOnWriteArrayList copyOnWriteArrayList = ntdVar2.b;
                        occ.Companion.getClass();
                        int iOrdinal = qccVar2.ordinal();
                        if (iOrdinal == 2) {
                            occVar2 = occ.ON_CREATE;
                        } else if (iOrdinal == 3) {
                            occVar2 = occ.ON_START;
                        } else if (iOrdinal == 4) {
                            occVar2 = occ.ON_RESUME;
                        }
                        if (occVar != occVar2) {
                            if (occVar != occ.ON_DESTROY) {
                                if (occVar == mcc.a(qccVar2)) {
                                    copyOnWriteArrayList.remove(mudVar2);
                                    runnable.run();
                                    break;
                                }
                            } else {
                                ntdVar2.b(mudVar2);
                                break;
                            }
                        } else {
                            copyOnWriteArrayList.add(mudVar2);
                            runnable.run();
                            break;
                        }
                        break;
                }
            }
        }));
    }

    @Override // defpackage.ncf
    public final void addOnConfigurationChangedListener(@NotNull qp5 qp5Var) {
        this.onConfigurationChangedListeners.add(qp5Var);
    }

    public final void addOnContextAvailableListener(@NotNull pcf pcfVar) {
        as5 as5Var = this.contextAwareHelper;
        xd5 xd5Var = as5Var.b;
        if (xd5Var != null) {
            pcfVar.a(xd5Var);
        }
        as5Var.a.add(pcfVar);
    }

    @Override // defpackage.vcf
    public final void addOnMultiWindowModeChangedListener(@NotNull qp5 qp5Var) {
        this.onMultiWindowModeChangedListeners.add(qp5Var);
    }

    public final void addOnNewIntentListener(@NotNull qp5 qp5Var) {
        this.onNewIntentListeners.add(qp5Var);
    }

    @Override // defpackage.wcf
    public final void addOnPictureInPictureModeChangedListener(@NotNull qp5 qp5Var) {
        this.onPictureInPictureModeChangedListeners.add(qp5Var);
    }

    @Override // defpackage.hdf
    public final void addOnTrimMemoryListener(@NotNull qp5 qp5Var) {
        this.onTrimMemoryListeners.add(qp5Var);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // defpackage.di
    @NotNull
    public final zh getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @NotNull
    public g06 getDefaultViewModelCreationExtras() {
        dde ddeVar = new dde(0);
        if (getApplication() != null) {
            ddeVar.a(q7n.d, getApplication());
        }
        ddeVar.a(kki.a, this);
        ddeVar.a(kki.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            ddeVar.a(kki.c, extras);
        }
        return ddeVar;
    }

    @NotNull
    public r7n getDefaultViewModelProviderFactory() {
        return (r7n) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @NotNull
    public mq9 getFullyDrawnReporter() {
        return (mq9) this.fullyDrawnReporter$delegate.getValue();
    }

    @f37
    public Object getLastCustomNonConfigurationInstance() {
        sd5 sd5Var = (sd5) getLastNonConfigurationInstance();
        if (sd5Var != null) {
            return sd5Var.a;
        }
        return null;
    }

    @Override // defpackage.wd5, defpackage.ndc
    @NotNull
    public tcc getLifecycle() {
        return super.getLifecycle();
    }

    @NotNull
    public xje getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // defpackage.lcf
    @NotNull
    public final kcf getOnBackPressedDispatcher() {
        return (kcf) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.rki
    @NotNull
    public final pki getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.w7n
    @NotNull
    public v7n getViewModelStore() {
        if (getApplication() == null) {
            qp2.n("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        v7n v7nVar = this._viewModelStore;
        if (v7nVar != null) {
            return v7nVar;
        }
        sd5 sd5Var = (sd5) getLastNonConfigurationInstance();
        if (sd5Var != null) {
            this._viewModelStore = sd5Var.b;
        }
        v7n v7nVar2 = this._viewModelStore;
        if (v7nVar2 != null) {
            return v7nVar2;
        }
        v7n v7nVar3 = new v7n();
        this._viewModelStore = v7nVar3;
        return v7nVar3;
    }

    public void initializeViewTreeOwners() {
        z7h.v(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(2131365021, this);
        getWindow().getDecorView().setTag(2131365020, this);
        getWindow().getDecorView().setTag(2131365019, this);
        getWindow().getDecorView().setTag(2131364052, this);
        getWindow().getDecorView().setTag(2131365018, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @f37
    public void onBackPressed() {
        ((o97) this.onBackPressedInput$delegate.getValue()).b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<qp5> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.wd5, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        as5 as5Var = this.contextAwareHelper;
        as5Var.b = this;
        Iterator it = as5Var.a.iterator();
        while (it.hasNext()) {
            ((pcf) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ReportFragment.a;
        a.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NotNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        ntd ntdVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ntdVar.b.iterator();
        while (it.hasNext()) {
            ((mud) it.next()).d(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                if (((mud) it.next()).c(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @f37
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<qp5> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new lce(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, @NotNull Configuration configuration) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<qp5> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new lce(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        super.onNewIntent(intent);
        Iterator<qp5> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NotNull Menu menu) {
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((mud) it.next()).a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @f37
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<qp5> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new qeg(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, @NotNull Configuration configuration) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<qp5> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new qeg(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, @NotNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((mud) it.next()).b(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @f37
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        sd5 sd5Var;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        v7n v7nVar = this._viewModelStore;
        if (v7nVar == null && (sd5Var = (sd5) getLastNonConfigurationInstance()) != null) {
            v7nVar = sd5Var.b;
        }
        if (v7nVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        sd5 sd5Var2 = new sd5();
        sd5Var2.a = objOnRetainCustomNonConfigurationInstance;
        sd5Var2.b = v7nVar;
        return sd5Var2;
    }

    @Override // defpackage.wd5, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        if (getLifecycle() instanceof qdc) {
            ((qdc) getLifecycle()).g(qcc.c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<qp5> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    @NotNull
    public final <I, O> th registerForActivityResult(@NotNull rh rhVar, @NotNull ph phVar) {
        return registerForActivityResult(rhVar, this.activityResultRegistry, phVar);
    }

    @NotNull
    public final <I, O> th registerForActivityResult(@NotNull rh rhVar, @NotNull zh zhVar, @NotNull ph phVar) {
        return zhVar.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, rhVar, phVar);
    }

    @Override // defpackage.ltd
    public void removeMenuProvider(@NotNull mud mudVar) {
        this.menuHostHelper.b(mudVar);
    }

    @Override // defpackage.ncf
    public final void removeOnConfigurationChangedListener(@NotNull qp5 qp5Var) {
        this.onConfigurationChangedListeners.remove(qp5Var);
    }

    public final void removeOnContextAvailableListener(@NotNull pcf pcfVar) {
        this.contextAwareHelper.a.remove(pcfVar);
    }

    @Override // defpackage.vcf
    public final void removeOnMultiWindowModeChangedListener(@NotNull qp5 qp5Var) {
        this.onMultiWindowModeChangedListeners.remove(qp5Var);
    }

    public final void removeOnNewIntentListener(@NotNull qp5 qp5Var) {
        this.onNewIntentListeners.remove(qp5Var);
    }

    @Override // defpackage.wcf
    public final void removeOnPictureInPictureModeChangedListener(@NotNull qp5 qp5Var) {
        this.onPictureInPictureModeChangedListeners.remove(qp5Var);
    }

    @Override // defpackage.hdf
    public final void removeOnTrimMemoryListener(@NotNull qp5 qp5Var) {
        this.onTrimMemoryListeners.remove(qp5Var);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            mq9 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                fullyDrawnReporter.c = true;
                ArrayList arrayList = fullyDrawnReporter.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Function0) obj).invoke();
                }
                fullyDrawnReporter.d.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        ((ud5) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ((ud5) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((ud5) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @f37
    public void startActivityForResult(@NotNull Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @f37
    public void startActivityForResult(@NotNull Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @f37
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @f37
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
