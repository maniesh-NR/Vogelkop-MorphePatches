package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class nm2 extends o93 {
    public final /* synthetic */ byte c;
    public final String d;

    public /* synthetic */ nm2(String str, byte b) {
        this.c = b;
        this.d = str;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        byte b = this.c;
        String str = this.d;
        switch (b) {
            case 0:
                return gtj.e(view, view.getResources().getString(2132017657, str), 0);
            default:
                return gtj.e(view, str, 2500);
        }
    }
}
