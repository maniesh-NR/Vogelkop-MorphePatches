package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vxi extends dej {
    public final /* synthetic */ byte c = 0;
    public final Object d;
    public final Object e;
    public Object f;

    public vxi(mej mejVar, String str, ArrayList arrayList, lz8 lz8Var) {
        super(mejVar);
        this.d = str;
        this.e = arrayList;
        this.f = lz8Var;
    }

    public vxi(mej mejVar, swf swfVar, qp2 qp2Var) {
        super(mejVar);
        this.d = qp2Var;
        this.e = swfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.View, androidx.appcompat.widget.AppCompatImageView, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.dej
    public final View a(Context context) {
        switch (this.c) {
            case 0:
                pt1 pt1VarD = pt1.d(LayoutInflater.from(context));
                ((TextView) pt1VarD.g).setText(context.getString(2132022383));
                yq1 yq1Var = (StylingTextView) pt1VarD.c;
                yq1Var.setText((String) this.d);
                yq1Var.setVisibility(0);
                ((OperaMaterialButton) pt1VarD.e).setVisibility(4);
                RecyclerView recyclerView = (RecyclerView) pt1VarD.f;
                recyclerView.y0(new x93((Object) this, (byte) 5));
                recyclerView.C0(new LinearLayoutManager(1, false));
                recyclerView.m(new b5a(recyclerView, false, new lld((Object) this, (byte) 24), 2130969329, false));
                int size = ((ArrayList) this.e).size();
                MaterialButton materialButton = (OperaMaterialButton) pt1VarD.d;
                if (size == 1) {
                    materialButton.setVisibility(0);
                    materialButton.setOnClickListener(new h4i((Object) this, (byte) 4));
                } else {
                    materialButton.setVisibility(8);
                }
                return (FrameLayout) pt1VarD.b;
            default:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                View viewInflate = layoutInflaterFrom.inflate(2131559329, (ViewGroup) null, false);
                int i = 2131362527;
                if (w1h.j(2131362527, viewInflate) != null) {
                    i = 2131363782;
                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
                    if (linearLayout != null) {
                        LayoutDirectionFrameLayout layoutDirectionFrameLayout = (LayoutDirectionFrameLayout) viewInflate;
                        yq1 yq1Var2 = (StylingTextView) w1h.j(2131363525, viewInflate);
                        if (yq1Var2 != null) {
                            this.f = new p8f(this, layoutInflaterFrom, linearLayout, false, (byte) 18);
                            yq1Var2.setText(2132021501);
                            for (qhj qhjVar : qhj.values()) {
                                p8f p8fVar = (p8f) this.f;
                                LinearLayout linearLayout2 = (LinearLayout) p8fVar.c;
                                qwf qwfVar = qhjVar.a;
                                if (qwf.k(qwfVar)) {
                                    boolean zContains = ((swf) ((vxi) p8fVar.d).e).f.contains(qwfVar);
                                    View viewInflate2 = ((LayoutInflater) p8fVar.b).inflate(2131559311, (ViewGroup) linearLayout2, false);
                                    linearLayout2.addView(viewInflate2);
                                    WeakHashMap weakHashMap = r5n.a;
                                    ?? r10 = (StylingImageView) ((View) m5n.f(viewInflate2, 2131362594));
                                    r10.setImageResource(qhjVar.c);
                                    byte b = 2;
                                    p73 p73Var = new p73(r10, (byte) 2);
                                    dll dllVarS = q9n.s(r10);
                                    if (dllVarS != null) {
                                        u8n.b(dllVarS, r10, p73Var);
                                    }
                                    p73Var.a(r10);
                                    ((TextView) ((View) m5n.f(viewInflate2, 2131363525))).setText(qhjVar.b);
                                    viewInflate2.findViewById(2131362305).setVisibility(zContains ? 0 : 4);
                                    viewInflate2.setOnClickListener(new ks8(new hv6(b, p8fVar, qwfVar, zContains), b));
                                }
                            }
                            return layoutDirectionFrameLayout;
                        }
                        i = 2131363525;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
        }
    }
}
