package com.opera.android.settings.speed_dial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.settings.SettingsManager;
import defpackage.dll;
import defpackage.ei;
import defpackage.gjf;
import defpackage.h4i;
import defpackage.khh;
import defpackage.kkf;
import defpackage.lld;
import defpackage.p7j;
import defpackage.pbj;
import defpackage.q9n;
import defpackage.szj;
import defpackage.u8n;
import defpackage.uzj;
import defpackage.xzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/settings/speed_dial/SpeedDialShapePreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "lld", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpeedDialShapePreview extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public final p7j p;
    public lld q;
    public final gjf r;
    public final ei s;
    public final List t;
    public List u;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeedDialShapePreview(@NotNull Context context, AttributeSet attributeSet) {
        p7j p7jVar;
        super(context, attributeSet, 0);
        this.p = p7j.d;
        this.r = gjf.a(context);
        LayoutInflater.from(context).inflate(2131559345, (ViewGroup) this);
        int i = 2131364396;
        View viewJ = w1h.j(2131364396, this);
        if (viewJ != null) {
            i = 2131364397;
            View viewJ2 = w1h.j(2131364397, this);
            if (viewJ2 != null) {
                i = 2131364398;
                View viewJ3 = w1h.j(2131364398, this);
                if (viewJ3 != null) {
                    i = 2131364399;
                    View viewJ4 = w1h.j(2131364399, this);
                    if (viewJ4 != null) {
                        i = 2131364400;
                        View viewJ5 = w1h.j(2131364400, this);
                        if (viewJ5 != null) {
                            i = 2131364401;
                            View viewJ6 = w1h.j(2131364401, this);
                            if (viewJ6 != null) {
                                i = 2131364402;
                                ConstraintLayout constraintLayoutJ = w1h.j(2131364402, this);
                                if (constraintLayoutJ != null) {
                                    i = 2131364403;
                                    TextView textView = (TextView) w1h.j(2131364403, this);
                                    if (textView != null) {
                                        this.s = new ei(this, viewJ, viewJ2, viewJ3, viewJ4, viewJ5, viewJ6, constraintLayoutJ, textView);
                                        this.t = Arrays.asList(viewJ, viewJ2, viewJ3, viewJ4, viewJ5, viewJ6);
                                        this.u = l08.a;
                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.H);
                                        int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
                                        if (i2 >= 0 && this.p != (p7jVar = (p7j) xzj.a.get(i2))) {
                                            this.p = p7jVar;
                                            textView.setText(p7jVar.a);
                                            r();
                                        }
                                        typedArrayObtainStyledAttributes.recycle();
                                        textView.setText(this.p.a);
                                        kkf kkfVar = new kkf(this, (byte) 19);
                                        dll dllVarS = q9n.s(this);
                                        if (dllVarS != null) {
                                            u8n.b(dllVarS, this, kkfVar);
                                        }
                                        kkfVar.a(this);
                                        setClickable(true);
                                        setFocusable(true);
                                        setOnClickListener(new h4i((Object) this, (byte) 12));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        int iK = isSelected() ? j7h.k(2130970805, getContext()) : j7h.k(2130970804, getContext());
        int iK2 = isSelected() ? j7h.k(2130970803, getContext()) : j7h.k(2130970802, getContext());
        float fH = z7h.h(getContext(), 1.0f);
        List<View> list = this.t;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (View view : list) {
            pbj pbjVar = new pbj(this.r, this.p.b, fH, iK, iK2);
            view.setBackground(pbjVar);
            arrayList.add(pbjVar);
        }
        this.u = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelected(boolean z) {
        lld lldVar;
        p7j p7jVar;
        p7j p7jVar2;
        boolean zIsSelected = isSelected();
        super/*android.view.View*/.setSelected(z);
        this.s.b.setSelected(z);
        if (zIsSelected != z) {
            int iK = isSelected() ? j7h.k(2130970805, getContext()) : j7h.k(2130970804, getContext());
            int iK2 = isSelected() ? j7h.k(2130970803, getContext()) : j7h.k(2130970802, getContext());
            for (pbj pbjVar : this.u) {
                pbjVar.d.setColor(iK);
                pbjVar.invalidateSelf();
                pbjVar.e.setColor(iK2);
                pbjVar.invalidateSelf();
            }
            if (!z || (lldVar = this.q) == null) {
                return;
            }
            szj szjVar = (szj) lldVar.b;
            xtb[] xtbVarArr = szj.w;
            uzj uzjVar = (uzj) ((ekc) ((zyk) szjVar.I0().e.c).getValue()).g();
            if (uzjVar == null || (p7jVar = uzjVar.b) == null || (p7jVar2 = this.p) == p7jVar) {
                return;
            }
            SettingsManager settingsManager = szjVar.I0().b;
            settingsManager.getClass();
            settingsManager.V(p7jVar2.ordinal(), "speed_dial.shape");
        }
    }
}
