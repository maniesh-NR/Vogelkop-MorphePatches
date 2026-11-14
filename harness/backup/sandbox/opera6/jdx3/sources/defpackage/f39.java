package defpackage;

import android.app.assist.AssistStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class f39 {
    public final AssistStructure.ViewNode a;
    public final nf2 b;
    public final p09 c;

    public f39(AssistStructure.ViewNode viewNode, nf2 nf2Var) {
        this.a = viewNode;
        this.b = nf2Var;
        ir5 ir5Var = p09.a;
        int autofillType = viewNode.getAutofillType();
        ir5Var.getClass();
        this.c = autofillType != 1 ? autofillType != 2 ? autofillType != 3 ? autofillType != 4 ? p09.b : p09.d : p09.f : p09.e : p09.c;
    }

    public static vz8 a(f39 f39Var, nf2 nf2Var, int i) {
        AutofillId autofillId = f39Var.a.getAutofillId();
        AutofillValue autofillValue = f39Var.a.getAutofillValue();
        x09 t09Var = u09.a;
        if (autofillValue != null) {
            if (autofillValue.isText()) {
                t09Var = new v09(autofillValue);
            } else if (autofillValue.isDate()) {
                t09Var = new s09(autofillValue);
            } else if (autofillValue.isToggle()) {
                t09Var = new w09(autofillValue);
            } else if (autofillValue.isList()) {
                t09Var = new t09(autofillValue);
            }
        }
        x09 x09Var = t09Var;
        if ((i & 4) != 0) {
            nf2Var = f39Var.b;
        }
        nf2 nf2Var2 = nf2Var;
        p09 p09Var = f39Var.c;
        boolean zIsFocused = f39Var.a.isFocused();
        f39Var.getClass();
        if (autofillId == null) {
            qp2.n("Required value was null.");
            return null;
        }
        if (nf2Var2 != null) {
            return new vz8(autofillId, x09Var, nf2Var2, p09Var, zIsFocused);
        }
        qp2.n("Required value was null.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f39)) {
            return false;
        }
        f39 f39Var = (f39) obj;
        return this.a.equals(f39Var.a) && this.b == f39Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf2 nf2Var = this.b;
        return iHashCode + (nf2Var == null ? 0 : nf2Var.hashCode());
    }

    public final String toString() {
        return "";
    }
}
