package org.chromium.content.browser.input;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.ListAdapter;
import android.widget.ListView;
import defpackage.ga6;
import defpackage.p8b;
import defpackage.q8b;
import defpackage.r8b;
import defpackage.th6;
import defpackage.tn;
import java.util.Arrays;
import org.chromium.content.browser.picker.DateTimeSuggestion;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class DateTimeChooserAndroid {
    public long a;
    public final tn b;

    public DateTimeChooserAndroid(Context context, long j) {
        this.a = j;
        ga6 ga6Var = new ga6((Object) this, (byte) 1);
        tn tnVar = new tn();
        tnVar.b = context;
        tnVar.d = ga6Var;
        this.b = tnVar;
    }

    public static DateTimeChooserAndroid createDateTimeChooser(WindowAndroid windowAndroid, long j, int i, double d, double d2, double d3, double d4, DateTimeSuggestion[] dateTimeSuggestionArr) {
        Context context = (Context) windowAndroid.f.get();
        if (context == null || t8.d(context) == null) {
            return null;
        }
        DateTimeChooserAndroid dateTimeChooserAndroid = new DateTimeChooserAndroid(context, j);
        tn tnVar = dateTimeChooserAndroid.b;
        tnVar.v();
        if (dateTimeSuggestionArr == null) {
            tnVar.J(i, d, d2, d3, d4);
            return dateTimeChooserAndroid;
        }
        Context context2 = (Context) tnVar.b;
        ListView listView = new ListView(context2);
        th6 th6Var = new th6(context2, Arrays.asList(dateTimeSuggestionArr));
        listView.setAdapter((ListAdapter) th6Var);
        listView.setOnItemClickListener(new p8b(tnVar, th6Var, i, d, d2, d3, d4));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context2).setTitle(i == 12 ? 2132021891 : (i == 9 || i == 10) ? 2132018513 : i == 11 ? 2132019800 : i == 13 ? 2132022690 : 2132018512).setView(listView).setNegativeButton(context2.getText(R.string.cancel), new q8b(tnVar, (byte) 0)).create();
        tnVar.c = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(new r8b(tnVar));
        tnVar.a = false;
        ((AlertDialog) tnVar.c).show();
        return dateTimeChooserAndroid;
    }

    public static DateTimeSuggestion[] createSuggestionsArray(int i) {
        return new DateTimeSuggestion[i];
    }

    public static void setDateTimeSuggestionAt(DateTimeSuggestion[] dateTimeSuggestionArr, int i, double d, String str, String str2) {
        dateTimeSuggestionArr[i] = new DateTimeSuggestion(str, d, str2);
    }

    public final void dismissAndDestroy() {
        this.a = 0L;
        this.b.v();
    }
}
