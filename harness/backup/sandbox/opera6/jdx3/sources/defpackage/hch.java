package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;
import com.opera.android.PushedContentHandler;
import com.opera.android.custom_views.OperaIntroView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class hch extends Fragment {
    public OperaIntroView c;
    public nu5 d;
    public boolean f;
    public final pjg a = new pjg(this, 12);
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean e = true;

    public final void f0() {
        this.b.removeCallbacks(this.a);
        if (isResumed()) {
            getActivity().b(true);
        } else {
            this.f = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.postDelayed(this.a, 10000L);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558646, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.b.removeCallbacks(this.a);
    }

    public final void onDestroyView() {
        nu5 nu5Var = this.d;
        nu5Var.b.removeCallbacks(nu5Var);
        nu5Var.d = 0.0f;
        nu5Var.run();
        this.d = null;
        this.c = null;
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        if (this.f) {
            this.b.post(new pjg(this, (byte) 12));
        } else if (this.e) {
            this.e = false;
            Context context = getContext();
            String[] strArr = OperaApplication.K;
            PushedContentHandler pushedContentHandlerF = ((OperaApplication) context.getApplicationContext()).F();
            gch gchVar = new gch();
            gchVar.a = this;
            getLifecycle().a(gchVar);
            pushedContentHandlerF.b(false, gchVar);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OperaIntroView operaIntroView = (OperaIntroView) view.findViewById(2131363229);
        this.c = operaIntroView;
        this.d = new nu5(operaIntroView, this.b);
        List listAsList = Arrays.asList(new Integer[101]);
        for (int i = 0; i <= 100; i++) {
            listAsList.set(i, Integer.valueOf(i));
        }
        this.c.D(new wub(this), listAsList);
        OperaIntroView operaIntroView2 = this.c;
        operaIntroView2.C(1);
        operaIntroView2.s(0, 0, 156, null);
    }
}
