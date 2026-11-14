package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.opera.android.custom_views.RadioButton;

/* loaded from: classes.dex */
public final class d1c extends nz0 {
    public final String a;
    public final int b;
    public final z0c c;
    public RadioButton d;
    public RadioButton e;

    public d1c(String str, int i, z0c z0cVar) {
        super(true, false);
        this.a = str;
        this.b = i;
        this.c = z0cVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.widget.TextView, com.opera.android.custom_views.RadioButton] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.widget.TextView, com.opera.android.custom_views.RadioButton] */
    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        LinearLayout linearLayout = new LinearLayout(az0Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(az0Var.getContext());
        ?? r2 = (RadioButton) kf.g(layoutInflaterFrom, linearLayout).c;
        this.d = r2;
        r2.setText(2132021981);
        ?? r1 = (RadioButton) kf.g(layoutInflaterFrom, linearLayout).c;
        this.e = r1;
        r1.setText(2132021982);
        az0Var.setTitle(this.a).setView(linearLayout);
    }

    @Override // defpackage.nz0
    public final void onShowDialog(final bz0 bz0Var) {
        super.onShowDialog(bz0Var);
        int i = this.b;
        if (i == 0) {
            this.d.setChecked(true);
            this.d.jumpDrawablesToCurrentState();
        } else if (i == 1) {
            this.e.setChecked(true);
            this.e.jumpDrawablesToCurrentState();
        }
        final byte b = 0;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: c1c
            public final /* synthetic */ d1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                bz0 bz0Var2 = bz0Var;
                d1c d1cVar = this.b;
                switch (b2) {
                    case 0:
                        d1cVar.d.setChecked(true);
                        z0c z0cVar = d1cVar.c;
                        f1c f1cVar = (f1c) z0cVar.b;
                        i0c i0cVar = (i0c) z0cVar.c;
                        f1cVar.getClass();
                        if (i0cVar.b != 0) {
                            f1cVar.z.j(i0cVar.a, 0, true);
                        }
                        bz0Var2.dismiss();
                        break;
                    default:
                        d1cVar.e.setChecked(true);
                        z0c z0cVar2 = d1cVar.c;
                        f1c f1cVar2 = (f1c) z0cVar2.b;
                        i0c i0cVar2 = (i0c) z0cVar2.c;
                        f1cVar2.getClass();
                        if (1 != i0cVar2.b) {
                            f1cVar2.z.j(i0cVar2.a, 1, true);
                        }
                        bz0Var2.dismiss();
                        break;
                }
            }
        });
        final byte b2 = 1;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: c1c
            public final /* synthetic */ d1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                bz0 bz0Var2 = bz0Var;
                d1c d1cVar = this.b;
                switch (b22) {
                    case 0:
                        d1cVar.d.setChecked(true);
                        z0c z0cVar = d1cVar.c;
                        f1c f1cVar = (f1c) z0cVar.b;
                        i0c i0cVar = (i0c) z0cVar.c;
                        f1cVar.getClass();
                        if (i0cVar.b != 0) {
                            f1cVar.z.j(i0cVar.a, 0, true);
                        }
                        bz0Var2.dismiss();
                        break;
                    default:
                        d1cVar.e.setChecked(true);
                        z0c z0cVar2 = d1cVar.c;
                        f1c f1cVar2 = (f1c) z0cVar2.b;
                        i0c i0cVar2 = (i0c) z0cVar2.c;
                        f1cVar2.getClass();
                        if (1 != i0cVar2.b) {
                            f1cVar2.z.j(i0cVar2.a, 1, true);
                        }
                        bz0Var2.dismiss();
                        break;
                }
            }
        });
    }
}
