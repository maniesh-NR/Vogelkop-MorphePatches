package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.nm9;
import defpackage.ol9;
import defpackage.ql9;
import defpackage.um9;
import defpackage.vm9;
import defpackage.whh;

/* loaded from: classes.dex */
public final class t implements LayoutInflater.Factory2 {
    public final w a;

    public t(w wVar) {
        this.a = wVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        z zVarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        w wVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, wVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, whh.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(ol9.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentE = resourceId != -1 ? wVar.E(resourceId) : null;
                    if (fragmentE == null && string != null) {
                        fragmentE = wVar.F(string);
                    }
                    if (fragmentE == null && id != -1) {
                        fragmentE = wVar.E(id);
                    }
                    if (fragmentE == null) {
                        fragmentE = wVar.L().a(context.getClassLoader(), attributeValue);
                        fragmentE.mFromLayout = true;
                        fragmentE.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentE.mContainerId = id;
                        fragmentE.mTag = string;
                        fragmentE.mInLayout = true;
                        fragmentE.mFragmentManager = wVar;
                        ql9 ql9Var = wVar.x;
                        fragmentE.mHost = ql9Var;
                        fragmentE.onInflate((Context) ql9Var.b, attributeSet, fragmentE.mSavedFragmentState);
                        zVarG = wVar.a(fragmentE);
                        if (w.N(2)) {
                            fragmentE.toString();
                        }
                    } else {
                        if (fragmentE.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentE.mInLayout = true;
                        fragmentE.mFragmentManager = wVar;
                        ql9 ql9Var2 = wVar.x;
                        fragmentE.mHost = ql9Var2;
                        fragmentE.onInflate((Context) ql9Var2.b, attributeSet, fragmentE.mSavedFragmentState);
                        zVarG = wVar.g(fragmentE);
                        if (w.N(2)) {
                            fragmentE.toString();
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    um9 um9Var = vm9.a;
                    vm9.b(new nm9(fragmentE, "Attempting to use <fragment> tag to add fragment " + fragmentE + " to container " + viewGroup));
                    vm9.a(fragmentE).a.getClass();
                    fragmentE.mContainer = viewGroup;
                    zVarG.i();
                    zVarG.h();
                    View view2 = fragmentE.mView;
                    if (view2 == null) {
                        qp2.n(sko.k("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentE.mView.getTag() == null) {
                        fragmentE.mView.setTag(string);
                    }
                    fragmentE.mView.addOnAttachStateChangeListener(new s(this, zVarG));
                    return fragmentE.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
