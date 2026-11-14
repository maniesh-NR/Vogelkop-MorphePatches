package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.iyj;
import defpackage.nm9;
import defpackage.o18;
import defpackage.ol9;
import defpackage.p3p;
import defpackage.qcc;
import defpackage.ql9;
import defpackage.r5n;
import defpackage.tm9;
import defpackage.um9;
import defpackage.vm9;
import defpackage.w7n;
import defpackage.z1m;
import defpackage.z8b;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z {
    public final z8b a;
    public final a0 b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public z(z8b z8bVar, a0 a0Var, Fragment fragment) {
        this.a = z8bVar;
        this.b = a0Var;
        this.c = fragment;
    }

    public z(z8b z8bVar, a0 a0Var, Fragment fragment, Bundle bundle) {
        this.a = z8bVar;
        this.b = a0Var;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public z(z8b z8bVar, a0 a0Var, ClassLoader classLoader, ol9 ol9Var, Bundle bundle) {
        this.a = z8bVar;
        this.b = a0Var;
        y yVar = (y) bundle.getParcelable("state");
        Fragment fragmentA = ol9Var.a(classLoader, yVar.a);
        fragmentA.mWho = yVar.b;
        fragmentA.mFromLayout = yVar.c;
        fragmentA.mInDynamicContainer = yVar.d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = yVar.e;
        fragmentA.mContainerId = yVar.f;
        fragmentA.mTag = yVar.g;
        fragmentA.mRetainInstance = yVar.h;
        fragmentA.mRemoving = yVar.i;
        fragmentA.mDetached = yVar.j;
        fragmentA.mHidden = yVar.k;
        fragmentA.mMaxState = qcc.values()[yVar.l];
        fragmentA.mTargetWho = yVar.m;
        fragmentA.mTargetRequestCode = yVar.n;
        fragmentA.mUserVisibleHint = yVar.o;
        this.c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (w.N(2)) {
            Objects.toString(fragmentA);
        }
    }

    public final void a() {
        Fragment fragment;
        View view;
        View view2;
        Fragment fragment2 = this.c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(2131363026);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i = fragment2.mContainerId;
            um9 um9Var = vm9.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment2);
            sb.append(" within the view of parent fragment ");
            sb.append(fragment);
            sb.append(" via container with ID ");
            vm9.b(new nm9(fragment2, p3p.k(i, " without using parent's childFragmentManager", sb)));
            vm9.a(fragment2).a.getClass();
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = fragment2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) arrayList.get(i2);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zN = w.N(3);
        Fragment fragment = this.c;
        if (zN) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        z zVar = null;
        a0 a0Var = this.b;
        if (fragment2 != null) {
            z zVar2 = (z) a0Var.b.get(fragment2.mWho);
            if (zVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            zVar = zVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (zVar = (z) a0Var.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                qp2.n(z1m.l(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (zVar != null) {
            zVar.i();
        }
        w wVar = fragment.mFragmentManager;
        fragment.mHost = wVar.x;
        fragment.mParentFragment = wVar.z;
        z8b z8bVar = this.a;
        z8bVar.s(fragment, false);
        fragment.performAttach();
        z8bVar.g(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = 2;
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            h hVarJ = h.j(viewGroup, fragment.getParentFragmentManager());
            c0 c0VarG = hVarJ.g(fragment);
            int i2 = c0VarG != null ? c0VarG.b : 0;
            c0 c0VarH = hVarJ.h(fragment);
            i = c0VarH != null ? c0VarH.b : 0;
            int i3 = i2 == 0 ? -1 : iyj.a[vep.A(i2)];
            if (i3 != -1 && i3 != 1) {
                i = i2;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (w.N(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (w.N(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    qp2.o(o18.o("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.y.b(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    um9 um9Var = vm9.a;
                    vm9.b(new nm9(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    vm9.a(fragment).a.getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (w.N(3)) {
                Objects.toString(fragment);
            }
            byte b = 0;
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(2131363026, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fragment.mView.isAttachedToWindow();
            View view = fragment.mView;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = r5n.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new tm9(view, b));
            }
            fragment.performViewCreated();
            this.a.A(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (w.N(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zN = w.N(3);
        Fragment fragment = this.c;
        if (zN) {
            Objects.toString(fragment);
        }
        int i = 0;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        a0 a0Var = this.b;
        if (z && !fragment.mBeingSaved) {
            a0Var.i(null, fragment.mWho);
        }
        if (!z) {
            x xVar = a0Var.d;
            if (!((xVar.b.containsKey(fragment.mWho) && xVar.e) ? xVar.f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = a0Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        ql9 ql9Var = fragment.mHost;
        boolean zIsChangingConfigurations = ql9Var instanceof w7n ? a0Var.d.f : true ^ ql9Var.b.isChangingConfigurations();
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            x xVar2 = a0Var.d;
            if (w.N(3)) {
                xVar2.getClass();
                Objects.toString(fragment);
            }
            xVar2.g(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.a.j(fragment, false);
        ArrayList arrayListD = a0Var.d();
        int size = arrayListD.size();
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            z zVar = (z) obj;
            if (zVar != null) {
                Fragment fragment2 = zVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = a0Var.b(str2);
        }
        a0Var.h(this);
    }

    public final void f() {
        View view;
        boolean zN = w.N(3);
        Fragment fragment = this.c;
        if (zN) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.B(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.r(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zN = w.N(3);
        Fragment fragment = this.c;
        if (zN) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.m(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            x xVar = this.b.d;
            if (!((xVar.b.containsKey(fragment.mWho) && xVar.e) ? xVar.f : true)) {
                return;
            }
        }
        if (w.N(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (w.N(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(2131363026, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.A(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0177, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.i():void");
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
                y yVar = (y) fragment.mSavedFragmentState.getParcelable("state");
                if (yVar != null) {
                    fragment.mTargetWho = yVar.m;
                    fragment.mTargetRequestCode = yVar.n;
                    Boolean bool = fragment.mSavedUserVisibleHint;
                    if (bool != null) {
                        fragment.mUserVisibleHint = bool.booleanValue();
                        fragment.mSavedUserVisibleHint = null;
                    } else {
                        fragment.mUserVisibleHint = yVar.o;
                    }
                }
                if (fragment.mUserVisibleHint) {
                    return;
                }
                fragment.mDeferStart = true;
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.w.N(r0)
            androidx.fragment.app.Fragment r1 = r4.c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            android.view.View r0 = r1.getFocusedView()
            if (r0 == 0) goto L3f
            android.view.View r2 = r1.mView
            if (r0 == r2) goto L20
            android.view.ViewParent r2 = r0.getParent()
        L1a:
            if (r2 == 0) goto L3f
            android.view.View r3 = r1.mView
            if (r2 != r3) goto L3a
        L20:
            r0.requestFocus()
            r2 = 2
            boolean r2 = androidx.fragment.app.w.N(r2)
            if (r2 == 0) goto L3f
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L3f
        L3a:
            android.view.ViewParent r2 = r2.getParent()
            goto L1a
        L3f:
            r0 = 0
            r1.setFocusedView(r0)
            r1.performResume()
            z8b r2 = r4.a
            r3 = 0
            r2.u(r1, r3)
            androidx.fragment.app.a0 r4 = r4.b
            java.lang.String r2 = r1.mWho
            r4.i(r0, r2)
            r1.mSavedFragmentState = r0
            r1.mSavedViewState = r0
            r1.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.k():void");
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new y(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.w(false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleF0 = fragment.mChildFragmentManager.f0();
            if (!bundleF0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleF0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView != null) {
            if (w.N(2)) {
                Objects.toString(fragment);
                Objects.toString(fragment.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            fragment.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                fragment.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            fragment.mViewLifecycleOwner.e.b(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            fragment.mSavedViewRegistryState = bundle;
        }
    }
}
