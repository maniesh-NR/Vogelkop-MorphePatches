package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class vv3 extends nz0 {
    public final x5f a;
    public final boolean b;
    public final gjm c;
    public vb0 d;
    public View e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ BrowserActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv3(boolean z, BrowserActivity browserActivity, x5f x5fVar, gjm gjmVar) {
        super(true, false);
        this.h = browserActivity;
        this.d = vb0.d;
        this.a = x5fVar;
        this.b = z;
        this.c = gjmVar;
    }

    public final void b() {
        if (this.g) {
            return;
        }
        vb0 vb0Var = this.d;
        boolean z = this.f;
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            ud0 ud0Var = new ud0(2443, -1, 4);
            ud0Var.q(0, 1, vb0Var);
            ud0Var.r(3, 1, z);
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(13);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 13, am2.q(xb0VarX, 13, 1)) : new hf0(xb0VarX, 13, list)).add(ud0Var);
            x5fVar.U0(x56VarF);
        }
        this.g = true;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final Drawable getPositiveButtonIcon(Context context) {
        Drawable drawableF = sgb.F(2131232204, context);
        j14.n0(drawableF, f03.t(2130969273, context, 2131101243));
        return drawableF;
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019755);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083350;
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558699, (ViewGroup) null);
        this.e = viewInflate.findViewById(2131363920);
        Context context = az0Var.getContext();
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        HashSet hashSetA0 = z4o.A0(operaApplication.J().z("exit_clear_data_categories"));
        boolean zIsEmpty = hashSetA0.isEmpty();
        boolean z = false;
        if (!zIsEmpty) {
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(2131362283);
            viewGroup.setVisibility(0);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            for (r25 r25Var : z4o.R()) {
                if (hashSetA0.contains(r25Var.a)) {
                    View viewInflate2 = layoutInflaterFrom.inflate(2131558698, viewGroup, false);
                    viewGroup.addView(viewInflate2);
                    TextView textView = (TextView) w1h.j(2131363485, viewInflate2);
                    if (textView == null) {
                        t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(2131363485)));
                        return;
                    } else {
                        textView.setText(r25Var.b.a(textView.getResources()));
                    }
                }
            }
        }
        az0Var.b(2132018913);
        ArrayList arrayList = operaApplication.m().a.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((re7) obj).m()) {
                z = true;
                break;
            }
        }
        az0Var.a(!zIsEmpty ? z ? 2132018910 : 2132018909 : z ? 2132018912 : 2132018911);
        az0Var.setView(viewInflate);
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        b();
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.d = vb0.c;
    }

    @Override // defpackage.nz0
    public final void onShowDialog(final bz0 bz0Var) {
        super.onShowDialog(bz0Var);
        View view = this.e;
        if (view != null) {
            final byte b = 0;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: sh8
                public final /* synthetic */ vv3 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r4v9, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b2 = b;
                    bz0 bz0Var2 = bz0Var;
                    vv3 vv3Var = this.b;
                    switch (b2) {
                        case 0:
                            vv3Var.f = true;
                            bz0Var2.dismiss();
                            vv3Var.c.e(new n35(), false);
                            break;
                        default:
                            vv3Var.d = vb0.b;
                            vv3Var.b();
                            bz0Var2.setCancelable(false);
                            View view3 = vv3Var.e;
                            if (view3 != null) {
                                view3.setEnabled(false);
                            }
                            bz0Var2.f(-2).setEnabled(false);
                            ?? r4 = (OperaMaterialButton) bz0Var2.f(-1);
                            r4.setClickable(false);
                            r4.R(true);
                            BrowserActivity browserActivity = vv3Var.h;
                            int i = BrowserActivity.E1;
                            browserActivity.f1();
                            break;
                    }
                }
            });
        }
        final byte b2 = 1;
        bz0Var.f(-1).setOnClickListener(new View.OnClickListener(this) { // from class: sh8
            public final /* synthetic */ vv3 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r4v9, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                bz0 bz0Var2 = bz0Var;
                vv3 vv3Var = this.b;
                switch (b22) {
                    case 0:
                        vv3Var.f = true;
                        bz0Var2.dismiss();
                        vv3Var.c.e(new n35(), false);
                        break;
                    default:
                        vv3Var.d = vb0.b;
                        vv3Var.b();
                        bz0Var2.setCancelable(false);
                        View view3 = vv3Var.e;
                        if (view3 != null) {
                            view3.setEnabled(false);
                        }
                        bz0Var2.f(-2).setEnabled(false);
                        ?? r4 = (OperaMaterialButton) bz0Var2.f(-1);
                        r4.setClickable(false);
                        r4.R(true);
                        BrowserActivity browserActivity = vv3Var.h;
                        int i = BrowserActivity.E1;
                        browserActivity.f1();
                        break;
                }
            }
        });
        if (this.b) {
            bz0Var.f(-1).requestFocus();
        }
        q9n.e(bz0Var.f(-1), new u7(new uk6(this, (byte) 25), (byte) 8));
    }
}
