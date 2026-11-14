package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class e04 {
    public final /* synthetic */ byte a;
    public int b;

    public /* synthetic */ e04(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public static void b(String str) {
        if (c.m(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.b(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() != 0) {
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public final void a(int i) {
        this.b |= i;
    }

    public final boolean d(int i) {
        return (this.b & i) == i;
    }

    public abstract void e(to9 to9Var);

    public void f(to9 to9Var, int i, int i2) {
        throw new SQLiteException(sko.h(i, i2, "Can't downgrade database from version ", " to "));
    }

    public void g(to9 to9Var) {
        to9Var.a.setForeignKeyConstraintsEnabled(true);
    }

    public abstract void h(to9 to9Var, int i, int i2);

    public String toString() {
        switch (this.a) {
            case 1:
                return c(this.b);
            default:
                return super.toString();
        }
    }
}
