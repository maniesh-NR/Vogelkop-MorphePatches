package defpackage;

import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.custom_views.OperaTextInputEditText;

/* loaded from: classes.dex */
public final class el7 implements p59 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ el7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // defpackage.p59
    public final void a() {
        byte b = this.a;
    }

    @Override // defpackage.p59
    public final void b(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ViewGroup) obj2).jumpDrawablesToCurrentState();
                break;
            case 1:
                c9j c9jVar = (c9j) obj2;
                xtb[] xtbVarArr = c9j.w;
                String str = ((j9j) obj).a;
                if (str != null) {
                    TextInputEditText textInputEditText = (OperaTextInputEditText) c9jVar.t.d;
                    textInputEditText.removeTextChangedListener(c9jVar.v);
                    c9jVar.J0(false);
                    textInputEditText.setText(str);
                    textInputEditText.setSelection(str.length());
                    textInputEditText.addTextChangedListener(c9jVar.v);
                    break;
                }
                break;
            default:
                xtb[] xtbVarArr2 = uxk.w;
                ((uxk) obj2).s.F();
                break;
        }
    }
}
