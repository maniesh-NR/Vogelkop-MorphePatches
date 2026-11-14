package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class s12 extends nz0 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public s12(g77 g77Var, String str) {
        super(true, false);
        this.c = str;
        this.d = g77Var;
    }

    public s12(boolean z, pxh pxhVar, Function0 function0) {
        super(false, true);
        this.b = z;
        this.c = pxhVar;
        this.d = function0;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 1:
                return context.getString(2132020040);
            default:
                return super.getNegativeButtonText(context);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 1:
                return context.getString(2132020204);
            default:
                return super.getPositiveButtonText(context);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        byte b = this.a;
        Object obj = this.c;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 0:
                View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558500, (ViewGroup) null, false);
                int i = 2131362527;
                if (w1h.j(2131362527, viewInflate) != null) {
                    i = 2131362528;
                    OperaTextView operaTextViewJ = w1h.j(2131362528, viewInflate);
                    if (operaTextViewJ != null) {
                        i = 2131363100;
                        if (w1h.j(2131363100, viewInflate) != null) {
                            i = 2131363782;
                            LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
                            if (linearLayout != null) {
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                operaTextViewJ.setText(((pxh) obj).a(az0Var.getContext().getResources()));
                                qb7 qb7Var = new qb7(linearLayout, LayoutInflater.from(linearLayout.getContext()), new pa(this, (byte) 25));
                                final r12 r12Var = (r12) ((Function0) this.d).invoke();
                                qb7Var.b(this.b ? 2131231300 : 2131231967, 2132018426, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b4 = b3;
                                        r12 r12Var2 = r12Var;
                                        switch (b4) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                qb7Var.b(2131232305, 2132021058, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b4 = b2;
                                        r12 r12Var2 = r12Var;
                                        switch (b4) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                final byte b4 = 2;
                                qb7Var.b(2131232081, 2132017384, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b42 = b4;
                                        r12 r12Var2 = r12Var;
                                        switch (b42) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                final byte b5 = 3;
                                qb7Var.b(2131232067, 2132018435, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b42 = b5;
                                        r12 r12Var2 = r12Var;
                                        switch (b42) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                final byte b6 = 4;
                                qb7Var.b(2131232244, 2132018441, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b42 = b6;
                                        r12 r12Var2 = r12Var;
                                        switch (b42) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                final byte b7 = 5;
                                qb7Var.b(2131232051, 2132018418, new View.OnClickListener() { // from class: q12
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b42 = b7;
                                        r12 r12Var2 = r12Var;
                                        switch (b42) {
                                            case 0:
                                                r12Var2.c();
                                                break;
                                            case 1:
                                                r12Var2.a();
                                                break;
                                            case 2:
                                                r12Var2.b();
                                                break;
                                            case 3:
                                                r12Var2.f();
                                                break;
                                            case 4:
                                                r12Var2.d();
                                                break;
                                            default:
                                                r12Var2.e();
                                                break;
                                        }
                                    }
                                });
                                az0Var.setView(linearLayout2);
                                break;
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            default:
                LinearLayout linearLayout3 = new LinearLayout(az0Var.getContext());
                linearLayout3.setOrientation(1);
                az0Var.setTitle(az0Var.getContext().getString(2132020199, (String) obj));
                az0Var.a.f = az0Var.getContext().getString(2132020198);
                az0Var.setView(linearLayout3);
                linearLayout3.addView(phj.I(az0Var.getContext(), 2132020887, false, new uk6(this, (byte) 15)));
                break;
        }
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 1:
                if (hjmVar == hjm.b) {
                    ((g77) this.d).y(false, false, true);
                    break;
                }
                break;
            default:
                super.onFinished(hjmVar);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 1:
                ((g77) this.d).y(false, this.b, false);
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        switch (this.a) {
            case 1:
                ((g77) this.d).y(true, this.b, false);
                break;
        }
    }
}
