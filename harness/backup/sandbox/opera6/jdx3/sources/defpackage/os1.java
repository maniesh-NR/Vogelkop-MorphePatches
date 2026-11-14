package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.bookmarks.h;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class os1 extends nz0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(fl3 fl3Var) {
        super(false, false);
        this.a = (byte) 3;
        this.d = fl3Var;
        fl3Var.z = this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os1(Function0 function0, Function0 function02, Function0 function03, byte b) {
        super(false, false);
        this.a = b;
        this.b = function0;
        this.c = function02;
        this.d = function03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(o8f o8fVar, pjg pjgVar, pjg pjgVar2) {
        super(true, false);
        this.a = (byte) 2;
        this.b = o8fVar;
        this.c = pjgVar;
        this.d = pjgVar2;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
        }
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132017580);
            case 1:
                return context.getString(2132020924);
            case 2:
                return context.getString(2132020924);
            default:
                return context.getString(2132019118);
        }
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.a) {
            case 0:
            case 1:
                return 2132083349;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        switch (this.a) {
            case 0:
                String string = az0Var.getContext().getString(2132017572, az0Var.getContext().getString(2132017591));
                az0Var.b(2132017573);
                az0Var.a.f = string;
                break;
            case 1:
                String string2 = az0Var.getContext().getString(2132017585, az0Var.getContext().getString(2132017591));
                az0Var.b(2132017586);
                az0Var.a.f = string2;
                break;
            case 2:
                az0Var.b(2132019055);
                Context context = az0Var.getContext();
                yq1 yq1VarJ = phj.J(context);
                phj.b0(yq1VarJ, context.getString(2132019054), new vk2(this, (byte) 11));
                az0Var.setView(yq1VarJ);
                break;
            default:
                this.b = ((fl3) this.d).s;
                ov0 ov0VarJ = ov0.j(LayoutInflater.from(az0Var.getContext()), null);
                this.c = ov0VarJ;
                TextInputLayout textInputLayout = (TextInputLayout) ov0VarJ.d;
                textInputLayout.t(textInputLayout.getResources().getText(2132018080));
                TextInputLayout textInputLayout2 = (TextInputLayout) ((ov0) this.c).d;
                textInputLayout2.setPadding(textInputLayout2.getPaddingLeft(), fan.a(16.0f, ((TextInputLayout) ((ov0) this.c).d).getResources()), ((TextInputLayout) ((ov0) this.c).d).getPaddingRight(), ((TextInputLayout) ((ov0) this.c).d).getPaddingBottom());
                az0Var.b(2132019119);
                az0Var.setView(((ov0) this.c).b);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        byte b = this.a;
        hjm hjmVar2 = hjm.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (hjmVar == hjmVar2) {
                    ((ys1) obj).invoke();
                    break;
                }
                break;
            case 1:
                if (hjmVar == hjmVar2) {
                    ((ys1) obj).invoke();
                    break;
                }
                break;
            case 2:
                ((o8f) this.b).run(hjmVar);
                break;
            default:
                ((fl3) obj).z = null;
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((ys1) obj).invoke();
                break;
            case 1:
                ((ys1) this.c).invoke();
                break;
            case 2:
                ((pjg) obj).run();
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                ((i51) this.c).invoke();
                break;
            case 1:
                ((x2) this.b).invoke();
                break;
            case 2:
                ((pjg) this.c).run();
                break;
            default:
                EditText editText = ((TextInputLayout) ((ov0) this.c).d).e;
                if (editText != null) {
                    fl3 fl3Var = (fl3) this.d;
                    String strTrim = editText.getText().toString().trim();
                    jl3 jl3Var = (jl3) this.b;
                    ml3 ml3VarB = (ml3) jl3Var.a;
                    i53 i53Var = fl3Var.C;
                    if (((h) i53Var).m(ml3VarB.getId(), true) == null) {
                        ml3VarB = jl3Var.d.b(i53Var);
                    }
                    kkj kkjVar = new kkj(-1L, strTrim, null, false);
                    i53Var.getClass();
                    ml3 ml3Var = (ml3) h.i(kkjVar, ml3VarB);
                    jl3 jl3Var2 = ml3Var != null ? new jl3(ml3Var, i53Var, true) : null;
                    if (jl3Var2 == null) {
                        Toast.makeText(fl3Var.v, fl3Var.getResources().getString(2132019120), 0).show();
                        break;
                    } else {
                        fl3Var.s = jl3Var2;
                        fl3Var.J0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                ((ys1) this.b).invoke();
                break;
            case 1:
                super.onShowDialog(bz0Var);
                bz0Var.f(-1).requestFocus();
                break;
            case 2:
            default:
                super.onShowDialog(bz0Var);
                break;
            case 3:
                fl3 fl3Var = (fl3) this.d;
                EditText editText = ((TextInputLayout) ((ov0) this.c).d).e;
                if (editText != null) {
                    editText.addTextChangedListener(new vp2(this, bz0Var, (byte) 3));
                    String string = fl3Var.getResources().getString(2132019121);
                    int i = 1;
                    while (fl3Var.u.G(fl3Var.getResources(), string)) {
                        int i2 = i + 1;
                        String string2 = fl3Var.getString(2132019122, new Object[]{Integer.valueOf(i)});
                        i = i2;
                        string = string2;
                    }
                    editText.setText(string);
                    editText.requestFocus();
                    editText.setSelection(0, string.length());
                    break;
                }
                break;
        }
    }
}
