package defpackage;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class vio implements jto {
    public static final vio f;
    public avj a;
    public Date b;
    public boolean c;
    public puo d;
    public boolean e;

    static {
        puo puoVar = new puo((byte) 0);
        vio vioVar = new vio();
        vioVar.a = new avj((byte) 13);
        vioVar.d = puoVar;
        f = vioVar;
    }

    @Override // defpackage.jto
    public final void a(boolean z) throws JSONException {
        if (!this.e && z) {
            this.a.getClass();
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(xqo.c.b).iterator();
                    while (it.hasNext()) {
                        yp ypVar = ((uio) it.next()).e;
                        Date date3 = this.b;
                        ypVar.e(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.e = z;
    }
}
