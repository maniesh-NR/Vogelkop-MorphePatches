package defpackage;

import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import java.io.IOException;
import org.chromium.printing.Printable;

/* loaded from: classes.dex */
public final class jyg {
    public final String a;
    public int b;
    public int c;
    public ParcelFileDescriptor d;
    public int e;
    public PrintAttributes.MediaSize f;
    public PrintAttributes.Margins g;
    public int[] h;
    public lld i;
    public Printable j;
    public pjg l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public iyg q;
    public byte k = 0;
    public final fyg r = new fyg(this);

    public jyg(Printable printable, iyg iygVar, int i, int i2) {
        this.b = -1;
        this.c = -1;
        this.j = printable;
        this.a = printable.a();
        this.q = iygVar;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor = this.d;
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            parcelFileDescriptor.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
        this.d = null;
    }

    public final void b() throws Resources.NotFoundException {
        lld lldVar;
        if (this.p) {
            return;
        }
        this.p = true;
        this.n = false;
        this.b = -1;
        this.c = -1;
        this.o = false;
        a();
        if (this.k == 1 && (lldVar = this.i) != null) {
            lldVar.k0(this.a);
        }
        this.k = (byte) 2;
        this.i = null;
        pjg pjgVar = this.l;
        this.l = null;
        this.j = null;
        this.q = null;
        this.f = null;
        this.h = null;
        if (pjgVar != null) {
            pjgVar.run();
        }
    }
}
