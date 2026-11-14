package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.bumptech.glide.a;
import com.google.android.tv.ads.controls.WhyThisAdFragment;
import java.util.HashSet;

/* loaded from: classes.dex */
public class nsk extends Fragment {
    public final jh a;
    public final yhe b;
    public final HashSet c;
    public nsk d;
    public kwh e;
    public WhyThisAdFragment f;

    public nsk() {
        jh jhVar = new jh((byte) 0);
        this.b = new yhe(this, (byte) 28);
        this.c = new HashSet();
        this.a = jhVar;
    }

    public final void f0(Context context, w wVar) {
        nsk nskVar = this.d;
        if (nskVar != null) {
            nskVar.c.remove(this);
            this.d = null;
        }
        nsk nskVarD = a.b(context).f.d(wVar, null, mwh.e(context));
        this.d = nskVarD;
        if (equals(nskVarD)) {
            return;
        }
        this.d.c.add(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        w fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                f0(getContext(), fragmentManager);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        nsk nskVar = this.d;
        if (nskVar != null) {
            nskVar.c.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f = null;
        nsk nskVar = this.d;
        if (nskVar != null) {
            nskVar.c.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
