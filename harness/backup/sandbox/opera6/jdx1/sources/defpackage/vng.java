package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public class vng {
    public final Object[] a;
    public int b;

    public vng() {
        this.a = new Object[NotificationCompat.FLAG_LOCAL_ONLY];
    }

    public vng(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            qp2.o("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    public final void b(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                qp2.n("Already in the pool!");
                return false;
            }
            i2++;
        }
    }
}
