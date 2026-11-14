package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls3i;", "Lk24;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s3i extends k24 {
    public final zyk f = z4c.b(new yse(this, 9));
    public j7i g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, ch5, d4] */
    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559273, viewGroup, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        j7i j7iVar = this.g;
        if (j7iVar == null) {
            qp2.o("Required value was null.");
            return null;
        }
        ?? ch5Var = new ch5(frameLayout.getContext());
        ch5Var.m();
        ch5Var.o(new ue5(1320616489, new l7i(j7iVar, (byte) 0), true));
        frameLayout.addView(ch5Var);
        return frameLayout;
    }

    @Override // defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n3i n3iVar = (n3i) p37.E(requireArguments());
        zyk zykVar = this.f;
        this.g = ((t3i) zykVar.getValue()).b.c(this, n3iVar.a, new e6g(0, this, s3i.class, "close", "close()V", 0, (byte) 8));
        nv6 nv6VarB = ((t3i) zykVar.getValue()).c.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("rewards.has_opened_ui", true);
        nv6VarB.w();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.g = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        j9h j9hVar = new j9h((byte) 19);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, j9hVar);
        view.addOnAttachStateChangeListener(new tm9(view, (byte) 1));
        cgh.h(view, new dxh(2130970872), new dxh(2130970433));
    }

    public final void setArguments(Bundle bundle) {
        p4i p4iVar;
        String str;
        t7i t7iVar;
        super/*androidx.fragment.app.Fragment*/.setArguments(bundle);
        if (bundle == null || (str = (p4iVar = ((n3i) p37.E(bundle)).a).b) == null) {
            return;
        }
        gpm gpmVarH = bwg.H(str);
        ek6 ek6VarA = gpmVarH == null ? null : qs7.A(gpmVarH);
        if (ek6VarA == null || (t7iVar = this.g) == null) {
            return;
        }
        t7iVar.e(ek6VarA, p4iVar.c);
    }
}
