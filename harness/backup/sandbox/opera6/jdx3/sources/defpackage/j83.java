package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class j83 extends Fragment {
    public abstract View f0(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void g0(j83 j83Var) {
        if ((getParentFragment() instanceof xzg ? (xzg) getParentFragment() : null) == null) {
            return;
        }
        xzg.j0(getParentFragmentManager(), j83Var, true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup != null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        View viewF0 = f0(layoutInflater, viewGroup);
        if (viewF0 != null) {
            viewF0.setTransitionName("PrivacyMonitorDialogTransitionName");
        }
        return viewF0;
    }
}
