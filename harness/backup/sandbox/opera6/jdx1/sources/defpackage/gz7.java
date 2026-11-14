package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class gz7 extends gyg {
    public final TextView l;
    public final fy7 m;
    public boolean n = true;

    public gz7(TextView textView) {
        this.l = textView;
        this.m = new fy7(textView);
    }

    @Override // defpackage.gyg
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof fy7) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            fy7 fy7Var = this.m;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fy7Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == fy7Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.gyg
    public final boolean F() {
        return this.n;
    }

    @Override // defpackage.gyg
    public final void S(boolean z) {
        if (z) {
            TextView textView = this.l;
            textView.setTransformationMethod(a0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.gyg
    public final void T(boolean z) {
        this.n = z;
        TextView textView = this.l;
        textView.setTransformationMethod(a0(textView.getTransformationMethod()));
        textView.setFilters(A(textView.getFilters()));
    }

    @Override // defpackage.gyg
    public final TransformationMethod a0(TransformationMethod transformationMethod) {
        return this.n ? ((transformationMethod instanceof kz7) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new kz7(transformationMethod) : transformationMethod instanceof kz7 ? ((kz7) transformationMethod).a : transformationMethod;
    }
}
