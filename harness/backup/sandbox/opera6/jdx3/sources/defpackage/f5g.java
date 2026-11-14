package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.AnimationEmptyListView;

/* loaded from: classes.dex */
public final class f5g extends LinearLayout {
    public final i5g a;
    public final i5g b;
    public final AnimationEmptyListView c;
    public final p5g d;
    public u3g e;

    public f5g(ViewGroup viewGroup, i5g i5gVar, i5g i5gVar2, u3g u3gVar, boolean z, boolean z2, boolean z3, boolean z4, final qfb qfbVar) {
        super(viewGroup.getContext());
        this.a = i5gVar;
        this.b = i5gVar2;
        int i = AnimationEmptyListView.e;
        Context context = viewGroup.getContext();
        int i2 = u3gVar.b;
        int i3 = u3gVar.a;
        int i4 = u3gVar.c;
        AnimationEmptyListView animationEmptyListView = new AnimationEmptyListView(context, null, 14);
        animationEmptyListView.c(i2);
        animationEmptyListView.b(i3);
        animationEmptyListView.c = i4 < -1 ? -1 : i4;
        this.c = animationEmptyListView;
        p5g p5gVar = new p5g(getContext());
        q5g q5gVar = (q5g) p5gVar.b;
        this.d = p5gVar;
        this.e = u3gVar;
        final byte b = 1;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(((i) i5gVar).itemView);
        final byte b2 = 0;
        ((i) i5gVar).itemView.setVisibility(z ? 0 : 8);
        addView(((i) i5gVar2).itemView);
        ((i) i5gVar2).itemView.setVisibility(z2 ? 0 : 8);
        animationEmptyListView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        addView(animationEmptyListView);
        addView(p5gVar);
        p5gVar.setVisibility(z3 ? 0 : 8);
        ((MaterialButton) q5gVar.d).setVisibility(z4 ? 0 : 8);
        ((MaterialButton) q5gVar.c).setOnClickListener(new View.OnClickListener() { // from class: e5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                qfb qfbVar2 = qfbVar;
                switch (b3) {
                    case 0:
                        t6g t6gVarI0 = ((t5g) qfbVar2.b).I0();
                        t6gVarI0.b.b.e(new d3b(), false);
                        ((x5f) t6gVarI0.k).l0(gm0.b);
                        break;
                    default:
                        t6g t6gVarI02 = ((t5g) qfbVar2.b).I0();
                        t6gVarI02.q = false;
                        t6gVarI02.i.F(t6gVarI02.t);
                        t6gVarI02.p.k(t6gVarI02.u);
                        xih.t(t6gVarI02.b.l, false, null);
                        ((x5f) t6gVarI02.k).l0(gm0.c);
                        break;
                }
            }
        });
        ((MaterialButton) q5gVar.d).setOnClickListener(new View.OnClickListener() { // from class: e5g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                qfb qfbVar2 = qfbVar;
                switch (b3) {
                    case 0:
                        t6g t6gVarI0 = ((t5g) qfbVar2.b).I0();
                        t6gVarI0.b.b.e(new d3b(), false);
                        ((x5f) t6gVarI0.k).l0(gm0.b);
                        break;
                    default:
                        t6g t6gVarI02 = ((t5g) qfbVar2.b).I0();
                        t6gVarI02.q = false;
                        t6gVarI02.i.F(t6gVarI02.t);
                        t6gVarI02.p.k(t6gVarI02.u);
                        xih.t(t6gVarI02.b.l, false, null);
                        ((x5f) t6gVarI02.k).l0(gm0.c);
                        break;
                }
            }
        });
    }
}
