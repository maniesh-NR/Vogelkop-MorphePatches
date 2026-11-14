package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class lv extends ca3 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ bz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(nz0 nz0Var, bz0 bz0Var, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = bz0Var;
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.b) {
            case 0:
                this.c.f(-1).setEnabled(!TextUtils.isEmpty(editable));
                for (CharacterStyle characterStyle : (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class)) {
                    editable.removeSpan(characterStyle);
                }
                break;
        }
    }

    @Override // defpackage.ca3, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.b) {
            case 1:
                this.c.f(-1).setEnabled(!TextUtils.isEmpty(charSequence.toString()));
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
