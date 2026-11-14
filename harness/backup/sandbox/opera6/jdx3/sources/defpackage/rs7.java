package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.OperaTextInputEditText;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class rs7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ss7 b;

    public /* synthetic */ rs7(ss7 ss7Var, byte b) {
        this.a = b;
        this.b = ss7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ss7 ss7Var = this.b;
        switch (b) {
            case 0:
                Window window = ss7Var.getActivity().getWindow();
                l5b l5bVar = q9n.c;
                View currentFocus = window.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                q9n.u(window.getDecorView());
                ml3 ml3VarO = ss7Var.B;
                if (ml3VarO == null) {
                    ml3VarO = ((h) ss7Var.A).o();
                }
                al3 al3Var = ss7Var.v;
                List listSingletonList = al3Var != null ? Collections.singletonList(al3Var) : Collections.EMPTY_LIST;
                fl3 fl3Var = new fl3(ss7Var.A, new dg7(ss7Var, (byte) 4));
                fl3Var.setArguments(fl3.G0(listSingletonList, ml3VarO, 1));
                new zhj(new wzg(fl3Var, fl3.class, (byte) 4), null, 2, 4097, null, false, Arrays.asList(new n6h[0])).c(ss7Var.requireContext());
                break;
            case 1:
                if (ss7Var.J0()) {
                    if (ss7Var.B == null) {
                        ss7Var.B = ss7Var.C.b(ss7Var.A);
                    }
                    al3 al3VarG0 = ss7Var.G0(ss7Var.v, ((OperaTextInputEditText) ss7Var.t.d).getText().toString().trim());
                    if (!((jkj) al3VarG0).c) {
                        ((SharedPreferences) ((h) ss7Var.A).j.get()).edit().putLong("last_folder", ss7Var.B.getId()).apply();
                    }
                    boolean z = ss7Var.v == null;
                    i53 i53Var = ss7Var.A;
                    ml3 ml3Var = ss7Var.B;
                    if (z) {
                        ((h) i53Var).getClass();
                        h.i(al3VarG0, ml3Var);
                        if (ss7Var.y) {
                            qim qimVar = ss7Var.getActivity().o;
                            Objects.requireNonNull(qimVar);
                            ysj ysjVar = qimVar.e;
                            ysjVar.b(am2.i(2132018044, 2500, ysjVar), ijm.b);
                        }
                    } else {
                        i53Var.g(al3VarG0, ml3Var);
                    }
                    ss7Var.M0(vb0.b);
                    ss7Var.g0();
                    break;
                }
                break;
            default:
                ss7Var.g0();
                break;
        }
    }
}
