package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class aa1 implements ssk, wa1 {
    public final String a;
    public final to9 b;
    public final ArrayList c;

    public aa1(String str, to9 to9Var, int i) {
        this.a = str;
        this.b = to9Var;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.c = arrayList;
    }

    @Override // defpackage.wa1
    public final void close() {
    }

    @Override // defpackage.wa1
    public final long execute() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ssk
    public final String h() {
        return this.a;
    }

    @Override // defpackage.ssk
    public final void l(rsk rskVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Function1) obj).invoke(rskVar);
        }
    }

    public final String toString() {
        return this.a;
    }

    @Override // defpackage.wa1
    public final void w(int i, String str) {
        this.c.set(i, new z91(str, i, (byte) 1));
    }

    @Override // defpackage.wa1
    public final void x(int i, Long l) {
        this.c.set(i, new z91(l, i, (byte) 2));
    }

    @Override // defpackage.wa1
    public final Object y(Function1 function1) {
        Cursor cursorQ = this.b.q(this);
        try {
            Object value = ((igh) function1.invoke(new t41(cursorQ))).getValue();
            vtp.v(cursorQ, null);
            return value;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wa1
    public final void z(int i, byte[] bArr) {
        this.c.set(i, new z91(bArr, i, (byte) 0));
    }
}
