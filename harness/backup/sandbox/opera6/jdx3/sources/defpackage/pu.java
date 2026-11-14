package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class pu implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ru ruVar = (ru) obj2;
                String string = StringsKt.m0(String.valueOf(editable)).toString();
                if (string.length() <= 0) {
                    string = null;
                }
                yt1 yt1Var = string != null ? new yt1(string) : null;
                xf8.E0(ruVar.J0().e, yt1Var != null ? new wu(yt1Var, yt1Var != null ? yt1Var.a(ruVar.A, ((MaterialAutoCompleteTextView) obj).getContext()) : null) : null);
                break;
            default:
                ((Button) obj2).setEnabled(!Intrinsics.a(editable != null ? editable.toString() : null, (String) ((bg7) obj).d));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }
}
