package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;

/* loaded from: classes.dex */
public final /* synthetic */ class cnb implements qnb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fnb b;

    public /* synthetic */ cnb(fnb fnbVar, byte b) {
        this.a = b;
        this.b = fnbVar;
    }

    public final void run() throws IOException {
        byte b = this.a;
        byte b2 = 0;
        fnb fnbVar = this.b;
        switch (b) {
            case 0:
                fnbVar.d.read(fnbVar, fnbVar.e);
                fnbVar.c.execute(new dnb(fnbVar, b2));
                break;
            default:
                nnb nnbVar = (nnb) fnbVar;
                if (nnbVar.k == null) {
                    nnbVar.m.l = 10;
                    nnbVar.i.setDoOutput(true);
                    nnbVar.i.connect();
                    nnbVar.m.l = 12;
                    OutputStream outputStream = nnbVar.i.getOutputStream();
                    nnbVar.l = outputStream;
                    nnbVar.k = Channels.newChannel(outputStream);
                }
                fnbVar.a.set(0);
                fnbVar.b(new cnb(fnbVar, b2), "readFromProvider");
                break;
        }
    }
}
