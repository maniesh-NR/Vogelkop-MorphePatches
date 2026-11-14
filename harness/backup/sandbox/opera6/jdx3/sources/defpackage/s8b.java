package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

/* loaded from: classes.dex */
public final class s8b implements DatePickerDialog.OnDateSetListener {
    public final int a;
    public final /* synthetic */ tn b;

    public s8b(tn tnVar, int i) {
        this.b = tnVar;
        this.a = i;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.b.I(this.a, i, i2, i3, 0, 0, 0, 0, 0);
    }
}
