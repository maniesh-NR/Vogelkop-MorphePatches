package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.OperaEditText;
import com.opera.hype.image.editor.EditImage;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class up2 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wp2 wp2Var = (wp2) obj2;
                fw fwVar = (fw) obj;
                TextInputLayout textInputLayout = wp2Var.c;
                if (!z) {
                    wp2Var.Y(fwVar, textInputLayout.e.getText().toString());
                    textInputLayout.p(fwVar.e);
                    break;
                }
                break;
            case 1:
                EditImage editImage = (EditImage) obj2;
                bfl bflVar = (bfl) obj;
                if (!z) {
                    if (editImage.j == bflVar) {
                        editImage.c(true, false);
                        break;
                    }
                } else {
                    xtb[] xtbVarArr = EditImage.s;
                    editImage.a(bflVar, false);
                    break;
                }
                break;
            case 2:
                ((EditText) obj2).setHintTextColor(z ? 0 : ((AtomicInteger) obj).get());
                break;
            default:
                mrn mrnVar = (mrn) obj;
                bq1 bq1Var = mrnVar.j;
                if (!((OperaEditText) obj2).isShown()) {
                    bq1Var.clearFocus();
                    break;
                } else {
                    if (z) {
                        l5b l5bVar = q9n.c;
                        q9n.G(bq1Var.getContext(), bq1Var);
                    }
                    mrnVar.p.f(new irn(z));
                    break;
                }
        }
    }
}
