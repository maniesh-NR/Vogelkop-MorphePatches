package defpackage;

import android.content.Intent;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.OrientationFitConstraintLayout;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le2b;", "Llj;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e2b extends lj {
    public f2b r;
    public final zyk s;

    public e2b() {
        super(2132019298, 0);
        this.s = z4c.b(new t2(this, (byte) 24));
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final byte b = 0;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558932, viewGroup, false);
        viewGroup.addView(constraintLayoutInflate);
        int i = 2131362414;
        if (((LinearLayout) w1h.j(2131362414, constraintLayoutInflate)) != null) {
            i = 2131363183;
            if (((ImageView) w1h.j(2131363183, constraintLayoutInflate)) != null) {
                i = 2131363191;
                if (((OrientationFitConstraintLayout) w1h.j(2131363191, constraintLayoutInflate)) != null) {
                    i = 2131363193;
                    MaterialButton materialButtonJ = w1h.j(2131363193, constraintLayoutInflate);
                    if (materialButtonJ != null) {
                        i = 2131363194;
                        MaterialButton materialButtonJ2 = w1h.j(2131363194, constraintLayoutInflate);
                        if (materialButtonJ2 != null) {
                            i = 2131363951;
                            TextView textView = (TextView) w1h.j(2131363951, constraintLayoutInflate);
                            if (textView != null) {
                                this.r = new f2b(constraintLayoutInflate, materialButtonJ, materialButtonJ2, textView, (byte) 0);
                                SpannableString spannableStringD = n1h.d(getString(2132020211), new owj[]{new owj("<ps>", "</ps>", new jng(2, requireContext(), new rl((byte) 4)))});
                                f2b f2bVar = this.r;
                                if (f2bVar == null) {
                                    f2bVar = null;
                                }
                                phj.u0(f2bVar.e, spannableStringD);
                                f2b f2bVar2 = this.r;
                                if (f2bVar2 == null) {
                                    f2bVar2 = null;
                                }
                                f2bVar2.c.setOnClickListener(new View.OnClickListener(this) { // from class: c2b
                                    public final /* synthetic */ e2b b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b2 = b;
                                        byte b3 = 0;
                                        e2b e2bVar = this.b;
                                        switch (b2) {
                                            case 0:
                                                h2b h2bVar = (h2b) e2bVar.s.getValue();
                                                d2b d2bVar = new d2b(e2bVar, b3);
                                                pm3 pm3Var = h2bVar.b;
                                                qj2 qj2Var = new qj2(d2bVar, (byte) 3);
                                                pm3Var.getClass();
                                                int i2 = ImportChromeBookmarksActivity.b0;
                                                o0g.E0(pm3Var.a, qj2Var, w2b.c);
                                                ((x5f) h2bVar.c).X(z80.d);
                                                break;
                                            default:
                                                h2b h2bVar2 = (h2b) e2bVar.s.getValue();
                                                d2b d2bVar2 = new d2b(e2bVar, (byte) 1);
                                                pm3 pm3Var2 = h2bVar2.b;
                                                g2b g2bVar = new g2b(d2bVar2, h2bVar2, b3);
                                                pm3Var2.getClass();
                                                pm3Var2.a.D(new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("text/html"), g2bVar);
                                                ((x5f) h2bVar2.c).X(z80.e);
                                                break;
                                        }
                                    }
                                });
                                f2b f2bVar3 = this.r;
                                final byte b2 = 1;
                                (f2bVar3 != null ? f2bVar3 : null).d.setOnClickListener(new View.OnClickListener(this) { // from class: c2b
                                    public final /* synthetic */ e2b b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b22 = b2;
                                        byte b3 = 0;
                                        e2b e2bVar = this.b;
                                        switch (b22) {
                                            case 0:
                                                h2b h2bVar = (h2b) e2bVar.s.getValue();
                                                d2b d2bVar = new d2b(e2bVar, b3);
                                                pm3 pm3Var = h2bVar.b;
                                                qj2 qj2Var = new qj2(d2bVar, (byte) 3);
                                                pm3Var.getClass();
                                                int i2 = ImportChromeBookmarksActivity.b0;
                                                o0g.E0(pm3Var.a, qj2Var, w2b.c);
                                                ((x5f) h2bVar.c).X(z80.d);
                                                break;
                                            default:
                                                h2b h2bVar2 = (h2b) e2bVar.s.getValue();
                                                d2b d2bVar2 = new d2b(e2bVar, (byte) 1);
                                                pm3 pm3Var2 = h2bVar2.b;
                                                g2b g2bVar = new g2b(d2bVar2, h2bVar2, b3);
                                                pm3Var2.getClass();
                                                pm3Var2.a.D(new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("text/html"), g2bVar);
                                                ((x5f) h2bVar2.c).X(z80.e);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }
}
