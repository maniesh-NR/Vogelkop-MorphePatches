package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public class z9k extends eog {
    public static String l0(int i, Context context) throws Resources.NotFoundException {
        String quantityString;
        int iA = vep.A(i);
        if (iA != 0) {
            return iA != 1 ? iA != 2 ? "" : context.getString(2132021422) : context.getString(2132021421);
        }
        long j = ((wnh) xnh.t(context).i()).b;
        if (j < 3600000) {
            int i2 = (int) ((j + 59999) / 60000);
            quantityString = context.getResources().getQuantityString(2131886129, i2, Integer.valueOf(i2));
        } else {
            int i3 = (int) ((j + 3599999) / 3600000);
            quantityString = context.getResources().getQuantityString(2131886128, i3, Integer.valueOf(i3));
        }
        return context.getString(2132021423, quantityString);
    }

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        ps5 ps5Var = new ps5(getActivity());
        ps5Var.c = this;
        ps5Var.e = this;
        ps5Var.setHeaderTitle(2132021420);
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        int iY = settingsManagerJ.y();
        int[] iArrB = vep.B(3);
        int length = iArrB.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                this.h = new axe(settingsManagerJ, (byte) 3);
                ps5Var.setGroupCheckable(1, true, true);
                this.d = ps5Var;
                return;
            } else {
                int i2 = iArrB[i];
                if (i2 != 1 || ((wnh) xnh.t(getContext()).i()).b != 0) {
                    ps5Var.a(1, vep.A(i2), 0, l0(i2, getContext())).setChecked(i2 == iY);
                }
                i++;
            }
        }
    }
}
