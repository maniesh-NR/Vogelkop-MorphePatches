package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.w;
import com.opera.android.InputFilterFrameLayout;
import com.opera.android.Lazy;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k24 extends ryl implements l24 {
    public m24 c;
    public final vr3 d = new vr3();
    public j24 e;

    public void L() {
        vr3 vr3Var = this.d;
        if (vr3Var.b) {
            vr3Var.b = false;
            vr3Var.f();
            ViewGroup viewGroup = (ViewGroup) vr3Var.c;
            if (viewGroup != null) {
                if (vr3Var.b) {
                    viewGroup.setImportantForAccessibility(vr3Var.a);
                } else {
                    viewGroup.setImportantForAccessibility(4);
                }
            }
        }
        j24 j24Var = this.e;
        if (j24Var == null || (this instanceof ar8)) {
            return;
        }
        j24Var.a = true;
    }

    @Override // defpackage.l24
    public final boolean V() {
        if (!i0()) {
            return true;
        }
        m0();
        return true;
    }

    @Override // defpackage.l24
    public final boolean Z() {
        i0();
        return true;
    }

    @Override // defpackage.ryl
    public void h0(w wVar) {
        Lazy lazyB = requireActivity().s().b();
        if (lazyB != null) {
            ((gjm) lazyB.get()).c.C(null);
        } else {
            wVar.X();
        }
    }

    @Override // defpackage.l24
    public boolean j() {
        return false;
    }

    public int k0() {
        return 0;
    }

    public void l() {
        boolean z = !isRemoving();
        vr3 vr3Var = this.d;
        if (z != vr3Var.b) {
            vr3Var.b = z;
            vr3Var.f();
            ViewGroup viewGroup = (ViewGroup) vr3Var.c;
            if (viewGroup != null) {
                if (vr3Var.b) {
                    viewGroup.setImportantForAccessibility(vr3Var.a);
                } else {
                    viewGroup.setImportantForAccessibility(4);
                }
            }
        }
        j24 j24Var = this.e;
        if (j24Var == null || (this instanceof ar8)) {
            return;
        }
        j24Var.a = false;
    }

    public void l0(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.d.c;
        if (viewGroup != null && viewGroup.findFocus() != null) {
            l5b l5bVar = q9n.c;
            q9n.u(getView());
        }
        g0();
    }

    public void m0() {
    }

    public abstract View n0(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void onAttach(Context context) {
        super.onAttach(context);
        m24 m24VarY = this.c;
        if (m24VarY == null) {
            m24VarY = zi4.y(getContext());
            this.c = m24VarY;
        }
        m24VarY.a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return n0(layoutInflater, null);
        }
        Context context = viewGroup.getContext();
        int iK0 = k0();
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(viewGroup.getContext());
        if (iK0 != 0 && dllVarV != null) {
            context = new s8n(context, iK0);
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j24 j24Var = new j24(context);
        this.e = j24Var;
        if (iK0 != 0 && dllVarV != null) {
            TypedValue typedValue = new TypedValue();
            typedValue.type = 2;
            typedValue.resourceId = iK0;
            typedValue.data = iK0;
            u8n.f(dllVarV, j24Var, new ff2(u8n.h, typedValue), null);
        }
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e.addView(n0(layoutInflaterFrom, this.e));
        return this.e;
    }

    public void onDestroyView() {
        vr3 vr3Var = this.d;
        ViewGroup viewGroup = (ViewGroup) vr3Var.c;
        if (viewGroup != null && viewGroup.findFocus() != null) {
            q9n.v(getActivity().getWindow());
        }
        super.onDestroyView();
        if (((ViewGroup) vr3Var.c) != null) {
            vr3Var.c = null;
            vr3Var.d = null;
            vr3Var.f();
            ViewGroup viewGroup2 = (ViewGroup) vr3Var.c;
            if (viewGroup2 != null) {
                vr3Var.a = viewGroup2.getImportantForAccessibility();
            }
            ViewGroup viewGroup3 = (ViewGroup) vr3Var.c;
            if (viewGroup3 != null) {
                if (vr3Var.b) {
                    viewGroup3.setImportantForAccessibility(vr3Var.a);
                } else {
                    viewGroup3.setImportantForAccessibility(4);
                }
            }
        }
        this.e = null;
    }

    public void onDetach() {
        this.c.c(this);
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        int i = InputFilterFrameLayout.c;
        view.setClickable(true);
        view.setFocusable(false);
        view.setOnGenericMotionListener(new v8b());
        view.setOnHoverListener(new w8b());
        PointerIcon systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        WeakHashMap weakHashMap = r5n.a;
        j5n.a(view, systemIcon);
        ViewGroup viewGroup = (ViewGroup) view;
        vr3 vr3Var = this.d;
        if (viewGroup != ((ViewGroup) vr3Var.c)) {
            vr3Var.c = viewGroup;
            vr3Var.d = null;
            vr3Var.f();
            ViewGroup viewGroup2 = (ViewGroup) vr3Var.c;
            if (viewGroup2 != null) {
                vr3Var.a = viewGroup2.getImportantForAccessibility();
            }
            ViewGroup viewGroup3 = (ViewGroup) vr3Var.c;
            if (viewGroup3 == null) {
                return;
            }
            if (vr3Var.b) {
                viewGroup3.setImportantForAccessibility(vr3Var.a);
            } else {
                viewGroup3.setImportantForAccessibility(4);
            }
        }
    }

    @Override // defpackage.l24
    public final boolean u() {
        if (i0()) {
            l0(true);
        }
        return true;
    }
}
