package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public class lh extends Fragment {
    public final void onStart() {
        super.onStart();
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) contextRequireContext.getApplicationContext()).L().b.m(getActivity());
    }

    public final void onStop() {
        super.onStop();
        Context contextRequireContext = requireContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) contextRequireContext.getApplicationContext()).L().b.i(getActivity());
    }
}
