package defpackage;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* loaded from: classes.dex */
public final class u8b implements TimePickerDialog.OnTimeSetListener {
    public final int a;
    public final /* synthetic */ tn b;

    public u8b(tn tnVar, int i) {
        this.b = tnVar;
        this.a = i;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.b.I(this.a, 0, 0, 0, i, i2, 0, 0, 0);
    }
}
