package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.ObservableEditText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ly4 extends ltl implements View.OnClickListener {
    public List r;
    public bm8 s;
    public ky4 t;
    public TextInputLayout u;
    public zy9 v;
    public NestedScrollView w;
    public LinearLayout x;
    public MaterialButton y;

    public final void G0() {
        int childCount = this.x.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            TextInputLayout childAt = this.x.getChildAt(i);
            Object objFindViewById = childAt.findViewById(2131362306);
            if (objFindViewById == null) {
                if ((childAt instanceof TextInputLayout) && !TextUtils.isEmpty(childAt.e.getText().toString())) {
                    z = true;
                    break;
                }
            } else {
                if (((CheckBox) objFindViewById).n) {
                    z = true;
                    break;
                }
            }
        }
        this.y.setEnabled(z);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        super.l0(z);
        bm8 bm8Var = this.s;
        if (bm8Var != null) {
            ((ox8) bm8Var.b).f(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 2131364591) {
            ArrayList arrayList = new ArrayList();
            int childCount = this.x.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextInputLayout childAt = this.x.getChildAt(i);
                Object objFindViewById = childAt.findViewById(2131362306);
                if (objFindViewById != null) {
                    if (((CheckBox) objFindViewById).n) {
                        arrayList.add((tx8) childAt.getTag());
                    }
                } else if (childAt instanceof TextInputLayout) {
                    String string = childAt.e.getText().toString();
                    if (!TextUtils.isEmpty(string)) {
                        tx8 tx8Var = (tx8) childAt.getTag();
                        arrayList.add(new tx8(tx8Var.a, string, tx8Var.c));
                    }
                }
            }
            bm8 bm8Var = this.s;
            if (bm8Var != null) {
                ((ox8) bm8Var.b).f(arrayList);
            }
        } else {
            bm8 bm8Var2 = this.s;
            if (bm8Var2 != null) {
                ((ox8) bm8Var2.b).f(null);
            }
        }
        g0();
    }

    @Override // defpackage.ltl
    public final void u0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559130, viewGroup, false);
        viewGroup.addView(viewInflate);
        MaterialButton materialButtonJ = w1h.j(2131364591, viewInflate);
        if (materialButtonJ == null) {
            t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131364591)));
            return;
        }
        this.y = materialButtonJ;
        materialButtonJ.setOnClickListener(this);
        this.y.setEnabled(false);
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.w = (NestedScrollView) viewGroup;
        byte b = 0;
        View viewInflate = layoutInflater.inflate(2131559129, viewGroup, false);
        viewGroup.addView(viewInflate);
        if (viewInflate == null) {
            t3p.q("rootView");
            return;
        }
        this.x = (LinearLayout) viewInflate;
        List<tx8> list = this.r;
        if (list != null) {
            for (tx8 tx8Var : list) {
                String str = tx8Var.d;
                String str2 = tx8Var.e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                LinearLayout linearLayout = this.x;
                if (zIsEmpty) {
                    View viewInflate2 = layoutInflater.inflate(2131559132, (ViewGroup) linearLayout, false);
                    viewInflate2.setTag(tx8Var);
                    TextInputLayout textInputLayout = (TextInputLayout) viewInflate2;
                    this.u = textInputLayout;
                    textInputLayout.t(str2);
                    ObservableEditText observableEditText = (ObservableEditText) this.u.e;
                    ky4 ky4Var = this.t;
                    if (ky4Var == null) {
                        ky4Var = new ky4(this, b);
                        this.t = ky4Var;
                    }
                    observableEditText.F(ky4Var);
                    this.x.addView(viewInflate2);
                } else {
                    View viewInflate3 = layoutInflater.inflate(2131559131, (ViewGroup) linearLayout, false);
                    viewInflate3.setTag(tx8Var);
                    ((TextView) viewInflate3.findViewById(2131363485)).setText(tx8Var.d);
                    TextView textView = (TextView) viewInflate3.findViewById(2131362512);
                    textView.setText(str2);
                    textView.setVisibility(!TextUtils.isEmpty(str2) ? 0 : 8);
                    CheckBox checkBox = (CheckBox) viewInflate3.findViewById(2131362306);
                    zy9 zy9Var = this.v;
                    if (zy9Var == null) {
                        zy9Var = new zy9(this);
                        this.v = zy9Var;
                    }
                    checkBox.m = zy9Var;
                    viewInflate3.setOnClickListener(new jy4(b));
                    this.x.addView(viewInflate3);
                }
            }
        }
    }
}
