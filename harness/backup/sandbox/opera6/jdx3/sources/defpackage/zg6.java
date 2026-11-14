package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.DatePicker;

/* loaded from: classes.dex */
public final class zg6 extends DatePickerDialog {
    public final s8b a;

    public zg6(Context context, s8b s8bVar, int i, int i2, int i3) {
        super(context, s8bVar, i, i2, i3);
        this.a = s8bVar;
    }

    @Override // android.app.DatePickerDialog, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        s8b s8bVar;
        if (i != -1 || (s8bVar = this.a) == null) {
            return;
        }
        DatePicker datePicker = getDatePicker();
        datePicker.clearFocus();
        s8bVar.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle("");
    }
}
