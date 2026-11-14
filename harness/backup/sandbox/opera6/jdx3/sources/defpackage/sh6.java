package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class sh6 extends AlertDialog implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {
    public final DatePicker a;
    public final TimePicker b;
    public final t8b c;
    public final long d;
    public final long e;

    public sh6(Context context, t8b t8bVar, int i, int i2, int i3, int i4, int i5, boolean z, double d, double d2) {
        super(context, 0);
        long j = (long) d;
        this.d = j;
        long j2 = (long) d2;
        this.e = j2;
        this.c = t8bVar;
        setButton(-1, context.getText(2132018511), this);
        setButton(-2, context.getText(R.string.cancel), (DialogInterface.OnClickListener) null);
        setIcon(0);
        setTitle(context.getText(2132018513));
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131558641, (ViewGroup) null);
        setView(viewInflate);
        DatePicker datePicker = (DatePicker) viewInflate.findViewById(2131362495);
        this.a = datePicker;
        scd.Z(datePicker, this, i, i2, i3, j, j2);
        TimePicker timePicker = (TimePicker) viewInflate.findViewById(2131364760);
        this.b = timePicker;
        timePicker.setIs24HourView(Boolean.valueOf(z));
        timePicker.setHour(i4);
        timePicker.setMinute(i5);
        timePicker.setOnTimeChangedListener(this);
        onTimeChanged(timePicker, timePicker.getHour(), timePicker.getMinute());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        t8b t8bVar = this.c;
        if (t8bVar != null) {
            DatePicker datePicker = this.a;
            datePicker.clearFocus();
            TimePicker timePicker = this.b;
            timePicker.clearFocus();
            t8bVar.b.I(t8bVar.a, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getHour(), timePicker.getMinute(), 0, 0, 0);
        }
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        TimePicker timePicker = this.b;
        if (timePicker != null) {
            onTimeChanged(timePicker, timePicker.getHour(), timePicker.getMinute());
        }
    }

    @Override // android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        DatePicker datePicker = this.a;
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.clear();
        TimePicker timePicker2 = this.b;
        gregorianCalendar.set(year, month, dayOfMonth, timePicker2.getHour(), timePicker2.getMinute(), 0);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        long j = this.d;
        if (timeInMillis < j) {
            gregorianCalendar.setTimeInMillis(j);
        } else {
            long timeInMillis2 = gregorianCalendar.getTimeInMillis();
            long j2 = this.e;
            if (timeInMillis2 > j2) {
                gregorianCalendar.setTimeInMillis(j2);
            }
        }
        timePicker2.setHour(gregorianCalendar.get(11));
        timePicker2.setMinute(gregorianCalendar.get(12));
    }
}
