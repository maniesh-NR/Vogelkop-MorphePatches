package defpackage;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.opera.android.BrowserActivity;
import com.opera.android.live_score.data.db.LiveScoreDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.coroutines.d;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ t1(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public /* synthetic */ t1(Context context, snc sncVar) {
        this.a = (byte) 7;
        this.b = context;
    }

    public final Object get() throws Throwable {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        Uri uri;
        Uri uri2;
        byte b = this.a;
        byte b2 = 2;
        FileInputStream fileInputStream = null;
        Context context = this.b;
        switch (b) {
            case 0:
                s6e s6eVarB = s6e.b(context);
                vq8 vq8Var = s6eVarB.b;
                return vq8Var != null ? (String) vq8Var.h : s6eVarB.c;
            case 1:
                int i = BrowserActivity.E1;
                return cqp.f0(context);
            case 2:
                c3j c3jVarD = ((d3j) e3j.t(context).i()).d(28, false);
                if (c3jVarD != null) {
                    return (String) c3jVarD.d;
                }
                return null;
            case 3:
                c3j c3jVarD2 = ((d3j) e3j.t(context).i()).d(40, false);
                if (c3jVarD2 != null) {
                    return (String) c3jVarD2.d;
                }
                return null;
            case 4:
                return i0l.c(context);
            case 5:
                return i0l.b(context);
            case 6:
                c3j c3jVarD3 = ((d3j) e3j.t(context).i()).d(35, false);
                if (c3jVarD3 == null || (uri = Uri.parse("https://".concat((String) c3jVarD3.d))) == null) {
                    uri = Uri.parse("ft-oscore.opera-api.com");
                }
                return uri.toString();
            case 7:
                return new cs6(context, new ix5(b2), yne.b);
            case 8:
                d3j d3jVar = (d3j) e3j.t(context).i();
                c3j c3jVarC = d3jVar.c(2);
                if (c3jVarC == null || (uri2 = (Uri) c3jVarC.d) == null) {
                    uri2 = Uri.parse("https://www.apex-football.com");
                }
                Uri uri3 = uri2;
                Uri uriQ = c09.q(d3jVar.d(13, false), "https://oscore.opera-api.com/");
                c3j c3jVarD4 = d3jVar.d(17, false);
                return new f3j(uri3, uriQ, c3jVarD4 != null ? Uri.parse("wss://".concat((String) c3jVarD4.d)) : null, c09.q(d3jVar.d(35, false), "https://ft-oscore.opera-api.com"), c09.q(d3jVar.d(44, false), "https://api.apexscores.io"));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return r9n.u(context, context.getPackageName(), 0L).versionName;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                u5i u5iVarF = xih.f(context.getApplicationContext(), LiveScoreDatabase.class, "live_score");
                jg8 jg8Var = (jg8) vml.e.d;
                if (u5iVarF.f != null || u5iVarF.g != null) {
                    qp2.o("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
                    return null;
                }
                if (jg8Var.get(d.Hq) == null) {
                    qp2.o("It is required that the coroutine context contain a dispatcher.");
                    return null;
                }
                u5iVarF.p = jg8Var;
                u5iVarF.a(new ryd[]{LiveScoreDatabase.l, LiveScoreDatabase.m, LiveScoreDatabase.n, LiveScoreDatabase.o, LiveScoreDatabase.p, LiveScoreDatabase.q, LiveScoreDatabase.r, LiveScoreDatabase.s, LiveScoreDatabase.t, LiveScoreDatabase.u, LiveScoreDatabase.v, LiveScoreDatabase.w, LiveScoreDatabase.x, LiveScoreDatabase.y});
                return ((LiveScoreDatabase) u5iVarF.b()).x();
            case 11:
                File file = new File(new File(context.getApplicationInfo().sourceDir).getParentFile(), "oat/arm");
                return new Pair(Boolean.valueOf(new File(file, "base.vdex").exists()), Boolean.valueOf(new File(file, "base.odex").exists()));
            case 12:
                return e3j.t(context);
            case 13:
                return (c36) i0i.a.d(context);
            case 14:
                return Boolean.valueOf(context.deleteFile(".save_as_pdf"));
            case 15:
                try {
                    fileInputStreamOpenFileInput = context.openFileInput(".save_as_pdf");
                    try {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileInputStreamOpenFileInput.getFD());
                            xvg.l(fileInputStreamOpenFileInput);
                            try {
                                try {
                                    return new PdfRenderer(parcelFileDescriptorDup);
                                } catch (IOException unused) {
                                    context.deleteFile(".save_as_pdf");
                                    xvg.l(parcelFileDescriptorDup);
                                    return null;
                                }
                            } catch (Throwable th2) {
                                xvg.l(parcelFileDescriptorDup);
                                throw th2;
                            }
                        } catch (IOException unused2) {
                            context.deleteFile(".save_as_pdf");
                            xvg.l(fileInputStreamOpenFileInput);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStreamOpenFileInput;
                        xvg.l(fileInputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                    fileInputStreamOpenFileInput = null;
                } catch (Throwable th4) {
                    th = th4;
                    xvg.l(fileInputStream);
                    throw th;
                }
            case 16:
                return cqp.j0(context);
            case 17:
                return ru9.c(context);
            default:
                return xnh.t(context);
        }
    }
}
