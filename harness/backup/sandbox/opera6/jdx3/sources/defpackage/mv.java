package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.a;
import com.opera.android.favorites.e;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class mv extends nz0 {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv(Object obj, byte b) {
        super(true, false);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(Function0 function0) {
        super(false, false);
        this.a = (byte) 2;
        this.b = function0;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018111);
            case 1:
                return context.getString(2132018111);
            default:
                return context.getString(2132022288);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132017365);
            case 1:
                return context.getString(2132020155);
            default:
                return context.getString(2132019363);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        switch (this.a) {
            case 0:
                wy0 wy0Var = az0Var.a;
                wy0Var.r = null;
                wy0Var.q = 2131558664;
                az0Var.b(2132017381);
                break;
            case 1:
                View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558720, (ViewGroup) null);
                EditText editText = (EditText) q9n.y(2131363525, viewInflate);
                View viewFindViewById = viewInflate.findViewById(2131364964);
                Objects.requireNonNull(viewFindViewById);
                EditText editText2 = (EditText) viewFindViewById;
                hq8 hq8Var = (hq8) this.b;
                editText.setText(hq8Var.h());
                p6l p6lVar = p6l.a;
                if (z5i.a0(hq8Var.i(p6lVar))) {
                    editText2.setText(2132017532);
                    editText2.setEnabled(false);
                } else {
                    editText2.setText(BrowserUtils.getEditableString(hq8Var.i(p6lVar)));
                }
                az0Var.b(2132019026);
                az0Var.setView(viewInflate);
                break;
            default:
                az0Var.b(2132018046);
                az0Var.a(2132018045);
                az0Var.a.k = true;
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        switch (this.a) {
            case 0:
                ((fv) this.b).c();
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                EditText editText = (EditText) bz0Var.findViewById(2131363525);
                EditText editText2 = (EditText) bz0Var.findViewById(2131364964);
                hq8 hq8Var = (hq8) obj;
                hq8Var.q(editText.getText().toString());
                if (editText2.isEnabled()) {
                    String string = editText2.getText().toString();
                    p6l p6lVar = p6l.a;
                    String strG = eti.a(string, null, 2).g();
                    a aVar = (a) hq8Var;
                    if (aVar.f != null) {
                        boolean zJ = wqm.J(strG, aVar.i(p6lVar), false, false);
                        N.MZwxl2qE(aVar.f.a, strG);
                        if (!zJ) {
                            e eVar = aVar.e;
                            long jE = aVar.e();
                            i7f i7fVar = FavoritesBridge.a;
                            N.MzRSq0ia(jE, false);
                            eVar.d.w(aVar, false);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((Function0) obj).invoke();
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                TextInputLayout textInputLayoutFindViewById = bz0Var.findViewById(2131363222);
                textInputLayoutFindViewById.t(bz0Var.getContext().getString(2132017374));
                EditText editText = textInputLayoutFindViewById.e;
                editText.setEnabled(false);
                editText.addTextChangedListener(new lv(this, bz0Var, (byte) 0));
                editText.setText("");
                ((fv) this.b).b(new bi(editText, (byte) 10));
                bz0Var.f(-1).setOnClickListener(new nf(this, bz0Var, (byte) 4));
                break;
            case 1:
                EditText editText2 = (EditText) bz0Var.findViewById(2131364964);
                editText2.addTextChangedListener(new vp2(this, bz0Var, editText2));
                break;
            default:
                super.onShowDialog(bz0Var);
                break;
        }
    }
}
