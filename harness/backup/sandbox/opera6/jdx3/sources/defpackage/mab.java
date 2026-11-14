package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.OperaIntroView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class mab extends Fragment {
    public final Handler a = new Handler(Looper.getMainLooper());
    public OperaIntroView b;
    public nu5 c;
    public u85 d;
    public int e;

    public final void f0(r0k r0kVar, Locale locale, x5f x5fVar) {
        wci wciVar = new wci();
        ((ArrayList) wciVar.c).add(locale);
        r0kVar.i(new n9h(wciVar)).addOnSuccessListener(new a32((Object) this, (Object) r0kVar, (Object) x5fVar, (byte) 15)).addOnFailureListener(new ge5(this, x5fVar, (byte) 26));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.e && i2 == 0) {
            requireActivity().J();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = mdb.b.nextInt() & 65535;
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        r0k r0kVarK = ((OperaApplication) getContext().getApplicationContext()).K();
        String strE = wwc.e(getContext());
        Locale localeF = wwc.f(strE);
        r0kVarK.c().addOnSuccessListener(new uf(this, strE, r0kVarK, localeF, x5fVar, (byte) 2)).addOnFailureListener(new ws1(this, x5fVar, r0kVarK, localeF, (byte) 9));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131558646, viewGroup, false);
        int i = 2131363229;
        if (((OperaIntroView) w1h.j(2131363229, viewInflate)) != null) {
            i = 2131363230;
            TextView textView = (TextView) w1h.j(2131363230, viewInflate);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                textView.setText(2132021623);
                textView.setVisibility(0);
                return linearLayout;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
        u85 u85Var = this.d;
        if (u85Var != null) {
            u85Var.c();
            this.d = null;
        }
    }

    public final void onDestroyView() {
        nu5 nu5Var = this.c;
        nu5Var.b.removeCallbacks(nu5Var);
        nu5Var.d = 0.0f;
        nu5Var.run();
        this.c = null;
        this.b = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OperaIntroView operaIntroView = (OperaIntroView) view.findViewById(2131363229);
        this.b = operaIntroView;
        this.c = new nu5(operaIntroView, this.a);
        List listAsList = Arrays.asList(new Integer[101]);
        for (int i = 0; i <= 100; i++) {
            listAsList.set(i, Integer.valueOf(i));
        }
        this.b.D(new qe6(this, (byte) 20), listAsList);
        OperaIntroView operaIntroView2 = this.b;
        operaIntroView2.C(1);
        operaIntroView2.s(0, 0, 156, null);
    }
}
