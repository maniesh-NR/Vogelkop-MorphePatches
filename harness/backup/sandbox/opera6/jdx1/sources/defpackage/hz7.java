package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class hz7 extends gyg {
    public final gz7 l;

    public hz7(TextView textView) {
        this.l = new gz7(textView);
    }

    @Override // defpackage.gyg
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !xx7.e() ? inputFilterArr : this.l.A(inputFilterArr);
    }

    @Override // defpackage.gyg
    public final boolean F() {
        return this.l.n;
    }

    @Override // defpackage.gyg
    public final void S(boolean z) {
        if (xx7.e()) {
            this.l.S(z);
        }
    }

    @Override // defpackage.gyg
    public final void T(boolean z) {
        boolean zE = xx7.e();
        gz7 gz7Var = this.l;
        if (zE) {
            gz7Var.T(z);
        } else {
            gz7Var.n = z;
        }
    }

    @Override // defpackage.gyg
    public final TransformationMethod a0(TransformationMethod transformationMethod) {
        return !xx7.e() ? transformationMethod : this.l.a0(transformationMethod);
    }
}
