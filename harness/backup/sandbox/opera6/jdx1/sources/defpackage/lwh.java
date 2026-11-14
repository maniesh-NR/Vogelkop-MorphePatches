package defpackage;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.a;
import java.util.HashSet;

/* loaded from: classes.dex */
public class lwh extends Fragment {
    public final jh a;
    public final lld b;
    public final HashSet c;
    public kwh d;
    public lwh e;

    public lwh() {
        jh jhVar = new jh((byte) 0);
        this.b = new lld(this, (byte) 19);
        this.c = new HashSet();
        this.a = jhVar;
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            lwh lwhVar = this.e;
            if (lwhVar != null) {
                lwhVar.c.remove(this);
                this.e = null;
            }
            lwh lwhVarC = a.b(activity).f.c(activity.getFragmentManager(), mwh.e(activity));
            this.e = lwhVarC;
            if (equals(lwhVarC)) {
                return;
            }
            this.e.c.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.c();
        lwh lwhVar = this.e;
        if (lwhVar != null) {
            lwhVar.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        lwh lwhVar = this.e;
        if (lwhVar != null) {
            lwhVar.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.g();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.h();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
