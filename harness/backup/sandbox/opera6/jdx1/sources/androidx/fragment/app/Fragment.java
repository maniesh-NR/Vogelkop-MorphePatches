package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import defpackage.ask;
import defpackage.atc;
import defpackage.dde;
import defpackage.ddj;
import defpackage.dm9;
import defpackage.e22;
import defpackage.ekc;
import defpackage.fx9;
import defpackage.fxj;
import defpackage.g06;
import defpackage.gm9;
import defpackage.gx9;
import defpackage.hdb;
import defpackage.hl9;
import defpackage.jr9;
import defpackage.kki;
import defpackage.nb6;
import defpackage.ndc;
import defpackage.nm9;
import defpackage.o18;
import defpackage.occ;
import defpackage.ode;
import defpackage.ol9;
import defpackage.ph;
import defpackage.pk9;
import defpackage.pki;
import defpackage.q7n;
import defpackage.qcc;
import defpackage.qdc;
import defpackage.qk9;
import defpackage.qki;
import defpackage.ql9;
import defpackage.rh;
import defpackage.rk9;
import defpackage.rki;
import defpackage.sk9;
import defpackage.ski;
import defpackage.sn9;
import defpackage.tcc;
import defpackage.th;
import defpackage.tk9;
import defpackage.uk9;
import defpackage.um9;
import defpackage.v7n;
import defpackage.vm9;
import defpackage.w7n;
import defpackage.xm5;
import defpackage.z7h;
import defpackage.zh;
import defpackage.zsc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ndc, w7n, n7a, rki {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    sk9 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    w mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    r7n mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    w mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    ql9 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    qdc mLifecycleRegistry;
    qcc mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<tk9> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final tk9 mSavedStateAttachListener;
    qki mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    sn9 mViewLifecycleOwner;
    ode mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new dm9();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new qk9(this, (byte) 0);
        this.mMaxState = qcc.e;
        this.mViewLifecycleOwnerLiveData = new ode();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new j(this);
        initLifecycle();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private sk9 ensureAnimationInfo() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var != null) {
            return sk9Var;
        }
        sk9 sk9Var2 = new sk9();
        sk9Var2.i = null;
        Object obj = USE_DEFAULT_TRANSITION;
        sk9Var2.j = obj;
        sk9Var2.k = null;
        sk9Var2.l = obj;
        sk9Var2.m = null;
        sk9Var2.n = obj;
        sk9Var2.q = 1.0f;
        sk9Var2.r = null;
        this.mAnimationInfo = sk9Var2;
        return sk9Var2;
    }

    private int getMinimumMaxLifecycleState() {
        qcc qccVar = this.mMaxState;
        return (qccVar == qcc.b || this.mParentFragment == null) ? qccVar.ordinal() : Math.min(qccVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @Nullable
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            um9 um9Var = vm9.a;
            vm9.b(new gx9(this, "Attempting to get target fragment from fragment " + this));
            vm9.a(this).a.getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.mFragmentManager;
        if (wVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return wVar.c.b(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new qdc(this, true);
        this.mSavedStateRegistryController = new qki(new ijd(this, new j3i(this, (byte) 8)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) ol9.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new e22(sko.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new e22(sko.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new e22(sko.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new e22(sko.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        sn9 sn9Var = this.mViewLifecycleOwner;
        sn9Var.e.a(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> th prepareCallInternal(@NonNull rh rhVar, @NonNull jr9 jr9Var, @NonNull ph phVar) {
        if (this.mState > 1) {
            qp2.n(o18.o("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new rk9(this, jr9Var, atomicReference, rhVar, phVar));
        return new pk9(atomicReference);
    }

    private void registerOnPreAttachListener(@NonNull tk9 tk9Var) {
        if (this.mState >= 0) {
            tk9Var.a();
        } else {
            this.mOnPreAttachedListeners.add(tk9Var);
        }
    }

    private void restoreViewState() {
        if (w.N(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        w wVar;
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var != null) {
            sk9Var.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (wVar = this.mFragmentManager) == null) {
            return;
        }
        h hVarJ = h.j(viewGroup, wVar);
        hVarJ.l();
        if (z) {
            this.mHost.c.post(new ig(hVarJ, (byte) 29));
        } else {
            hVarJ.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public hl9 createFragmentContainer() {
        return new k(this);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            zsc.a(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(sko.u(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final r getActivity() {
        ql9 ql9Var = this.mHost;
        if (ql9Var == null) {
            return null;
        }
        return ql9Var.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null || (bool = sk9Var.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null || (bool = sk9Var.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        sk9Var.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final w getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        qp2.n(o18.o("Fragment ", this, " has not been attached yet."));
        return null;
    }

    @Nullable
    public Context getContext() {
        ql9 ql9Var = this.mHost;
        if (ql9Var == null) {
            return null;
        }
        return ql9Var.b;
    }

    @NonNull
    public g06 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.N(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        dde ddeVar = new dde(0);
        if (application != null) {
            ddeVar.a(q7n.d, application);
        }
        ddeVar.a(kki.a, this);
        ddeVar.a(kki.b, this);
        if (getArguments() != null) {
            ddeVar.a(kki.c, getArguments());
        }
        return ddeVar;
    }

    @NonNull
    public r7n getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            qp2.n("Can't access ViewModels from detached fragment");
            return null;
        }
        r7n r7nVar = this.mDefaultFactory;
        if (r7nVar != null) {
            return r7nVar;
        }
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.N(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        ski skiVar = new ski(application, this, getArguments());
        this.mDefaultFactory = skiVar;
        return skiVar;
    }

    public int getEnterAnim() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 0;
        }
        return sk9Var.b;
    }

    @Nullable
    public Object getEnterTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        return sk9Var.i;
    }

    public ddj getEnterTransitionCallback() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        sk9Var.getClass();
        return null;
    }

    public int getExitAnim() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 0;
        }
        return sk9Var.c;
    }

    @Nullable
    public Object getExitTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        return sk9Var.k;
    }

    public ddj getExitTransitionCallback() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        sk9Var.getClass();
        return null;
    }

    public View getFocusedView() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        return sk9Var.r;
    }

    @Nullable
    @Deprecated
    public final w getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        ql9 ql9Var = this.mHost;
        if (ql9Var == null) {
            return null;
        }
        return ((q) ql9Var).e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        ql9 ql9Var = this.mHost;
        if (ql9Var == null) {
            qp2.n("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        r rVar = ((q) ql9Var).e;
        LayoutInflater layoutInflaterCloneInContext = rVar.getLayoutInflater().cloneInContext(rVar);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f);
        return layoutInflaterCloneInContext;
    }

    @Override // defpackage.ndc
    @NonNull
    public tcc getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public zsc getLoaderManager() {
        return zsc.a(this);
    }

    public int getNextTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 0;
        }
        return sk9Var.f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final w getParentFragmentManager() {
        w wVar = this.mFragmentManager;
        if (wVar != null) {
            return wVar;
        }
        qp2.n(o18.o("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return false;
        }
        return sk9Var.a;
    }

    public int getPopEnterAnim() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 0;
        }
        return sk9Var.d;
    }

    public int getPopExitAnim() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 0;
        }
        return sk9Var.e;
    }

    public float getPostOnViewCreatedAlpha() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return 1.0f;
        }
        return sk9Var.q;
    }

    @Nullable
    public Object getReenterTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        Object obj = sk9Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        um9 um9Var = vm9.a;
        vm9.b(new fx9(this, "Attempting to get retain instance for fragment " + this));
        vm9.a(this).a.getClass();
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        Object obj = sk9Var.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.rki
    @NonNull
    public final pki getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        return sk9Var.m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return null;
        }
        Object obj = sk9Var.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        sk9 sk9Var = this.mAnimationInfo;
        return (sk9Var == null || (arrayList = sk9Var.g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        sk9 sk9Var = this.mAnimationInfo;
        return (sk9Var == null || (arrayList = sk9Var.h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i) {
        return getResources().getString(i);
    }

    @NonNull
    public final String getString(int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        um9 um9Var = vm9.a;
        vm9.b(new gx9(this, "Attempting to get target request code from fragment " + this));
        vm9.a(this).a.getClass();
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    public ndc getViewLifecycleOwner() {
        sn9 sn9Var = this.mViewLifecycleOwner;
        if (sn9Var != null) {
            return sn9Var;
        }
        qp2.n(o18.o("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    @NonNull
    public ekc getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.w7n
    @NonNull
    public v7n getViewModelStore() {
        if (this.mFragmentManager == null) {
            qp2.n("Can't access ViewModels from detached fragment");
            return null;
        }
        int minimumMaxLifecycleState = getMinimumMaxLifecycleState();
        qcc qccVar = qcc.a;
        if (minimumMaxLifecycleState == 1) {
            qp2.n("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.mFragmentManager.Q.d;
        v7n v7nVar = (v7n) map.get(this.mWho);
        if (v7nVar != null) {
            return v7nVar;
        }
        v7n v7nVar2 = new v7n();
        map.put(this.mWho, v7nVar2);
        return v7nVar2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new dm9();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        w wVar = this.mFragmentManager;
        if (wVar != null) {
            Fragment fragment = this.mParentFragment;
            wVar.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        sk9 sk9Var = this.mAnimationInfo;
        if (sk9Var == null) {
            return false;
        }
        return sk9Var.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        w wVar = this.mFragmentManager;
        if (wVar == null) {
            return false;
        }
        return wVar.R();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.T();
    }

    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (w.N(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        ql9 ql9Var = this.mHost;
        r rVar = ql9Var == null ? null : ql9Var.a;
        if (rVar != null) {
            this.mCalled = false;
            onAttach((Activity) rVar);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        w wVar = this.mChildFragmentManager;
        if (wVar.w >= 1) {
            return;
        }
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(1);
    }

    @Nullable
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Nullable
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        ql9 ql9Var = this.mHost;
        r rVar = ql9Var == null ? null : ql9Var.a;
        if (rVar != null) {
            this.mCalled = false;
            onInflate((Activity) rVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        w wVar = this.mChildFragmentManager;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(4);
    }

    public void performAttach() {
        ArrayList<tk9> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            tk9 tk9Var = arrayList.get(i);
            i++;
            tk9Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.b);
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.q.iterator();
        while (it.hasNext()) {
            ((gm9) it.next()).a(this);
        }
        w wVar = this.mChildFragmentManager;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new l(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(occ.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.k(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new sn9(this, getViewModelStore(), new ld9(this, (byte) 4));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        sn9 sn9Var = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (sn9Var.d == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                qp2.n("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        sn9Var.b();
        if (w.N(3)) {
            Objects.toString(this.mView);
            toString();
        }
        z7h.v(this.mView, this.mViewLifecycleOwner);
        this.mView.setTag(2131365021, this.mViewLifecycleOwner);
        this.mView.setTag(2131365020, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.e(occ.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            sn9 sn9Var = this.mViewLifecycleOwner;
            sn9Var.b();
            if (sn9Var.d.i.d(qcc.c)) {
                this.mViewLifecycleOwner.a(occ.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        fxj fxjVar = zsc.a(this).b.b;
        int i = fxjVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((atc) fxjVar.f(i2)).s();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onDetach()"));
        }
        w wVar = this.mChildFragmentManager;
        if (wVar.L) {
            return;
        }
        wVar.l();
        this.mChildFragmentManager = new dm9();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(occ.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(occ.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.t(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zQ = w.Q(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zQ) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zQ);
            onPrimaryNavigationFragmentChanged(zQ);
            w wVar = this.mChildFragmentManager;
            wVar.o0();
            wVar.r(wVar.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.T();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onResume()"));
        }
        qdc qdcVar = this.mLifecycleRegistry;
        occ occVar = occ.ON_RESUME;
        qdcVar.e(occVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(occVar);
        }
        w wVar = this.mChildFragmentManager;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.T();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onStart()"));
        }
        qdc qdcVar = this.mLifecycleRegistry;
        occ occVar = occ.ON_START;
        qdcVar.e(occVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(occVar);
        }
        w wVar = this.mChildFragmentManager;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(5);
    }

    public void performStop() {
        w wVar = this.mChildFragmentManager;
        wVar.K = true;
        wVar.Q.g = true;
        wVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(occ.ON_STOP);
        }
        this.mLifecycleRegistry.e(occ.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().s = true;
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().s = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        w wVar = this.mFragmentManager;
        if (wVar != null) {
            handler = wVar.x.c;
            this.mPostponedHandler = handler;
        } else {
            handler = new Handler(Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    public final <I, O> th registerForActivityResult(@NonNull rh rhVar, @NonNull ph phVar) {
        return prepareCallInternal(rhVar, new m(this), phVar);
    }

    @NonNull
    public final <I, O> th registerForActivityResult(@NonNull rh rhVar, @NonNull zh zhVar, @NonNull ph phVar) {
        return prepareCallInternal(rhVar, new xm5(zhVar), phVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            qp2.n(o18.o("Fragment ", this, " not attached to Activity"));
            return;
        }
        w parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.G == null) {
            parentFragmentManager.x.getClass();
            return;
        }
        parentFragmentManager.H.addLast(new yl9(this.mWho, i));
        parentFragmentManager.G.a(strArr, null);
    }

    @NonNull
    public final r requireActivity() {
        r activity = getActivity();
        if (activity != null) {
            return activity;
        }
        qp2.n(o18.o("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        qp2.n(o18.o("Fragment ", this, " does not have any arguments."));
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        qp2.n(o18.o("Fragment ", this, " not attached to a context."));
        return null;
    }

    @NonNull
    @Deprecated
    public final w requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        qp2.n(o18.o("Fragment ", this, " not attached to a host."));
        return null;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            qp2.n(o18.o("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        t14.g(sb, " is not a child Fragment, it is directly attached to ", getContext());
        return null;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        qp2.n(o18.o("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.e0(bundle);
        w wVar = this.mChildFragmentManager;
        wVar.J = false;
        wVar.K = false;
        wVar.Q.g = false;
        wVar.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new ask(o18.o("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(occ.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().b = i;
        ensureAnimationInfo().c = i2;
        ensureAnimationInfo().d = i3;
        ensureAnimationInfo().e = i4;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            qp2.n("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(@Nullable ddj ddjVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(@Nullable ddj ddjVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((q) this.mHost).e.invalidateMenu();
        }
    }

    public void setInitialSavedState(@Nullable uk9 uk9Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            qp2.n("Fragment already added");
            return;
        }
        if (uk9Var == null || (bundle = uk9Var.a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((q) this.mHost).e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().q = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        um9 um9Var = vm9.a;
        vm9.b(new fx9(this, "Attempting to set retain instance for fragment " + this));
        vm9.a(this).a.getClass();
        this.mRetainInstance = z;
        w wVar = this.mFragmentManager;
        if (wVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        x xVar = wVar.Q;
        if (z) {
            xVar.f(this);
        } else {
            xVar.h(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        sk9 sk9Var = this.mAnimationInfo;
        sk9Var.g = arrayList;
        sk9Var.h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        if (fragment != null) {
            um9 um9Var = vm9.a;
            vm9.b(new gx9(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this));
            vm9.a(this).a.getClass();
        }
        w wVar = this.mFragmentManager;
        w wVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (wVar != null && wVar2 != null && wVar != wVar2) {
            qp2.o(o18.o("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                s49.q("Setting ", fragment, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        um9 um9Var = vm9.a;
        vm9.b(new nm9(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        vm9.a(this).a.getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            w wVar = this.mFragmentManager;
            z zVarG = wVar.g(this);
            Fragment fragment = zVarG.c;
            if (fragment.mDeferStart) {
                if (wVar.b) {
                    wVar.M = true;
                } else {
                    fragment.mDeferStart = false;
                    zVarG.i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        ql9 ql9Var = this.mHost;
        if (ql9Var != null) {
            return nb6.S(((q) ql9Var).e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        ql9 ql9Var = this.mHost;
        if (ql9Var != null) {
            ql9Var.b.startActivity(intent, bundle);
        } else {
            qp2.n(o18.o("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            qp2.n(o18.o("Fragment ", this, " not attached to Activity"));
            return;
        }
        w parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E != null) {
            parentFragmentManager.H.addLast(new yl9(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.E.a(intent, null);
            return;
        }
        ql9 ql9Var = parentFragmentManager.x;
        if (i == -1) {
            ql9Var.b.startActivity(intent, bundle);
        } else {
            ql9Var.getClass();
            qp2.n("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) {
        Intent intent2;
        if (this.mHost == null) {
            qp2.n(o18.o("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (w.N(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        w parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            ql9 ql9Var = parentFragmentManager.x;
            if (i == -1) {
                ql9Var.a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                ql9Var.getClass();
                qp2.n("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (w.N(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        hdb hdbVar = new hdb(intentSender, intent2, i2, i3);
        parentFragmentManager.H.addLast(new yl9(this.mWho, i));
        if (w.N(2)) {
            toString();
        }
        parentFragmentManager.F.a(hdbVar, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().s = false;
        } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
            this.mHost.c.postAtFrontOfQueue(new qk9(this, (byte) 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
