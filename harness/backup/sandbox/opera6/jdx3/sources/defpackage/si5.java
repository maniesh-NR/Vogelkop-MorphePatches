package defpackage;

import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class si5 implements ua6 {
    public final /* synthetic */ byte a;
    public long b;
    public final Object c;
    public final /* synthetic */ xi5 d;

    public si5(xi5 xi5Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = xi5Var;
                this.c = new Object();
                break;
            default:
                this.d = xi5Var;
                this.c = new Object();
                break;
        }
    }

    public final void d(ta6 ta6Var) {
        switch (this.a) {
            case 0:
                ri5 ri5Var = (ri5) ta6Var;
                synchronized (this.c) {
                    ri5Var.d += this.b;
                    this.b = 0L;
                }
                return;
            default:
                wi5 wi5Var = (wi5) ta6Var;
                synchronized (this.c) {
                    wi5Var.d += this.b;
                    this.b = 0L;
                }
                return;
        }
    }

    public final ta6 e(GregorianCalendar gregorianCalendar) {
        switch (this.a) {
            case 0:
                return new ri5(gregorianCalendar);
            default:
                return new wi5(gregorianCalendar);
        }
    }

    public final ta6 f(String str) throws NumberFormatException {
        switch (this.a) {
            case 0:
                String[] strArrSplit = str.split("/");
                int i = Integer.parseInt(strArrSplit[0]);
                int i2 = Integer.parseInt(strArrSplit[1]);
                int i3 = Integer.parseInt(strArrSplit[2]);
                long j = Long.parseLong(strArrSplit[3]);
                ri5 ri5Var = new ri5(i, i2, i3);
                ri5Var.d = j;
                return ri5Var;
            default:
                String[] strArrSplit2 = str.split("/");
                int i4 = Integer.parseInt(strArrSplit2[0]);
                int i5 = Integer.parseInt(strArrSplit2[1]);
                int i6 = Integer.parseInt(strArrSplit2[2]);
                long j2 = Long.parseLong(strArrSplit2[3]);
                wi5 wi5Var = new wi5(i4, i5, i6);
                wi5Var.d = j2;
                return wi5Var;
        }
    }

    public final String i(ta6 ta6Var) {
        switch (this.a) {
            case 0:
                ri5 ri5Var = (ri5) ta6Var;
                Locale locale = Locale.US;
                return ri5Var.a + "/" + ri5Var.b + "/" + ri5Var.c + "/" + ri5Var.d;
            default:
                wi5 wi5Var = (wi5) ta6Var;
                Locale locale2 = Locale.US;
                return wi5Var.a + "/" + wi5Var.b + "/" + wi5Var.c + "/" + wi5Var.d;
        }
    }
}
