package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;

/* loaded from: classes.dex */
public final /* synthetic */ class q1h implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7m b;
    public final /* synthetic */ jo2 c;

    public /* synthetic */ q1h(g7m g7mVar, jo2 jo2Var, byte b) {
        this.a = b;
        this.b = g7mVar;
        this.c = jo2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        byte b = this.a;
        jo2 jo2Var = this.c;
        g7m g7mVar = this.b;
        switch (b) {
            case 0:
                s1h s1hVar = jo2Var.a;
                try {
                    eo2 eo2Var = (eo2) ((j06) g7mVar.e).g(jo2Var);
                    int i = eo2Var.c;
                    jpo.i("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i, i == 35 || i == 256 || i == 4101);
                    ((g7a) x7d.l()).execute(new q2g(s1hVar, (Bitmap) ((i06) g7mVar.j).a(eo2Var), (byte) 9));
                    return;
                } catch (Exception unused) {
                    jo2Var.b.close();
                    return;
                }
            case 1:
                q1h q1hVar = new q1h(g7mVar, jo2Var, (byte) 2);
                Trace.beginSection("CX:processInputPacket");
                try {
                    q1hVar.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                s1h s1hVar2 = jo2Var.a;
                try {
                    ((io2) g7mVar.d).d.size();
                    s1hVar2.getClass();
                    ((g7a) x7d.l()).execute(new q2g(s1hVar2, g7mVar.i(jo2Var), (byte) 10));
                    return;
                } catch (gwa e) {
                    ((g7a) x7d.l()).execute(new q2g(s1hVar2, e, (byte) 11));
                    return;
                } catch (OutOfMemoryError e2) {
                    ((g7a) x7d.l()).execute(new q2g(s1hVar2, new gwa(0, "Processing failed due to low memory.", e2), (byte) 11));
                    return;
                } catch (RuntimeException e3) {
                    ((g7a) x7d.l()).execute(new q2g(s1hVar2, new gwa(0, "Processing failed.", e3), (byte) 11));
                    return;
                }
        }
    }
}
