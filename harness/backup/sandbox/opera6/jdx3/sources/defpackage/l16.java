package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.opera.android.autofill.AutofillManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l16 implements TextWatcher {
    public final AutofillManager a;
    public boolean b = true;
    public boolean c;
    public boolean d;

    public l16(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a(Editable editable) {
        String string = editable.toString();
        this.a.getClass();
        for (int i : Intrinsics.a((String) N.MyZkOeCB(string), "amex") ? new int[]{4, 11} : new int[]{4, 9, 14}) {
            if (editable.length() > i) {
                editable.insert(i, " ");
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b) {
            int iIndexOf = TextUtils.indexOf(editable, " ");
            while (iIndexOf >= 0) {
                int i = iIndexOf + 1;
                editable.delete(iIndexOf, i);
                iIndexOf = TextUtils.indexOf(editable, " ", i);
            }
            if (editable.length() > 16) {
                this.d = true;
                this.b = false;
            } else {
                a(editable);
            }
        } else if (this.d && editable.length() <= 16) {
            this.d = false;
            this.b = true;
            a(editable);
        }
        if (editable.length() == 0) {
            this.b = true;
        }
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c || !this.b || i3 <= 0) {
            return;
        }
        int i4 = i3 + i;
        if (TextUtils.indexOf(charSequence, " ", i, i4) == -1 && TextUtils.indexOf(charSequence, "-", i, i4) == -1) {
            return;
        }
        this.b = false;
    }
}
